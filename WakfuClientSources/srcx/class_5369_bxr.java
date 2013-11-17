import java.util.ArrayList;

public class bxr extends cKq
{
  private float[] ghJ;
  private float[] ghK;
  private float[] ghL;
  private int[] ghM;
  private int[] ggy;
  private int[] ghN;
  private Su ghO;

  public bxr(cbk paramcbk1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, int[] paramArrayOfInt4, int[] paramArrayOfInt5, cbk paramcbk2, int paramInt1, int paramInt2, int paramInt3, ddp paramddp)
  {
    be(paramArrayOfInt1);
    bf(paramArrayOfInt2);
    a(paramcbk2);
    setDelay(paramInt1);
    setDuration(paramInt2);
    yc(paramInt3);
    setTweenFunction(paramddp);

    this.ghJ = paramArrayOfFloat1;
    this.ghK = paramArrayOfFloat2;
    this.ghL = paramArrayOfFloat3;
    this.ggy = paramArrayOfInt4;
    this.ghM = paramArrayOfInt5;
    this.ghN = paramArrayOfInt3;

    this.ghO = cbk.b(paramcbk1).Ih();

    cbk.a(paramcbk1, true);
  }

  public boolean aH(int paramInt)
  {
    if (!super.aH(paramInt)) {
      return false;
    }

    if (this.dRn != null)
    {
      int i = cbk.c(this.cfA).getMesh().bDE().getHeight();
      int[] arrayOfInt1 = (int[])this.iJh;
      int[] arrayOfInt2 = (int[])this.iJi;
      int j = cbk.c(this.cfA).getMesh().bDE().getWidth();
      int k = this.cfA.getAppearance().getContentWidth() - j;

      float[] arrayOfFloat = new float[this.ghJ.length];
      int[] arrayOfInt3 = new int[arrayOfInt1.length];

      for (int m = 0; m < arrayOfInt1.length; m++) {
        arrayOfInt3[m] = ((int)this.dRn.a(arrayOfInt1[m], arrayOfInt2[m], this.bmM, this.aKS));
        arrayOfFloat[m] = this.dRn.a(this.ghJ[m], this.ghK[m], this.bmM, this.aKS);
      }

      for (m = 0; (m < arrayOfInt3.length) && (m < cbk.d(this.cfA).size()); m++) {
        caF localcaF = (caF)cbk.d(this.cfA).get(m);
        i1 = aFG.eck.bb(localcaF.getHeight(), i) - i;
        localcaF.setPosition(aFG.eck.ba(localcaF.getWidth(), j) + 6 + k, arrayOfInt3[m] + i1);
      }

      m = cbk.c(this.cfA).getMesh().bDE().getHeight();
      int n = 0;
      axU localaxU;
      Object localObject;
      int i2;
      int i3;
      for (int i1 = cbk.e(this.cfA).size(); n < i1; n++) {
        localaxU = (axU)cbk.e(this.cfA).get(n);
        localObject = ((Su)localaxU.getItemValue()).adI();
        i2 = localObject != null ? ((dpa)localObject).cWv() : 1;
        i3 = localObject != null ? ((dpa)localObject).cWu() : 0;
        int i4 = 0;
        int i8;
        for (i8 : this.ghM) {
          if (i8 == i2)
            break;
          i4++;
        }

        int i5 = aFG.eck.bb(localaxU.getHeight(), m);

        if (arrayOfInt3.length == 0)
          ??? = 0;
        else if (i4 == arrayOfInt3.length)
          ??? = arrayOfInt3[(arrayOfInt3.length - 1)] - m + i5;
        else {
          ??? = arrayOfInt3[i4] - m + i5;
        }

        ??? = 0;

        if (i4 + 1 < arrayOfInt3.length) {
          i8 = arrayOfInt3[(i4 + 1)] - arrayOfInt3[i4] - (int)(m * 0.5F);
          ??? = (int)(i3 / cbk.f(this.cfA) * i8);
        }

        localaxU.setPosition(12 + k, ??? + ???);
      }

      n = 0; for (i1 = cbk.e(this.cfA).size(); n < i1; n++) {
        localaxU = (axU)cbk.e(this.cfA).get(n);
        localObject = (axU)cbk.g(this.cfA).get(n);

        i2 = localaxU.getX() - localaxU.getWidth();
        i3 = localaxU.getY();

        i2 = cbk.getAdjustedX((axU)localObject, i2, i3, n, cbk.g(this.cfA), this.ghO);

        ((axU)localObject).setPosition(i2, i3);
        if (((axU)localObject).getItemValue() == this.ghO) {
          cbk.h(this.cfA).setPosition(i2 - cbk.h(this.cfA).getWidth(), i3);
        }
      }

      cbk.c(this.cfA).setPixelSeparations(arrayOfInt3, this.ghM, arrayOfFloat);
    }

    return true;
  }

  public void nv() {
    int[] arrayOfInt1 = this.ghN;

    int i = cbk.c(this.cfA).getMesh().bDE().getHeight();
    int j = cbk.c(this.cfA).getMesh().bDE().getWidth();
    int k = this.cfA.getAppearance().getContentWidth() - j;

    cbk.c(this.cfA).setPixelSeparations(arrayOfInt1, this.ggy, this.ghL);
    for (int m = 0; (m < arrayOfInt1.length) && (m < cbk.d(this.cfA).size()); m++) {
      caF localcaF = (caF)cbk.d(this.cfA).get(m);
      i1 = aFG.eck.bb(localcaF.getHeight(), i) - i;
      localcaF.setPosition(aFG.eck.ba(localcaF.getWidth(), j) + 6 + k, arrayOfInt1[m] + i1);
    }

    m = cbk.c(this.cfA).getMesh().bDE().getHeight();
    int n = 0;
    axU localaxU;
    Object localObject;
    int i2;
    int i3;
    for (int i1 = cbk.e(this.cfA).size(); n < i1; n++) {
      localaxU = (axU)cbk.e(this.cfA).get(n);
      localObject = ((Su)localaxU.getItemValue()).adI();
      i2 = localObject != null ? ((dpa)localObject).cWv() : 1;
      i3 = localObject != null ? ((dpa)localObject).cWu() : 0;
      int i4 = aFG.eck.bb(localaxU.getHeight(), m);

      int i5 = 0;
      for (int i9 : this.ggy) {
        if (i9 == i2)
          break;
        i5++;
      }

      int i6 = -m + i4;
      if (i5 < arrayOfInt1.length) {
        i6 += arrayOfInt1[i5];
      }

      ??? = 0;

      if (i5 + 1 < arrayOfInt1.length) {
        ??? = arrayOfInt1[(i5 + 1)] - arrayOfInt1[i5] - (int)(m * 0.5F);
        ??? = (int)(i3 / cbk.f(this.cfA) * ???);
      }

      localaxU.setPosition(12 + k, i6 + ???);
    }

    n = 0; for (i1 = cbk.e(this.cfA).size(); n < i1; n++) {
      localaxU = (axU)cbk.e(this.cfA).get(n);
      localObject = (axU)cbk.g(this.cfA).get(n);

      i2 = localaxU.getX() - localaxU.getWidth();
      i3 = localaxU.getY();

      i2 = cbk.getAdjustedX((axU)localObject, i2, i3, n, cbk.g(this.cfA), this.ghO);

      ((axU)localObject).setPosition(i2, i3);

      if (((axU)localObject).getItemValue() == this.ghO) {
        cbk.h(this.cfA).setPosition(i2 - cbk.h(this.cfA).getWidth(), i3);
      }
    }

    cbk.i(this.cfA);

    cbk.a(this.cfA, false);
    super.nv();
  }
}