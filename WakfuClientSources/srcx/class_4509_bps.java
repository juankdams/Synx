import org.apache.log4j.Logger;

public class bps extends dKc
{
  protected static final Logger K = Logger.getLogger(bps.class);
  private final bKi fJR;
  private final byo fJS;
  private long cqz;

  public bps(bKi parambKi, byo parambyo)
  {
    this.fJR = parambKi;
    this.fJS = parambyo;
  }

  public short fU() {
    return 6;
  }

  public boolean fV()
  {
    if (this.fJR != null) {
      bZA localbZA = this.fJR.F();
      byz localbyz = byv.bFN().bFO();
      if ((!bB) && (localbyz != this.bSY)) throw new AssertionError();

      if ((!localbyz.aTn().contains(this.fJR.axX())) || ((localbZA != null) && (!localbZA.i(localbyz, this.fJS, null, null))))
      {
        K.error("le joueur ne possède pas ce skill " + this.fJR.axX());
        return false;
      }
    }

    return true;
  }

  public void begin()
  {
    cYb.cLu().wh();

    K.info("On démarre l'occupation de collecte d'un monstre");
    this.bSY.q(false, true);
    this.bSY.b(this.fJS.aeL());

    aCH localaCH = clR.cni().vL(this.fJR.gC());
    if (localaCH != null) {
      dgM.a(this.bSY.aeL(), localaCH);
    }

    this.bSY.a(this);

    this.bSY.bHi().a(this.fJR, this.cqz);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("Annulation de la collecte d'un monstre, relai au serveur " + paramBoolean2);

    this.bSY.bHi().cvS();

    if (paramBoolean2) {
      ayC localayC = new ayC();
      localayC.bt((byte)3);
      localayC.aS(fU());
      byv.bFN().aJK().d(localayC);
    }

    this.bSY.aeL().eq("AnimStatique");
    this.bSY.bHe();

    cYb.cLu().clear();
    return true;
  }

  public boolean fW()
  {
    cYb.cLu().cLz();

    K.info("Fin de l'occupation de collecte d'un monstre");

    ayC localayC = new ayC();
    localayC.bt((byte)2);
    localayC.aS((short)6);
    byv.bFN().aJK().d(localayC);

    String str = aDO.v(this.bSY.aeL().ata(), true);
    this.bSY.aeL().eq(str);
    this.bSY.bHi().cvS();
    this.bSY.bHe();
    this.bSY.aTn().n(this.fJR.axX(), this.fJR.bOJ());
    return true;
  }

  public void fT(long paramLong) {
    this.cqz = paramLong;
  }
}