package net.unstoppalezzz.mobs.object.Items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.IngameGui;
import net.minecraft.client.gui.overlay.PlayerTabOverlayGui;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.lang.reflect.Field;
import java.util.Collection;


public class VanishItem extends Item {
    public VanishItem(Properties properties) {
        super(properties);
    }


    @Override
    public Item asItem() {
        return super.asItem();
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (!playerIn.abilities.allowFlying) {
            playerIn.setInvisible(true);


            playerIn.abilities.allowFlying = true;


        } else {

            playerIn.abilities.allowFlying = false;
            playerIn.setInvisible(false);


        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}





