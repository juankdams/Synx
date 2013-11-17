import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class anK
  implements Runnable
{
  public static final anK drx = new anK();

  protected static final Logger K = Logger.getLogger(anK.class);
  public static final int dry = 5000;
  private Pr drz = Pr.chF;
  private rh drA = null;

  private final bEV drB = new bEV(0.0F);
  private final bEV drC = new bEV(adA.cTQ.apA());
  private final aFR drD = new aFR();
  private boolean drE;
  private final HashMap cgz = new HashMap();
  private ddH drF;
  private boolean drG = true;

  private final ArrayList drH = new ArrayList();

  public void cB(boolean paramBoolean)
  {
    this.drE = paramBoolean;
  }

  private long aAe() {
    return System.currentTimeMillis();
  }

  public void aAf()
  {
    cZJ localcZJ = new cZJ();
    dtu localdtu = new dtu();

    a(Pr.chG, localcZJ);
    a(Pr.chH, localcZJ);
    a(Pr.chM, new bcL());

    a(Pr.chI, localdtu);

    a(Pr.chL, new bwc());

    a(Pr.chJ, localcZJ);
    a(Pr.chK, localdtu);

    this.drH.add(this.drD);
  }

  public void ay(float paramFloat) {
    if ((!bB) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) throw new AssertionError();
    for (rh localrh : this.drH)
      if ((localrh instanceof cZJ))
        ((cZJ)localrh).cc(paramFloat);
  }

  private void a(Pr paramPr, rh paramrh)
  {
    this.cgz.put(paramPr, paramrh);
    if (!this.drH.contains(paramrh))
      this.drH.add(paramrh);
  }

  public void start()
  {
    dka.cSF().a(this, 50L);
  }

  public void cz(boolean paramBoolean) {
    if (!paramBoolean) {
      this.drG = false;
      return;
    }

    if (!this.drG) {
      this.drG = true;

      for (rh localrh : this.drH)
        if (localrh != null)
          localrh.A(0.0F);
    }
  }

  public void aAg()
  {
    if (this.drA != null) {
      c(this.drz);
    }

    for (rh localrh : this.drH) {
      if (localrh != null) {
        localrh.A(0.0F);
        localrh.stop();
      }
    }
    this.drz = null;
    this.drA = null;
  }

  public void cC(boolean paramBoolean) {
    for (rh localrh : this.drH)
      if (localrh != null)
        localrh.setVisible(paramBoolean);
  }

  private TE a(Pr paramPr)
  {
    if (paramPr == null) {
      return null;
    }

    switch (cRn.kDD[paramPr.ordinal()]) {
    case 1:
    case 2:
    case 3:
      return TE.cwE;
    case 4:
    case 5:
      return TE.cwG;
    case 6:
    case 7:
    case 8:
    }
    return null;
  }

  public void aAh()
  {
    b(this.drz);
  }

  private void b(Pr paramPr) {
    if (paramPr == null) {
      return;
    }

    switch (cRn.kDD[paramPr.ordinal()]) {
    case 6:
    case 7:
    case 8:
      break;
    case 1:
    case 2:
    case 3:
      aWc.blo().b(new azB(TE.cwE));
      break;
    case 4:
    case 5:
      aWc.blo().b(new azB(TE.cwG));
    }
  }

  private void c(Pr paramPr)
  {
    if (paramPr == null) {
      return;
    }

    switch (cRn.kDD[paramPr.ordinal()]) {
    case 6:
    case 7:
    case 8:
      break;
    case 1:
    case 2:
    case 3:
      aWc.blo().b(new azB(TE.cwF));
      break;
    case 4:
    case 5:
      aWc.blo().b(new azB(TE.cwH));
    }
  }

  public void a(Pr paramPr, int paramInt)
  {
    if (this.drE) {
      return;
    }

    if (paramPr == this.drz) {
      return;
    }

    long l = aAe();

    rh localrh = (rh)this.cgz.get(paramPr);
    if (localrh != this.drA) {
      if (this.drA != null) {
        this.drA.a(0.0F, paramInt, l);
      }
      this.drA = localrh;
    }

    if (a(paramPr) != a(this.drz)) {
      c(this.drz);
      b(paramPr);
    }

    this.drz = paramPr;

    if (this.drA != null)
      switch (cRn.kDD[this.drz.ordinal()]) {
      case 7:
      case 8:
        this.drA.a(0.33F, paramInt, l);
        break;
      case 1:
      case 4:
        this.drA.a(0.66F, paramInt, l);
        break;
      case 2:
      case 5:
        this.drA.a(1.0F, paramInt, l);
        break;
      case 6:
        this.drA.a(1.0F, paramInt, l);
        break;
      case 3:
        this.drA.a(1.0F, paramInt, l);
      }
  }

  public void d(Pr paramPr)
  {
    a(paramPr, 5000);
  }

  public void az(float paramFloat) {
    b(paramFloat, 5000);
  }

  private void b(float paramFloat, int paramInt) {
    this.drB.a(paramFloat, paramInt, aAe());
  }

  public void a(adA paramadA) {
    a(paramadA, 5000);
  }

  private void a(adA paramadA, int paramInt) {
    this.drC.a(paramadA.apA(), paramInt, aAe());
  }

  public void run() {
    if (this.drz == null)
      return;
    try
    {
      dSz localdSz = WakfuClientInstance.awy().Dg();

      if (!this.drG) {
        for (int i = 0; i < this.drH.size(); i++) {
          rh localrh1 = (rh)this.drH.get(i);
          if (localrh1 != null) {
            localrh1.a(localdSz, 0.0F, 0.0F);
          }
        }
        return;
      }

      long l = aAe();

      if (this.drF == null)
        a(l, localdSz);
      else {
        this.drF.a(l, this.drB, this.drC, this.drD, this.cgz);
      }

      float f1 = this.drC.bMS();
      f1 += Math.abs(f1) * aGG.a(0.0F, (float)l, 1.0F, 5, QP.cpY);
      float f2 = this.drB.bMS();
      f2 += Math.abs(f2) * aGG.a(1.0F, (float)l, 1.0F, 5, QP.cpY);

      for (int j = 0; j < this.drH.size(); j++) {
        rh localrh2 = (rh)this.drH.get(j);
        if (localrh2 != null)
        {
          if ((localrh2.xP() > 0.0F) && (!localrh2.isRunning())) {
            localrh2.a(localdSz);
          }

          localrh2.a(localdSz, f1, f2);
        }
      }
    } catch (Exception localException) { K.error("Exception ", localException); }
  }

  private void a(long paramLong, adG paramadG)
  {
    this.drB.K(paramLong);
    this.drC.K(paramLong);
    if ((this.drB.bMS() > 0.0F) && (!this.drD.isRunning())) {
      this.drD.a(paramadG);
    }

    for (int i = 0; i < this.drH.size(); i++) {
      rh localrh = (rh)this.drH.get(i);
      if (localrh != null)
        localrh.Y(paramLong);
    }
  }

  public void a(ddH paramddH)
  {
    this.drF = paramddH;
  }

  public static void a(rp paramrp, bNa parambNa) {
    int i = bCO.cL(1, 3);
    int j = 0;
    int k = 0;
    for (int m = 0; m < i; m++) {
      int n = d(j, parambNa);
      k = j + n;
      j += bCO.cL(200, 1000);
    }

    k = Math.max(800, k);
    cZf localcZf = new cZf();
    localcZf.a(paramrp);
    localcZf.L(true);
    localcZf.am(70.0F, -2.0F);
    localcZf.e(new Ar(100, 100, k / 2, k / 2));
    Pb.aaU().a(localcZf);

    aWc.blo().b(new azB(TE.cwI));
  }

  private static int d(int paramInt, bNa parambNa)
  {
    bdp localbdp = new bdp();
    localbdp.dF("snow.tga");
    localbdp.a(cnQ.hUX, cnQ.hUU);
    localbdp.setColor(parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    float f1 = bCO.U(0.7F, 1.0F) + 2.0F;
    float f2 = bCO.U(-2.0F, 2.0F);
    float f3 = bCO.U(0.0F, 1.0F) + f1 * 0.5F;
    localbdp.j(f2, f3);
    localbdp.setSize(f1, f1);
    int i = bCO.cL(0, 200) + 100;
    localbdp.e(new Ar(paramInt, 25, i, 75));
    Pb.aaU().a(localbdp);
    return i;
  }
}