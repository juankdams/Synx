import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.List;

class cZJ extends rh
{
  private static final int kNi = 2048;
  private static final float kNj = 1.5F;
  private int kNk;
  private int kNl;
  private boolean kNm = false;
  private long kNn;
  private boolean cLT;
  private final ArrayList kNo = new ArrayList();

  private final aTu kNp = new aTu();
  private ckI kNq;
  private float kNr;
  private final RY kNs;

  protected cZJ(RY paramRY)
  {
    this.kNs = paramRY;
  }

  cZJ() {
    this.kNs = new RY();
  }

  public void cc(float paramFloat) {
    this.kNr = paramFloat;
    if (this.kNq != null)
      this.kNq.cc(paramFloat);
  }

  void a(adG paramadG)
  {
    super.a(paramadG);

    if (this.kNk > 0) {
      return;
    }

    rp localrp = paramadG.apF();
    czT localczT = new czT(-18.0F, 18.0F, -18.0F, 18.0F, 0.0F, 54.0F);

    cZv localcZv = new cZv();
    localcZv.a(localczT);
    localcZv.a(localrp);
    this.kNs.a(localcZv);

    localczT = new czT(-18.0F, 18.0F, -18.0F, 18.0F, 0.0F, 18.0F);

    avF localavF = new avF();
    localavF.a(localczT);
    localavF.a(localrp);
    this.kNs.a(localavF);

    Pb.aaU().a(localcZv);
    Pb.aaU().a(localavF);

    this.kNk = localcZv.getId();
    this.kNl = localavF.getId();

    btL.gcv.a(this.kNp);
    this.kNp.a(localrp);

    this.aYY = true;
  }

  private void iS(boolean paramBoolean) {
    if (cMq() == paramBoolean) {
      return;
    }

    if (paramBoolean) {
      this.kNq = new ckI();
      this.kNq.a(WakfuClientInstance.awy().Dg().cKV());
      this.kNq.cd(0.0F);
      this.kNq.A(0.0F);
      this.kNq.cc(this.kNr);
      Pb.aaU().a(this.kNq);
    } else {
      Pb.aaU().b(this.kNq);
      this.kNq = null;
    }
  }

  private boolean cMq() {
    return this.kNq != null;
  }

  void stop() {
    super.stop();

    if (this.kNk == 0) {
      return;
    }
    adQ localadQ = Pb.aaU().gh(this.kNk);
    if (localadQ != null) {
      localadQ.L(false);
      Pb.aaU().b(localadQ);
      localadQ.clear();
    }
    this.kNk = 0;

    localadQ = Pb.aaU().gh(this.kNl);
    if (localadQ != null) {
      localadQ.L(false);
      Pb.aaU().b(localadQ);
      localadQ.clear();
    }
    this.kNl = 0;

    iS(false);

    if (this.kNm) {
      cMs();
    }

    btL.gcv.b(this.kNp);

    this.aYY = false;
  }

  private void cMr() {
    List localList = ayg.aJQ().bjr();

    if (localList == null) {
      return;
    }

    int i = 86;
    int j = 0;

    cbQ localcbQ = new cbQ();

    byz localbyz = byv.bFN().bFO();
    int k = 0; for (int m = localList.size(); k < m; k++) {
      cfb localcfb = (cfb)localList.get(k);
      long l = bCO.cM(localcfb.getX(), localcfb.getY());
      if (!localcbQ.N(l)) {
        localcbQ.add(l);
        int n = localcfb.getX() * 18;
        int i1 = localcfb.getY() * 18;
        int i2 = cwO.V(n, i1, localbyz.ML().IB());

        FreeParticleSystem localFreeParticleSystem = cof.cop().dC(86, 0);
        localFreeParticleSystem.f(n, i1, i2);
        cWS.cKD().b(localFreeParticleSystem);
        this.kNo.add(localFreeParticleSystem);
      }
    }

    this.kNm = true;
  }

  private void cMs() {
    int i = this.kNo.size();
    for (int j = 0; j < i; j++) {
      int k = ((FreeParticleSystem)this.kNo.get(j)).getId();
      cWS.cKD().A(k, true);
    }
    this.kNo.clear();

    this.kNm = false;
  }

  public void setVisible(boolean paramBoolean)
  {
    super.setVisible(paramBoolean);
    if (!paramBoolean) {
      if (this.kNm) {
        cMs();
      }

      cZv localcZv = (cZv)Pb.aaU().gh(this.kNk);
      if (localcZv != null)
        localcZv.cd(400);
    }
  }

  void a(adG paramadG, float paramFloat1, float paramFloat2)
  {
    if (!this.aYY) {
      this.cLT = true;
      if (cMq()) {
        this.kNq.cd(0.0F);
      }
      return;
    }

    float f1 = this.aZa.bMS();
    long l = System.currentTimeMillis();
    if (cMq())
    {
      float f2;
      if (l - this.kNn > 0L)
        f2 = Math.min(1.0F, (float)(l - this.kNn) / 10000.0F);
      else {
        f2 = 1.0F;
      }
      this.kNq.cd((this.cLT ? 1.0F - f2 : f2) * xP());
    }

    boolean bool = f1 <= 0.33F;
    if (bool != this.cLT) {
      this.kNn = l;
      this.cLT = bool;
    }

    if (f1 <= 0.0F)
    {
      stop();
      return;
    }

    iS(true);

    cZv localcZv = (cZv)Pb.aaU().gh(this.kNk);
    avF localavF = (avF)Pb.aaU().gh(this.kNl);
    if ((localcZv == null) || (localavF == null)) {
      return;
    }
    float f3 = paramFloat2 * paramFloat1;
    localcZv.an(-1.570796F - f3 * 0.7853982F, 0.1178097F * (f3 + 0.3F));

    int i = (int)((this.aYZ) && (f1 > 0.33F) ? 2048.0F * f1 : 0.0F);
    localcZv.cc(i);
    localavF.cc(i);

    localcZv.cZ(1.5F * (1.0F + f1 * 1.5F));

    float f4 = bzZ.goz.bIz();

    if ((f4 > 0.7F) && (this.aZa.bMT() < this.aZa.bMS()) && (this.aZa.bMT() < 0.33F)) {
      if ((!this.kNm) && (this.aYZ))
        cMr();
    }
    else if (this.kNm) {
      cMs();
    }

    float f5 = 1.0F - 0.5F * f1;
    float f6 = (1.1F - f1) * bCO.s(0.5F, 1.0F, f4);
    this.kNp.aV(f5);
    this.kNp.aW(f6);
    this.kNp.J(-f3 * (2.0F - f1) * 5.0F, 0.0F);

    this.kNp.aX(1.0F);

    if (cMq())
      this.kNq.A(f1);
  }
}