import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class dkh
{
  private static final Logger K = Logger.getLogger(dkh.class);
  private static final Comparator lhm = new bQZ();

  private static final Comparator lhn = new bRa();

  private static final Comparator lho = new bRb();

  private static final Comparator lhp = new bRd();

  private static final Comparator lhq = new bRf();

  private static int by(Su paramSu)
  {
    try
    {
      return paramSu.cJf().bP(); } catch (Exception localException) {
    }
    return 0;
  }

  public static dCb a(czN paramczN, int paramInt, cYk paramcYk)
  {
    dvC localdvC = a(paramcYk, paramczN, paramInt);

    localdvC.a(new bRg(paramczN, localdvC));

    return localdvC;
  }

  private static dvC a(cYk paramcYk, czN paramczN, int paramInt)
  {
    Object localObject1 = paramInt == 1 ? paramczN.cwM() : paramczN.cwN();
    if (localObject1 == null) {
      localObject2 = paramczN.ch((byte)paramInt).iterator(); if (((Iterator)localObject2).hasNext()) { localObject3 = (Su)((Iterator)localObject2).next();
        localObject1 = localObject3;
      }
    }

    Object localObject2 = new dvC(dsE.cYX(), paramcYk.getX(), paramcYk.getY(), paramcYk.IB(), (Su)localObject1, null);
    Object localObject3 = "EpeeCombat.anm";
    ((dvC)localObject2).em("EpeeCombat");

    ((dvC)localObject2).c(paramInt == 1 ? CG.bFF : CG.bFJ);

    ((dvC)localObject2).eq(bz((Su)localObject1));
    ((dvC)localObject2).ax((short)6);
    try
    {
      ((dvC)localObject2).b(ay.bd().getString("ANMGUIPath") + "EpeeCombat.anm", true);
    } catch (Exception localException) {
      K.error("", localException);
    }

    return localObject2;
  }

  private static String bz(Su paramSu) {
    if ((paramSu instanceof byo)) {
      return "Anim-Mob";
    }
    return "Anim-" + by(paramSu);
  }

  private static boolean a(czN paramczN, Su paramSu, dD paramdD) {
    try {
      List localList = (List)paramczN.ch(paramSu.Fx());
      Collections.sort(localList, lhq);
      Su localSu;
      if (localList.size() > 1) {
        int i = 0;
        for (localIterator = localList.iterator(); localIterator.hasNext(); ) { localSu = (Su)localIterator.next();
          i += localSu.nU();
        }
        dxz.a(paramdD, i);
      }

      boolean bool = paramSu.aeL().asQ();

      dxz.a(paramdD, paramSu);

      for (Iterator localIterator = localList.iterator(); localIterator.hasNext(); ) { localSu = (Su)localIterator.next();
        Object localObject;
        if ((localSu instanceof byo)) {
          localObject = Tn.g((byo)localSu);
          dxz.a(bool, localSu, paramdD, (dzM)localObject);
        } else if ((localSu instanceof bKm)) {
          dxz.w(localSu.aeL());
          localObject = dxz.i(localSu, bool);
          paramdD.c((String)localObject, dxz.bC(localSu));
        }
      }
      paramdD.addInfo(bU.fH().getString("desc.inFight"));
    } catch (Exception localException) {
      K.error("problème de récupération d'info leader=" + paramSu + " fightInfo=" + paramczN, localException);
      return false;
    }

    return true;
  }
}