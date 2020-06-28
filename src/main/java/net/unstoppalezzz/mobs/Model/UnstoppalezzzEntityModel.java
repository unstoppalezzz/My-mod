package net.unstoppalezzz.mobs.Model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * PlayerModel - Either Mojang or a mod author (Taken From Memory)
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class UnstoppalezzzEntityModel<T extends Entity> extends EntityModel<T> {
    public ModelRenderer Backround6;
    public ModelRenderer Cape;
    public ModelRenderer Backround5;
    public ModelRenderer Backround4;
    public ModelRenderer Backround3;
    public ModelRenderer Backround2;
    public ModelRenderer Backround1;
    public ModelRenderer RightArm;
    public ModelRenderer RightLeg;
    public ModelRenderer head;
    public ModelRenderer Body;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer Backround;

    public UnstoppalezzzEntityModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.5F, 0.0F);
        this.RightArm.addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.Backround3 = new ModelRenderer(this, 40, 32);
        this.Backround3.setRotationPoint(-5.0F, 2.5F, 10.0F);
        this.Backround3.addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.LeftArm = new ModelRenderer(this, 32, 48);
        this.LeftArm.setRotationPoint(5.0F, 2.5F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.Backround2 = new ModelRenderer(this, 32, 0);
        this.Backround2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Backround2.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, 0.5F, 0.5F);
        this.Cape = new ModelRenderer(this, 0, 0);
        this.Cape.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cape.addBox(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.Backround1 = new ModelRenderer(this, 0, 48);
        this.Backround1.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.Backround1.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.Backround = new ModelRenderer(this, 16, 32);
        this.Backround.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Backround.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.Backround5 = new ModelRenderer(this, 48, 48);
        this.Backround5.setRotationPoint(5.0F, 2.5F, 0.0F);
        this.Backround5.addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.Backround4 = new ModelRenderer(this, 0, 32);
        this.Backround4.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.Backround4.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, 0.25F, 0.25F);
        this.Backround6 = new ModelRenderer(this, 24, 0);
        this.Backround6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Backround6.addBox(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 16, 48);
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.Body, this.RightArm, this.Backround3, this.LeftArm, this.Backround2, this.Cape, this.Backround1, this.Backround, this.Backround5, this.Backround4, this.Backround6, this.head, this.RightLeg, this.LeftLeg).forEach((modelRenderer) -> { 
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
