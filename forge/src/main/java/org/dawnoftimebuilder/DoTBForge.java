package org.dawnoftimebuilder;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import dev.isxander.yacl3.platform.YACLPlatform;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.items.ItemStackHandler;
import org.dawnoftimebuilder.datagen.DataGenerators;

@Mod(DoTBCommon.MOD_ID)
public class DoTBForge {
    public static final ConfigClassHandler<DoTBConfig> HANDLER = ConfigClassHandler.createBuilder(DoTBConfig.class)
            .id(new ResourceLocation(DoTBCommon.MOD_ID, "config"))
            .serializer(config -> GsonConfigSerializerBuilder.create(config)
                    .setPath(YACLPlatform.getConfigDir().resolve("dawnoftimebuilder-config.json5"))
                    .setJson5(true)
                    .build())
            .build();

    public DoTBForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        HANDLER.load();
        DoTBCommon.init();

        RegistryImpls.init(modEventBus);

        if (FMLEnvironment.dist.isClient()) {
            modEventBus.register(DoTBForgeClient.class);
        }

        modEventBus.register(DataGenerators.class);
    }

}