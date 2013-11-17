import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import org.apache.log4j.Logger;

public class bOX
  implements ZF
{
  protected static final Logger K = Logger.getLogger(bOX.class);
  private ckT aCI;
  private static final float[] gUf = { 1.0F, 1.0F, 1.0F, 0.9F };
  private static final String gUg = "STATIC_EFFECT";
  private static final bOX gUh = new bOX();

  private static int gUi = 1;

  private final Stack gUj = new Stack();

  private final HashMap gUk = new HashMap();
  private final HashMap gUl = new HashMap();

  private final aoL gUm = new aoL();

  private static final cIw gUn = new crN();

  public static bOX bVM()
  {
    return gUh;
  }

  private static int bVN()
  {
    if (gUi == 2147483647)
      return 1;
    return gUi++;
  }

  public void o(cjK paramcjK)
  {
    cCq localcCq = ((dhy)paramcjK).Uc();
    if (localcCq.cyE()) {
      c(paramcjK, localcCq);
    }

    if (this.gUm.containsKey(paramcjK.getId())) {
      return;
    }

    if (localcCq.cys()) {
      try {
        b(paramcjK, localcCq);
      } catch (NumberFormatException localNumberFormatException) {
        K.error("Aps au format étrange : '" + localcCq.cyt() + "' pour l'area " + localcCq.cyF() + "-" + localcCq.getId());
        return;
      }

    }

    dRK localdRK = a(paramcjK, localcCq);
    if (localdRK == null) {
      if (!localcCq.cyz())
        return;
      if (paramcjK.clv() == null)
        return;
    }
    int i;
    int j;
    short s1;
    Object localObject2;
    Object localObject3;
    int m;
    short s2;
    if (paramcjK.clv() != null) {
      i = paramcjK.fa();
      j = paramcjK.fb();
      s1 = paramcjK.fc();
      dle localdle = paramcjK.axG();

      Object localObject1 = null;
      if (localdle != null) {
        localObject1 = paramcjK.clv().b(i, j, s1, localdle.fa(), localdle.fb(), localdle.fc(), localdle.E());
        i = 0;
        j = 0;
      }
      else if ((paramcjK instanceof cTE)) {
        localObject1 = paramcjK.clv().b(i, j, s1, i, j, s1, paramcjK.E());
        i = 0;
        j = 0;
      } else {
        localObject1 = paramcjK.clv().eH();
      }

      if (this.aCI != null) {
        localObject2 = this.aCI.LB();

        if (localObject1 != null)
          for (localObject3 = ((Iterable)localObject1).iterator(); ((Iterator)localObject3).hasNext(); ) { int[] arrayOfInt = (int[])((Iterator)localObject3).next();
            m = i + arrayOfInt[0];
            int n = j + arrayOfInt[1];

            if (((UG)localObject2).aq(m, n)) {
              s2 = ((UG)localObject2).aw(m, n);

              if ((localdRK != null) && (!localdRK.P(m, n, s2))) {
                localdRK.Q(m, n, s2);
              }
              if (localcCq.cyz())
                a(localcCq, m, n, s2);
            } }
      }
      else {
        for (localObject2 = ((Iterable)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (int[])((Iterator)localObject2).next();
          int k = i + localObject3[0];
          m = j + localObject3[1];
          DisplayedScreenElement localDisplayedScreenElement = btb.bBd().d(k, m, s1, cWj.kJk);
          if (localDisplayedScreenElement != null)
          {
            s2 = localDisplayedScreenElement.bpc().ddH();
            if ((localdRK != null) && (!localdRK.P(k, m, s2))) {
              localdRK.Q(k, m, s2);
            }
            if (localcCq.cyz())
              a(localcCq, k, m, s2);
          } }
      }
    } else {
      K.error("area.getArea() is null");
    }

    if (localdRK != null)
      this.gUk.put(paramcjK, localdRK);
  }

  private dRK a(cjK paramcjK, cCq paramcCq)
  {
    if (!paramcCq.cyC()) {
      return null;
    }

    if (this.gUk.containsKey(paramcjK)) {
      return null;
    }

    String str = null;
    try {
      str = ay.bd().getString("highLightGfxPath") + paramcCq.cyD() + ".tga";
    }
    catch (Exception localException)
    {
      K.error("Exception", localException);
    }

    if (str != null) {
      uz localuz = dRK.rS(str);
      return new dRK("STATIC_EFFECT" + bVN(), gUf, localuz, dn.Tq);
    }

    K.error("Chemin vers la source nulle");
    return null;
  }

  private void b(cjK paramcjK, cCq paramcCq) {
    if (this.gUm.N(paramcjK.getId())) {
      return;
    }
    int i = Integer.parseInt(paramcCq.cyt());

    if (paramcCq.cyv()) {
      localObject = byv.bFN().bFO();
      if (a(paramcjK, (byz)localObject))
        i = Integer.parseInt(paramcCq.cyu());
      else if (b(paramcjK, (byz)localObject)) {
        i = Integer.parseInt(paramcCq.cyw());
      }
    }
    Object localObject = cof.cop().dC(i, paramcCq.cyB());

    bSl localbSl = paramcCq.cyy();
    if (localbSl != null)
      ((FreeParticleSystem)localObject).b(localbSl);
    else {
      ((FreeParticleSystem)localObject).k(paramcjK.fa(), paramcjK.fb(), paramcjK.fc());
    }
    a(paramcCq, (FreeParticleSystem)localObject);
  }

  private boolean a(cjK paramcjK, byz parambyz) {
    return (paramcjK.axG() != null) && (paramcjK.axG() == parambyz);
  }

  private boolean b(cjK paramcjK, byz parambyz) {
    if (a(paramcjK, parambyz))
      return false;
    if ((paramcjK instanceof dLR)) {
      int i = ((dLR)paramcjK).czh() == 6 ? 1 : 0;
      return (i != 0) && (paramcjK.Fx() == parambyz.Fx());
    }
    return false;
  }

  private void c(cjK paramcjK, cCq paramcCq) {
    if (this.gUl.containsKey(paramcjK)) {
      return;
    }

    int i = paramcjK.fa();
    int j = paramcjK.fb();
    int k = paramcjK.fc();
    dle localdle = paramcjK.axG();

    int m = paramcjK.getType() == xj.bps.xj() ? 1 : 0;
    int n = paramcjK.getType() == xj.bpz.xj() ? 1 : 0;
    int i1 = (m != 0) || (n != 0) ? 1 : 0;

    int i2 = 0;
    Object localObject2;
    Object localObject1;
    Object localObject3;
    if ((i1 != 0) && ((paramcjK instanceof dgL))) {
      localObject2 = ((dgL)paramcjK).aeM();
      if (localObject2 != null) {
        localObject1 = localObject2;
        i2 = 1;
      } else {
        localObject1 = new dMM(paramcjK.getId(), i, j, k);
      }
      ((dCb)localObject1).k(i, j, k);
      localObject3 = (cUo)localObject1;
      ((cUo)localObject3).cS(this.aCI.getId());
      ((cUo)localObject3).ax(paramcCq.ats());
      if (m != 0)
        ((cFH)paramcjK).j((cUo)localObject3);
      else if (n != 0)
        ((ddn)paramcjK).j((cUo)localObject3);
    }
    else {
      localObject1 = new csd(this, paramcjK.getId(), i, j, k);

      ((dCb)localObject1).ax(paramcCq.ats());
    }

    try
    {
      localObject2 = ay.bd().getString("ANMInteractiveElementPath");
      localObject2 = String.format((String)localObject2, new Object[] { paramcCq.cyF() });
      ((dCb)localObject1).b((String)localObject2, true);
      if (n != 0) {
        if ((localdle instanceof bKm)) {
          ((cUo)localObject1).e(1, agt.arQ().b((bKm)localdle).bcl());
        }
        else if ((localdle instanceof byo)) {
          localObject3 = ((byo)localdle).bFE();
          ((aMl)localObject3).E(new csc(this, (dCb)localObject1));
        }

      }

      ((dCb)localObject1).em(dtb.pY(paramcCq.cyF()));
    } catch (bdh localbdh) {
      K.error("", localbdh);
    } catch (Exception localException) {
      K.error("", localException);
    }

    paramcCq.f((dCb)localObject1);
    this.gUl.put(paramcjK, localObject1);

    if (i1 != 0)
      bQK.bXG().d((cUo)localObject1);
    else {
      dps.cXa().k((ahm)localObject1);
    }

    if (i2 == 0) {
      axB.aIZ().i((ahm)localObject1);
      ((dCb)localObject1).c(new crL(this, (dCb)localObject1));
    }
  }

  private void a(cCq paramcCq, int paramInt1, int paramInt2, short paramShort)
  {
    int i;
    try
    {
      i = Integer.parseInt(paramcCq.cyA());
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Aps au format étrange : '" + paramcCq.cyA() + "' pour l'area " + paramcCq.cyF() + "-" + paramcCq.getId());
      return;
    }
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(i);
    localFreeParticleSystem.k(paramInt1, paramInt2, paramShort);
    a(paramcCq, localFreeParticleSystem);
  }

  private void a(cCq paramcCq, FreeParticleSystem paramFreeParticleSystem)
  {
    if (paramFreeParticleSystem == null) {
      return;
    }
    if (this.aCI != null)
      paramFreeParticleSystem.cS(this.aCI.getId());
    cWS.cKD().b(paramFreeParticleSystem);
    cSi localcSi = (cSi)this.gUm.get(paramcCq.getId());
    if (localcSi == null) {
      localcSi = new cSi();
      this.gUm.put(paramcCq.getId(), localcSi);
    }
    localcSi.add(paramFreeParticleSystem.getId());
  }

  public void p(cjK paramcjK)
  {
    switch (crH.gSH[xj.dA(paramcjK.getType()).ordinal()])
    {
    case 1:
    case 2:
    case 3:
      dmM.cUe().b(mD(), paramcjK);
      break;
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
  }

  private ahm q(cjK paramcjK)
  {
    Set localSet = this.gUl.keySet();
    for (cjK localcjK : localSet) {
      if (localcjK.getId() == paramcjK.getId()) {
        return (ahm)this.gUl.remove(localcjK);
      }
    }
    return null;
  }

  public void r(cjK paramcjK)
  {
    if (paramcjK == null) {
      K.warn("On veut supprimer une area null");
      return;
    }

    ahm localahm = q(paramcjK);
    if (localahm != null) {
      dps.cXa().l(localahm);
      localahm.dispose();
    }

    dRK localdRK = (dRK)this.gUk.remove(paramcjK);
    if (localdRK != null) {
      localdRK.clear();
    }

    long l = paramcjK.getId();
    cSi localcSi = (cSi)this.gUm.remove(l);
    if (localcSi != null) {
      localcSi.g(gUn);
    }

    for (cjK localcjK : this.gUj)
      if (localcjK.getId() == l) {
        this.gUj.remove(localcjK);
        break;
      }
  }

  public void clear()
  {
    for (Object localObject1 = this.gUl.values().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (ahm)((Iterator)localObject1).next();
      dps.cXa().l((ahm)localObject2);
      ((ahm)localObject2).dispose();
    }
    Object localObject2;
    this.gUl.clear();

    for (localObject1 = this.gUk.values().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (dRK)((Iterator)localObject1).next();
      ((dRK)localObject2).clear();
    }
    this.gUk.clear();

    localObject1 = this.gUm.aBa();
    while (((cHu)localObject1).hasNext()) {
      ((cHu)localObject1).fl();
      localObject2 = (cSi)((cHu)localObject1).value();
      if (localObject2 != null) {
        ((cSi)localObject2).g(gUn);
      }
    }
    this.gUm.clear();
  }

  public void update() {
    while (!this.gUj.empty())
      o((cjK)this.gUj.pop());
  }

  public void a(cjK paramcjK, ckT paramckT)
  {
    this.gUj.push(paramcjK);
    this.aCI = paramckT;
  }

  public ckT mD()
  {
    return this.aCI;
  }
}