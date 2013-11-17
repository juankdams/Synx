import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.ankamagames.framework.kernel.core.maths.Matrix44.ObjectFactory;
import javax.media.opengl.GL;

public class bdp extends dDv
{
  private EntitySprite fiu;
  private float bOZ;
  private float bPa;
  private float bPb;
  private float bPc;
  private final Matrix44 jdField_for = (Matrix44)Matrix44.bFc.bQx();
  private final Matrix44 fos = (Matrix44)Matrix44.bFc.bQx();
  private final Matrix44 fot = (Matrix44)Matrix44.bFc.bQx();

  public bdp()
  {
    this.fiu = ((EntitySprite)EntitySprite.kYR.bQy());
    this.fiu.mnU = this;
    GLGeometrySprite localGLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.ieZ.bQy();
    this.fiu.a(localGLGeometrySprite);
    this.fiu.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    this.fiu.c(1.0F, -1.0F, 2, 2);
    this.fiu.i(0.0F, 0.0F, 1.0F, 1.0F);
    localGLGeometrySprite.axl();
  }

  public void clear()
  {
    this.fiu.axl();
    this.fiu = null;
  }

  public void update(int paramInt) {
    super.update(paramInt);
    float f = xP();
    this.fiu.setColor(this.bOZ * f, this.bPa * f, this.bPb * f, this.bPc * f);
  }

  public void a(bSr parambSr) {
    GL localGL = (GL)((ayc)parambSr).bZk();
    dsZ localdsZ = dsZ.cZe();

    this.fos.a(parambSr.bZj());
    this.jdField_for.a(parambSr.bZi());
    localGL.glGetFloatv(2983, this.fot.Fj(), 0);

    parambSr.f(Matrix44.bFe);
    parambSr.g(Matrix44.bFe);
    localdsZ.a(localGL, aLv.epN, Matrix44.bFe);

    this.fiu.a(parambSr);

    parambSr.f(this.jdField_for);
    parambSr.g(this.fos);
    localdsZ.a(localGL, aLv.epN, this.fot);
  }

  public void dF(String paramString) {
    if (paramString != null) {
      String str = byn.bFr().bFt() + "textures/" + paramString;
      long l = 0x0 ^ byn.jp(str);
      uz localuz = tq.Bg().a(dHL.lSB.dhZ(), l, str, false);
      this.fiu.setTexture(localuz);
    } else {
      this.fiu.setTexture(null);
    }
  }

  public void setColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.bOZ = paramFloat1;
    this.bPa = paramFloat2;
    this.bPb = paramFloat3;
    this.bPc = paramFloat4;
  }

  public void j(float paramFloat1, float paramFloat2) {
    this.fiu.aGp().b(paramFloat1, paramFloat2, 0.0F);
  }

  public void setSize(float paramFloat1, float paramFloat2) {
    this.fiu.aGp().c(paramFloat1, paramFloat2, 1.0F);
  }

  public void a(cnQ paramcnQ1, cnQ paramcnQ2) {
    this.fiu.cPd().a(paramcnQ1, paramcnQ2);
  }
}