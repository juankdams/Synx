import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class dUJ
  implements aZL, aua, bUL, bxM, dDt, fd
{
  public static final dUJ msI = new dUJ();

  private final dUy msJ = new dUy();
  private final dUy msK = new dUy();
  private final dUy msL = new dUy();

  public void a(cUo paramcUo)
  {
    if (!q(paramcUo)) {
      return;
    }

    a(paramcUo, this.msJ, 800163);
  }

  public void b(cUo paramcUo) {
    a(paramcUo, this.msJ, true);
  }

  private static boolean q(cUo paramcUo) {
    return ((paramcUo instanceof cew)) && (((cew)paramcUo).cbD().c(dKm.lWW));
  }

  public void b(azX paramazX)
  {
    if (!paramazX.aLV().c(aDc.dXJ)) {
      return;
    }
    a(paramazX, this.msK, t(paramazX));
  }

  public void a(azX paramazX) {
    a(paramazX, this.msK, true);
  }

  public void g(ob paramob) {
    if (!paramob.vK().c(dLq.maH)) {
      return;
    }

    a(paramob, this.msL, 800163);
  }

  public void a(ob paramob) {
    a(paramob, this.msL, false);
  }

  private static void a(ahm paramahm, dUy paramdUy, int paramInt)
  {
    if (paramdUy.N(paramahm.getId())) {
      return;
    }

    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(paramInt);
    localFreeParticleSystem.b(paramahm);
    cWS.cKD().b(localFreeParticleSystem);

    paramdUy.G(paramahm.getId(), localFreeParticleSystem.getId());
  }

  private static void a(ahm paramahm, dUy paramdUy, boolean paramBoolean) {
    int i = paramdUy.la(paramahm.getId());
    if (i == 0) {
      return;
    }

    cWS.cKD().zk(i);
    if (paramBoolean)
      g(paramahm);
  }

  private static void g(bSl parambSl)
  {
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800174);
    localFreeParticleSystem.k(parambSl.getWorldX(), parambSl.getWorldY(), parambSl.getAltitude());
    cWS.cKD().b(localFreeParticleSystem);
  }

  private static int t(azX paramazX) {
    return paramazX.aLV().Bw() ? 800163 : 800164;
  }
}