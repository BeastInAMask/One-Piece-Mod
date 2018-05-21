package src.main.java.beast.mods.onepiecemod.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BlockMera extends ModelBase {
            ModelRenderer shape1;
            ModelRenderer shape8;
            ModelRenderer shape2;
            ModelRenderer shape3;
            ModelRenderer shape4;
            ModelRenderer shape5;
            ModelRenderer shape6;
            ModelRenderer shape7;
            ModelRenderer shape9;
            ModelRenderer shape10;

            public BlockMera(Material grass) {
                this.textureWidth = 256;
                this.textureHeight = 256;
                this.shape8 = new ModelRenderer(this, 77, 20);
                this.shape8.setRotationPoint(1.5F, -3.0F, 1.5F);
                this.shape8.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
                this.shape5 = new ModelRenderer(this, 66, 100);
                this.shape5.setRotationPoint(5.0F, 0.0F, 0.0F);
                this.shape5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
                this.shape10 = new ModelRenderer(this, 77, 31);
                this.shape10.setRotationPoint(0.0F, -1.2F, 0.0F);
                this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
                this.setRotateAngle(shape10, -0.40980330836826856F, 0.0F, 0.0F);
                this.shape2 = new ModelRenderer(this, 55, 100);
                this.shape2.setRotationPoint(1.0F, -1.0F, 1.0F);
                this.shape2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
                this.shape4 = new ModelRenderer(this, 44, 92);
                this.shape4.setRotationPoint(-2.0F, 0.0F, 2.0F);
                this.shape4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
                this.shape3 = new ModelRenderer(this, 77, 100);
                this.shape3.setRotationPoint(0.0F, 1.9F, -2.0F);
                this.shape3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
                this.shape1 = new ModelRenderer(this, 34, 92);
                this.shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
                this.shape1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
                this.shape7 = new ModelRenderer(this, 34, 97);
                this.shape7.setRotationPoint(0.0F, -3.0F, 3.0F);
                this.shape7.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
                this.shape6 = new ModelRenderer(this, 88, 97);
                this.shape6.setRotationPoint(-3.0F, 3.0F, 0.0F);
                this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
                this.shape9 = new ModelRenderer(this, 77, 31);
                this.shape9.setRotationPoint(0.0F, 0.0F, -2.0F);
                this.shape9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
                this.shape4.addChild(this.shape5);
                this.shape9.addChild(this.shape10);
                this.shape1.addChild(this.shape2);
                this.shape3.addChild(this.shape4);
                this.shape2.addChild(this.shape3);
                this.shape6.addChild(this.shape7);
                this.shape5.addChild(this.shape6);
                this.shape8.addChild(this.shape9);
            }

            @Override
            public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
                this.shape8.render(f5);
                this.shape1.render(f5);
            }

            /**
             * This is a helper function from Tabula to set the rotation of model parts
             */
            void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
                modelRenderer.rotateAngleX = x;
                modelRenderer.rotateAngleY = y;
                modelRenderer.rotateAngleZ = z;
            }
        }
