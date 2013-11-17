public abstract class bJv
{
  private final int bjv;
  private final Class dGA;
  private aum bhW;

  public bJv(Class paramClass)
  {
    this.bjv = akE.C(paramClass);
    this.dGA = paramClass;
  }

  public final akE bQx() {
    akE localakE = ZX();
    localakE.gL();
    return localakE;
  }

  public final akE bQy() {
    if (this.bhW == null) {
      this.bhW = aDM.aPZ().a(this.bjv, this.dGA);
    }
    return this.bhW.aGv();
  }

  public abstract akE ZX();
}