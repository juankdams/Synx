import java.util.List;

public class bEh
  implements ckr
{
  protected List gzy;
  protected long dpk;
  protected long gzz;

  public bEh(List paramList, long paramLong)
  {
    this.gzy = paramList;
    this.dpk = paramLong;

    this.gzz = 0L;
    for (bmM localbmM : this.gzy) {
      this.gzz += localbmM.getDuration();
      localbmM.fJ(paramLong);
    }
  }

  public cEi cp(long paramLong)
  {
    if (paramLong <= this.dpk)
      return akj();
    if (paramLong >= this.dpk + this.gzz) {
      return akl();
    }
    for (int i = 0; i < this.gzy.size(); i++) {
      bmM localbmM = (bmM)this.gzy.get(i);
      if ((paramLong >= localbmM.akh()) && (paramLong < localbmM.aki())) {
        cEi localcEi = localbmM.cp(paramLong);

        localcEi.aK(localbmM.akj().aCv());
        return localcEi;
      }
    }

    return akl();
  }

  public cEi cn(long paramLong) {
    return a(this, paramLong);
  }

  public cEi akj() {
    if ((this.gzy == null) || (this.gzy.size() <= 0)) {
      return null;
    }
    return ((bmM)this.gzy.get(0)).akj();
  }

  public cEi akl() {
    if ((this.gzy == null) || (this.gzy.size() <= 0)) {
      return null;
    }
    return ((bmM)this.gzy.get(this.gzy.size() - 1)).akl();
  }

  public long aki() {
    return this.dpk + this.gzz;
  }

  public long akh() {
    return this.dpk;
  }

  public static cEi a(ckr paramckr, long paramLong) {
    long l1 = 75L;

    cEi localcEi1 = paramckr.cp(paramLong);
    cEi localcEi2 = new cEi(bCO.bD(localcEi1.getX()), bCO.bD(localcEi1.getY()), bCO.bD(localcEi1.aCv()));

    cEi localcEi3 = new cEi(localcEi2);
    cEi localcEi4 = localcEi2;

    long l2 = paramckr.aki();
    while ((paramLong < l2) && (localcEi3.equals(localcEi2))) {
      localcEi4 = paramckr.cp(paramLong + 75L);
      localcEi3.m(bCO.bD(localcEi4.getX()), bCO.bD(localcEi4.getY()), bCO.bD(localcEi4.aCv()));

      paramLong += 75L;
    }

    return localcEi4;
  }
}