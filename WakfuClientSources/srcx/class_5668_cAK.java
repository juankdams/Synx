import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class cAK extends cMb
{
  private static final Logger K = Logger.getLogger(cAK.class);
  protected dFN dln;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    cQa localcQa = ccm.a(this.dln);
    d(paramdJO);
    switch (amF.av[paramdJO.ordinal()]) {
    case 1:
      localcQa.b(this, (dhJ)parambhL);
      return true;
    case 2:
      localcQa.a(this, (dhJ)parambhL);
      t((bKm)parambhL);
      aBq();
      return true;
    }
    K.error("Impossible d'effectuer une action " + paramdJO + " sur une machine de transport de type " + this.dln, new IllegalArgumentException());
    return false;
  }

  public dJO eR()
  {
    if (this.dln == dFN.lQh) {
      return dJO.lVv;
    }
    return byv.bFN().bFO().bGF().a(this.dln, (int)this.aTz) ? dJO.lVv : dJO.lVT;
  }

  public byte bY()
  {
    return 8;
  }

  public dJO[] eS()
  {
    if (this.dln == dFN.lQh) {
      return new dJO[] { dJO.lVv };
    }
    return new dJO[] { dJO.lVv, dJO.lVT };
  }

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
    if ((!bB) && (this.dln != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    this.dln = null;
  }

  public csx[] am()
  {
    CU localCU = aot.dtv.a(this.dln, this.aTz);
    aCH localaCH = clR.cni().vL(localCU.gC());
    awT localawT = byv.bFN().bFO().bGF();
    Object localObject;
    if ((this.dln == dFN.lQh) || (localawT.a(this.dln, (int)this.aTz)))
    {
      localObject = (baM)aiI.dgg.avt();
      ((csl)localObject).ma("desc.mru." + localaCH.aOS());
    } else {
      localObject = (csl)aiI.dfO.avt();
      ((csl)localObject).ma("zaap.discover");
    }
    ((csl)localObject).iT(localaCH.aOR());

    return new csx[] { localObject };
  }

  public String getName()
  {
    aZm localaZm = (aZm)ccm.a(this.dln);
    return localaZm.a(this);
  }

  public dFN chE() {
    return this.dln;
  }

  public void a(abc paramabc)
  {
  }

  private void t(bKm parambKm) {
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800110);
    if (localFreeParticleSystem != null) {
      localFreeParticleSystem.b(parambKm.aeL());
      cWS.cKD().b(localFreeParticleSystem);
    }
  }

  private void aBq() {
    aEe localaEe = new aEe(bU.fH().getString("chat.travel.discovered"));
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public String cxp()
  {
    aZm localaZm = (aZm)ccm.a(this.dln);
    return localaZm.b(this);
  }

  public boolean y(byz parambyz) {
    aZm localaZm = (aZm)ccm.a(this.dln);
    return localaZm.a(parambyz, this);
  }
}