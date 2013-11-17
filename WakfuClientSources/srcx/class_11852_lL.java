import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import org.apache.log4j.Logger;

public class lL extends cMb
  implements AQ
{
  private static final Logger K = Logger.getLogger(lL.class);
  private aoQ aPr;
  private int aPs;
  private int aPt;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    K.info("Action performed on interactive element : " + paramdJO.toString());
    d(paramdJO);
    a(paramdJO);
    return true;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv };
  }

  public dJO eR()
  {
    int i = (this.aTn == 1) && (this.aPr.aBi() >= 0) ? 1 : 0;
    int j = (this.aTn == 0) && (this.aPr.aBf() >= 0) ? 1 : 0;
    return (i != 0) || (j != 0) ? dJO.lVv : dJO.lVD;
  }

  public csx[] am()
  {
    aCH localaCH = te();
    if (localaCH == null) {
      return csx.icw;
    }

    aru localaru = (aru)aiI.dgz.avt();
    localaru.iT(localaCH.aOR());
    boolean bool = td();
    localaru.ma("desc.mru." + localaCH.aOS());
    if (te().aOU()) {
      localaru.fn(Od.n(te().Ei()[0], 1, 0));
    }
    localaru.cM(true);
    localaru.setEnabled((localaCH.isEnabled()) && (bool));

    return new csx[] { localaru };
  }

  private boolean td() {
    return te().K(byv.bFN().bFO());
  }

  private aCH te()
  {
    aCH localaCH;
    switch (this.aTn) {
    case 1:
      localaCH = clR.cni().vL(this.aPr.aBi());
      break;
    case 0:
      localaCH = clR.cni().vL(this.aPr.aBf());
      break;
    default:
      throw new IllegalStateException("State " + this.aTn + " inconnu pour un Lampadaire");
    }
    return localaCH;
  }

  public void bc()
  {
    super.bc();
    this.aPr = null;
  }

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
    this.aPs = 0;
    this.aPt = 0;
    if ((!bB) && (this.aPr != null)) throw new AssertionError();
  }

  protected void tf()
  {
    super.tf();
    switch (this.aTn) {
    case 1:
      th();
      break;
    case 0:
      tg();
    }
  }

  private void tg()
  {
    btL.gcv.cA(this.aPs, 1000);
    IsoParticleSystem localIsoParticleSystem = cWS.cKD().zj(this.aPt);
    if (localIsoParticleSystem != null) {
      localIsoParticleSystem.vk(500);
    }
    this.aPs = -1;
    this.aPt = -1;
  }

  private void th()
  {
    tg();
    try {
      bxu localbxu = bSj.hcO.y();
      this.aPs = localbxu.getId();
      bNa localbNa = new bNa(this.aPr.aBc());
      localbxu.p(0.0F, 0.0F, 0.0F);

      localbxu.q(0.0F, 0.0F, 0.0F);
      localbxu.b(localbNa.QC(), localbNa.QD(), localbNa.QE(), 1000);
      localbxu.e(new cEi(fa(), fb(), fc()));
      localbxu.aG(this.aPr.aBd());
      localbxu.setEnabled(true);
      localbxu.fw(this.aPr.aBe());
      btL.gcv.a(localbxu);

      int i = this.aPr.LI();
      if (i > 0) {
        CellParticleSystem localCellParticleSystem = cof.cop().vZ(i);
        if (localCellParticleSystem != null) {
          localCellParticleSystem.f(fa(), fb(), fc() + bY());
          cWS.cKD().b(localCellParticleSystem);
          this.aPt = localCellParticleSystem.getId();
        } else {
          K.error("Particule non trouvée " + i);
        }
      }
    }
    catch (Exception localException) {
      K.error("", localException);
    }
  }

  public boolean ti()
  {
    return true;
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public void al()
  {
    super.al();
    String[] arrayOfString = this.fgH.split(";");
    if (arrayOfString.length != 1) {
      K.error("[LD] Le lampadaire " + this.aTz + " doit avoir " + 1 + " paramètre");
      return;
    }
    aoQ localaoQ = (aoQ)aKY.epr.a(cdc.hvQ, Integer.valueOf(arrayOfString[0]).intValue());
    if (localaoQ == null) {
      K.error("[LD] Le lampadaire " + this.aTz + " à un parametre [" + Integer.valueOf(arrayOfString[0]) + "] qui ne correspond a rien dans les Admins");
      return;
    }
    this.aPr = localaoQ;
    D(false);
  }

  public diP tj() {
    return this.aPr;
  }

  public void tk()
  {
    btL.gcv.kF(this.aPs);
    cWS.cKD().zk(this.aPt);
    super.tk();
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDx.a(new aGH[] { localbyz });
  }
}