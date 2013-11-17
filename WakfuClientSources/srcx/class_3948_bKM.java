public class bKM
{
  private static final bKM gOd = new bKM();

  private final dPx gOe = new dPx();
  private bdN gOf = bdN.fpZ;

  public static bKM bSX()
  {
    return gOd;
  }

  public void a(bdN parambdN, int paramInt, aQI paramaQI) {
    cSR localcSR = (cSR)this.gOe.bf(bdN.a(parambdN));
    if (localcSR == null) {
      localcSR = new cSR();
      this.gOe.c(bdN.a(parambdN), localcSR);
    }
    localcSR.put(paramInt, paramaQI);
  }

  public void a(bdN parambdN, int paramInt) {
    cSR localcSR = (cSR)this.gOe.bf(bdN.a(parambdN));
    if (localcSR == null) {
      return;
    }
    localcSR.remove(paramInt);
  }

  public void b(bdN parambdN) {
    this.gOe.be(bdN.a(parambdN));
  }

  public dmn bSY() {
    cSR localcSR = (cSR)this.gOe.bf(bdN.a(this.gOf));
    if (localcSR == null) {
      return null;
    }

    return localcSR.yF();
  }

  public void c(bdN parambdN) {
    this.gOf = parambdN;
  }

  public bdN bSZ() {
    return this.gOf;
  }
}