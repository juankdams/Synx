import org.apache.log4j.Logger;

public class adh extends dKc
{
  protected static final Logger K = Logger.getLogger(adh.class);
  private aCH cAO;
  private long ctZ;
  private int aHf;
  private final cYk cTr;

  public adh(int paramInt1, int paramInt2)
  {
    this.cTr = new cYk(paramInt1, paramInt2);
  }

  public long getDuration() {
    return this.ctZ;
  }

  public void cE(long paramLong) {
    this.ctZ = paramLong;
  }

  public void hJ(int paramInt) {
    this.aHf = paramInt;
  }

  public short fU() {
    return 2;
  }

  public boolean fV() {
    return true;
  }

  public void begin() {
    K.info("Lancement occupation PLANT");

    aDI.aPQ().wh();

    this.bSY.q(false, true);
    aCH localaCH = clR.cni().vL(this.cAO.gC());
    if (localaCH != null) {
      cew localcew = this.bSY.aeL();
      CG localCG = localcew.atB().aa(this.cTr);
      localcew.c(localCG);
      dgM.a(localcew, localaCH);
    }
    this.bSY.bHi().z(this.ctZ, this.aHf);
    this.bSY.a(this);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    g((byte)3, paramBoolean2);
    return true;
  }

  public boolean fW() {
    g((byte)2, true);
    return true;
  }

  private void g(byte paramByte, boolean paramBoolean)
  {
    aDI.aPQ().wh();

    if (paramBoolean) {
      localObject = new ayC();
      ((ayC)localObject).bt(paramByte);
      ((ayC)localObject).aS((short)2);
      byv.bFN().aJK().d((cWG)localObject);
    }

    Object localObject = this.bSY.aeL();
    if (((cew)localObject).dpz() == null) {
      dgM.a((dMM)localObject, this.cAO, true);
    }
    K.info("On termine l'occupation PLANT");
    this.bSY.bHi().cvS();
  }

  public void a(aCH paramaCH) {
    this.cAO = paramaCH;
  }
}