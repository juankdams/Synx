import org.apache.log4j.Logger;

public class ccK extends dKc
{
  protected static final Logger K = Logger.getLogger(ccK.class);
  private long cqz;
  private Od hvy;
  private short hvz;

  public ccK(Od paramOd)
  {
    this.hvy = paramOd;
    this.hvz = this.hvy.getState();
  }

  public short fU()
  {
    return 13;
  }

  public boolean fV()
  {
    if (this.hvy == null) {
      K.error("[DISTRIBUTION] Impossible d'utiliser une machine de distribution null");
      return false;
    }

    if ((this.bSY.isDead()) || (this.bSY.adF())) {
      K.info("[DISTRIBUTION] Un joueur mort ou en combat ne peut utiliser de machine de distribution");
      return false;
    }

    return true;
  }

  public void begin() {
    this.bSY.q(false, true);

    this.bSY.a(this);
    this.bSY.c(this.bSY.ML().Z(this.hvy.ML()));
    dgM.a(this.bSY.aeL(), this.hvy.te());

    this.hvy.x((short)3);
    this.hvy.sM();

    if (this.cqz > 0L)
      this.bSY.bHi().G(this.hvy.getId(), this.cqz);
    else
      this.bSY.bSf();
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.bSY.bHi().cvS();
    this.bSY.aeL().eq("AnimStatique");

    this.hvy.x(this.hvz);
    this.hvy.sM();

    if (paramBoolean2) {
      ayC localayC = new ayC();
      localayC.bt((byte)3);
      localayC.aS(fU());
      byv.bFN().aJK().d(localayC);
    }
    return true;
  }

  public boolean fW() {
    cew localcew = this.bSY.aeL();

    this.bSY.bHi().cvS();

    this.hvy.x(this.hvz);
    this.hvy.sM();

    String str = aDO.v(localcew.ata(), true);
    localcew.eq(str);

    ayC localayC = new ayC();
    localayC.bt((byte)2);
    localayC.aS((short)13);
    byv.bFN().aJK().d(localayC);

    return true;
  }

  public void fT(long paramLong) {
    this.cqz = paramLong;
  }
}