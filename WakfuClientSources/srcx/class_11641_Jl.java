public class Jl
{
  private final byz bSY;
  private Fs bSZ;

  public Jl(byz parambyz)
  {
    this.bSY = parambyz;
  }

  public final Fs Ta() {
    return this.bSZ;
  }

  public long Tb() {
    if (this.bSZ != null) {
      return this.bSZ.getId();
    }
    return 0L;
  }

  public boolean Tc() {
    if (this.bSZ == null) {
      return false;
    }
    return this.bSZ.Ph() == this.bSY.getId();
  }

  public boolean Td() {
    return this.bSZ != null;
  }

  public void ch(String paramString) {
    if (!FJ.a(new czx(paramString, 2))) {
      return;
    }
    String str = bU.fH().getString("group.party.inviting", new Object[] { paramString });
    CM.LV().f(str, 4);

    ber localber = new ber();
    localber.cF(go.aEq.bJ());
    try
    {
      long l = Long.parseLong(paramString);
      localber.fr(l);
    } catch (NumberFormatException localNumberFormatException) {
      localber.jdMethod_if(paramString);
    }
    byv.bFN().aJK().d(localber);
  }

  public void bH(long paramLong) {
    if (this.bSZ != null) {
      xR localxR = new xR();
      localxR.aS(this.bSZ.getId());
      localxR.g(paramLong);
      byv.bFN().aJK().d(localxR);
    }
  }

  public void a(Fs paramFs) {
    if (paramFs == this.bSZ) {
      return;
    }

    if (this.bSZ != null) {
      cYg.cLD().jp(this.bSZ.getId());
    }

    this.bSZ = paramFs;

    if (this.bSZ != null) {
      cYg.cLD().a(this.bSZ);
    }

    byv.bFN().bFO().adq();
  }
}