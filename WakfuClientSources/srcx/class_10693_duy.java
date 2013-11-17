import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Dimension;
import java.awt.Insets;

public class duy extends aGI
{
  private boolean iov = false;

  public duy()
  {
    this.cZv = new dDq[9];
  }

  public boolean isScaled()
  {
    return this.iov;
  }

  public void setScaled(boolean paramBoolean) {
    this.iov = paramBoolean;
  }

  public dDq aru()
  {
    return this.cZv[5];
  }

  public void b(dDq paramdDq)
  {
    this.cZv[5] = paramdDq;
  }

  public dDq arv()
  {
    return this.cZv[1];
  }

  public void c(dDq paramdDq)
  {
    this.cZv[1] = paramdDq;
  }

  public dDq arw()
  {
    return this.cZv[2];
  }

  public void d(dDq paramdDq)
  {
    this.cZv[2] = paramdDq;
  }

  public dDq arx()
  {
    return this.cZv[0];
  }

  public void e(dDq paramdDq)
  {
    this.cZv[0] = paramdDq;
  }

  public dDq ary()
  {
    return this.cZv[7];
  }

  public void f(dDq paramdDq)
  {
    this.cZv[7] = paramdDq;
  }

  public dDq arz()
  {
    return this.cZv[8];
  }

  public void g(dDq paramdDq)
  {
    this.cZv[8] = paramdDq;
  }

  public dDq arA()
  {
    return this.cZv[6];
  }

  public void h(dDq paramdDq)
  {
    this.cZv[6] = paramdDq;
  }

  public dDq arB()
  {
    return this.cZv[3];
  }

  public void i(dDq paramdDq)
  {
    this.cZv[3] = paramdDq;
  }

  public dDq arC()
  {
    return this.cZv[4];
  }

  public void j(dDq paramdDq)
  {
    this.cZv[4] = paramdDq;
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
  }

  public void setPixmaps(dDq paramdDq) {
    this.cZv[4] = paramdDq;
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
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    int i = paramInsets1.left + paramInsets2.left;
    int j = paramInsets1.right + paramInsets2.right;
    int k = paramInsets1.top + paramInsets2.top;
    int m = paramInsets1.bottom + paramInsets2.bottom;

    this.aVX.clear();

    if (this.cZv[0] == null) {
      a(paramDimension, i, j, k, m);
      return;
    }

    int[] arrayOfInt1 = new int[3];
    int[] arrayOfInt2 = new int[3];
    int[] arrayOfInt3 = new int[3];
    int[] arrayOfInt4 = new int[3];
    int n = paramInsets1.left;
    int i1 = paramDimension.height - paramInsets1.top;

    arrayOfInt1[0] = this.cZv[0].getWidth();
    arrayOfInt1[2] = this.cZv[2].getWidth();
    arrayOfInt1[1] = (paramDimension.width - (arrayOfInt1[0] + arrayOfInt1[2] + paramInsets1.left + paramInsets1.right));

    arrayOfInt2[0] = this.cZv[0].getHeight();
    arrayOfInt2[2] = this.cZv[6].getHeight();
    arrayOfInt2[1] = (paramDimension.height - (arrayOfInt2[0] + arrayOfInt2[2] + paramInsets1.top + paramInsets1.bottom));
    arrayOfInt3[0] = n;
    arrayOfInt3[1] = (arrayOfInt3[0] + arrayOfInt1[0]);
    arrayOfInt3[2] = (arrayOfInt3[1] + arrayOfInt1[1]);

    arrayOfInt4[0] = i1;
    arrayOfInt4[1] = (arrayOfInt4[0] - arrayOfInt2[0]);
    arrayOfInt4[2] = (arrayOfInt4[1] - arrayOfInt2[1]);

    hW(9);
    for (int i2 = 0; i2 < 3; i2++) {
      for (int i3 = 0; i3 < 3; i3++)
        if ((i2 == 1) && (i3 == 1) && (!this.iov)) {
          dDq localdDq = this.cZv[(i2 * 3 + i3)];
          int i4 = n + (paramDimension.width - (paramInsets1.left + paramInsets1.right) - localdDq.getWidth()) / 2;
          int i5 = i1 - (paramDimension.height - (paramInsets1.top + paramInsets1.bottom) + localdDq.getHeight()) / 2;
          a(i4, i5, localdDq.getWidth(), localdDq.getHeight(), localdDq);
        } else {
          a(arrayOfInt3[i3], arrayOfInt4[i2], arrayOfInt1[i3], arrayOfInt2[i2], this.cZv[(i2 * 3 + i3)]);
        }
    }
    afN();
  }

  private void a(Dimension paramDimension, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int j;
    if (this.iov) {
      i = paramDimension.width - paramInt2 - paramInt1;
      j = paramDimension.height - paramInt3 - paramInt4;
      hW(1);
      a(paramInt1, paramDimension.height - paramInt3, i, j, this.cZv[4]);
      afN();
    } else if (this.cZv[4] != null)
    {
      i = this.cZv[4].getWidth();
      j = this.cZv[4].getHeight();

      int k = (paramDimension.width - paramInt2 - paramInt1 - i) / 2;
      int m = (paramDimension.height - paramInt3 - paramInt4 - j) / 2;

      hW(1);
      a(paramInt1 + k, paramDimension.height - paramInt3 - m, i, j, this.cZv[4]);
      afN();
    }
  }
}