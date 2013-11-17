import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class aDI extends oG
{
  private static final Logger K = Logger.getLogger(aDI.class);

  private static final aDI dYK = new aDI();
  protected final ArrayList dYL = new ArrayList();

  public static aDI aPQ() {
    return dYK;
  }

  protected void a(cYk paramcYk) {
    this.aUi.Q(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  protected void wc() {
    if (!this.dYL.isEmpty()) {
      return;
    }

    for (Iterator localIterator = aPT().iterator(); localIterator.hasNext(); ) { int i = ((Integer)localIterator.next()).intValue();
      FreeParticleSystem localFreeParticleSystem = cof.cop().vY(i);
      if (localFreeParticleSystem != null) {
        this.dYL.add(localFreeParticleSystem);
        localFreeParticleSystem.b(this.aUf);
        cWS.cKD().b(localFreeParticleSystem);
      } }
  }

  public void wf()
  {
    alo localalo = (alo)this.aUe.oi().bKr();
    int i = localalo.axY();
    dxy localdxy = (dxy)fj.mh().hH(i);
    bOU.gUc.b(new jm(i, localdxy.bqt()));
    byv.bFN().bFO().aTn().lh(localalo.axX());
    cYk localcYk = this.aUl.azG();
    if (bT(1)) {
      a(this.aUg, true);
    }
    if (d(localcYk)) {
      g(localcYk);
      e(localcYk);
    }
  }

  protected void C(int paramInt1, int paramInt2) {
    ((alo)this.aUe.oi().bKr()).a(this.aUe, paramInt1, paramInt2);
  }

  private boolean aPR() {
    byz localbyz = byv.bFN().bFO();
    return bGP.gDx.a(new aGH[] { localbyz });
  }

  protected String wj() {
    if (wd()) {
      return "";
    }

    if (this.aUg == null) {
      return "";
    }

    if (!aPR()) {
      lZ locallZ = new lZ();
      locallZ.tI().am(bNa.gRz.bUV());
      locallZ.a(bU.fH().getString("error.playerNotSubscribed"));
      locallZ.tJ();
      return locallZ.tP();
    }
    int i = h(this.aUg);
    String str = aPS();
    return i + " %" + (str == null ? "" : str);
  }

  private String aPS() {
    dqU localdqU = vC.Ew();

    if (localdqU == null) {
      return null;
    }
    lZ locallZ = new lZ();

    boolean bool = Ev();
    if (bool) {
      locallZ.tI().am(bNa.gRz.bUV());
      locallZ.a("\n").a(bU.fH().getString("desc.mru.illegalAction"));
      locallZ.tJ();
    }

    List localList1 = Ex();
    if ((localdqU == dqU.ltr) && (!localList1.isEmpty())) {
      locallZ.tH().tI().am(bNa.gRA.bUV());
      locallZ.tz().a(bU.fH().getString("nation.law.mru.good")).tA();
      locallZ.tJ();
      vC.a(locallZ, localList1, bNa.gRA.bUV(), bool);
    }
    List localList2 = Ez();
    if (!localList2.isEmpty()) {
      locallZ.tH().tI().am(bNa.gRz.bUV());
      locallZ.tz().a(bU.fH().getString("nation.law.mru.bad")).tA();
      locallZ.tJ();
      vC.a(locallZ, localList2, bNa.gRz.bUV(), bool);
    }
    return locallZ.length() > 0 ? locallZ.tP() : null;
  }

  private boolean Ev() {
    if (vC.Ew() != dqU.ltq) {
      return false;
    }
    List localList = Ez();
    return !localList.isEmpty();
  }

  private List Ex() {
    return dWf.T(EB());
  }

  private List Ez() {
    return dWf.U(EB());
  }

  private List EB() {
    alo localalo = (alo)this.aUe.oi().bKr();
    int i = localalo.axY();

    dxy localdxy = (dxy)fj.mh().hH(i);
    if (localdxy == null) {
      return Collections.emptyList();
    }

    ayn localayn = bWW.ccf().FB();
    if (localayn == null) {
      return Collections.emptyList();
    }

    aYr localaYr = localayn.ava();
    if (localaYr == aYr.feh) {
      return Collections.emptyList();
    }

    byz localbyz = byv.bFN().bFO();
    ArrayList localArrayList = new ArrayList();
    if ((localdxy instanceof ceV)) {
      for (int m : ((ceV)localdxy).BA())
        localArrayList.add(blo.bws().qc(m));
    }
    else {
      localArrayList.add(dcK.cOf().zJ(localdxy.bqt()));
    }

    ??? = new ArrayList();
    for (acy localacy : localArrayList)
      if ((localacy != null) && (localacy.aoT()) && (!localacy.aoU())) {
        De localDe = new De(localbyz);
        int n = localacy.aoV();
        if (n != 0)
        {
          agy localagy;
          if (n < 0)
            localagy = agy.daq;
          else {
            localagy = agy.dap;
          }
          localDe.a(localagy);

          ((ArrayList)???).addAll(localDe.bDr());
        }
      }
    return ???;
  }

  private List aPT() {
    if (Ev()) {
      return Collections.singletonList(Integer.valueOf(800127));
    }

    List localList = EB();
    if (!localList.isEmpty())
    {
      int i;
      if (((dWf)localList.get(0)).TL() > 0)
        i = 800191;
      else {
        i = 800192;
      }
      return Collections.singletonList(Integer.valueOf(i));
    }

    return Collections.emptyList();
  }

  protected int h(cYk paramcYk) {
    if (this.aUe == null) {
      return -1;
    }

    azX localazX = acL.apd().aP(paramcYk.getX(), paramcYk.getY());
    if (localazX != null) {
      return -1;
    }

    dJN localdJN = (dJN)cPV.cGZ().es(paramcYk.getX(), paramcYk.getY());
    if (localdJN == null) {
      return -1;
    }
    int i = localdJN.ak(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
    if (i == 0) {
      return -1;
    }

    byz localbyz = byv.bFN().bFO();

    if (!aPR()) {
      return -1;
    }

    dwN localdwN = localbyz.bHa();
    if ((localdwN != null) && (!localdwN.a(localbyz, paramcYk.getX(), paramcYk.getY()))) {
      return -1;
    }

    alo localalo = (alo)this.aUe.oi().bKr();
    int j = localalo.axY();

    dxy localdxy = (dxy)fj.mh().hH(j);
    if (localdxy == null) {
      return -1;
    }

    if ((localdxy instanceof ceV)) {
      if (cwO.X(paramcYk.getX(), paramcYk.getY(), paramcYk.IB())) {
        return -1;
      }
      if (!a((ceV)localdxy)) {
        return -1;
      }
    }

    dKM localdKM = djb.cRJ().Ak(i);
    if (localdKM == null) {
      return -1;
    }
    cIB localcIB = sS.Al().Aq().abJ();

    double d = Yc.b(localbyz, localdxy, localdKM, localcIB == null ? -1.0F : localcIB.oy());

    return (int)(d <= 0.0D ? -1L : Math.round(d * 100.0D));
  }

  private boolean a(ceV paramceV) {
    if (Vr.cAl.aiI()) {
      return true;
    }
    for (int k : paramceV.BA()) {
      if (blo.bws().qc(k) == null) {
        return false;
      }
    }
    return true;
  }

  protected void wk() {
    for (FreeParticleSystem localFreeParticleSystem : this.dYL) {
      localFreeParticleSystem.kill();
    }
    this.dYL.clear();
  }
}