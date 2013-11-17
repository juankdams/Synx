import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Dimension;
import java.awt.Insets;

public class cya extends duy
{
  boolean bY = true;
  boolean aKX = true;

  public cya()
  {
    this.cZv = new dDq[1];
  }

  public dDq cvf()
  {
    return this.cZv[0];
  }

  public void setPixmap(dDq paramdDq) {
    this.cZv[0] = paramdDq;
  }

  public void setHorizontal(boolean paramBoolean) {
    this.bY = paramBoolean;
  }

  public void setVertical(boolean paramBoolean) {
    this.aKX = paramBoolean;
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    int i = paramInsets1.left + paramInsets2.left;
    int j = paramInsets1.right + paramInsets2.right;
    int k = paramInsets1.top + paramInsets2.top;
    int m = paramInsets1.bottom + paramInsets2.bottom;

    int n = paramDimension.width - i - j;
    int i1 = paramDimension.height - k - m;

    this.aVX.clear();

    if (this.cZv[0] != null) {
      int i2 = !this.bY ? n : this.cZv[0].getWidth();
      int i3 = !this.aKX ? i1 : this.cZv[0].getHeight();

      float f1 = n / i2;
      float f2 = i1 / i3;

      int i4 = !this.bY ? 1 : n / i2 + (n % i2 > 0 ? 1 : 0);
      int i5 = !this.aKX ? 1 : i1 / i3 + (i1 % i3 > 0 ? 1 : 0);

      int i6 = i;
      int i7 = paramDimension.height - k;
      int i8 = i7;
      hW(i5 * i4);
      for (int i9 = 0; i9 < i5; i9++) {
        int i10 = i6;
        float f3 = i9 == i5 - 1 ? f2 - i9 : 1.0F;
        for (int i11 = 0; i11 < i4; i11++) {
          float f4 = i11 == i4 - 1 ? f1 - i11 : 1.0F;
          a(i10, i8, (int)(i2 * f4), (int)(i3 * f3), f4, f3, this.cZv[0]);
          i10 += i2;
        }
        i8 -= i3;
      }
      afN();
    }
  }

  protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, dDq paramdDq)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0) || (paramdDq == null) || (paramdDq.hN() == null)) {
      return;
    }
    float f1 = paramdDq.bjK() - paramdDq.bjJ();
    float f2 = paramdDq.bjM() - paramdDq.bjL();
    float f3 = paramdDq.bjJ() + f1 * (paramdDq.getRotation().bVu() ? paramFloat2 : paramFloat1);
    float f4 = paramdDq.bjL() + f2 * (paramdDq.getRotation().bVu() ? paramFloat1 : paramFloat2);

    a(paramInt1, paramInt2, paramInt3, paramInt4, paramdDq, paramdDq.bjL(), paramdDq.bjJ(), f4, f3);
  }
}