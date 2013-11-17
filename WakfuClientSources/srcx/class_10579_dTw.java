public enum dTw
{
  private final byte gBM;
  private final byte mqj;
  private final byte mqk;
  private final byte mql;
  private final byte mqm;
  private final int mqn;
  private final int mqo;
  private final boolean mqp;
  private final boolean mqq;
  private final boolean mqr;
  private final boolean mqs;
  private final boolean mqt;
  private final boolean mqu;
  private final boolean enG;
  private final boolean enH;
  private final boolean enI;
  private final brG enJ;
  private final boolean enK;
  private final boolean enL;
  private final boolean enM;
  private final boolean enN;
  private final boolean enO;
  private final boolean mqv;
  private final boolean enP;

  public static dTw DY(int paramInt)
  {
    for (dTw localdTw : values())
      if (localdTw.xH() == (byte)paramInt)
        return localdTw;
    return null;
  }

  private static aKt DZ(int paramInt) {
    return new aKt(paramInt);
  }

  private dTw(aKt arg3)
  {
    Object localObject;
    this.gBM = ((byte)localObject.getId());
    this.mqj = ((byte)localObject.bbB());
    this.mqk = ((byte)localObject.bbB());
    this.mql = ((byte)localObject.bbC());
    this.mqm = ((byte)localObject.bbD());
    this.mqn = localObject.bbE();
    this.mqo = localObject.bbF();
    this.mqp = localObject.bbG();
    this.mqq = localObject.bbH();
    this.mqr = localObject.bbI();
    this.mqs = localObject.bbK();
    this.mqt = localObject.bbJ();
    this.mqu = localObject.bbL();
    this.enG = localObject.bbM();
    this.enH = localObject.bbN();
    this.enI = localObject.bbO();
    this.enJ = localObject.bbR();
    this.enK = localObject.bbP();
    this.enL = localObject.bbQ();
    this.enM = localObject.bbS();
    this.enN = localObject.bbT();
    this.enO = localObject.bbU();
    this.mqv = localObject.bbV();
    this.enP = localObject.bbW();
  }

  public byte xH() {
    return this.gBM;
  }

  public byte bgB() {
    return this.mqj;
  }

  public byte bgC() {
    return this.mqk;
  }

  public byte bgD() {
    return this.mql;
  }

  public byte bgE() {
    return this.mqm;
  }

  public boolean dtm() {
    return this.mqr;
  }

  public boolean dtn() {
    return this.mqt;
  }

  public int dto()
  {
    return this.mqo;
  }

  public boolean dtp() {
    return this.mqp;
  }

  public boolean dtq() {
    return this.mqq;
  }

  public boolean dtr() {
    return this.mqs;
  }

  public boolean dts() {
    return this.mqu;
  }

  public int dtt() {
    return this.mqn;
  }

  public boolean dtu() {
    return this.enH;
  }

  public boolean dtv()
  {
    return this.enG;
  }

  public boolean bbO() {
    return this.enI;
  }

  public brG bbR() {
    return this.enJ;
  }

  public boolean bbP() {
    return this.enK;
  }

  public boolean bbQ() {
    return this.enL;
  }

  public boolean bbS() {
    return this.enM;
  }

  public boolean bbT() {
    return this.enN;
  }

  public boolean bbU() {
    return this.enO;
  }

  public boolean dtw() {
    return this.mqv;
  }

  public boolean dtx() {
    return this.enP;
  }
}