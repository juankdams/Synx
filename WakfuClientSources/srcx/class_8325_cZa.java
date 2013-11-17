import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class cZa extends aZm
{
  public void a(aZK paramaZK, dhJ paramdhJ)
  {
    awT localawT = byv.bFN().bFO().bGF();
    ((cMb)paramaZK).a(((dWu)paramaZK).adT());
    localawT.kM((int)paramaZK.getId());
  }

  public void b(aZK paramaZK, dhJ paramdhJ)
  {
    djB.cSv().c((cAK)paramaZK);
  }

  public dwZ b(dhJ paramdhJ, aZK paramaZK, long paramLong) {
    int i = aot.dtv.m(paramaZK.getId(), paramLong).qW();
    if (paramdhJ.JE() < i)
      return dwZ.lDb;
    aNn localaNn = (aNn)aot.dtv.a(dFN.lQe, paramLong);
    if (!localaNn.af(paramdhJ))
      return dwZ.lDe;
    return dwZ.lDa;
  }

  protected void c(dhJ paramdhJ, aZK paramaZK, long paramLong)
  {
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(800102);
    if (localFreeParticleSystem != null) {
      localFreeParticleSystem.b(byv.bFN().bFO().aeM());
      cWS.cKD().b(localFreeParticleSystem);
    }

    djB.cSv().cSw();

    dka.cSF().a(new cmP(this, paramaZK, paramLong), 500L, 1);
  }

  public boolean a(byz parambyz, cAK paramcAK)
  {
    return true;
  }

  public dFN cHc() {
    return dFN.lQe;
  }

  public String a(cAK paramcAK) {
    return bU.fH().b(36, (int)paramcAK.getId(), new Object[0]);
  }

  public String b(cAK paramcAK)
  {
    return null;
  }
}