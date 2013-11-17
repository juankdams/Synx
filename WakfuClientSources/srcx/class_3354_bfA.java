public final class bfA extends dte
{
  public boolean isValid()
  {
    return true;
  }

  public void execute() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    try {
      qY();
    } catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de place de marché " + localException);
    }
  }

  private void qY() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)94);
    localcyx.d(localaIG);
  }
}