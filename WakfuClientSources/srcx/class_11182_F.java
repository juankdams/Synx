import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class F
  implements dAm
{
  private static final Logger K = Logger.getLogger(F.class);
  public static final cSi aO = new cSi();
  private final byo aP;
  private boolean aQ;

  public static boolean a(Su paramSu)
  {
    return aO.contains(paramSu.oc());
  }

  public F(byo parambyo)
  {
    this.aP = parambyo;
  }

  public void a(int paramInt, Object paramObject) {
    switch (paramInt) {
    case 301:
      Z();
      aa();
      break;
    case 300:
      this.aQ = true;
    }
  }

  public void a(bXL parambXL)
  {
    switch (parambXL.getId()) {
    case 101:
      if (this.aQ) {
        this.aQ = false;
        bTf localbTf = new bTf(dqt.cXz(), dPD.miv.bJ(), 0, this.aP);
        bnc.bxw().a(this.aP.aeQ(), localbTf);

        aa();
      }
      break;
    }
  }

  public void a(Kf paramKf)
  {
    if (paramKf != dKm.lXm) {
      return;
    }

    Z();
  }

  public void b(Kf paramKf) {
    if (paramKf != dKm.lXm) {
      return;
    }

    Y();
    this.aP.a(null);
  }

  private void Y() {
    cew localcew = this.aP.aeL();
    this.aP.gE(0);
    this.aP.aek();
    localcew.a(localcew.atx(), new brv(this, localcew));
  }

  private void Z()
  {
    cew localcew = this.aP.aeL();

    localcew.cgZ().f(localcew);
    localcew.es("AnimStatique");
    localcew.eq("AnimTransEffect-Debut");

    this.aP.aek();

    int i = (int)(Math.abs(this.aP.getId()) % aO.size());
    this.aP.gE(aO.get(i));
  }

  private void aa() {
    if (this.aP.isDead()) {
      return;
    }
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800340);
    if (localFreeParticleSystem == null) {
      K.error("pas d'aps 800340");
      return;
    }
    localFreeParticleSystem.cS(this.aP.aeR());
    localFreeParticleSystem.f(this.aP.fa(), this.aP.fb(), this.aP.fc());
    cWS.cKD().b(localFreeParticleSystem);
  }

  static
  {
    aO.add(129402237);
    aO.add(129402238);
    aO.add(129402239);
  }
}