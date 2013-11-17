public class atj extends dte
{
  private float dEy;

  public atj(float paramFloat)
  {
    this.dEy = paramFloat;
  }

  public boolean isValid() {
    return true;
  }

  public void execute() {
    if ((this.dEy < -1.0D) || (this.dEy > 1.0D)) {
      cth.cqP().err("La valeur d'une jauge de wakfu doit être dans [-1.0, 1.0]");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)77);
    localaIG.aM(this.dEy);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }
}