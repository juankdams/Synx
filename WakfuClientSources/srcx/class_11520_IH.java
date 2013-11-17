import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import org.apache.log4j.Logger;

public class IH
  implements Uq
{
  private static final Logger K = Logger.getLogger(IH.class);
  public static final int bRJ = 1000;
  public static final int bRK = 1000;
  private bZd bRL;
  private int bmM;
  private int bRM;
  private int bRN = 1000;
  private float[] bRO;
  private float[] bRP;
  private float[] bRQ;
  private final EntitySprite bRR;
  private DB bRS;
  private final ArrayList aBf = new ArrayList();
  private final ArrayList bRT = new ArrayList();

  private static final IH bRU = new IH();

  int bRV = 0;

  private IH()
  {
    this.bRP = new float[4];
    this.bRO = new float[4];
    this.bRQ = new float[4];
    this.bRP[3] = 0.0F;
    this.bRO[3] = 1.0F;
    this.bmM = 0;
    this.bRM = 1000;
    this.bRL = bZd.hpw;

    this.bRR = ((EntitySprite)EntitySprite.kYR.bQx());
    this.bRR.mnU = this;
    GLGeometrySprite localGLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.ieZ.bQx();
    this.bRR.a(localGLGeometrySprite);
    localGLGeometrySprite.axl();
    this.bRR.setColor(this.bRO[0], this.bRO[1], this.bRO[2], this.bRO[3]);
    this.bRR.setTexture(null);
    this.bRR.setVisible(false);
    this.bRR.cPd().a(cnQ.hUX, cnQ.hUY);
  }

  public static IH Sd()
  {
    return bRU;
  }

  public final boolean Se() {
    return this.bRL == bZd.hpt;
  }

  public final boolean Sf() {
    return this.bRL == bZd.hpv;
  }

  public final boolean Sg() {
    return this.bRL == bZd.hpu;
  }

  public final boolean Sh() {
    return this.bRL == bZd.hpw;
  }

  public final void fm(int paramInt) {
    this.bRN = paramInt;
  }

  public final void a(int paramInt, DB paramDB) {
    if (this.bRL == bZd.hpu) {
      K.error("problème de fade ", new Exception());
    }
    this.bRS = paramDB;
    c(paramInt, bNa.gRy);
    a(bZd.hpt);
  }

  public final void cz(int paramInt)
  {
    if (this.bRL == bZd.hpu) {
      this.bRV += paramInt;
      if (this.bRV > 10000) {
        this.bRV = 0;
      }
      for (int i = this.bRT.size() - 1; i >= 0; i--) {
        if (!((bOl)this.bRT.get(i)).isValid())
          return;
      }
      if (this.bRV == 0);
      this.bRV = 0;
      fn(this.bRN);
      return;
    }
    if (this.bRL == bZd.hpw) {
      return;
    }

    this.bmM += paramInt;
    if (this.bmM > this.bRM) {
      this.bmM = this.bRM;
      this.bRQ[0] = this.bRO[0];
      this.bRQ[1] = this.bRO[1];
      this.bRQ[2] = this.bRO[2];
      this.bRQ[3] = this.bRO[3];
      if (this.bRL == bZd.hpt) {
        a(bZd.hpu);
        this.bRS = null;
      } else {
        a(bZd.hpw);
      }
    } else { float f = this.bmM / this.bRM;
      this.bRQ[0] = bCO.s(this.bRP[0], this.bRO[0], f);
      this.bRQ[1] = bCO.s(this.bRP[1], this.bRO[1], f);
      this.bRQ[2] = bCO.s(this.bRP[2], this.bRO[2], f);
      this.bRQ[3] = bCO.s(this.bRP[3], this.bRO[3], f);
    }

    this.bRR.setColor(this.bRQ[0], this.bRQ[1], this.bRQ[2], this.bRQ[3]);
    this.bRR.setVisible(this.bRQ[3] > 0.004F);
  }

  public void init(GLAutoDrawable paramGLAutoDrawable) {
  }

  public final void W(int paramInt1, int paramInt2) {
    this.bRR.c(paramInt2 / 2, -paramInt1 / 2, paramInt1, paramInt2);
    if (this.bRS != null)
      this.bRS.W(paramInt1, paramInt2);
  }

  public void a(GL paramGL)
  {
    if (this.bRL == bZd.hpw)
      return;
    if (this.bRS != null)
      this.bRS.a(paramGL);
    ayc localayc = dHL.lSB.dhZ();
    localayc.g(Matrix44.bFe);
    this.bRR.a(localayc);
  }

  public final void a(dnV paramdnV) {
    this.aBf.add(paramdnV);
  }

  public final void b(dnV paramdnV) {
    this.aBf.remove(paramdnV);
  }

  public final void a(bOl parambOl) {
    this.bRT.add(parambOl);
  }

  public final void b(bOl parambOl) {
    this.bRT.remove(parambOl);
  }

  private void fn(int paramInt)
  {
    if (this.bRS != null)
      this.bRS.uninitialize();
    this.bRS = null;
    c(paramInt, bNa.gRt);
    a(bZd.hpv);
  }

  private void c(int paramInt, bNa parambNa) {
    this.bRP[0] = this.bRQ[0];
    this.bRP[1] = this.bRQ[1];
    this.bRP[2] = this.bRQ[2];
    this.bRP[3] = this.bRQ[3];
    this.bRO[0] = parambNa.QC();
    this.bRO[1] = parambNa.QD();
    this.bRO[2] = parambNa.QE();
    this.bRO[3] = parambNa.getAlpha();
    this.bRM = paramInt;
    this.bmM = 0;
  }

  public final void reset() {
    a(bZd.hpu);
  }

  private void a(bZd parambZd) {
    if (this.bRL == parambZd) {
      return;
    }
    bZd localbZd = this.bRL;
    this.bRL = parambZd;

    for (int i = this.aBf.size() - 1; i >= 0; i--)
      this.bRL.c((dnV)this.aBf.get(i));
  }
}