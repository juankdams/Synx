import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class ape extends cMb
{
  static final Logger K = Logger.getLogger(ape.class);

  public dJO eR()
  {
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv };
  }

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
  }

  public csx[] am()
  {
    csl localcsl = (csl)aiI.dgj.avt();
    localcsl.iT(coH.hXF.aw);
    localcsl.ma("desc.mru.attachPhoenix");
    csx[] arrayOfcsx = new csx[1];
    arrayOfcsx[0] = localcsl;

    return arrayOfcsx;
  }

  public String getName()
  {
    return bU.fH().getString("desc.phoenix");
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    switch (bGR.av[paramdJO.ordinal()]) {
    case 1:
      d(paramdJO);
      byv.bFN().bFO().bGG().o((int)getId());
      bSH.bZs().bLP();
      a(paramdJO);
      O((Su)parambhL);
      aBq();
      aWc.blo().eO(600064L);
      return true;
    }
    K.error("Impossible d'effectuer une action " + paramdJO + " sur un phoenix", new IllegalArgumentException());
    return false;
  }

  private static void O(Su paramSu)
  {
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800110);
    if (localFreeParticleSystem != null) {
      localFreeParticleSystem.b(paramSu.aeL());
      cWS.cKD().b(localFreeParticleSystem);
    }
  }

  private static void aBq() {
    aEe localaEe = new aEe(bU.fH().getString("soulLinked"));
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }
}