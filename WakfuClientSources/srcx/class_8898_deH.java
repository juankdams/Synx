import java.util.List;
import org.apache.log4j.Logger;

public class deH extends dte
{
  private static final Logger K = Logger.getLogger(deH.class);
  public static final int HELP = 0;
  public static final int kYz = 1;
  public static final int ADD = 2;
  public static final int aat = 3;
  public static final int SHOW_ALL = 4;
  public static final int kYA = 5;
  private int aLs;
  private String[] aLt;

  public deH(int paramInt, String[] paramArrayOfString)
  {
    this.aLs = paramInt;
    this.aLt = paramArrayOfString;
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 1:
      return this.aLt.length == 0;
    case 0:
      return true;
    case 2:
      return (this.aLt.length == 1) || (this.aLt.length == 2);
    case 3:
      return this.aLt.length == 1;
    case 4:
      return this.aLt.length == 0;
    case 5:
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
    try {
      switch (this.aLs) {
      case 1:
        show();
        break;
      case 0:
        OQ();
        break;
      case 2:
        F(localcyx);
        break;
      case 3:
        V(localcyx);
        break;
      case 4:
        T(localcyx);
        break;
      case 5:
        U(localcyx);
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de calendrier " + localException);
    }
  }

  private void T(cyx paramcyx) {
    byz localbyz = byv.bFN().bFO();
    cTB localcTB = localbyz.bFW();
    cth.cqP().log("effets : ");
    for (aVc localaVc : localcTB)
      try {
        Ce localCe = localaVc.wa();
        int i = localCe == null ? 0 : localCe.nS();
        cth.cqP().log("UID : " + localaVc.bkb() + ", " + localaVc.getClass().getSimpleName() + " (" + localaVc.getId() + ")" + ", id effet : " + localaVc.bkc().yR() + ", container type : " + Wb.getTypeName(i) + " (" + i + ")" + ", id container : " + V(localaVc));
      }
      catch (Exception localException)
      {
        K.error("Erreur lors de la recuperation d'un effet");
      }
  }

  private void U(cyx paramcyx)
  {
    byz localbyz = byv.bFN().bFO();
    cTB localcTB = localbyz.bFW();
    int i = Integer.parseInt(this.aLt[0]);
    for (aVc localaVc : localcTB)
      try {
        if ((localaVc.wa() == null) || (localaVc.wa().nS() == i))
        {
          cth.cqP().log("UID : " + localaVc.bkb() + ", " + localaVc.getClass().getSimpleName() + " (" + localaVc.bkc().eo() + ")" + ", id effet : " + localaVc.bkc().yR() + ", container type : " + Wb.getTypeName(i) + " (" + i + ")" + ", id container : " + V(localaVc));
        }

      }
      catch (Exception localException)
      {
        K.error("Erreur lors de la recuperation d'un effet");
      }
  }

  private long V(aVc paramaVc)
  {
    Ce localCe = paramaVc.wa();

    if ((localCe instanceof bfE)) {
      return ((bfE)localCe).bsL().getId();
    }
    if ((localCe instanceof gA)) {
      return ((gA)localCe).ok();
    }
    if ((localCe instanceof bWG)) {
      return ((bWG)localCe).ok();
    }
    if ((localCe instanceof bJC)) {
      return ((bJC)localCe).bQW();
    }
    return 0L;
  }

  private void F(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)101);
    localaIG.bg(Short.parseShort(this.aLt[0]));
    if (this.aLt.length == 2)
      localaIG.bg(Short.parseShort(this.aLt[1]));
    paramcyx.d(localaIG);
  }

  private void V(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)100);
    localaIG.bg(Short.parseShort(this.aLt[0]));
    paramcyx.d(localaIG);
  }

  private void show() {
    byz localbyz = byv.bFN().bFO();
    List localList = localbyz.bFW().bto();
    int i = 0; for (int j = localList.size(); i < j; i++) {
      bPD localbPD = (bPD)localList.get(i);
      cth.cqP().log("UID : " + localbPD.bkb() + ", id Etat : " + localbPD.bWk().bQW() + ", level : " + localbPD.bWk().nU() + ", remaining time in ms : " + localbPD.bWm() + " ms");
    }
  }

  private void OQ()
  {
    log("-show | -s : montre les etats actuellement sur le joueur local");
    log("-showall | -sa : montre les effets actuellement sur le joueur local");
    log("(-showallof | -sao) containerID : montre les effets avec un type de conteneur (Etat = 1, Sort = 11, Item = 12, Aptitude = 17) actuellement sur le joueur local");
    log("(-add | -a) Id level? : ajoute l'état dont l'id est spécifié au niveau choisi (par défaut niveau 1)");
    log("(-remove | -r) Id : retire l'état dont l'id est passé en paramètre");
  }
}