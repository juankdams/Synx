public final class jv extends dte
{
  public static final int aLq = 0;
  public static final int aLr = 1;
  private int aLs;
  private String[] aLt;

  public jv(int paramInt, String[] paramArrayOfString)
  {
    this.aLs = paramInt;
    this.aLt = paramArrayOfString;
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 0:
      return this.aLt.length == 1;
    case 1:
      return this.aLt.length == 0;
    }
    return false;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté!");
      return;
    }
    byz localbyz = byv.bFN().bFO();
    if (localbyz.ayJ().dB((short)azO.dRT.hV) == null) {
      cth.cqP().err("Il faut avoir un familier équipé!");
      return;
    }
    try {
      switch (this.aLs) {
      case 0:
        a(localcyx);
        break;
      case 1:
        b(localcyx);
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème d'une commande" + localException);
    }
  }

  private void a(brd parambrd) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)115);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    parambrd.d(localaIG);
  }

  private static void b(brd parambrd) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)116);
    parambrd.d(localaIG);
  }
}