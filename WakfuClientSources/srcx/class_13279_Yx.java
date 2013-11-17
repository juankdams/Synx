import org.apache.log4j.Logger;

public final class Yx extends dKc
{
  private static final Logger K = Logger.getLogger(Yx.class);

  private static final Runnable cJn = new DH();
  private final dli cJo;
  private final long ctZ;
  private final long cJp;

  public Yx(dli paramdli, long paramLong1, long paramLong2)
  {
    this.cJo = paramdli;
    this.ctZ = paramLong1;
    this.cJp = paramLong2;
  }

  public boolean fV() {
    if ((this.bSY.isDead()) || (this.bSY.adF())) {
      K.warn("Le joueur " + this.bSY + " est mort ou en combat et ne peut utiliser de machine de craft");
      return false;
    }
    return true;
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    dka.cSF().j(cJn);
    return fW();
  }

  public void begin() {
    clc localclc = new clc(this.cJp, this.cJo);
    byv.bFN().aJK().d(localclc);
    dka.cSF().a(cJn, this.ctZ, 1);
  }

  public boolean fW()
  {
    ayC localayC = new ayC();
    localayC.bt((byte)2);
    localayC.aS((short)27);
    byv.bFN().aJK().d(localayC);
    return true;
  }

  public short fU() {
    return 27;
  }
}