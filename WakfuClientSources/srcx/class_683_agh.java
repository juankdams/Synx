import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import java.awt.Insets;

public final class agh extends GX
{
  private dDq[] cZv = new dDq[9];
  private boolean cZw = false;
  private Entity3D aVX;
  private boolean bY = true;
  private bNa bPo;
  private SF cZx;

  public float getDeltaAngle()
  {
    return 0.0F;
  }

  public void setDeltaAngle(float paramFloat) {
  }

  public void setPosition(aFG paramaFG) {
  }

  public aFG getPosition() {
    return null;
  }

  public void setHorizontal(boolean paramBoolean) {
    this.bY = paramBoolean;
  }

  public void setBorderColor(bNa parambNa) {
  }

  public bNa getBorderColor() {
    return null;
  }

  public void setBorder(Insets paramInsets) {
  }

  public Insets getBorder() {
    return null;
  }

  public void setColor(bNa parambNa) {
    if (this.bPo == parambNa) {
      return;
    }

    this.bPo = parambNa;

    QL();
  }

  public bNa getColor() {
    return this.bPo;
  }

  public void setModulationColor(bNa parambNa) {
    super.setModulationColor(parambNa);

    QL();
  }

  private void QL()
  {
    float f4;
    float f3;
    float f2;
    float f1;
    if (this.bPo == null) {
      f1 = f2 = f3 = f4 = 1.0F;
    } else {
      f1 = this.bPo.QC();
      f2 = this.bPo.QD();
      f3 = this.bPo.QE();
      f4 = this.bPo.getAlpha();
    }

    if (this.bPm != null) {
      f1 *= this.bPm.QC();
      f2 *= this.bPm.QD();
      f3 *= this.bPm.QE();
      f4 *= this.bPm.getAlpha();
    }

    this.aVX.setColor(f1, f2, f3, f4);
  }

  public void setFullCirclePercentage(float paramFloat) {
  }

  public float getFullCirclePercentage() {
    return 0.0F;
  }

  public dDq aru()
  {
    return this.cZv[5];
  }

  public void b(dDq paramdDq)
  {
    this.cZv[5] = paramdDq;
    arD();
  }

  public dDq arv()
  {
    return this.cZv[1];
  }

  public void c(dDq paramdDq)
  {
    this.cZv[1] = paramdDq;
    arD();
  }

  public dDq arw()
  {
    return this.cZv[2];
  }

  public void d(dDq paramdDq)
  {
    this.cZv[2] = paramdDq;
    arD();
  }

  public dDq arx()
  {
    return this.cZv[0];
  }

  public void e(dDq paramdDq)
  {
    this.cZv[0] = paramdDq;
    arD();
  }

  public dDq ary()
  {
    return this.cZv[7];
  }

  public void f(dDq paramdDq)
  {
    this.cZv[7] = paramdDq;
    arD();
  }

  public dDq arz()
  {
    return this.cZv[8];
  }

  public void g(dDq paramdDq)
  {
    this.cZv[8] = paramdDq;
    arD();
  }

  public dDq arA()
  {
    return this.cZv[6];
  }

  public void h(dDq paramdDq)
  {
    this.cZv[6] = paramdDq;
    arD();
  }

  public dDq arB()
  {
    return this.cZv[3];
  }

  public void i(dDq paramdDq)
  {
    this.cZv[3] = paramdDq;
    arD();
  }

  public dDq arC()
  {
    return this.cZv[4];
  }

  public void j(dDq paramdDq)
  {
    this.cZv[4] = paramdDq;
    arD();
  }

  public void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8, dDq paramdDq9)
  {
    this.cZv[0] = paramdDq1;
    this.cZv[1] = paramdDq2;
    this.cZv[2] = paramdDq3;
    this.cZv[3] = paramdDq4;
    this.cZv[4] = paramdDq5;
    this.cZv[5] = paramdDq6;
    this.cZv[6] = paramdDq7;
    this.cZv[7] = paramdDq8;
    this.cZv[8] = paramdDq9;

    arD();
  }

  public void setPixmaps(dDq paramdDq) {
    this.cZv[5] = paramdDq;
    arD();
  }

  public void setPixmaps(dDq[] paramArrayOfdDq) {
    this.cZv[0] = paramArrayOfdDq[0];
    this.cZv[1] = paramArrayOfdDq[1];
    this.cZv[2] = paramArrayOfdDq[2];
    this.cZv[3] = paramArrayOfdDq[3];
    this.cZv[4] = paramArrayOfdDq[4];
    this.cZv[5] = paramArrayOfdDq[5];
    this.cZv[6] = paramArrayOfdDq[6];
    this.cZv[7] = paramArrayOfdDq[7];
    this.cZv[8] = paramArrayOfdDq[8];
    arD();
  }

  private void arD()
  {
    if (this.cZv[4] == null) {
      this.cZw = false;
      return;
    }

    int i = 0;
    for (int j = this.cZv.length - 1; j >= 0; j--) {
      if (this.cZv[j] != null) {
        i++;
      }

    }

    if ((i != 1) && (i != 9)) {
      this.cZw = false;
      return;
    }

    this.cZw = true;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat)
  {
    if (!this.cZw) {
      return;
    }

    this.aVX.clear();

    int[] arrayOfInt1 = new int[3];
    int[] arrayOfInt2 = new int[3];

    paramInt3 = (int)(paramInt3 * (this.bY ? paramFloat : 1.0F));
    paramInt4 = (int)(paramInt4 * (this.bY ? 1.0F : paramFloat));

    arrayOfInt1[0] = this.cZv[0].getWidth();
    arrayOfInt1[2] = this.cZv[2].getWidth();
    arrayOfInt1[1] = Math.max(0, paramInt3 - (arrayOfInt1[0] + arrayOfInt1[2]));

    arrayOfInt2[0] = this.cZv[0].getHeight();
    arrayOfInt2[2] = this.cZv[6].getHeight();
    arrayOfInt2[1] = Math.max(0, paramInt4 - (arrayOfInt2[0] + arrayOfInt2[2]));

    hW(9);
    int i = paramInt4 + paramInt2;
    for (int j = 0; j < 3; j++) {
      int k = paramInt1;
      for (int m = 0; m < 3; m++) {
        a(k, i, arrayOfInt1[m], arrayOfInt2[j], this.cZv[(j * 3 + m)]);
        k += arrayOfInt1[m];
      }
      i -= arrayOfInt2[j];
    }
    afN();
  }

  public final Entity getEntity() {
    return this.aVX;
  }

  public final void aJ() {
    if ((!bB) && (this.aVX != null)) throw new AssertionError();
    this.aVX = ((Entity3D)Entity3D.fAs.bQy());
  }

  public final void bc() {
    super.bc();

    this.aVX.axl();
    this.aVX = null;

    this.bPo = null;

    if (this.cZx != null) {
      this.cZx.release();
      this.cZx = null;
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDq paramdDq)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      return;
    }

    this.cZx.a(paramInt1, paramInt2, paramInt3, paramInt4, paramdDq, null);
  }

  private void hW(int paramInt)
  {
    if (this.cZx == null) {
      this.cZx = new SF();
    }
    this.cZx.a(this.aVX, paramInt);
  }

  private void afN() {
    this.cZx.afN();
  }
}