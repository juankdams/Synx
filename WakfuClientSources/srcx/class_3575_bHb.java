import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bHb
  implements cTu
{
  private static final Logger K = Logger.getLogger(bHb.class);
  public static final bHb gEk = new bHb();

  public void f(deT paramdeT)
  {
    bMD localbMD = byv.bFN().bFO().bGP();
    ArrayList localArrayList = localbMD.hi(paramdeT.cPh());
    for (Object localObject1 = localArrayList.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (gA)((Iterator)localObject1).next();
      if (localbMD.aq((gA)localObject2) != null)
        ((gA)localObject2).release();
    }
    localObject1 = bU.fH().getString("craft.jobLearnt", new Object[] { bU.fH().b(43, paramdeT.getId(), new Object[0]) });
    Object localObject2 = new aEe((String)localObject1);
    ((aEe)localObject2).mm(4);
    CM.LV().a((aEe)localObject2);

    Nx.cdi.fV(paramdeT.getId());
    dLE.doY().a(byv.bFN().bFO(), new String[] { "craft" });

    bSH.bZs().bLP();

    bOU.gUc.b(new dQf(paramdeT.getId()));
  }

  public void b(int paramInt, long paramLong) {
    byz localbyz = byv.bFN().bFO();
    long l = localbyz.aTn().ll(paramInt);
    int i = Et.bq(l) - Et.bq(l - paramLong);
    String str1 = bU.fH().b(43, paramInt, new Object[0]);
    String str2 = bU.fH().getString("infoPop.xpGain", new Object[] { str1, Long.valueOf(paramLong), Long.valueOf(localbyz.aTn().lk(paramInt)), cPU.kAy, Integer.valueOf(i) });
    aEe localaEe = new aEe(str2);
    localaEe.mm(4);
    CM.LV().a(localaEe);
    if (i == 0)
      return;
    String str3 = bU.fH().getString("notification.skillLevelUpTitle", new Object[] { str1 });

    String str4 = cda.createLink(bU.fH().getString("notification.skillLevelUpText", new Object[] { str1, Short.valueOf(localbyz.aTn().getLevel(paramInt)) }), ana.dqf, paramInt + "");

    az localaz = new az(str3, str4, ana.dqf);
    cjO.clE().j(localaz);

    localbyz.bGA();

    Nx.cdi.b(paramInt, paramLong);
  }

  public void cj(int paramInt1, int paramInt2) {
    String str = bU.fH().getString("craft.recipeDiscovered", new Object[] { bU.fH().b(46, paramInt2, new Object[0]) });
    aEe localaEe = new aEe(str);
    localaEe.mm(4);
    CM.LV().a(localaEe);

    Nx.cdi.fX(paramInt1);
  }
}