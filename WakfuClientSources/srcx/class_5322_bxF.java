import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bxF
{
  private static final Logger K = Logger.getLogger(bxF.class);
  public static final float giK = 4.0F;
  public static final float giL = 4.0F;
  private static final baN giM = new baN();
  private static final baN giN = new baN();

  public static void ag(String paramString1, String paramString2) {
    giM.ik(paramString1);
    giN.ik(paramString2);
  }

  public static void a(EntityGroup paramEntityGroup, int paramInt1, int paramInt2, int paramInt3, float paramFloat, MD paramMD)
  {
    uz localuz = giM.jP(paramInt1);
    float f1 = R(paramInt2, paramInt3);
    float f2 = Q(paramInt2, paramInt3);

    f2 -= WakfuClientInstance.awy().Dg().apC() / 4.0F;
    try {
      a(paramEntityGroup, localuz, f1, f2, paramFloat, paramMD);
    } catch (NullPointerException localNullPointerException) {
      K.error("problème avec le patch " + paramInt1, localNullPointerException);
    }
  }

  static void b(EntityGroup paramEntityGroup, int paramInt1, int paramInt2, int paramInt3, float paramFloat, MD paramMD)
  {
    uz localuz = giN.jP(paramInt1);
    float f1 = paramInt2 / 9.0F;
    float f2 = paramInt3 / 9.0F;
    float f3 = R(f1, f2);
    float f4 = Q(f1, f2);
    try
    {
      a(paramEntityGroup, localuz, f3, f4, paramFloat, paramMD);
    } catch (NullPointerException localNullPointerException) {
      K.error("problème avec le building " + paramInt1, localNullPointerException);
    }
  }

  private static float Q(float paramFloat1, float paramFloat2) {
    return (paramFloat1 - paramFloat2) * bEW();
  }

  private static float R(float paramFloat1, float paramFloat2) {
    return -(paramFloat1 + paramFloat2) * bEX() + WakfuClientInstance.awy().Dg().apC() * 0.5F;
  }

  private static void a(EntityGroup paramEntityGroup, uz paramuz, float paramFloat1, float paramFloat2, float paramFloat3, MD paramMD)
  {
    if ((paramuz == null) || (paramMD == null)) {
      throw new NullPointerException();
    }
    dSz localdSz = WakfuClientInstance.awy().Dg();
    paramFloat2 += localdSz.r(paramEntityGroup.mnQ, paramEntityGroup.mnR);
    paramFloat1 += localdSz.s(paramEntityGroup.mnQ, paramEntityGroup.mnR) + paramFloat3;

    paramFloat2 += paramMD.getX() / 4.0F / 9.0F;
    paramFloat1 += paramMD.getY() / 4.0F / 9.0F;

    MD localMD = paramuz.cqv();

    EntitySprite localEntitySprite = d(paramuz);
    localEntitySprite.c(paramFloat1, paramFloat2, localMD.getX() + 1, localMD.getY() + 1);

    localEntitySprite.aEf = bCO.bD(paramFloat2);
    localEntitySprite.aEg = bCO.bD(paramFloat1);
    localEntitySprite.aEh = bCO.aB(paramFloat2 + localMD.getX());
    localEntitySprite.aEi = bCO.aB(paramFloat1 - localMD.getY());
    paramEntityGroup.d(localEntitySprite);
    localEntitySprite.axl();
  }

  private static EntitySprite d(uz paramuz) {
    MD localMD1 = paramuz.cqv();
    MD localMD2 = paramuz.cqw();

    GLGeometrySprite localGLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.ieZ.bQy();
    localGLGeometrySprite.a(cnQ.hUU, cnQ.hUY);
    localGLGeometrySprite.c(0.0F, 0.0F, localMD1.getX(), localMD1.getY());
    localGLGeometrySprite.i(0.0F, 0.0F, localMD1.getY() / localMD2.getY(), localMD1.getX() / localMD2.getX());

    EntitySprite localEntitySprite = (EntitySprite)EntitySprite.kYR.bQy();
    localEntitySprite.a(localGLGeometrySprite);
    localEntitySprite.setTexture(paramuz);
    localEntitySprite.dsJ();

    localEntitySprite.setColor(0.5F, 0.5F, 0.5F, 1.0F);
    localGLGeometrySprite.axl();
    return localEntitySprite;
  }

  private static float bEW() {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    return 0.5F * localdSz.apB() / 4.0F;
  }

  private static float bEX() {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    return 0.5F * localdSz.apC() / 4.0F;
  }
}