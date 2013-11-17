import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class Rl
  implements cvW
{
  private static final boolean aRN = false;
  private long cqE;
  private static final Logger K = Logger.getLogger(Rl.class);

  private static final Rl cqF = new Rl();

  private final caq cqG = caq.hrj;
  private int cqH;
  private int cqI;
  private final List cqJ = new ArrayList();
  private FreeParticleSystem cqK;

  public static Rl acN()
  {
    return cqF;
  }

  public boolean a(cWG paramcWG)
  {
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    byz localbyz = byv.bFN().bFO();
    aqQ localaqQ;
    switch (paramcWG.getId())
    {
    case 19994:
      return a((aqQ)paramcWG, localaTL);
    case 19995:
      localaqQ = (aqQ)paramcWG;
      return a(localaqQ, localbyz);
    case 19998:
      this.cqE = System.currentTimeMillis();
      return false;
    case 19992:
      localaqQ = (aqQ)paramcWG;
      return a(localaqQ, localaTL, localbyz);
    case 19993:
    case 19996:
    case 19997: } return true;
  }

  private boolean a(aqQ paramaqQ, aTL paramaTL, byz parambyz) {
    if (parambyz.bGK()) {
      return false;
    }

    zV.IH().II();

    aqQ localaqQ = paramaqQ;
    int i = localaqQ.aCX();
    int j = localaqQ.aCY();

    for (int k = this.cqJ.size() - 1; k >= 0; k--) {
      ((adV)this.cqJ.get(k)).a(null);
    }

    if (!parambyz.bGM()) {
      return false;
    }

    if ((localaqQ.aCU()) && (dWc.mvm.isRunning())) {
      dWc.mvm.d(paramaTL, i, j);
      return false;
    }

    dWc.mvm.stop();

    if (localaqQ.aCU())
    {
      ArrayList localArrayList = paramaTL.bT(i, j);

      dCb localdCb = null;
      if (!localArrayList.isEmpty()) {
        localdCb = (dCb)localArrayList.get(0);
      }
      if (localdCb == null) {
        a(parambyz, i, j, true);
        return false;
      }
      if ((localdCb instanceof azX)) {
        a(parambyz, localaqQ.aCX(), localaqQ.aCY(), true);
        return false;
      }if (((localdCb instanceof cRz)) || ((localdCb instanceof cew))) {
        buj.bCk().a(cED.iyS, null);
      } else {
        parambyz.b(localdCb.atB(), false, true);
        return false;
      }

    }

    if (parambyz.bGZ()) {
      return false;
    }

    if ((localaqQ.aCW()) || ((WakfuClientInstance.awy().awB().a(bmz.fEB)) && (localaqQ.aCU())))
    {
      cqu.cpE().b(paramaTL, i, j);
    }

    return false;
  }

  private boolean a(aqQ paramaqQ, byz parambyz) {
    if (aqQ.aCZ()) {
      if ((parambyz.bGK()) || (parambyz.bGZ()) || (!parambyz.bGM())) {
        return true;
      }

      long l = System.currentTimeMillis();
      if (l - this.cqE > 500L) {
        a(parambyz, paramaqQ.aCX(), paramaqQ.aCY(), false);
        this.cqE = l;
      }
    }
    return false;
  }

  private boolean a(aqQ paramaqQ, aTL paramaTL) {
    dOc localdOc = bsP.getInstance().getMouseOver();
    if ((localdOc != null) && (localdOc != bsP.getInstance())) {
      return true;
    }

    int i = paramaqQ.aCX();
    int j = paramaqQ.aCY();

    if (dWc.mvm.isRunning()) {
      dWc.mvm.c(paramaTL, i, j);
    }

    ArrayList localArrayList = paramaTL.bT(i, j);

    if (localArrayList.isEmpty()) {
      dGx.dhr().a(duv.lyl, false);
      return true;
    }

    int k = 0;
    for (int m = 0; (m < localArrayList.size()) && (k == 0); m++) {
      dCb localdCb = (dCb)localArrayList.get(m);
      duv localduv = duv.lyB;
      Object localObject1;
      Object localObject2;
      csx[] arrayOfcsx;
      if ((localdCb instanceof cew)) {
        localObject1 = (cew)localdCb;
        localObject2 = ((cew)localObject1).cbD();
        if (localObject2 != null) {
          arrayOfcsx = ((Su)localObject2).adN();
          if ((arrayOfcsx != null) && (arrayOfcsx.length > 0))
            for (int n = 0; n < arrayOfcsx.length; n++) {
              csx localcsx = arrayOfcsx[n];
              if (localcsx != null) {
                localcsx.Q(localObject2);
                if ((localcsx != null) && (localcsx.isUsable()) && (localcsx.pZ())) {
                  if (dGx.dhr().dhs() != localduv) {
                    dGx.dhr().a(localduv, false);
                  }
                  k = 1;
                  break;
                }
              }
            }
        }
      }
      else if ((localdCb instanceof cRz)) {
        dGx.dhr().a(localduv, false);
        k = 1;
      } else if ((localdCb instanceof azX)) {
        if (((azX)localdCb).aLN().length > 0)
          dGx.dhr().a(localduv, false);
        else {
          dGx.dhr().a(duv.lyl);
        }
        k = 1;
      } else if ((localdCb instanceof djm)) {
        localObject1 = (abc)localdCb;
        localObject2 = ((abc)localObject1).vK();
        if ((localObject2 instanceof cRz)) {
          arrayOfcsx = ((cRz)localObject2).adN();
          if ((((dWu)localObject2).isUsable()) && (arrayOfcsx != null) && (arrayOfcsx.length != 0))
            dGx.dhr().a(localduv, false);
          else {
            dGx.dhr().a(duv.lyl, false);
          }
        }
        k = 1;
      }
    }
    if (k == 0) {
      dGx.dhr().a(duv.lyl, false);
    }
    return false;
  }

  private void a(byz parambyz, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((!parambyz.bGM()) || (!parambyz.q(false, false))) {
      return;
    }

    if (parambyz.bGZ()) {
      tL.Ca().Cb();
      return;
    }

    this.cqH = paramInt1;
    this.cqI = paramInt2;
    a(parambyz, true);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    if (!paramBoolean) {
      localaTL.dV(true);
      localaTL.dZ(true);
    }
    ahm localahm = acO();
    this.cqG.ceE();
    this.cqG.ceB();
    this.cqG.a(new dgy(localahm, localaTL.cKV()));
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      dGx.dhr().unlock();
    }
    this.cqG.ceC();
  }

  private void a(byz parambyz, boolean paramBoolean)
  {
    ArrayList localArrayList = WakfuClientInstance.awy().Dg().a(this.cqH, this.cqI, parambyz.getAltitude(), bYP.hoH, 0.0F, 0.0F);
    if ((localArrayList == null) || (localArrayList.isEmpty())) {
      return;
    }

    for (int i = 0; i < localArrayList.size(); i++) {
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)localArrayList.get(i);
      int j = localDisplayedScreenElement.fa();
      int k = localDisplayedScreenElement.fb();
      short s = localDisplayedScreenElement.fc();
      if (parambyz.aKb().Z(j, k, s)) {
        if (paramBoolean)
          p(j, k, s);
        return;
      }
      if (parambyz.a(j, k, s, false, true))
      {
        if (paramBoolean)
          p(j, k, s);
        return;
      }
    }
  }

  private void p(int paramInt1, int paramInt2, short paramShort)
  {
    if ((this.cqK != null) && (this.cqK.isAlive()) && (this.cqK.fa() == paramInt1) && (this.cqK.fb() == paramInt2) && (this.cqK.fc() == paramShort))
    {
      return;
    }
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800185);
    localFreeParticleSystem.f(paramInt1, paramInt2, paramShort);
    cWS.cKD().b(localFreeParticleSystem);
    this.cqK = localFreeParticleSystem;
  }

  private static ahm acO()
  {
    byz localbyz = byv.bFN().bFO();
    if ((!bB) && (localbyz == null)) throw new AssertionError("Local player null !!! WTF ?");
    return localbyz.aeL();
  }

  public static cuB a(bAF parambAF, dWu paramdWu) {
    List localList = paramdWu.bVi();
    if (localList.isEmpty()) {
      return parambAF.b(paramdWu.fa(), paramdWu.fb(), paramdWu.fc(), false, true);
    }

    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    for (Object localObject = localList.iterator(); ((Iterator)localObject).hasNext(); ) { cYk localcYk1 = (cYk)((Iterator)localObject).next();
      j = 0;
      cYk localcYk2 = parambAF.atB();
      byte b = (byte)Math.max(Math.abs(localcYk2.getX() - localcYk1.getX()), Math.abs(localcYk2.getY() - localcYk1.getY()));

      while ((j < localArrayList2.size()) && (((Byte)localArrayList2.get(j)).byteValue() < b)) {
        j++;
      }
      localArrayList1.add(j, localcYk1);
      localArrayList2.add(j, Byte.valueOf(b));
    }
    int j;
    localObject = null;
    for (int i = 0; i < localArrayList1.size(); i++) {
      localArrayList3.add(i, parambAF.c((cYk)localArrayList1.get(i), false, true));
      if (((cuB)localArrayList3.get(i)).csX())
      {
        if (((cuB)localArrayList3.get(i)).csW() > 1.6D * ((Byte)localArrayList2.get(i)).byteValue()) {
          if ((localObject == null) || (((cuB)localObject).csW() >= ((cuB)localArrayList3.get(i)).csW()))
          {
            localObject = (cuB)localArrayList3.get(i);
          }
        } else {
          localObject = (cuB)localArrayList3.get(i);
          break;
        }
      }
    }
    if ((localObject != null) && (paramdWu.cFe()) && (!paramdWu.sO())) {
      cuB localcuB = new cuB(((cuB)localObject).csW() + 1);
      for (j = 0; j < ((cuB)localObject).csW(); j++) {
        localcuB.i(j, ((cuB)localObject).wR(j));
      }
      localcuB.a(((cuB)localObject).csW(), paramdWu.fa(), paramdWu.fb(), paramdWu.fc());
      localObject = localcuB;
    }

    return localObject;
  }

  public void a(adV paramadV) {
    this.cqJ.add(paramadV);
  }

  public void b(adV paramadV) {
    this.cqJ.remove(paramadV);
  }
}