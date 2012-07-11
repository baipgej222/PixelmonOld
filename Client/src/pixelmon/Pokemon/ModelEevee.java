// Date: 5/6/2012 1:09:16 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelEevee extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer fluff1;
    ModelRenderer fluff2;
    ModelRenderer fluff3;
    ModelRenderer fluff4;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer rightear;
    ModelRenderer leftear;
    ModelRenderer TailX;
    ModelRenderer Nose;
    ModelRenderer TailY;
  
  public ModelEevee()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-1.5F, -4F, -1.5F, 3, 4, 3);
      Head.setRotationPoint(-0.5F, 18F, -3F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 13);
      Body.addBox(-1.5F, -2F, -3F, 3, 6, 3);
      Body.setRotationPoint(-0.5F, 18F, -2F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 1.570796F, 0F, 0F);
      Mane = new ModelRenderer(this, 0, 7);
      Mane.addBox(-2F, -2F, -2F, 4, 4, 2);
      Mane.setRotationPoint(-0.5F, 17F, -3F);
      Mane.setTextureSize(64, 64);
      Mane.mirror = true;
      setRotation(Mane, 1.937315F, 0F, 0F);
      fluff1 = new ModelRenderer(this, 24, 4);
      fluff1.addBox(-2F, 0F, 0F, 4, 3, 0);
      fluff1.setRotationPoint(1.5F, 17F, -3F);
      fluff1.setTextureSize(64, 64);
      fluff1.mirror = true;
      setRotation(fluff1, 0.1047198F, 1.570796F, 0.3490659F);
      fluff2 = new ModelRenderer(this, 24, 0);
      fluff2.addBox(-2F, 0F, 0F, 4, 3, 0);
      fluff2.setRotationPoint(-0.5F, 17.8F, -4.8F);
      fluff2.setTextureSize(64, 64);
      fluff2.mirror = true;
      setRotation(fluff2, 0F, 0F, 0F);
      fluff3 = new ModelRenderer(this, 24, 8);
      fluff3.addBox(-2F, 0F, 0F, 4, 3, 0);
      fluff3.setRotationPoint(-2.5F, 17F, -3F);
      fluff3.setTextureSize(64, 64);
      fluff3.mirror = true;
      setRotation(fluff3, -0.1047198F, 1.570796F, 0.3490659F);
      fluff4 = new ModelRenderer(this, 24, 12);
      fluff4.addBox(-2F, 0F, 0F, 4, 2, 0);
      fluff4.setRotationPoint(-0.5F, 16.3F, -1.1F);
      fluff4.setTextureSize(64, 64);
      fluff4.mirror = true;
      setRotation(fluff4, 0.5585054F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 12, 0);
      Leg1.addBox(-1F, 0F, 0F, 1, 3, 1);
      Leg1.setRotationPoint(-1F, 21F, 1F);
      Leg1.setTextureSize(64, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 12, 0);
      Leg2.addBox(0F, 0F, 0F, 1, 3, 1);
      Leg2.setRotationPoint(0F, 21F, 1F);
      Leg2.setTextureSize(64, 64);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 12, 0);
      Leg3.addBox(-1F, 0F, -1F, 1, 3, 1);
      Leg3.setRotationPoint(-1F, 21F, -3F);
      Leg3.setTextureSize(64, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 12, 0);
      Leg4.addBox(0F, 0F, -1F, 1, 3, 1);
      Leg4.setRotationPoint(0F, 21F, -3F);
      Leg4.setTextureSize(64, 64);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      rightear = new ModelRenderer(this, 17, 0);
      rightear.addBox(-4.5F, -6.2F, 1F, 3, 3, 0);
      rightear.setRotationPoint(-0.5F, 18F, -3F);
      rightear.setTextureSize(64, 64);
      rightear.mirror = true;
      setRotation(rightear, 0F, 0F, 0.1396263F);
      leftear = new ModelRenderer(this, 17, 0);
      leftear.addBox(-6.2F, -4.5F, 1F, 3, 3, 0);
      leftear.setRotationPoint(-0.5F, 18F, -3F);
      leftear.setTextureSize(64, 64);
      leftear.mirror = true;
      setRotation(leftear, 0F, 0F, 1.43117F);
      TailX = new ModelRenderer(this, 0, 18);
      TailX.addBox(0F, 0F, -2.5F, 0, 6, 5);
      TailX.setRotationPoint(-0.5F, 18.5F, 1.5F);
      TailX.setTextureSize(64, 64);
      TailX.mirror = true;
      setRotation(TailX, 2.356194F, 0F, 0F);
      Nose = new ModelRenderer(this, 18, 4);
      Nose.addBox(-0.5F, -2.3F, -0.5F, 1, 0, 1);
      Nose.setRotationPoint(-0.5F, 18F, -3F);
      Nose.setTextureSize(64, 64);
      Nose.mirror = true;
      setRotation(Nose, 0.3839724F, 0.7679449F, 0.3839724F);
      TailY = new ModelRenderer(this, 0, 23);
      TailY.addBox(-2.5F, 0F, 0F, 5, 6, 0);
      TailY.setRotationPoint(-0.5F, 18.5F, 1.5F);
      TailY.setTextureSize(64, 64);
      TailY.mirror = true;
      setRotation(TailY, 2.356194F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.render(f5);
    Body.render(f5);
    Mane.render(f5);
    fluff1.render(f5);
    fluff2.render(f5);
    fluff3.render(f5);
    fluff4.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    rightear.render(f5);
    leftear.render(f5);
    TailX.render(f5);
    Nose.render(f5);
    TailY.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
    
    Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    Leg1.rotateAngleY = 0.0F;
    Leg2.rotateAngleY = 0.0F;
    Leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    Leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    Leg4.rotateAngleY = 0.0F;
    Leg3.rotateAngleY = 0.0F;
  }

}
