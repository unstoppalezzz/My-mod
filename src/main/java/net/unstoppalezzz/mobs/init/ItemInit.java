package net.unstoppalezzz.mobs.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.unstoppalezzz.mobs.Main;
import net.unstoppalezzz.mobs.object.Items.FlyItem;
import net.unstoppalezzz.mobs.object.Items.SpeedItem;
import net.unstoppalezzz.mobs.object.Items.SpeedResetItem;
import net.unstoppalezzz.mobs.object.Items.VanishItem;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
            Main.MOD_ID);

    public static final RegistryObject<VanishItem> Vansih_ITEM = ITEMS.register("vanish_item",
            () -> new VanishItem(new Item.Properties().group(Main.UnstoppalezzzItemGroup.instance)));

    public static final RegistryObject<FlyItem> Fly_ITEM = ITEMS.register("fly_item",
            () -> new FlyItem(new Item.Properties().group(Main.UnstoppalezzzItemGroup.instance)));

    public static final RegistryObject<SpeedItem> Speed_ITEM = ITEMS.register("speed_item",
            () -> new SpeedItem(new Item.Properties().group(Main.UnstoppalezzzItemGroup.instance)));

    public static final RegistryObject<SpeedResetItem> SpeedReset_ITEM = ITEMS.register("speedreset_item",
            () -> new SpeedResetItem(new Item.Properties().group(Main.UnstoppalezzzItemGroup.instance)));
}



