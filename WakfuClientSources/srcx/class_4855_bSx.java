public class bSx
{
  public static final bSx hdo = new bSx();
  private aVG bjg;
  private bdw hdp;
  protected final cSR hdq = new cSR();

  public void a(aVG paramaVG) {
    this.bjg = paramaVG;
  }

  public void a(bdw parambdw) {
    this.hdp = parambdw;
  }

  public void a(dHt paramdHt) {
    this.hdq.put(paramdHt.getId(), paramdHt);
  }

  public dHt tU(int paramInt)
  {
    if (paramInt <= 0) {
      return null;
    }
    dHt localdHt1 = (dHt)this.hdq.get(paramInt);
    if (localdHt1 != null) {
      return localdHt1;
    }

    if (this.bjg == null) {
      return null;
    }

    drN localdrN = this.bjg.jt(paramInt);
    if (localdrN == null) {
      return null;
    }
    bBn localbBn = (bBn)this.hdp.c(localdrN);
    if (!(localbBn instanceof dHt)) {
      return null;
    }

    dHt localdHt2 = (dHt)localbBn;
    a(localdHt2);
    return localdHt2;
  }
}