import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class cvy extends dte
{
  public static final int igV = 0;
  public static final int igW = 1;
  public static final int HELP = 2;
  public static final int igX = 3;
  public static final int igY = 4;
  public static final int igZ = 5;
  public static final int iha = 6;
  public static final int ihb = 7;
  private final int aLs;
  private final String[] aLt;

  public cvy(int paramInt, String[] paramArrayOfString)
  {
    this.aLt = ((String[])paramArrayOfString.clone());
    this.aLs = paramInt;
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 0:
      return this.aLt.length == 0;
    case 1:
      return this.aLt.length == 1;
    case 2:
      return this.aLt.length == 0;
    case 3:
      return this.aLt.length == 0;
    case 4:
      return this.aLt.length == 0;
    case 5:
      return this.aLt.length == 0;
    case 6:
      return this.aLt.length == 1;
    case 7:
      return this.aLt.length == 0;
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
    try {
      switch (this.aLs) {
      case 0:
        ctq();
        break;
      case 1:
        ctp();
        break;
      case 2:
        OQ();
        break;
      case 3:
        cto();
        break;
      case 4:
        ctr();
        break;
      case 5:
        cts();
        break;
      case 6:
        ctt();
        break;
      case 7:
        ctu();
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de place de marché " + localException);
    }
  }

  private static void cto() {
    dn((short)90);
  }

  private static void OQ() {
    log("'-showBonusPointSelectbable' | '-sbps' : Montre la liste des bonus encore selectionnables");
    log("'-selectBonus' | '-sb' : Envoie au serveur une requete pour choisir un bonus de timepoints");
    log("-win : met fin au combat par une victoire pour notre personnage");
    log("-flee : Fuit de notre personnage");
    log("-ca idDonjon : lance un combat arcade spécifié");
    log("-cb : lance un combat match de boufbowl");
  }

  private void ctp() {
    int i = Integer.parseInt(this.aLt[0]);

    dBA localdBA = new dBA();
    localdBA.Cp(i);

    byv.bFN().aJK().d(localdBA);
  }

  private static void ctq() {
    byz localbyz = byv.bFN().bFO();
    arl localarl = localbyz.aeQ();
    Iterator localIterator;
    if (localarl == null) {
      log("Pas de combat, pas de bonus");
    } else {
      List localList = localarl.aDp().bPN().t(localbyz.getId());
      for (localIterator = localList.iterator(); localIterator.hasNext(); ) {
        dpI localdpI = (dpI)localIterator.next();
        String str = bU.fH().b(30, localdpI.yR(), new Object[0]);
        log("Id : " + localdpI.yR() + " : " + str);
      }
    }
  }

  private static void ctr() {
    dn((short)102);
  }

  private static void cts() {
    dn((short)103);
  }

  private void ctt() {
    int i = Integer.parseInt(this.aLt[0]);
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)120);
    localaIG.mH(i);
    localcyx.d(localaIG);
  }

  private void ctu() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)125);
    localcyx.d(localaIG);
  }

  private static void dn(short paramShort) {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf(paramShort);
    localcyx.d(localaIG);
  }
}