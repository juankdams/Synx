import java.util.Iterator;
import java.util.List;

public class beD extends dte
{
  public static final int frE = 0;
  public static final int frF = 1;
  public static final int frG = 2;
  public static final int frH = 3;
  public static final int HELP = 4;
  public static final int frI = 5;
  public static final int frJ = 6;
  public static final int frK = 7;
  private float frL;
  private int aLs;
  private List frM;
  private String frN;
  private String frO;

  public beD()
  {
    this(3);
  }

  public beD(int paramInt) {
    this(paramInt, -1.0F);
  }

  public beD(int paramInt, float paramFloat) {
    this.frL = paramFloat;
    this.aLs = paramInt;
  }

  public beD(int paramInt, float paramFloat, List paramList) {
    this(paramInt, paramFloat);
    this.frM = paramList;
  }

  public beD(int paramInt, float paramFloat, List paramList, String paramString1, String paramString2) {
    this(paramInt, paramFloat, paramList);
    this.frN = paramString1;
    this.frO = paramString2;
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 0:
    case 1:
    case 2:
    case 5:
    case 6:
    case 7:
      return (this.frL == -1.0F) || ((this.frN != null) && (this.frO != null));
    case 3:
    case 4:
      return true;
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

    if ((this.frL < 0.0F) && (this.frL != -1.0F)) {
      cth.cqP().err("Il faut que le facteur d'xp soit >= 0, reçu=" + this.frL);
      return;
    }
    short s;
    switch (this.aLs) {
    case 1:
      s = 136;
      break;
    case 0:
      s = 39;
      break;
    case 2:
      s = 137;
      break;
    case 3:
      s = 138;
      break;
    case 5:
      s = 163;
      break;
    case 6:
      s = 164;
      break;
    case 7:
      s = 165;
      break;
    case 4:
      localObject1 = "setBonusFactor|sbf help : affiche l'aide\nsetBonusFactor|sbf : affiche toutes les valeurs de bonus\nsetBonusFactor|sbf fxp : affiche la valeur de bonus d'xp de combat général\nsetBonusFactor|sbf fxp instanceId : affiche la valeur de bonus d'xp de combat sur une ou plusieurs instances\nsetBonusFactor|sbf fxp -1.0 : reset des événements de bonus d'xp de combat général\nsetBonusFactor|sbf fxp -1.0 instanceId : reset des événements de bonus d'xp de combat sur une ou plusieurs instances\nsetBonusFactor|sbf fxp value startDate endDate : applique value comme valeur de bonus d'xp de combat général de startDate à endDate\nsetBonusFactor|sbf fxp value startDate endDate instanceId : applique value comme valeur de bonus d'xp de combat sur une ou plusieurs instances de startDate à endDate\nsyntaxe d'une date : jj/mm/aaaa hh:mm\nremplacer fxp par cxp : concerne l'xp de craft\nremplacer fxp par k : concerne les kamas\nremplacer fxp par loot : concerne le nombre d'essais de loot\nremplacer fxp par gblf : concerne le facteur d'apprentissage des bonus de guilde\nremplacer fxp par pp : concerne la prospection\n";

      cth.cqP().log("setBonusFactor|sbf help : affiche l'aide\nsetBonusFactor|sbf : affiche toutes les valeurs de bonus\nsetBonusFactor|sbf fxp : affiche la valeur de bonus d'xp de combat général\nsetBonusFactor|sbf fxp instanceId : affiche la valeur de bonus d'xp de combat sur une ou plusieurs instances\nsetBonusFactor|sbf fxp -1.0 : reset des événements de bonus d'xp de combat général\nsetBonusFactor|sbf fxp -1.0 instanceId : reset des événements de bonus d'xp de combat sur une ou plusieurs instances\nsetBonusFactor|sbf fxp value startDate endDate : applique value comme valeur de bonus d'xp de combat général de startDate à endDate\nsetBonusFactor|sbf fxp value startDate endDate instanceId : applique value comme valeur de bonus d'xp de combat sur une ou plusieurs instances de startDate à endDate\nsyntaxe d'une date : jj/mm/aaaa hh:mm\nremplacer fxp par cxp : concerne l'xp de craft\nremplacer fxp par k : concerne les kamas\nremplacer fxp par loot : concerne le nombre d'essais de loot\nremplacer fxp par gblf : concerne le facteur d'apprentissage des bonus de guilde\nremplacer fxp par pp : concerne la prospection\n");
      return;
    default:
      return;
    }

    Object localObject1 = new aIG();
    ((aIG)localObject1).bM((byte)2);
    ((aIG)localObject1).bf(s);
    ((aIG)localObject1).aM(this.frL);
    Object localObject2;
    if (this.frN != null) {
      localObject2 = ig(this.frN);
      ((aIG)localObject1).dU(((cYq)localObject2).rP());
      if (localObject2 == null) {
        cth.cqP().err("Erreur de syntaxe dans la date de départ - taper setBonusFactor help pour voir la syntaxe");
        return;
      }
    }
    if (this.frO != null) {
      localObject2 = ig(this.frO);
      ((aIG)localObject1).dU(((cYq)localObject2).rP());
      if (localObject2 == null) {
        cth.cqP().err("Erreur de syntaxe dans la date de fin - taper setBonusFactor help pour voir la syntaxe");
        return;
      }
    }

    if (this.frM != null)
      for (localObject2 = this.frM.iterator(); ((Iterator)localObject2).hasNext(); ) { Integer localInteger = (Integer)((Iterator)localObject2).next();
        ((aIG)localObject1).mH(localInteger.intValue()); }
    localcyx.d((cWG)localObject1);
  }

  private cYq ig(String paramString) {
    String[] arrayOfString1 = paramString.split(" ");
    if (arrayOfString1.length < 2)
      return null;
    String[] arrayOfString2 = arrayOfString1[0].split("/");
    if (arrayOfString2.length < 3)
      return null;
    String[] arrayOfString3 = arrayOfString1[1].split(":");
    if (arrayOfString3.length < 2)
      return null;
    return new cYq(0, Integer.parseInt(arrayOfString3[1]), Integer.parseInt(arrayOfString3[0]), Integer.parseInt(arrayOfString2[0]), Integer.parseInt(arrayOfString2[1]), Integer.parseInt(arrayOfString2[2]));
  }
}