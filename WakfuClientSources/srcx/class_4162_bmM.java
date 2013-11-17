import java.util.ArrayList;
import java.util.List;

public class bmM
  implements bmC
{
  private cEi cJw = new cEi();
  private cEi cJx = new cEi();
  private cEi cJy = new cEi();
  private cEi cJz = new cEi();
  private long cJJ;
  private long cJK;

  public bmM()
  {
    this.cJJ = (this.cJK = 0L);
  }

  public bmM(bmM parambmM) {
    this.cJw.m(parambmM.cJw.getX(), parambmM.cJw.getY(), parambmM.cJw.aCv());
    this.cJx.m(parambmM.cJx.getX(), parambmM.cJx.getY(), parambmM.cJx.aCv());
    this.cJy.m(parambmM.cJy.getX(), parambmM.cJy.getY(), parambmM.cJy.aCv());
    this.cJz.m(parambmM.cJz.getX(), parambmM.cJz.getY(), parambmM.cJz.aCv());
    this.cJJ = parambmM.akh();
    this.cJK = parambmM.aki();
  }

  public void cm(long paramLong) {
    this.cJJ = paramLong;
  }

  public long akh() {
    return this.cJJ;
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

  public cEi akk() {
    return this.cJx;
  }

  public cEi akl() {
    return this.cJy;
  }

  public cEi akm() {
    return this.cJz;
  }

  public void a(cEi paramcEi) {
    this.cJw.k(paramcEi);
  }

  public void b(cEi paramcEi) {
    this.cJx.k(paramcEi);
  }

  public void c(cEi paramcEi) {
    this.cJy.k(paramcEi);
  }

  public void d(cEi paramcEi) {
    this.cJz.k(paramcEi);
  }

  public cEi cp(long paramLong)
  {
    if (paramLong < this.cJJ) {
      paramLong = this.cJJ;
    }
    if ((this.cJK == this.cJJ) || ((this.cJz.czQ() == 0.0F) && (paramLong >= this.cJK))) {
      return new cEi(this.cJy);
    }
    float f = (float)(paramLong - this.cJJ) / (float)(this.cJK - this.cJJ);

    return new cEi(this.cJw.getX() + this.cJx.getX() * f, this.cJw.getY() + this.cJx.getY() * f, this.cJw.aCv() + this.cJx.aCv() * f);
  }

  public double fI(long paramLong)
  {
    return (paramLong - this.cJJ) / (this.cJK - this.cJJ);
  }

  public long getDuration() {
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

  public void fJ(long paramLong) {
    this.cJJ += paramLong;
    this.cJK += paramLong;
  }

  public List r(double paramDouble) {
    double d1 = this.cJy.o(this.cJw).czR();

    int i = (int)Math.ceil(d1 / paramDouble);
    ArrayList localArrayList = new ArrayList(i);

    if (i == 0) {
      localArrayList.add(this);
      return localArrayList;
    }
    double d2 = d1 / i;
    long l1 = getDuration() / i;
    cEi localcEi1 = this.cJy.o(this.cJw);
    localcEi1.czT();

    cEi localcEi2 = this.cJw;
    long l2 = this.cJJ;

    for (int j = 0; j < i; j++) {
      bmM localbmM = new bmM();
      localbmM.a(localcEi2);
      localbmM.cm(l2);

      if (j != i - 1) {
        localbmM.d(this.cJx);
        cEi localcEi3 = localcEi2.n(localcEi1.cJ((float)d2));
        localbmM.c(localcEi3);
        localbmM.co(l2 + l1);
      } else {
        localbmM.co(this.cJK);
        localbmM.d(this.cJz);
        localbmM.c(this.cJy);
      }

      localbmM.b(localbmM.akl().o(localbmM.akj()));

      l2 += l1;
      localcEi2 = localbmM.akl();
      localArrayList.add(localbmM);
    }

    return localArrayList;
  }

  public double length() {
    return this.cJy.o(this.cJw).czR();
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(getClass().getSimpleName());
    localStringBuffer.append(" (duration:").append(this.cJK - this.cJJ).append(") > from=");
    localStringBuffer.append(this.cJw);
    localStringBuffer.append(", to=");
    localStringBuffer.append(this.cJy);
    localStringBuffer.append(", initVel=");
    localStringBuffer.append(this.cJx);
    localStringBuffer.append(", finalVel=");
    localStringBuffer.append(this.cJz);
    localStringBuffer.append(", initialTime=");
    localStringBuffer.append(this.cJJ);
    localStringBuffer.append(", finalTime=");
    localStringBuffer.append(this.cJK);
    return localStringBuffer.toString();
  }
}