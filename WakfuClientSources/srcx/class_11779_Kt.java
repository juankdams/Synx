public final class Kt extends dte
{
  public static final int bWP = 0;
  public static final int bWQ = 2;
  public static final int aaX = 3;
  public static final int bWR = 4;
  public static final int bWS = 5;
  public static final int bWT = 6;
  public static final int bWU = 7;
  public static final int bWV = 8;
  public static final int INFO = 9;
  public static final int bWW = 10;
  public static final int aaH = 11;
  public static final int HELP = 12;
  public static final int bWX = 13;
  public static final int bWY = 14;
  private int aLs;
  private String[] aLt;

  public Kt(int paramInt, String[] paramArrayOfString)
  {
    this.aLs = paramInt;
    this.aLt = ((String[])paramArrayOfString.clone());
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 3:
    case 7:
    case 9:
    case 12:
      return this.aLt.length == 0;
    case 0:
    case 2:
    case 4:
    case 5:
    case 6:
    case 8:
    case 10:
    case 11:
    case 13:
    case 14:
      return this.aLt.length == 1;
    case 1:
    }return false;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté!");
      return;
    }
    byz localbyz = byv.bFN().bFO();
    if (localbyz.bSt().CD() <= 0L) {
      cth.cqP().err("Il faut avoir une guilde!");
      return;
    }
    try {
      switch (this.aLs) {
      case 0:
        d(localcyx);
        break;
      case 2:
        e(localcyx);
        break;
      case 3:
        f(localcyx);
        break;
      case 4:
        c(localcyx);
        break;
      case 5:
        w(localcyx);
        break;
      case 6:
        v(localcyx);
        break;
      case 7:
        UZ();
        break;
      case 8:
        u(localcyx);
        break;
      case 9:
        UY();
        break;
      case 10:
        t(localcyx);
        break;
      case 11:
        s(localcyx);
        break;
      case 13:
        r(localcyx);
        break;
      case 14:
        q(localcyx);
        break;
      case 12:
        OQ();
      case 1:
      }
    } catch (Exception localException) {
      cth.cqP().err("Problème d'une commande" + localException);
    }
  }

  private void OQ() {
    log("guild ('point'|'p'|'pt') delta : modifie de delta les points de guilde");
    log("guild 'money' delta : modifie de delta l'argent de la guilde");
    log("guild 'stats' : affiche des stats concernant la guilde");
    log("guild ('addBonus'|'ab') bonusId : active le bonus d'id bonusId");
    log("guild ('setLearningFactor'|'slf') factor : modifie le facteur de vitesse d'apprentissage");
    log("guild ('setMaxSimultaneous' | 'sms') max : modifie le maximum de bonus que la guilde peut apprendre en même temps");
    log("guild 'id' : affiche l'id de la guilde");
    log("guild ('maxPerWeek' | 'mpw') maxPerWeek : modifie le maximum de point accumulable par semaine");
    log("guild ('pointEarnedFactor' | 'pef') factor : modifie le facteur de points gagnés");
    log("guild 'info' :  affiche des infos concernant le guilde");
    log("guild ('setLevel' | 'sl') level : modifie le niveau de la guilde");
    log("guild ('changeMessage' | 'cm') level : modifie le message de la guilde");
    log("guild ('changeDescription' | 'cd') level : modifie la description de la guilde");
  }

  private void q(cyx paramcyx) {
    String str = this.aLt[0];
    bIZ localbIZ = new bIZ(str);
    paramcyx.d(localbIZ);
  }

  private void r(cyx paramcyx) {
    String str = this.aLt[0];
    dPp localdPp = new dPp(str);
    paramcyx.d(localdPp);
  }

  private void s(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)157);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void t(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)155);
    float f = Float.parseFloat(this.aLt[0]);
    localaIG.aM(f);
    paramcyx.d(localaIG);

    cyS localcyS = dqB.cXD().CG();
    if (localcyS == null) {
      cth.cqP().err("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
      return;
    }
    localcyS.aNv().q(f);
  }

  private void UY() {
    cyS localcyS = dqB.cXD().CG();
    if (localcyS == null) {
      cth.cqP().err("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
      return;
    }
    log("Total de point : " + localcyS.aNr());
    log("Points actuels : " + localcyS.CI());
    log("Limite de points par semaine : " + localcyS.aNw());
    log("Points gagnés cette semaine : " + localcyS.aNx());
  }

  private void u(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)154);
    int i = Integer.parseInt(this.aLt[0]);
    localaIG.mH(i);
    paramcyx.d(localaIG);

    cyS localcyS = dqB.cXD().CG();
    if (localcyS == null) {
      cth.cqP().err("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
      return;
    }
    new aGO(localcyS).lD(i);
  }

  private void UZ() {
    byz localbyz = byv.bFN().bFO();
    log("Id de la guilde : " + localbyz.bSt().CD());
  }

  private void v(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)150);
    int i = Integer.parseInt(this.aLt[0]);
    localaIG.mH(i);
    paramcyx.d(localaIG);

    cyS localcyS = dqB.cXD().CG();
    if (localcyS == null) {
      cth.cqP().err("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
      return;
    }

    localcyS.aNv().qf(i);
  }

  private void w(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)149);
    float f = Float.parseFloat(this.aLt[0]);
    localaIG.aM(f);
    paramcyx.d(localaIG);

    cyS localcyS = dqB.cXD().CG();
    if (localcyS == null) {
      cth.cqP().err("Il faut avoir les infos de la guilde pour mettre le facteur a jour dans le client");
      return;
    }

    localcyS.aNv().p(f);
  }

  private void c(brd parambrd) {
    bdO localbdO = new bdO(Integer.parseInt(this.aLt[0]));
    parambrd.d(localbdO);
  }

  private void d(brd parambrd) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)121);
    localaIG.mH(Integer.parseInt(this.aLt[0]));
    parambrd.d(localaIG);
  }

  private void e(brd parambrd) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)126);
    localaIG.dU(Long.parseLong(this.aLt[0]));
    parambrd.d(localaIG);
  }

  private void f(brd parambrd) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)6);
    localaIG.bf((short)127);
    parambrd.d(localaIG);
  }
}