public class bWz extends dte
{
  private final int aLs;
  private final String[] aLt;

  public bWz()
  {
    this.aLs = 1;
    this.aLt = new String[0];
  }

  public bWz(int paramInt, String[] paramArrayOfString) {
    this.aLs = paramInt;
    this.aLt = paramArrayOfString;
  }

  public boolean isValid() {
    switch (this.aLs) {
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      return this.aLt.length == 0;
    }
    return false;
  }

  public void execute() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    try
    {
      switch (this.aLs) {
      case 0:
        OQ();
        break;
      case 1:
        J(localcyx);
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      default:
        K(localcyx);
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de place de marché " + localException);
    }
  }

  private void OQ() {
    log("-help | -h : affiche la description des options");
    log("-all | -a : execute toutes les options");
    log("-fight | -f : booste les sorts et le niveau du perso à 200");
    log("-kamas | -k : passe les kamas 999 999 999");
    log("-exploit | -ex : réalise tous les exploits");
    log("-emotes | -em : débloque les emotes");
  }

  private void J(cyx paramcyx) {
    K(paramcyx);
    dLE.doY().a(byv.bFN().bFO(), byv.bFN().bFO().getFields());
  }

  private void K(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)30);
    localaIG.mH(this.aLs);
    paramcyx.d(localaIG);
  }
}