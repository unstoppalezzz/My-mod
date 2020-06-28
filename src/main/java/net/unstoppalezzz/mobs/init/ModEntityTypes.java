package net.unstoppalezzz.mobs.init;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.unstoppalezzz.mobs.Main;
import net.unstoppalezzz.mobs.entitys.UnstoppalezzzEntity;
import net.unstoppalezzz.mobs.entitys.UnstoppalezzzEntityEvil;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES,
            Main.MOD_ID);

    public static final RegistryObject<EntityType<UnstoppalezzzEntity>> UNSTOPPALEZZZ_ENTITY = ENTITY_TYPES
            .register("unstoppalezzz_entity",
                    () -> EntityType.Builder.create(UnstoppalezzzEntity::new, EntityClassification.CREATURE)
                            .size(0.9f, 1.3f)
                            .build(new ResourceLocation(Main.MOD_ID, "unstoppalezzz_entity").toString()));

    public static final RegistryObject<EntityType<UnstoppalezzzEntityEvil>> UNSTOPPALEZZZEvil_ENTITY = ENTITY_TYPES
            .register("unstoppalezzzevil_entity",
                    () -> EntityType.Builder.create(UnstoppalezzzEntityEvil::new, EntityClassification.CREATURE)
                            .size(0.9f, 1.3f)
                            .build(new ResourceLocation(Main.MOD_ID, "unstoppalezzzevil_entity").toString()));
}