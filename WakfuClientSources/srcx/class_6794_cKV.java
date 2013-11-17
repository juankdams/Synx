public class cKV extends dte
{
  public static final byte eSv = 0;
  public static final byte iJz = 1;
  public static final byte iJA = 2;
  public static final byte iJB = 3;
  public static final byte iJC = 4;
  private final byte iJD;
  private int aw;
  private final int iJE;

  public cKV(byte paramByte, int paramInt)
  {
    this.iJD = paramByte;
    this.aw = paramInt;
    this.iJE = 1;
  }

  public cKV(byte paramByte, int paramInt1, int paramInt2) {
    this.iJD = paramByte;
    this.aw = paramInt1;
    this.iJE = paramInt2;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    if (this.iJD == 0) {
      OQ();
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf(BM());
    localaIG.mH(this.aw);
    localaIG.mH(this.iJE);

    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null)
      localcyx.d(localaIG);
    else
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
  }

  private void OQ()
  {
    log("id : ajoute un mob avec l'id donné autour du personnage");
    log("id x : ajoute 'x' mob avec l'id donné autour du personnage");
    log("-t id : ajoute le template avec l'id donné");
    log("-t id x : ajoute 'x' template avec l'id donné");
    log("-ut id : ajoute un userGroup de template 'id'");
    log("-ut id x : ajoute 'x' userGroup de template 'id'");
    log("-ugi id : initialise le userGroup id dans l'instance du personnage");
    log("-ugi cn : initialise le corbeau noir sur kelba");
  }

  private short BM() {
    switch (this.iJD) {
    case 1:
      return 11;
    case 3:
      return 16;
    case 2:
      return 17;
    case 4:
      return 119;
    }
    String str = "Type de groupe " + this.iJD + " inconnu";
    cth.cqP().err(str);
    throw new UnsupportedOperationException(str);
  }
}