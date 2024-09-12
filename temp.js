/**
 * This file will generate a list of block render types for each blockstate file in the blockstate directory.
 * Forge/NeoForge automatically does this, but Fabric does not.
 * The output of this script should be placed within RenderLayers.java
 */

const glob = require('glob');
const fs = require('fs');
const path = require('path');

// Directory to search for blockstate files
const blockstateDirectory = '/home/calum/dev/DOTBuilder/common/src/main/resources/assets/dawnoftimebuilder/blockstates';
// Directory to search for model files
const modelDirectory = '/home/calum/dev/DOTBuilder/common/src/main/resources/assets/dawnoftimebuilder/models';

// Glob pattern to match all JSON files in the blockstate directory
const blockstatePattern = path.join(blockstateDirectory, '**/*.json');

// Regular expression to find model references
const modelRegex = /"model":\s*"(.*?)"/g;

// Function to check for render_type property in model JSON files
function checkRenderType(modelPath) {
    if (fs.existsSync(modelPath)) {
        try {
            const modelContent = fs.readFileSync(modelPath, 'utf8');
            const modelJson = JSON.parse(modelContent);
            if(modelJson.render_type === undefined) {
                return false;
            }

            return modelJson.render_type;
        } catch {
            return false;
        }
    }
    return false;
}

// Function to resolve model paths and check for render_type property
function resolveAndCheckModel(modelReference) {
    const split = modelReference.split(":");

    if(split.length < 2) {
        return false;
    }

    const modelPath = path.join(modelDirectory, modelReference.split(":")[1].replace('block/', 'block/').replace('item/', 'item/') + '.json');
    return checkRenderType(modelPath);
}

// Function to process blockstate files
function processBlockstateFile(blockstatePath) {
    const blockstateContent = fs.readFileSync(blockstatePath, 'utf8');
    const models = [];
    let match;

    while ((match = modelRegex.exec(blockstateContent)) !== null) {
        models.push(match[1]);
    }


    for (const modelReference of models) {
        if (resolveAndCheckModel(modelReference)) {
            let type = resolveAndCheckModel(modelReference).split(":")[1];
            let filename = blockstatePath.split('/').pop().replace('.json', '');
            console.log(`BlockRenderLayerMap.INSTANCE.putBlock(DoTBBlocksRegistry.INSTANCE.${filename.toUpperCase()}.get(), RenderType.${type}());`);
            break;
        }
    }
}

// Find all blockstate files and process them
const files = glob.sync(blockstatePattern);
files.forEach(processBlockstateFile);