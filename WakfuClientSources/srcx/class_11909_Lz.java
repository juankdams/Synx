public final class Lz extends dte
{
  private float bYl;

  public Lz(float paramFloat)
  {
    this.bYl = paramFloat;
  }

  public boolean isValid()
  {
    return this.bYl > 0.0F;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)86);
    localaIG.aM(this.bYl);
    localcyx.d(localaIG);
  }
}