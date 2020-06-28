package net.unstoppalezzz.mobs;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.unstoppalezzz.mobs.init.ItemInit;
import net.unstoppalezzz.mobs.init.ModEntityTypes;
import net.unstoppalezzz.mobs.object.Items.VanishItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mobs")
public class Main {

    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "mobs";

    public static final ResourceLocation EXAMPLE_DIM_TYPE = new ResourceLocation(MOD_ID, "mobs");

    public static Main instance;

    public Main() {


        IEventBus forge = MinecraftForge.EVENT_BUS;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);


    }

    public static class UnstoppalezzzItemGroup extends ItemGroup {


        public static final UnstoppalezzzItemGroup instance = new UnstoppalezzzItemGroup(ItemGroup.GROUPS.length, "unstoppalezzztab");
        private UnstoppalezzzItemGroup(int index,String label) {
            super(index, label);
        }



        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemInit.Vansih_ITEM.get());
        }
    }
}














