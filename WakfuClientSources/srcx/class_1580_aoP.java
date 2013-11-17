import com.ankamagames.wakfu.client.binaryStorage.ItemBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.StaticEffectBinaryData;
import java.util.EnumMap;
import org.apache.log4j.Logger;

public final class aoP
  implements bdw
{
  private static final Logger K = Logger.getLogger(aoP.class);

  public bBn b(drN paramdrN) {
    if ((!bB) && (paramdrN == null)) throw new AssertionError();

    ItemBinaryData localItemBinaryData = (ItemBinaryData)paramdrN;
    Object localObject;
    if (localItemBinaryData.duG()) {
      localObject = i(localItemBinaryData);
    } else if (localItemBinaryData.duH()) {
      cIF localcIF = (cIF)bSx.hdo.tU(localItemBinaryData.bKE());
      if (localcIF == null) {
        K.error("Un submetaItem sans parent !!! Id=" + localItemBinaryData.getId());
        return null;
      }
      localObject = a(localItemBinaryData, localcIF);
    } else {
      localObject = j(localItemBinaryData);
    }

    bVN.hhQ.g((bBn)localObject);

    return localObject;
  }

  private static cIF i(ItemBinaryData paramItemBinaryData) {
    EnumMap localEnumMap = k(paramItemBinaryData);

    cIF localcIF = Mf.a(paramItemBinaryData, localEnumMap);

    c(paramItemBinaryData, localcIF);
    a(paramItemBinaryData, localcIF);
    b(paramItemBinaryData, localcIF);
    return localcIF;
  }

  private static QM a(ItemBinaryData paramItemBinaryData, cIF paramcIF) {
    EnumMap localEnumMap = k(paramItemBinaryData);

    QM localQM = Mf.a(paramcIF, paramItemBinaryData, localEnumMap);

    c(paramItemBinaryData, localQM);
    a(paramItemBinaryData, localQM);
    b(paramItemBinaryData, localQM);
    return localQM;
  }

  private static bVw j(ItemBinaryData paramItemBinaryData) {
    EnumMap localEnumMap = k(paramItemBinaryData);

    bVw localbVw = Mf.b(paramItemBinaryData, localEnumMap);

    c(paramItemBinaryData, localbVw);
    a(paramItemBinaryData, localbVw);
    b(paramItemBinaryData, localbVw);
    return localbVw;
  }

  private static void a(ItemBinaryData paramItemBinaryData, bBn parambBn) {
    int i = paramItemBinaryData.getId();
    for (dTV localdTV : paramItemBinaryData.dva()) {
      dmX localdmX = dmX.AQ(localdTV.chY());
      dKf localdKf = xW.a(localdTV.eo(), localdmX);
      if (localdKf != null) {
        bZA localbZA = null;
        try {
          localbZA = aVj.hn(localdTV.uL());
        } catch (Exception localException) {
          K.error("Erreur de compilation du critèrre sur l'action id=" + localdTV.chY() + " de l'item id=" + i, localException);
        }

        localdKf.c(localdTV.chZ());
        localdKf.a(localbZA);
        localdKf.bP(localdTV.dtY());
        localdKf.bQ(localdTV.apw());
        localdKf.bR(localdTV.apx());
        localdKf.bS(localdmX.cUr());
        localdKf.bO(localdTV.dtZ());
        parambBn.a(localdKf);
        parambBn.fT(true);
      } else {
        K.error("Chargement d'une action d'un type inconnu sur un item actionId=" + localdTV.chY() + " referenceItemId=" + parambBn.getId());
      }
    }
  }

  private static void b(ItemBinaryData paramItemBinaryData, bBn parambBn) {
    Object localObject = parambBn.acu() == cqG.iat ? new cSi() : null;

    StaticEffectBinaryData localStaticEffectBinaryData = new StaticEffectBinaryData();
    for (int k : paramItemBinaryData.vD()) {
      try {
        if (cze.cwb().a(k, localStaticEffectBinaryData))
          if (bBn.a(paramItemBinaryData.duG(), localStaticEffectBinaryData.yQ(), localStaticEffectBinaryData.eo())) {
            localObject.add(k);
          }
          else
          {
            dpI localdpI = ciQ.ckL().vt(k);
            if (localdpI != null)
              parambBn.a(localdpI);
            else
              K.error("Problème de chargement du ReferenceItem " + paramItemBinaryData.getId());
          }
      }
      catch (Exception localException) {
        K.error("Exception au chargement de l'effet " + k, localException);
      }
    }

    if (localObject != null)
      ((cIF)parambBn).V(localObject.cIf());
  }

  private static void c(ItemBinaryData paramItemBinaryData, bBn parambBn)
  {
    int i = paramItemBinaryData.getId();

    int[] arrayOfInt = paramItemBinaryData.duU();
    int j = 0; for (int k = arrayOfInt.length; j < k; j++) {
      int m = arrayOfInt[j];
      bGS localbGS = bGS.sT(m);
      if (localbGS == null) {
        K.error("Impossible de trouver la propriété " + m + " définie pour l'item " + i);
      }
      else
        parambBn.a(localbGS);
    }
  }

  private static EnumMap k(ItemBinaryData paramItemBinaryData) {
    int i = paramItemBinaryData.getId();
    EnumMap localEnumMap = new EnumMap(Aq.class);
    String[] arrayOfString = paramItemBinaryData.duI();
    if (arrayOfString != null) {
      int j = arrayOfString.length / 2;
      for (int k = 0; k < j; k++) { String str1 = arrayOfString[(2 * k)];
        String str2 = arrayOfString[(2 * k + 1)];
        Aq localAq;
        try {
          localAq = Aq.valueOf(str1);
        } catch (IllegalArgumentException localIllegalArgumentException) {
          K.error("Erreur lors de la récupération d'une action : type d'action inconnu : '" + str1 + "' Item : " + i, localIllegalArgumentException);
          continue;
        }
        bZA localbZA;
        try
        {
          localbZA = aVj.hn(str2);
        } catch (Exception localException) {
          K.error("Erreur lors de la compilation du critère sur l'action " + localAq + " de l'item " + i, localException);
          continue;
        }

        localEnumMap.put(localAq, localbZA);
      }
    }
    return localEnumMap;
  }
}