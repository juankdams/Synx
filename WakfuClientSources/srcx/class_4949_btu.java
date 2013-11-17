import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import java.awt.Dimension;
import java.awt.Insets;

public class btu extends cRZ
{
  private dDq[] cZv = new dDq[16];
  private boolean cZw;

  public void a(dDq paramdDq, ajb paramajb)
  {
    switch (bAj.aHB[paramajb.ordinal()]) {
    case 1:
      this.cZv[0] = paramdDq;
      break;
    case 2:
      this.cZv[1] = paramdDq;
      break;
    case 3:
      this.cZv[2] = paramdDq;
      break;
    case 4:
      this.cZv[3] = paramdDq;
      break;
    case 5:
      this.cZv[4] = paramdDq;
      break;
    case 6:
      this.cZv[5] = paramdDq;
      break;
    case 7:
      this.cZv[6] = paramdDq;
      break;
    case 8:
      this.cZv[7] = paramdDq;
      break;
    case 9:
      this.cZv[8] = paramdDq;
      break;
    case 10:
      this.cZv[9] = paramdDq;
      break;
    case 11:
      this.cZv[10] = paramdDq;
      break;
    case 12:
      this.cZv[11] = paramdDq;
      break;
    case 13:
      this.cZv[12] = paramdDq;
      break;
    case 14:
      this.cZv[13] = paramdDq;
      break;
    case 15:
      this.cZv[14] = paramdDq;
      break;
    case 16:
      this.cZv[15] = paramdDq;
    }

    arD();
  }

