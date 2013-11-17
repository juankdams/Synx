final class zK extends dcW
{
  public boolean a(bvT parambvT)
  {
    if (!parambvT.bDL())
      return true;
    if (this.kLP != null) {
      ((arl)this.kLP).b(parambvT.bDK());
    }
    aTb localaTb = aTb.c(parambvT);
    bnc.bxw().a((arl)this.kLP, localaTb);

    YJ[] arrayOfYJ1 = YJ.b(parambvT);
    for (YJ localYJ : arrayOfYJ1) {
      bnc.bxw().a((arl)this.kLP, localYJ);
    }
    return false;
  }
}