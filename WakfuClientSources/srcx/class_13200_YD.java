import java.util.ArrayList;
import java.util.List;

public class YD
  implements bmC, ckr
{
  private cEi cJw = new cEi();
  private cEi cJx = new cEi();
  private cEi cJy = new cEi();
  private cEi cJz = new cEi();
  private float cxA;
  private float cxz;
  private float cJA;
  private float cJB;
  private float cJC;
  private float cJD;
  private float cxy;
  private float cJE;
  private float aHl;
  private float cJF;
  private float cJG;
  private float cJH;
  private boolean cJI;
  private long cJJ;
  private long cJK;

  public YD()
  {
    this.cJI = true;
  }

  public YD(YD paramYD) {
    this.cJw.m(paramYD.cJw.getX(), paramYD.cJw.getY(), paramYD.cJw.aCv());
    this.cJx.m(paramYD.cJx.getX(), paramYD.cJx.getY(), paramYD.cJx.aCv());
    this.cJy.m(paramYD.cJy.getX(), paramYD.cJy.getY(), paramYD.cJy.aCv());
    this.cJz.m(paramYD.cJz.getX(), paramYD.cJz.getY(), paramYD.cJz.aCv());
    this.cJJ = paramYD.akh();
    this.cJK = paramYD.aki();
    this.cJI = true;
  }

  public void cm(long paramLong)
  {
    this.cJJ = paramLong;
  }

  public long akh() {
    return this.cJJ;
  }

  public cEi cn(long paramLong) {
    return bEh.a(this, paramLong);
  }

  public void co(long paramLong) {
    this.cJK = paramLong;
  }

  public long aki() {
    return this.cJK;
  }

  public cEi akj() {
    return this.cJw;
  }

  public void a(cEi paramcEi) {
    this.cJw = paramcEi;
    this.cJI = true;
  }

  public cEi akk() {
    return this.cJx;
  }

  public void b(cEi paramcEi) {
    this.cJx = paramcEi;
    this.cJI = true;
  }

  public cEi akl() {
    return this.cJy;
  }

  public void c(cEi paramcEi) {
    this.cJy = paramcEi;
    this.cJI = true;
  }

  public cEi akm() {
    return this.cJz;
  }

  public void d(cEi paramcEi) {
    this.cJz = paramcEi;
    this.cJI = true;
  }

  private void akn() {
    float f1 = 1.0F;

    float f2 = this.cJw.getX();
    float f3 = this.cJw.getY();
    float f4 = this.cJw.aCv();
    float f5 = f2 + this.cJx.getX() * 1.0F;
    float f6 = f3 + this.cJx.getY() * 1.0F;
    float f7 = f4 + this.cJx.aCv() * 1.0F;

    float f8 = this.cJy.getX();
    float f9 = this.cJy.getY();
    float f10 = this.cJy.aCv();
    float f11 = f8 - this.cJz.getX() * 1.0F;
    float f12 = f9 - this.cJz.getY() * 1.0F;
    float f13 = f10 - this.cJz.aCv() * 1.0F;

    this.cxA = (f8 - 3.0F * f11 + 3.0F * f5 - f2);
    this.cxz = (3.0F * f11 - 6.0F * f5 + 3.0F * f2);
    this.cJA = (3.0F * f5 - 3.0F * f2);
    this.cJB = f2;

    this.cJC = (f9 - 3.0F * f12 + 3.0F * f6 - f3);
    this.cJD = (3.0F * f12 - 6.0F * f6 + 3.0F * f3);
    this.cxy = (3.0F * f6 - 3.0F * f3);
    this.cJE = f3;

    this.aHl = (f10 - 3.0F * f13 + 3.0F * f7 - f4);
    this.cJF = (3.0F * f13 - 6.0F * f7 + 3.0F * f4);
    this.cJG = (3.0F * f7 - 3.0F * f4);
    this.cJH = f4;

    this.cJI = false;
  }

  public cEi cp(long paramLong) {
    if (this.cJI) {
      akn();
    }
    if (paramLong < this.cJJ) {
      paramLong = this.cJJ;
    }
    else if (paramLong > this.cJK) {
      paramLong = this.cJK;
    }

    float f1 = (float)(paramLong - this.cJJ) / (float)(this.cJK - this.cJJ);
    float f2 = f1 * f1;
    float f3 = f2 * f1;
    return new cEi(this.cxA * f3 + this.cxz * f2 + this.cJA * f1 + this.cJB, this.cJC * f3 + this.cJD * f2 + this.cxy * f1 + this.cJE, this.aHl * f3 + this.cJF * f2 + this.cJG * f1 + this.cJH);
  }

  public long getDuration()
  {
    return this.cJK - this.cJJ;
  }

  public List hr(int paramInt)
  {
    int i = 0;
    int j = 0;

    ArrayList localArrayList = new ArrayList();
    int[] arrayOfInt = null;

    for (long l = this.cJJ; l < this.cJK; l += paramInt) {
      cEi localcEi = cp(l);
      int k = (int)localcEi.getX();
      int m = (int)localcEi.getY();
      int n = (int)localcEi.aCv();

      if ((l <= this.cJJ) || (k != i) || (m != j))
      {
        arrayOfInt = new int[] { k, m, n };
        localArrayList.add(arrayOfInt);
        i = k;
        j = m;
      }
    }
    if (!localArrayList.isEmpty())
    {
      if ((arrayOfInt != null) && (
        (arrayOfInt[0] != this.cJy.getX()) || (arrayOfInt[1] != this.cJy.getY()) || (arrayOfInt[2] != this.cJy.aCv()))) {
        arrayOfInt = new int[] { (int)this.cJy.getX(), (int)this.cJy.getY(), (int)this.cJy.aCv() };
        localArrayList.add(arrayOfInt);
      }

    }

    return localArrayList;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(getClass().getSimpleName());
    localStringBuffer.append(" (duration:").append(this.cJK - this.cJJ).append(") > from=").append(this.cJw).append(", to=").append(this.cJy).append(", initVel=").append(this.cJx).append(", finalVel=").append(this.cJz).append(".");

    return localStringBuffer.toString();
  }
}