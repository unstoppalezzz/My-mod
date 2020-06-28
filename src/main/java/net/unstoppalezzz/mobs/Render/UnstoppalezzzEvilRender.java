package net.unstoppalezzz.mobs.Render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.unstoppalezzz.mobs.Main;
import net.unstoppalezzz.mobs.Model.UnstoppalezzzEntityEvilModel;
import net.unstoppalezzz.mobs.Model.UnstoppalezzzEntityModel;
import net.unstoppalezzz.mobs.entitys.UnstoppalezzzEntityEvil;

public class UnstoppalezzzEvilRender extends MobRenderer<UnstoppalezzzEntityEvil, UnstoppalezzzEntityEvilModel<UnstoppalezzzEntityEvil>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID,
            "textures/entity/example_entity_evil.png");

    public UnstoppalezzzEvilRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new UnstoppalezzzEntityEvilModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(UnstoppalezzzEntityEvil entity) {
        return TEXTURE;
    }
}
