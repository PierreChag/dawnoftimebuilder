package org.dawnoftimebuilder.compat;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import org.dawnoftimebuilder.DoTBFabric;

public class ModMenuEntrypoint implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return (parent) -> DoTBFabric.HANDLER.generateGui().generateScreen(parent);
    }
}
