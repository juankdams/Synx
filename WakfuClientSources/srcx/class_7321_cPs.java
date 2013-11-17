public class cPs extends dte
{
  public static final int cWB = 0;
  public static final int Zv = 1;
  public static final int HELP = 2;
  private final int aLs;
  private final int RZ;
  private final int kyx;
  private final int kyy;

  public cPs(int paramInt)
  {
    this(paramInt, 0, 0, -1);
  }

  public cPs(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.aLs = paramInt1;
    this.RZ = paramInt2;
    this.kyx = paramInt3;
    this.kyy = paramInt4;
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 0:
      return true;
    case 2:
      return true;
    case 1:
      return (this.RZ != 0) && (this.kyx != 0) && (this.kyy != -1);
    }

    return false;
  }

  public void execute()
  {
    switch (this.aLs) {
    case 0:
      AB.bwj.b(new bRL(this));

      break;
    case 1:
      cyx localcyx = byv.bFN().aJK();
      if (localcyx == null) {
        cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
        return;
      }

      if ((this.kyy < 0) || (this.kyy >= 5)) {
        cth.cqP().err("variation doit être comprise entre 0 et 5");
        return;
      }

      aIG localaIG = new aIG();
      localaIG.bM((byte)3);
      localaIG.bf((short)142);
      localaIG.mH(this.RZ);
      localaIG.mH(this.kyx);
      localaIG.bN((byte)this.kyy);
      localcyx.d(localaIG);
      break;
    case 2:
      cth.cqP().trace("gem list : affiche la liste des runes disponibles");
      cth.cqP().trace("gem (createItem|ci) itemId gemId variation: Crée l'objet avec la rune désirée dans la variation voulue (comprise entre 0 et 4)");
    }
  }
}