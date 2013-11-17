import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Dimension;
import java.awt.Insets;

public class cvI extends cRZ
{
  public cvI()
  {
    this.cZv = new dDq[8];
  }

  public void setInsets(Insets paramInsets)
  {
  }

  public dDq aru()
  {
    return this.cZv[4];
  }

  public void b(dDq paramdDq)
  {
    this.cZv[4] = paramdDq;
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
    return this.cZv[6];
  }

  public void f(dDq paramdDq)
  {
    this.cZv[6] = paramdDq;
    arD();
  }

  public dDq arz()
  {
    return this.cZv[7];
  }

  public void g(dDq paramdDq)
  {
    this.cZv[7] = paramdDq;
    arD();
  }

  public dDq arA()
  {
    return this.cZv[5];
  }

  public void h(dDq paramdDq)
  {
    this.cZv[5] = paramdDq;
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

  public void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8)
  {
    this.cZv[0] = paramdDq1;
    this.cZv[1] = paramdDq2;
    this.cZv[2] = paramdDq3;
    this.cZv[3] = paramdDq4;
    this.cZv[4] = paramdDq5;
    this.cZv[5] = paramdDq6;
    this.cZv[6] = paramdDq7;
    this.cZv[7] = paramdDq8;

    arD();
  }

  public boolean biY()
  {
    return this.cZw;
  }

  public void a(Insets paramInsets)
  {
    if (paramInsets != null) {
      paramInsets.top = Math.max(this.cZv[0].getHeight(), Math.max(this.cZv[1].getHeight(), this.cZv[2].getHeight()));
      paramInsets.bottom = Math.max(this.cZv[5].getHeight(), Math.max(this.cZv[6].getHeight(), this.cZv[7].getHeight()));
      paramInsets.left = Math.max(this.cZv[0].getWidth(), Math.max(this.cZv[3].getWidth(), this.cZv[5].getWidth()));
      paramInsets.right = Math.max(this.cZv[2].getWidth(), Math.max(this.cZv[4].getWidth(), this.cZv[7].getWidth()));
    }
  }

  private void arD()
  {
    for (int i = this.cZv.length - 1; i >= 0; i--) {
      if (this.cZv[i] == null) {
        this.cZw = false;
        return;
      }
    }

    this.cZw = true;
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    int i = paramInsets1.left + paramInsets2.left;
    int j = paramInsets1.right + paramInsets2.right;
    int k = paramInsets1.top + paramInsets2.top;
    int m = paramInsets1.bottom + paramInsets2.bottom;

    this.aVX.clear();

    int[] arrayOfInt1 = new int[3];
    int[] arrayOfInt2 = new int[3];
    int n = paramInsets1.left;
    int i1 = paramDimension.height - paramInsets1.top;

    arrayOfInt1[0] = paramInsets2.left;
    arrayOfInt1[1] = (paramDimension.width - i - j);
    arrayOfInt1[2] = paramInsets2.right;

    arrayOfInt2[0] = paramInsets2.top;
    arrayOfInt2[1] = (paramDimension.height - k - m);
    arrayOfInt2[2] = paramInsets2.bottom;

    int i2 = i1;
    int i3 = 0;
    hW(9);
    for (int i4 = 0; i4 < 3; i4++) {
      int i5 = n;
      for (int i6 = 0; i6 < 3; i6++) {
        if ((i6 != 1) || (i4 != 1)) {
          a(i5, i2, arrayOfInt1[i6], arrayOfInt2[i4], this.cZv[i3]);
          i3++;
        }
        i5 += arrayOfInt1[i6];
      }
      i2 -= arrayOfInt2[i4];
    }
    afN();
  }
}