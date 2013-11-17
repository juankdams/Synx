import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class qn
  implements bYa
{
  private final cSR aXl = new cSR();
  private final cSR aXm = new cSR();

  private static final Logger K = Logger.getLogger(qn.class);

  private static final cnq aXn = new cnq();

  private static final qn aXo = new qn();

  public amY cj(int paramInt)
  {
    return b(paramInt, cYq.cLM());
  }

  private amY a(int paramInt, dxL paramdxL) {
    dDU localdDU = cl(paramInt);
    if (localdDU == null) {
      K.error("Le challenge " + paramInt + " n'existe pas, impossible de le lancer.");
      return null;
    }

    amY localamY = amY.b(localdDU);
    this.aXm.put(paramInt, localamY);

    localamY.r(paramdxL);
    localamY.aF((short)-1);

    return localamY;
  }

  public amY b(int paramInt, dxL paramdxL) {
    return a(paramInt, paramdxL);
  }

  public static qn xw()
  {
    return aXo;
  }

  public amY ck(int paramInt) {
    return (amY)this.aXm.get(paramInt);
  }

  public void a(int paramInt, dDU paramdDU) {
    this.aXl.put(paramInt, paramdDU);
  }

  public dDU cl(int paramInt) {
    dDU localdDU = (dDU)this.aXl.get(paramInt);
    if (localdDU == null) {
      gR localgR = bfK.bsS().a(paramInt, aXn);
      if (localgR != null) {
        a((cnq)localgR);
      }

      localdDU = (dDU)this.aXl.get(paramInt);
    }

    return localdDU;
  }

  public dNR cm(int paramInt) {
    dDU localdDU = cl(paramInt);
    amY localamY = ck(paramInt);
    if (localamY == null) {
      return null;
    }

    ArrayList localArrayList = localdDU.aLj();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dNR localdNR = (dNR)localArrayList.get(i);
      if (localamY.a(localdNR) == 1) {
        return localdNR;
      }
    }
    return null;
  }

  public dNR cn(int paramInt) {
    dDU localdDU = cl(paramInt);
    amY localamY = ck(paramInt);
    if (localamY == null) {
      return null;
    }

    ArrayList localArrayList = localdDU.aLj();
    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      dNR localdNR = (dNR)localArrayList.get(i);
      if (localamY.a(localdNR) == 2) {
        return localdNR;
      }
    }
    return null;
  }

  public boolean co(int paramInt) {
    amY localamY = (amY)this.aXm.remove(paramInt);

    if (localamY != null) {
      localamY.r(null);
      aUi.eUP.nX(paramInt);
      a(localamY);
      return true;
    }
    return false;
  }

  public void clean() {
    bUH.caG().caH();
    bUH.caG().caL();

    this.aXm.clear();
  }

  public void a(cSi paramcSi, int paramInt) {
    amY localamY = ck(paramInt);
    if (localamY == null) {
      localamY = cj(paramInt);
    }
    localamY.b(paramcSi);
    a(localamY);
  }

  public boolean a(byte paramByte, long paramLong, int paramInt) {
    amY localamY = ck(paramInt);
    if (localamY == null) {
      localamY = cj(paramInt);
    }
    boolean bool = localamY.b(paramByte, paramLong);
    a(localamY);
    return bool;
  }

  public void a(amY paramamY) {
    ceQ localceQ = aUi.eUP.nW(paramamY.getId());
    if (localceQ != null)
      localceQ.bot();
  }

  public void b(amY paramamY)
  {
    ceQ localceQ = aUi.eUP.nW(paramamY.getId());
    if (localceQ != null)
      localceQ.bot();
  }

  public void F(int paramInt1, int paramInt2)
  {
    amY localamY = ck(paramInt1);
    if ((localamY != null) && (!localamY.azx()))
      localamY.jf(paramInt2);
    else {
      K.error("On essaie de terminer un but sur un challenge pas chargé dans le client");
    }
    a(localamY);
  }

  public void a(int paramInt, cSi paramcSi) {
    amY localamY = (amY)this.aXm.get(paramInt);
    localamY.c(paramcSi);
    localamY.r(null);
    localamY.bB(true);
    if (!localamY.azx()) {
      localamY.bz(true);
    }

    dLE.doY().t("challengeDetailsVisible", Boolean.valueOf(false));

    a(localamY);

    cew localcew = byv.bFN().bFO().aeL();
    localcew.c(CG.bFI);

    localcew.eq("AnimEmote-Victoire");

    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800029);
    localFreeParticleSystem.b(localcew);
    cWS.cKD().b(localFreeParticleSystem);
  }

  public void cp(int paramInt) {
    amY localamY = ck(paramInt);
    if (localamY == null) {
      localamY = cj(paramInt);
    }
    if (localamY == null) {
      return;
    }

    localamY.cx(true);
    a(localamY);
  }

  public boolean a(dA paramdA)
  {
    if (paramdA.aq != null) {
      K.error("Le client ne devrait pas recevoir les infos complètes de scenarii.");
      return false;
    }

    if (paramdA.ar == null) {
      K.error("Pas d'infos de challenges à désérialiser");
      return false;
    }

    boolean bool = true;
    for (dkE localdkE : paramdA.ar.cGb) {
      try {
        awE localawE = localdkE.lhM;
        int i = localawE.aBM;
        cYq localcYq = localawE.dLV != null ? cYq.jq(localawE.dLV.value) : cYq.cLM();
        localamY = a(i, localcYq);

        cSi localcSi = new cSi(localawE.dLR.size());
        for (localIterator2 = localawE.dLR.iterator(); localIterator2.hasNext(); ) { localObject = (doZ)localIterator2.next();
          localcSi.add(((doZ)localObject).eQZ);
        }
        localamY.b(localcSi);

        for (localIterator2 = localawE.dLS.iterator(); localIterator2.hasNext(); ) { localObject = (cJO)localIterator2.next();
          localamY.jf(((cJO)localObject).eQZ);
        }

        for (localIterator2 = localawE.dLT.iterator(); localIterator2.hasNext(); ) { localObject = (dfO)localIterator2.next();
          localamY.b(((dfO)localObject).hFV, ((dfO)localObject).value);
        }
      }
      catch (Exception localException)
      {
        amY localamY;
        Iterator localIterator2;
        Object localObject;
        K.error("Exception lors de la désérialisation du scénarion id=" + localdkE.lhM.aBM, localException);
        bool = false;
      }
    }

    return bool;
  }

  public void a(cnq paramcnq)
  {
    if (!paramcnq.cnY()) {
      return;
    }

    int i = paramcnq.getId();
    byte b1 = paramcnq.getType();
    byte b2 = paramcnq.cnT();
    boolean bool1 = paramcnq.azC();

    short s1 = paramcnq.azC() ? 0 : paramcnq.azI();
    dxL localdxL = paramcnq.cnS();
    boolean bool2 = paramcnq.cnX();
    short s2 = paramcnq.cnZ();
    short s3 = paramcnq.coa();
    String str1 = paramcnq.cnV();
    String str2 = paramcnq.cnW();
    String str3 = paramcnq.aiV();
    dDU localdDU = new dDU(i, b1, b2, s1, bool2, localdxL, s2, s3, str1, str2, bool1, str3);

    String[] arrayOfString = paramcnq.cnU();
    Object localObject1;
    for (int j = 0; j < arrayOfString.length; j++) {
      localObject1 = arrayOfString[j];

      if (((String)localObject1).startsWith("'")) {
        localObject1 = ((String)localObject1).substring(1, ((String)localObject1).length() - 1);
      }

      localdDU.l((byte)j, (String)localObject1);
    }

    for (Iterator localIterator = paramcnq.cnR().iterator(); localIterator.hasNext(); ) { localObject1 = (cVX)localIterator.next();
      if (((cVX)localObject1).cKq())
      {
        k = ((cVX)localObject1).getId();
        String str4 = ((cVX)localObject1).cKp();
        localcYk = null;
        if (!str4.equalsIgnoreCase("null")) {
          localObject2 = null;
          try {
            localObject2 = aVj.hm(str4);
          } catch (Exception localException) {
            K.error("Erreur lors de la compilation des critères d'un scénario (scénario " + i + " actionGroupId : " + k + ")", localException);
          }
          if (localObject2 != null) {
            localcYk = aUG.eF(((aUG)localObject2).b(null, null, null, null));
          }
        }

        Object localObject2 = new dNR(k, i, localcYk, ((cVX)localObject1).cKo(), ((cVX)localObject1).cKn(), ((cVX)localObject1).cKr());
        localdDU.b((dNR)localObject2);
      }
    }
    int k;
    cYk localcYk;
    for (localIterator = paramcnq.cfd().iterator(); localIterator.hasNext(); ) { localObject1 = (XE)localIterator.next();
      k = ((XE)localObject1).getId();
      int m = ((XE)localObject1).ajB();
      localcYk = null;
      boolean bool3 = ((XE)localObject1).IR();
      int n = ((XE)localObject1).gw();
      short s4 = ((XE)localObject1).ajC();
      int i1 = ((XE)localObject1).IT();
      int i2 = ((XE)localObject1).IQ();
      byte b3 = ((XE)localObject1).IS();
      if (bool3)
        localdDU.a(k, m, n, s4, i1, i2, localcYk, b3);
      else {
        localdDU.b(k, m, n, s4, i1, i2, localcYk, b3);
      }

    }

    a(i, localdDU);
  }

  public String toString()
  {
    amY localamY = bUH.caG().caF();
    String str = "";

    return str;
  }
}