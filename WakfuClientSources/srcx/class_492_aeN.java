public final class aeN extends dte
{
  public static final int START = 0;
  public static final int STOP = 1;
  public static final int COMMIT = 2;
  public static final int cWB = 3;
  public static final int cWC = 4;
  public static final int cWD = 5;
  public static final int cWE = 6;
  public static final int cWF = 7;
  public static final int cWG = 8;
  public static final int cWH = 9;
  public static final int cWI = 10;
  public static final int cWJ = 11;
  public static final int cWK = 12;
  public static final int cWL = 13;
  public static final int HELP = 14;
  public static final int cWM = 15;
  public static final int cWN = 16;
  public static final int cWO = 8421631;
  private int aLs;
  private String[] aLt;

  public aeN(int paramInt, String[] paramArrayOfString)
  {
    this.aLs = paramInt;
    this.aLt = ((String[])paramArrayOfString.clone());
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 0:
    case 1:
    case 2:
    case 3:
    case 14:
      return this.aLt.length == 0;
    case 7:
    case 9:
    case 10:
    case 11:
      return this.aLt.length == 1;
    case 4:
    case 8:
    case 12:
    case 15:
      return this.aLt.length == 2;
    case 5:
    case 6:
      return this.aLt.length == 3;
    case 13:
      return this.aLt.length == 7;
    case 16:
      return this.aLt.length == 2;
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
    try {
      switch (this.aLs) {
      case 0:
        h(localcyx);
        break;
      case 1:
        i(localcyx);
        break;
      case 2:
        j(localcyx);
        break;
      case 3:
        k(localcyx);
        break;
      case 4:
        l(localcyx);
        break;
      case 5:
        m(localcyx);
        break;
      case 6:
        n(localcyx);
        break;
      case 7:
        o(localcyx);
        break;
      case 8:
        g(localcyx);
        break;
      case 9:
        D(localcyx);
        break;
      case 10:
        C(localcyx);
        break;
      case 11:
        A(localcyx);
        break;
      case 12:
        B(localcyx);
        break;
      case 13:
        z(localcyx);
        break;
      case 15:
        y(localcyx);
        break;
      case 16:
        x(localcyx);
        break;
      case 14:
        OQ();
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème d'une commande" + localException);
    }
  }

  private void OQ() {
    log("hw (startAuction|sa) idhw : démarre l'enchere du havre monde d'id passé en parametre");
    log("hw bid idhw bidValue : encheri pour le havre monde d'id passé en paramètre (l'enchere doit être démarrée)");
    log("hw (endAuction|ea) idhw : termine l'enchere associée au havre monde d'id passé en paramètre");
    log("hw (resetGuild|rg) idIhw : remet a 0 l'id de guilde du havre monde d'id d'instance passé en paramètre");
    log("hw (setGuild | sg) idIhw guildId: assigne l'id de guilde au havre monde d'id d'instance passé en paramètre");
    log("hw (setEndDate|sed) idhw s min h d m y : modifie la date de fin de l'enchere du havre monde d'id passé en paramètre");
    log("hw (addResources|ar) idIhw resourcesAmount : permet d'ajouter des ressources au havre monde d'id d'instance passé en paramètre");
    log("hw (setAdminBuildingFactor|sabf) idIhw factor : permet de modifier le facteur de vitesse de construction en % (idIhw = -1 applique a tous les mondes)");
    log("hw (help|h) : liste les commandes");
  }

  private void x(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)161);
    localaIG.bg(Short.parseShort(this.aLt[0]));
    localaIG.mH(Integer.parseInt(this.aLt[1]));
    paramcyx.d(localaIG);
  }

  private void y(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)158);
    localaIG.bg(Short.parseShort(this.aLt[0]));
    localaIG.mH(Integer.parseInt(this.aLt[1]));
    paramcyx.d(localaIG);
  }

  private void z(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)156);
    int i = Integer.parseInt(this.aLt[0]);
    int j = Integer.parseInt(this.aLt[1]);
    int k = Integer.parseInt(this.aLt[2]);
    int m = Integer.parseInt(this.aLt[3]);
    int n = Integer.parseInt(this.aLt[4]);
    int i1 = Integer.parseInt(this.aLt[5]);
    int i2 = Integer.parseInt(this.aLt[6]);
    localaIG.mH(i);
    localaIG.mH(j);
    localaIG.mH(k);
    localaIG.mH(m);
    localaIG.mH(n);
    localaIG.mH(i1);
    localaIG.mH(i2);
    paramcyx.d(localaIG);
  }

  private void A(cyx paramcyx) {
    a(paramcyx, 0);
  }

  private void B(cyx paramcyx) {
    a(paramcyx, Integer.parseInt(this.aLt[1]));
  }

  private void a(cyx paramcyx, int paramInt) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)148);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    localaIG.mH(paramInt);
    paramcyx.d(localaIG);
  }

  private void C(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)147);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void D(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)146);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void g(brd parambrd) {
    aJS localaJS = new aJS(Integer.valueOf(this.aLt[0]).intValue(), Integer.valueOf(this.aLt[1]).intValue());
    parambrd.d(localaJS);
  }

  private static void h(brd parambrd) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)128);
    parambrd.d(localaIG);
  }

  private static void i(brd parambrd) {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc == null) || (localdKc.fU() != 25)) {
      cth.cqP().err("L'occupation de gestion du Havre-monde doit être lancée");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)129);
    parambrd.d(localaIG);
  }

  private static void j(brd parambrd) {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc == null) || (localdKc.fU() != 25)) {
      cth.cqP().err("L'occupation de gestion du Havre-monde doit être lancée");
      return;
    }

    bvK localbvK = new bvK();
    ((bXu)localdKc).ccJ().J(new cUx(localbvK));

    parambrd.d(localbvK);

    cth.cqP().s("Actions envoyées au server", 8421631);
  }

  private static void k(brd parambrd) {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc == null) || (localdKc.fU() != 25)) {
      cth.cqP().err("L'occupation de gestion du Havre-monde doit être lancée");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)130);
    parambrd.d(localaIG);
  }

  private void l(brd parambrd) {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc == null) || (localdKc.fU() != 25)) {
      cth.cqP().err("L'occupation de gestion du Havre-monde doit être lancée");
      return;
    }
    try
    {
      short s1 = Short.valueOf(this.aLt[0]).shortValue();
      short s2 = Short.valueOf(this.aLt[1]).shortValue();

      dCz localdCz = new dCz(s1, s2);
      ((bXu)localdKc).ccJ().a(localdCz);

      cth.cqP().s("Action enregistrée : " + localdCz, 8421631);
    } catch (NumberFormatException localNumberFormatException) {
      cth.cqP().err("Arguments invalides : " + localNumberFormatException.getMessage());
    }
  }

  private void m(brd parambrd) {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc == null) || (localdKc.fU() != 25)) {
      cth.cqP().err("L'occupation de gestion du Havre-monde doit être lancée");
      return;
    }
    try
    {
      short s1 = Short.valueOf(this.aLt[0]).shortValue();
      short s2 = Short.valueOf(this.aLt[1]).shortValue();
      short s3 = Short.valueOf(this.aLt[2]).shortValue();

      ctl localctl = new ctl(s1, s2, s3, (short)0);
      ((bXu)localdKc).ccJ().a(localctl);

      cth.cqP().s("Action enregistrée : " + localctl, 8421631);
    } catch (NumberFormatException localNumberFormatException) {
      cth.cqP().err("Arguments invalides : " + localNumberFormatException.getMessage());
    }
  }

  private void n(brd parambrd) {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc == null) || (localdKc.fU() != 25)) {
      cth.cqP().err("L'occupation de gestion du Havre-monde doit être lancée");
      return;
    }
    try
    {
      short s1 = Short.valueOf(this.aLt[0]).shortValue();
      short s2 = Short.valueOf(this.aLt[1]).shortValue();
      short s3 = Short.valueOf(this.aLt[2]).shortValue();

      jk localjk = new jk(s3, s1, s2);
      ((bXu)localdKc).ccJ().a(localjk);

      cth.cqP().s("Action enregistrée : " + localjk, 8421631);
    } catch (NumberFormatException localNumberFormatException) {
      cth.cqP().err("Arguments invalides : " + localNumberFormatException.getMessage());
    }
  }

  private void o(brd parambrd) {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc == null) || (localdKc.fU() != 25)) {
      cth.cqP().err("L'occupation de gestion du Havre-monde doit être lancée");
      return;
    }
    try
    {
      long l = Long.valueOf(this.aLt[0]).longValue();

      clB localclB = new clB(l);
      ((bXu)localdKc).ccJ().a(localclB);

      cth.cqP().s("Action enregistrée : " + localclB, 8421631);
    } catch (NumberFormatException localNumberFormatException) {
      cth.cqP().err("Arguments invalides : " + localNumberFormatException.getMessage());
    }
  }
}