  public void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8, dDq paramdDq9, dDq paramdDq10, dDq paramdDq11, dDq paramdDq12, dDq paramdDq13, dDq paramdDq14, dDq paramdDq15, dDq paramdDq16)
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
    this.cZv[9] = paramdDq10;
    this.cZv[10] = paramdDq11;
    this.cZv[11] = paramdDq12;
    this.cZv[12] = paramdDq13;
    this.cZv[13] = paramdDq14;
    this.cZv[14] = paramdDq15;
    this.cZv[15] = paramdDq16;

    arD();
  }

  public void setPixmaps(dDq[] paramArrayOfdDq)
  {
    this.cZv[0] = paramArrayOfdDq[0];
    this.cZv[1] = paramArrayOfdDq[1];
    this.cZv[2] = paramArrayOfdDq[2];
    this.cZv[3] = paramArrayOfdDq[3];
    this.cZv[4] = paramArrayOfdDq[4];
    this.cZv[5] = paramArrayOfdDq[5];
    this.cZv[6] = paramArrayOfdDq[6];
    this.cZv[7] = paramArrayOfdDq[7];
    this.cZv[8] = paramArrayOfdDq[8];
    this.cZv[9] = paramArrayOfdDq[9];
    this.cZv[10] = paramArrayOfdDq[10];
    this.cZv[11] = paramArrayOfdDq[11];
    this.cZv[12] = paramArrayOfdDq[12];
    this.cZv[13] = paramArrayOfdDq[13];
    this.cZv[14] = paramArrayOfdDq[14];
    this.cZv[15] = paramArrayOfdDq[15];

    arD();
  }

  public final boolean biY()
  {
    return this.cZw;
  }

  public void a(Insets paramInsets)
  {
    if (paramInsets != null) {
      paramInsets.top = Math.max(this.cZv[0].getHeight(), Math.max(this.cZv[2].getHeight(), Math.max(this.cZv[4].getHeight(), Math.max(this.cZv[1].getHeight(), this.cZv[3].getHeight()))));
      paramInsets.bottom = Math.max(this.cZv[11].getHeight(), Math.max(this.cZv[13].getHeight(), Math.max(this.cZv[15].getHeight(), Math.max(this.cZv[12].getHeight(), this.cZv[14].getHeight()))));
      paramInsets.left = Math.max(this.cZv[0].getWidth(), Math.max(this.cZv[7].getWidth(), Math.max(this.cZv[11].getWidth(), Math.max(this.cZv[5].getWidth(), this.cZv[9].getWidth()))));
      paramInsets.right = Math.max(this.cZv[4].getWidth(), Math.max(this.cZv[8].getWidth(), Math.max(this.cZv[15].getWidth(), Math.max(this.cZv[6].getWidth(), this.cZv[10].getWidth()))));
    }
  }

  public final void bc() {
    this.aVX.axl();
    this.aVX = null;
  }

  public final void aJ() {
    arD();
    if ((!bB) && (this.aVX != null)) throw new AssertionError();
    this.aVX = ((Entity3D)Entity3D.fAs.bQy());
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    if (!this.cZw) {
      return;
    }

    this.aVX.clear();

    hW(this.cZv.length);
    for (int i = 0; i < this.cZv.length; i++) {
      int j = a(paramDimension, paramInsets1, paramInsets2, i);
      int k = b(paramDimension, paramInsets1, paramInsets2, i);
      int m = c(paramDimension, paramInsets1, paramInsets2, i);
      int n = d(paramDimension, paramInsets1, paramInsets2, i);
      a(j, k, m, n, this.cZv[i]);
    }
    afN();
  }

  private int a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, int paramInt)
  {
    if ((paramInt == 0) || (paramInt == 5) || (paramInt == 7) || (paramInt == 9) || (paramInt == 11))
      return paramInsets1.left;
    if ((paramInt == 1) || (paramInt == 12))
      return paramInsets1.left + paramInsets2.left;
    if ((paramInt == 2) || (paramInt == 13))
      return paramInsets1.left + paramInsets2.left + this.cZv[(paramInt - 1)].getWidth();
    if ((paramInt == 3) || (paramInt == 14))
      return paramDimension.width - paramInsets1.left - paramInsets1.right - paramInsets2.right - this.cZv[paramInt].getWidth();
    if ((paramInt == 4) || (paramInt == 6) || (paramInt == 8) || (paramInt == 10) || (paramInt == 15)) {
      return paramDimension.width - paramInsets1.left - paramInsets1.right - paramInsets2.right;
    }
    if (!bB) throw new AssertionError("We should never end here");
    return 0;
  }

  private int b(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, int paramInt) {
    if ((paramInt == 0) || (paramInt == 1) || (paramInt == 2) || (paramInt == 3) || (paramInt == 4))
      return paramDimension.height - paramInsets1.top;
    if ((paramInt == 5) || (paramInt == 6))
      return paramDimension.height - (paramInsets1.top + paramInsets2.top);
    if ((paramInt == 7) || (paramInt == 8))
      return paramDimension.height - (paramInsets1.top + paramInsets2.top + this.cZv[(paramInt - 2)].getHeight());
    if ((paramInt == 9) || (paramInt == 10))
      return paramInsets1.bottom + paramInsets2.bottom + this.cZv[paramInt].getHeight();
    if ((paramInt == 11) || (paramInt == 12) || (paramInt == 13) || (paramInt == 14) || (paramInt == 15)) {
      return paramInsets1.bottom + paramInsets2.bottom;
    }
    if (!bB) throw new AssertionError("We should never end here");
    return 0;
  }

  private int c(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, int paramInt) {
    if ((paramInt == 0) || (paramInt == 5) || (paramInt == 7) || (paramInt == 9) || (paramInt == 11))
      return paramInsets2.left;
    if ((paramInt == 1) || (paramInt == 12))
      return this.cZv[paramInt].getWidth();
    if (paramInt == 2)
      return paramDimension.width - paramInsets1.left - paramInsets1.right - paramInsets2.left - paramInsets2.right - this.cZv[1].getWidth() - this.cZv[3].getWidth();
    if (paramInt == 13)
      return paramDimension.width - paramInsets1.left - paramInsets1.right - paramInsets2.left - paramInsets2.right - this.cZv[12].getWidth() - this.cZv[14].getWidth();
    if ((paramInt == 3) || (paramInt == 14))
      return this.cZv[paramInt].getWidth();
    if ((paramInt == 4) || (paramInt == 6) || (paramInt == 8) || (paramInt == 10) || (paramInt == 15)) {
      return paramInsets2.right;
    }
    if (!bB) throw new AssertionError("We should never end here");
    return 0;
  }

  private int d(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, int paramInt) {
    if ((paramInt == 0) || (paramInt == 1) || (paramInt == 2) || (paramInt == 3) || (paramInt == 4))
      return paramInsets2.top;
    if ((paramInt == 5) || (paramInt == 6))
      return this.cZv[paramInt].getHeight();
    if (paramInt == 7)
      return paramDimension.height - paramInsets1.top - paramInsets1.bottom - paramInsets2.top - paramInsets2.bottom - this.cZv[5].getHeight() - this.cZv[9].getHeight();
    if (paramInt == 8)
      return paramDimension.height - paramInsets1.top - paramInsets1.bottom - paramInsets2.top - paramInsets2.bottom - this.cZv[6].getHeight() - this.cZv[10].getHeight();
    if ((paramInt == 9) || (paramInt == 10))
      return this.cZv[paramInt].getHeight();
    if ((paramInt == 11) || (paramInt == 12) || (paramInt == 13) || (paramInt == 14) || (paramInt == 15)) {
      return paramInsets2.bottom;
    }
    if (!bB) throw new AssertionError("We should never end here");
    return 0;
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
}