import org.apache.log4j.Logger;

public class bNP extends dKc
{
  protected static final Logger K = Logger.getLogger(bNP.class);
  private aCH cAO;
  private long ctZ;
  private final cYk cTr;

  public bNP(int paramInt1, int paramInt2, short paramShort)
  {
    this.cTr = new cYk(paramInt1, paramInt2, paramShort);
  }

  public long getDuration() {
    return this.ctZ;
  }

  public void cE(long paramLong) {
    this.ctZ = paramLong;
  }

  public short fU() {
    return 26;
  }

  public boolean fV() {
    return true;
  }

  public void begin() {
    K.info("Lancement occupation SEARCH_TREASURE");

    daM.kSz.wh();

    this.bSY.q(false, true);
    aCH localaCH = clR.cni().vL(this.cAO.gC());
    if (localaCH != null) {
      cew localcew = this.bSY.aeL();
      CG localCG = localcew.atB().aa(this.cTr);
      localcew.c(localCG);
      dgM.a(localcew, localaCH);
    }
    this.bSY.bHi().hW(this.ctZ);
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
    daM.kSz.wh();

    if (paramBoolean) {
      localObject = new ayC();
      ((ayC)localObject).bt(paramByte);
      ((ayC)localObject).aS((short)26);
      byv.bFN().aJK().d((cWG)localObject);
    }

    Object localObject = this.bSY.aeL();
    if (((cew)localObject).dpz() == null) {
      dgM.a((dMM)localObject, this.cAO, true);
    }
    K.info("On termine l'occupation SEARCH_TREASURE");
    this.bSY.bHi().cvS();
  }

  public void a(aCH paramaCH) {
    this.cAO = paramaCH;
  }
}