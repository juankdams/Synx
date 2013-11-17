final class KM
{
  private final cWy bXt;
  private cYl bXu;

  KM(cWy paramcWy)
  {
    this.bXt = paramcWy;
  }

  public boolean Vi() {
    return false;
  }

  public boolean a(cYl paramcYl) {
    return paramcYl.afw() == this.bXt.axG();
  }

  public boolean Vj() {
    return this.bXu != null;
  }

  public void b(cYl paramcYl) {
    this.bXu = paramcYl;
    UG localUG = this.bXt.aIq().LB();
    if ((localUG != null) && (this.bXt.atP()))
      localUG.a(this.bXt, false);
  }

  public void Vk()
  {
    this.bXu = null;
    this.bXt.atl();
  }

  public cYl Vl() {
    return this.bXu;
  }
}