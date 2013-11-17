public class JU extends dte
{
  public static final int bVn = 1;
  public static final int bVo = 2;
  public static final int bVp = 3;
  public static final int bVq = 4;
  public static final int bVr = 5;
  public static final int bVs = 6;
  public static final int bVt = 7;
  public static final int bVu = 8;
  public static final int bVv = 9;
  public static final int UPDATE = 10;
  public static final int bVw = 11;
  public static final int bVx = 12;
  public static final int bVy = 13;
  public static final int bVz = 14;
  public static final int bVA = 15;
  private int aLs;
  private String[] aLt;

  public JU(int paramInt, String[] paramArrayOfString)
  {
    this.aLs = paramInt;
    this.aLt = paramArrayOfString;
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 1:
      return this.aLt.length == 1;
    case 2:
      return this.aLt.length == 0;
    case 3:
      return this.aLt.length == 1;
    case 4:
      return (this.aLt.length == 7) || (this.aLt.length == 9);
    case 5:
      return this.aLt.length == 1;
    case 6:
      return this.aLt.length == 2;
    case 7:
      return this.aLt.length == 2;
    case 8:
      return this.aLt.length == 3;
    case 9:
      return this.aLt.length == 2;
    case 10:
      return this.aLt.length == 1;
    case 11:
      return (this.aLt.length == 4) || (this.aLt.length == 6) || (this.aLt.length == 2);
    case 12:
      return this.aLt.length == 2;
    case 13:
      return this.aLt.length == 2;
    case 14:
      return (this.aLt.length == 4) || (this.aLt.length == 6);
    case 15:
      return this.aLt.length == 1;
    }
    return false;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    try
    {
      switch (this.aLs) {
      case 1:
        b(localcyx);
        break;
      case 5:
        c(localcyx);
        break;
      case 2:
        UB();
        break;
      case 3:
        p(localcyx);
        break;
      case 4:
        o(localcyx);
        break;
      case 6:
        n(localcyx);
        break;
      case 7:
        m(localcyx);
        break;
      case 8:
        l(localcyx);
        break;
      case 9:
        k(localcyx);
        break;
      case 10:
        j(localcyx);
        break;
      case 11:
        i(localcyx);
        break;
      case 12:
        g(localcyx);
        break;
      case 13:
        h(localcyx);
        break;
      case 14:
        f(localcyx);
        break;
      case 15:
        e(localcyx);
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de calendrier " + localException);
    }
  }

  private void e(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)87);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void f(cyx paramcyx) {
    long l = Long.parseLong(this.aLt[0]);
    cYq localcYq = null;
    if (this.aLt.length == 6)
      localcYq = new cYq(0, Integer.parseInt(this.aLt[5]), Integer.parseInt(this.aLt[4]), Integer.parseInt(this.aLt[1]), Integer.parseInt(this.aLt[2]), Integer.parseInt(this.aLt[3]));
    else if (this.aLt.length == 4) {
      localcYq = new cYq(0, 0, 0, Integer.parseInt(this.aLt[1]), Integer.parseInt(this.aLt[2]), Integer.parseInt(this.aLt[3]));
    }

    vL localvL = aca.aoj().cy(l);
    if (localvL != null) {
      aca.aoj().a(l, localcYq);
      afT localafT = new afT();
      localafT.h(localcYq);
      localafT.bA(l);
      paramcyx.d(localafT);
    } else {
      cth.cqP().err("Evenement " + l + " inconnu");
    }
  }

  private void g(cyx paramcyx)
  {
    long l = Long.parseLong(this.aLt[0]);
    String str = this.aLt[1];
    vL localvL = aca.aoj().cy(l);
    if (localvL != null) {
      localvL.aP(str);
      Gq localGq = new Gq();
      localGq.aP(str);
      localGq.bA(l);
      paramcyx.d(localGq);
    } else {
      cth.cqP().err("Evenement " + l + " inconnu");
    }
  }

  private void h(cyx paramcyx) {
    long l = Long.parseLong(this.aLt[0]);
    String str = this.aLt[1];
    vL localvL = aca.aoj().cy(l);
    if (localvL != null) {
      localvL.setTitle(str);
      bWJ localbWJ = new bWJ();
      localbWJ.setTitle(str);
      localbWJ.bA(l);
      paramcyx.d(localbWJ);
    } else {
      cth.cqP().err("Evenement " + l + " inconnu");
    }
  }

  private void i(cyx paramcyx)
  {
    long l = Long.parseLong(this.aLt[0]);
    cYq localcYq = null;
    if (this.aLt.length == 6)
      localcYq = new cYq(0, Integer.parseInt(this.aLt[5]), Integer.parseInt(this.aLt[4]), Integer.parseInt(this.aLt[1]), Integer.parseInt(this.aLt[2]), Integer.parseInt(this.aLt[3]));
    else if (this.aLt.length == 4)
      localcYq = new cYq(0, 0, 0, Integer.parseInt(this.aLt[1]), Integer.parseInt(this.aLt[2]), Integer.parseInt(this.aLt[3]));
    else if ((this.aLt.length == 2) && (this.aLt[1].equals("-1"))) {
      localcYq = null;
    }
    vL localvL = aca.aoj().cy(l);
    if (localvL != null) {
      localvL.f(localcYq);
      dll localdll = new dll();
      localdll.h(localcYq);
      localdll.bA(l);
      paramcyx.d(localdll);
    } else {
      cth.cqP().err("Evenement " + l + " inconnu");
    }
  }

  private void j(cyx paramcyx) {
    byte b = Byte.parseByte(this.aLt[0]);
    switch (b)
    {
    case 0:
      aca.aoj().clear();
      break;
    default:
      aca.aoj().aJ(b);
    }

    aDw localaDw = new aDw();
    localaDw.bz(b);
    paramcyx.d(localaDw);
  }

  private void k(cyx paramcyx) {
    bsw localbsw = new bsw();
    localbsw.bA(Long.parseLong(this.aLt[0]));
    localbsw.iO(this.aLt[1]);
    paramcyx.d(localbsw);
  }

  private void l(cyx paramcyx) {
    dGb localdGb = new dGb();
    localdGb.bA(Long.parseLong(this.aLt[0]));
    localdGb.fJ(Byte.parseByte(this.aLt[1]));
    localdGb.setType(Byte.parseByte(this.aLt[2]));
    paramcyx.d(localdGb);
  }

  private void m(cyx paramcyx) {
    csg localcsg = new csg();
    localcsg.g(Long.parseLong(this.aLt[0]));
    localcsg.bA(Long.parseLong(this.aLt[1]));
    paramcyx.d(localcsg);
  }

  private void n(cyx paramcyx) {
    bpS localbpS = new bpS();
    localbpS.g(Long.parseLong(this.aLt[0]));
    localbpS.bA(Long.parseLong(this.aLt[1]));
    paramcyx.d(localbpS);
  }

  private void c(cyx paramcyx) {
    aBH localaBH = new aBH();
    localaBH.dN(Long.parseLong(this.aLt[0]));
    paramcyx.d(localaBH);
  }

  private void o(cyx paramcyx) {
    aos localaos = new aos();
    byz localbyz = byv.bFN().bFO();
    vL localvL;
    if (this.aLt.length == 7) {
      localvL = new vL(this.aLt[0], this.aLt[1], localbyz.getId(), Byte.parseByte(this.aLt[2]), Byte.parseByte(this.aLt[3]), Byte.parseByte(this.aLt[4]), Byte.parseByte(this.aLt[5]), Short.parseShort(this.aLt[6]));
    }
    else {
      localvL = new vL(this.aLt[0], this.aLt[1], localbyz.getId(), Byte.parseByte(this.aLt[2]), Byte.parseByte(this.aLt[3]), Byte.parseByte(this.aLt[4]), Byte.parseByte(this.aLt[5]), Short.parseShort(this.aLt[6]), Byte.parseByte(this.aLt[7]), Byte.parseByte(this.aLt[8]));
    }

    localaos.a(localvL);

    localvL.a(localbyz.getId(), localbyz.getName());
    aca.aoj().f(localvL);
    paramcyx.d(localaos);
  }

  private void p(cyx paramcyx) {
    cUS localcUS = new cUS();
    localcUS.bA(Long.parseLong(this.aLt[0]));
    paramcyx.d(localcUS);
  }

  private void UB() {
    aca.aoj().display();
  }

  private void b(cyx paramcyx) {
    cyP localcyP = new cyP();
    localcyP.dN(Long.parseLong(this.aLt[0]));
    paramcyx.d(localcyP);
  }
}