package net.unstoppalezzz.mobs.utils;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.unstoppalezzz.mobs.Main;
import net.unstoppalezzz.mobs.Render.UnstoppalezzzEvilRender;
import net.unstoppalezzz.mobs.Render.UnstoppalezzzRender;
import net.unstoppalezzz.mobs.init.ModEntityTypes;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.UNSTOPPALEZZZ_ENTITY.get(), UnstoppalezzzRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.UNSTOPPALEZZZEvil_ENTITY.get(), UnstoppalezzzEvilRender::new);
    }
}
