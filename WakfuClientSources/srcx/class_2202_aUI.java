public class aUI extends dte
{
  public static final byte bRz = 0;
  public static final byte bRA = 1;
  public static final byte eVV = 2;
  public static final byte eVW = 3;
  public static final byte eVX = 4;
  public static final byte eSv = 5;
  private byte eVY;
  private String[] aLt;

  public aUI(byte paramByte, String[] paramArrayOfString)
  {
    this.eVY = paramByte;
    this.aLt = paramArrayOfString;
  }

  public boolean isValid() {
    switch (this.eVY) {
    case 0:
      return (this.aLt.length == 1) || (this.aLt.length == 2);
    case 1:
      return this.aLt.length == 1;
    case 2:
      return this.aLt.length == 2;
    case 3:
      return this.aLt.length == 1;
    case 4:
      return true;
    case 5:
      return true;
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
      switch (this.eVY) {
      case 0:
        F(localcyx);
        break;
      case 1:
        remove();
        break;
      case 2:
        G(localcyx);
        break;
      case 3:
        H(localcyx);
        break;
      case 4:
        UY();
        break;
      case 5:
        OQ();
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de calendrier " + localException);
    }
  }

  private void OQ() {
    cth.cqP().log("-add breedId : ajoute un mob au symbiote");
    cth.cqP().log("-add breedId qty : ajuste la quantité donnée au mob du symbiote");
    cth.cqP().log("-rm index : retire une creature à l'index donné");
    cth.cqP().log("-rename index name : renomme la creature à l'index donné");
    cth.cqP().log("-index index : change l'index sélectionné");
    cth.cqP().log("-i : donne des infos détaillées sur le symbiote");
    cth.cqP().log("-h | -help : donne des infos sur la commande symbiot");
  }

  private void UY() {
    byv localbyv = byv.bFN();
    byz localbyz = localbyv.bFO();
    QT localQT = localbyz.bGo();
    if (localQT != null) {
      cth.cqP().s("Index courant : " + localQT.aae() + "\n", 11141375);
      for (byte b = 0; b < localQT.aad(); b = (byte)(b + 1)) {
        csi localcsi = localQT.aj(b);
        cth.cqP().s(localcsi.toString() + "\n", 11141375);
      }
      cth.cqP().s("Creatures disponibles : ", 11141375);
      for (b = 0; b < localQT.aad(); b = (byte)(b + 1)) {
        boolean bool = localQT.an(b);
        if (bool)
          cth.cqP().s(Byte.toString(b), 11141375);
      }
    }
    else {
      cth.cqP().log("pas de symbiote");
    }
  }

  private void F(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)10);
    localaIG.bN(this.eVY);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    if (this.aLt.length == 2)
      localaIG.mH(Integer.parseInt(this.aLt[1]));
    else {
      localaIG.mH(1);
    }
    paramcyx.d(localaIG);
  }

  private void remove() {
    byz localbyz = byv.bFN().bFO();
    if ((localbyz != null) && (localbyz.bGo() != null))
      localbyz.bGo().al(Byte.parseByte(this.aLt[0]));
  }

  private void G(cyx paramcyx)
  {
    byz localbyz = byv.bFN().bFO();
    String str = this.aLt[1];
    byte b = Byte.parseByte(this.aLt[0]);

    if (localbyz.bGo() == null) {
      cth.cqP().err("Pas de symbiote");
      return;
    }
    csi localcsi = localbyz.bGo().aj(b);
    if (localcsi == null) {
      cth.cqP().err("Pas de creature dispo a l'index fourni");
      return;
    }
    if (!aYD.avC().eA(str)) {
      cth.cqP().err(" Nom invalide");
      return;
    }

    localcsi.setName(str);
    alc localalc = new alc();
    localalc.bc(b);
    localalc.eK(str);
    paramcyx.d(localalc);
  }

  private void H(cyx paramcyx)
  {
    byz localbyz = byv.bFN().bFO();

    if (localbyz.bGo() == null) {
      cth.cqP().err("Pas de symbiote");
      return;
    }
    byte b = Byte.parseByte(this.aLt[0]);
    localbyz.bGo().ak(b);
    cth.cqP().log("Nouvel index courant : " + b);

    localbyz.bGI();

    bFC localbFC = new bFC();
    localbFC.dn(b);
    paramcyx.d(localbFC);
  }
}