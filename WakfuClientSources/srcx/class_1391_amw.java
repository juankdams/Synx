import java.util.ArrayList;
import java.util.List;

public class amw
  implements ckr
{
  protected static final float[][] dpg = { { 2.0F, -3.0F, 0.0F, 1.0F }, { 2.0F, 3.0F, 0.0F, 0.0F }, { 1.0F, -2.0F, 1.0F, 0.0F }, { 1.0F, -1.0F, 0.0F, 0.0F } };
  protected final ArrayList dph;
  protected float dpi;
  protected long dpj;
  protected long dpk;
  private static final cEi dpl = new cEi();
  private static final cEi dpm = new cEi();

  public amw(List paramList, long paramLong)
  {
    this.dpk = paramLong;
    this.dpi = 0.0F;
    this.dpj = 0L;
    this.dph = new ArrayList();

    if (paramList.size() == 1) {
      localObject = (bmM)paramList.get(0);
      List localList = ((bmM)localObject).r(((bmM)localObject).length() / 2.0D);
      paramList.clear();
      paramList.addAll(localList);
    }

    Object localObject = null;
    for (int i = 0; i < paramList.size(); i++) {
      bmC localbmC = (bmC)paramList.get(i);

      bvB localbvB1 = new bvB(this);
      localbvB1.e(localbmC.akj());
      if (i != 0) {
        ((bvB)localObject).bw(((bvB)localObject).bDo().o(localbvB1.bDo()).czR());
        this.dpi += ((bvB)localObject).bDp();
      }
      this.dpj += localbmC.getDuration();

      this.dph.add(localbvB1);
      localObject = localbvB1;

      if (i == paramList.size() - 1) {
        bvB localbvB2 = new bvB(this);
        localbvB2.e(localbmC.akl());
        ((bvB)localObject).bw(((bvB)localObject).bDo().o(localbvB2.bDo()).czR());
        this.dpi += ((bvB)localObject).bDp();
        this.dph.add(localbvB2);
      }

    }

    azc();
  }

  protected void azc()
  {
    for (int i = 1; i < this.dph.size() - 1; i++) {
      localbvB2 = (bvB)this.dph.get(i - 1);
      localObject1 = (bvB)this.dph.get(i);
      localbvB3 = (bvB)this.dph.get(i + 1);

      localObject2 = localbvB3.bDo().o(((bvB)localObject1).bDo());
      ((cEi)localObject2).czT();
      localcEi1 = localbvB2.bDo().o(((bvB)localObject1).bDo());
      localcEi1.czT();
      cEi localcEi2 = ((cEi)localObject2).o(localcEi1);
      localcEi2.czT();
      ((bvB)localObject1).g(localcEi2);
    }

    bvB localbvB1 = (bvB)this.dph.get(0);
    bvB localbvB2 = (bvB)this.dph.get(1);
    Object localObject1 = localbvB2.bDo().o(localbvB1.bDo());
    ((cEi)localObject1).Q(1.0F / localbvB1.bDp());
    ((cEi)localObject1).Q(3.0D);
    ((cEi)localObject1).m(localbvB2.bDn());
    ((cEi)localObject1).Q(0.5D);
    localbvB1.g((cEi)localObject1);

    bvB localbvB3 = (bvB)this.dph.get(this.dph.size() - 1);
    Object localObject2 = (bvB)this.dph.get(this.dph.size() - 2);
    cEi localcEi1 = localbvB3.bDo().o(((bvB)localObject2).bDo());
    localcEi1.Q(1.0F / ((bvB)localObject2).bDp());
    localcEi1.Q(3.0D);
    localcEi1.m(((bvB)localObject2).bDn());
    localcEi1.Q(0.5D);
    localbvB3.g(localcEi1);
  }

  public cEi cp(long paramLong)
  {
    if (paramLong >= this.dpk + this.dpj)
      return ((bvB)this.dph.get(this.dph.size() - 1)).bDo();
    if (paramLong < this.dpk) {
      return ((bvB)this.dph.get(0)).bDo();
    }

    long l = paramLong - this.dpk;
    float f1 = (float)l / (float)this.dpj;
    float f2 = f1 * this.dpi;

    float f3 = 0.0F;
    int i = 0;
    while ((i < this.dph.size() - 1) && (f3 + ((bvB)this.dph.get(i)).bDp() < f2)) {
      f3 += ((bvB)this.dph.get(i)).bDp();
      i++;
    }

    float f4 = f2 - f3;
    bvB localbvB1 = (bvB)this.dph.get(i);
    bvB localbvB2 = (bvB)this.dph.get(i + 1);

    f4 /= localbvB1.bDp();
    dpl.k(localbvB1.bDn());
    dpl.Q(localbvB1.bDp());
    dpm.k(localbvB2.bDn());
    dpm.Q(localbvB1.bDp());

    return a(localbvB1.bDo(), dpl, localbvB2.bDo(), dpm, f4);
  }

  protected cEi a(cEi paramcEi1, cEi paramcEi2, cEi paramcEi3, cEi paramcEi4, float paramFloat)
  {
    float f1 = 2.0F * paramcEi1.getX() - 2.0F * paramcEi3.getX() + paramcEi2.getX() + paramcEi4.getX();
    float f2 = 2.0F * paramcEi1.getY() - 2.0F * paramcEi3.getY() + paramcEi2.getY() + paramcEi4.getY();
    float f3 = 2.0F * paramcEi1.aCv() - 2.0F * paramcEi3.aCv() + paramcEi2.aCv() + paramcEi4.aCv();

    float f4 = -3.0F * paramcEi1.getX() + 3.0F * paramcEi3.getX() - 2.0F * paramcEi2.getX() - paramcEi4.getX();
    float f5 = -3.0F * paramcEi1.getY() + 3.0F * paramcEi3.getY() - 2.0F * paramcEi2.getY() - paramcEi4.getY();
    float f6 = -3.0F * paramcEi1.aCv() + 3.0F * paramcEi3.aCv() - 2.0F * paramcEi2.aCv() - paramcEi4.aCv();

    float f7 = paramcEi2.getX();
    float f8 = paramcEi2.getY();
    float f9 = paramcEi2.aCv();

    float f10 = paramcEi1.getX();
    float f11 = paramcEi1.getY();
    float f12 = paramcEi1.aCv();

    float f13 = paramFloat;
    float f14 = paramFloat * paramFloat;
    float f15 = f14 * paramFloat;

    return new cEi(f1 * f15 + f4 * f14 + f7 * f13 + f10, f2 * f15 + f5 * f14 + f8 * f13 + f11, paramcEi1.aCv());
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("TimeUniformSpline={");
    for (bvB localbvB : this.dph) {
      localStringBuffer.append("( position=").append(localbvB.bDo()).append(" velocity=").append(localbvB.bDn()).append(", length=").append(localbvB.bDp()).append(" ), ");
    }
    return "}";
  }

  public ArrayList azd()
  {
    return this.dph;
  }

  public long aze()
  {
    return this.dpj;
  }

  public double azf()
  {
    return this.dpi;
  }

  public cEi cn(long paramLong)
  {
    return bEh.a(this, paramLong);
  }

  public long aki()
  {
    return this.dpk + this.dpj;
  }

  public long akh()
  {
    return this.dpk;
  }

  public cEi akj() {
    return ((bvB)this.dph.get(0)).bDo();
  }

  public cEi akl()
  {
    return ((bvB)this.dph.get(this.dph.size() - 1)).bDo();
  }
}