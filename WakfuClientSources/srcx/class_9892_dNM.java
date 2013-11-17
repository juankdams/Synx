import java.util.List;
import org.apache.log4j.Logger;

public class dNM
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dNM.class);

  public static dNM meo = new dNM();

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public boolean a(cWG paramcWG) {
    byz localbyz = byv.bFN().bFO();
    Object localObject;
    switch (paramcWG.getId()) {
    case 15710:
      localObject = (dfx)paramcWG;
      a(localbyz, (dfx)localObject);
      return false;
    case 15712:
      localObject = (zS)paramcWG;
      a(localbyz, (zS)localObject);
      return false;
    case 15714:
      localObject = (afA)paramcWG;
      a(localbyz, (afA)localObject);
      return false;
    case 15716:
      localObject = (bet)paramcWG;
      a(localbyz, (bet)localObject);
      return false;
    case 15718:
      localObject = (vh)paramcWG;
      a(localbyz, (vh)localObject);
      return false;
    case 15711:
    case 15713:
    case 15715:
    case 15717: } return true;
  }

  private void a(byz parambyz, vh paramvh)
  {
    cXB localcXB = paramvh.Ec();
    Object localObject1;
    Object localObject2;
    String str2;
    Object localObject3;
    String str1;
    switch (chr.hFG[localcXB.ordinal()])
    {
    case 1:
      break;
    case 2:
      break;
    case 3:
      break;
    case 4:
      break;
    case 5:
      break;
    case 6:
      break;
    case 7:
      break;
    case 8:
      break;
    case 9:
      break;
    case 10:
      break;
    case 11:
      duO.dax().qq("6001039.xps");

      aWc.blo().eO(600125L);

      localObject1 = (cfm)dLE.doY().rv("selectedRecipe");

      if (localObject1 == null)
        localObject2 = bU.fH().b(46, duO.dax().daK(), new Object[0]);
      else {
        localObject2 = ((cfm)localObject1).getName();
      }
      str2 = bU.fH().getString("craft.knownRecipeExecutionFailure", new Object[] { localObject2 });
      localObject3 = new aEe(str2);
      ((aEe)localObject3).mm(4);
      CM.LV().a((aEe)localObject3);
      duO.dax().daD();

      return;
    case 12:
      duO.dax().qq("6001039.xps");

      aWc.blo().eO(600125L);

      localObject1 = bU.fH().getString("craft.unknownRecipeExecutionFailure");
      localObject2 = new aEe((String)localObject1);
      ((aEe)localObject2).mm(4);
      CM.LV().a((aEe)localObject2);

      duO.dax().daD();

      return;
    case 13:
      duO.dax().qq("6001039.xps");

      aWc.blo().eO(600125L);

      localObject1 = bU.fH().getString("craft.unknownRecipeCantBeCraftedHere");
      localObject2 = new aEe((String)localObject1);
      ((aEe)localObject2).mm(4);
      CM.LV().a((aEe)localObject2);

      duO.dax().daD();

      return;
    case 14:
      boolean bool = ((bVw)Hh.QM().dh(paramvh.Ed())).cbh().cwz();
      localObject2 = (cfm)dLE.doY().rv("selectedRecipe");

      if (localObject2 == null)
        str2 = bU.fH().b(46, duO.dax().daK(), new Object[0]);
      else {
        str2 = ((cfm)localObject2).getName();
      }
      localObject3 = bU.fH().getString("craft.knownRecipeExecutionSuccess", new Object[] { str2 });
      aEe localaEe = new aEe((String)localObject3);
      localaEe.mm(4);
      CM.LV().a(localaEe);

      duO.dax().kE(bool);

      return;
    case 15:
      str1 = bU.fH().getString("craft.errorOccupation");
      localObject2 = new aEe(str1);
      ((aEe)localObject2).mm(3);
      CM.LV().a((aEe)localObject2);
      if (byv.bFN().c(duO.dax())) {
        byv.bFN().b(duO.dax());
      }
      return;
    case 16:
      str1 = bU.fH().getString("craft.errorOccupation");
      localObject2 = new aEe(str1);
      ((aEe)localObject2).mm(3);
      CM.LV().a((aEe)localObject2);
      break;
    default:
      K.error("Reception d'un message d'erreur de craft " + localcXB + " non géré par le client");
    }

    duO.dax(); duO.daG();
  }

  private void a(byz parambyz, dfx paramdfx) {
    int i = paramdfx.IF();

    deT localdeT = DA.bIr.eD(i);
    if (localdeT == null) {
      K.error("Réception d'un message d'apprentissage pour le métier " + i + " inconnu du manager");
      return;
    }

    parambyz.aTn().b(localdeT);
  }

  private void a(byz parambyz, zS paramzS) {
    int i = paramzS.IF();
    int j = paramzS.IG();

    deT localdeT = DA.bIr.eD(i);
    if (localdeT == null) {
      K.error("Réception d'un message d'apprentissage de recette pour le metier " + i + " inconnu du manager");
      return;
    }

    cGx localcGx = localdeT.zP(j);
    if (localcGx == null) {
      K.error("Réception d'un message d'apprentissage de la recette " + i + " inconnue du manager");
      return;
    }

    parambyz.aTn().bw(i, j);
  }

  private void a(byz parambyz, afA paramafA) {
    int i = paramafA.IF();
    long l = paramafA.arb();
    parambyz.aTn().d(i, l);
  }

  private void a(byz parambyz, bet parambet) {
    long l1 = parambet.bsh();
    int i = parambet.IG();
    int j = parambet.bsi();
    long l2 = parambet.getDuration();

    bNK localbNK = (bNK)ayg.aJQ().dw(l1);
    if (!localbNK.bVi().contains(parambyz.ML())) {
      K.error("DéSnchro de position? le joueur " + parambyz + " essaye d'interagir avec la machine " + localbNK + " sans se trouver dans le pattern d'activation");

      return;
    }

    int k = localbNK.axX();
    deT localdeT = DA.bIr.eD(k);
    if (localdeT == null) {
      K.error("Le joueur " + parambyz + " essaye d'utiliser la recette " + i + " du métier " + k + " alors que celui-ci n'existe pas");
      return;
    }
    Object localObject1;
    if (j == -1) {
      localObject1 = new dJP(k, parambyz.aTn().getLevel(k));
    } else if (j == -2) {
      localObject2 = localdeT.zP(i);
      localObject1 = new dLd((cGx)localObject2, k, ((cGx)localObject2).cig());
    } else {
      localObject1 = localdeT.zP(i);
    }
    if (localObject1 == null) {
      K.error("Le joueur " + parambyz + " essaye d'utiliser la recette " + i + " du métier " + k + " alors que celle-ci n'existe pas");

      return;
    }

    Object localObject2 = new apq(localbNK, (cGx)localObject1, l2);
    if (((apq)localObject2).fV()) {
      parambyz.a((aDq)localObject2);
      ((apq)localObject2).begin();
    } else {
      ((apq)localObject2).cancel();
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}