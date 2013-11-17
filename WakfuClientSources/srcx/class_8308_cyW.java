import org.apache.log4j.Logger;

public class cyW extends cGj
{
  protected static final Logger K = Logger.getLogger(cyW.class);
  public static final long inB = 10000L;
  public static final String inC = "remainingSlots";
  public static final String inD = "validLevel";
  public static final String inE = "canDoAlone";
  public static final String inF = "slots";
  public static final String inG = "iconskill";
  public static final String inH = "wait";
  public static final String inI = "drawNumber";
  private static final short inJ = 100;
  private static final String[] bF = { "validLevel", "remainingSlots", "canDoAlone", "slots", "iconskill", "wait" };

  private byte erb = -1;
  private long inK;
  private alP cdb;
  private alP inL;
  private boolean fLu;
  private int aHf;
  private long fst = 0L;
  private boolean inM = false;
  private ahK inN;
  private bKi fLt;
  private final dUd inO = new cOR(this);

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconskill"))
      return cvT();
    if (paramString.equals("drawNumber"))
      return Integer.valueOf(this.fLt == null ? 1 : this.fLt.bOG() - this.erb);
    if (paramString.equals("validLevel"))
      return Boolean.valueOf(false);
    if (paramString.equals("remainingSlots"))
      return Byte.valueOf(this.erb);
    if (paramString.equals("canDoAlone"))
      return Boolean.valueOf(cvU());
    if (paramString.equals("slots")) {
      if ((this.erb == 1) && (!this.fLu))
        return Integer.valueOf(0);
      return Byte.valueOf(this.erb);
    }if (paramString.equals("wait")) {
      return Boolean.valueOf(this.fLu);
    }
    return null;
  }

  public void hO(boolean paramBoolean)
  {
    this.inM = paramBoolean;
  }

  public final void cvS()
  {
    if (this.inK != 0L) {
      this.erb = -1;
      this.fLt = null;
      this.inN = null;

      cAo.cxf().ia(this.inK);
      if (this.inM) {
        this.cdb = null;
        this.inL = null;
        cBQ.cxL().mW("collectingProgressDialog");
      }
      this.inK = 0L;
    }
  }

  private void mz(String paramString)
  {
    dLE.doY().a(this, new String[] { paramString });
  }

  private String cvT()
  {
    if (this.fLt != null)
      switch (this.fLt.gC())
      {
      case 4:
      case 22:
        return "iconaxe";
      case 3:
      case 7:
      case 8:
      case 18:
      case 19:
      case 23:
        return "iconcollect";
      case 2:
        return "iconreap";
      case 9:
        return "iconpickaxe";
      case 16:
        return "iconpick";
      case 5:
      case 6:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 17:
      case 20:
      case 21: }  return "iconbag";
  }

  private boolean cvU()
  {
    return !this.fLu;
  }

  public final void a(azX paramazX, bKi parambKi, long paramLong, byte paramByte, boolean paramBoolean, double paramDouble)
  {
    cAo.cxf().ia(this.inK);
    this.inK = 0L;
    this.fLt = parambKi;

    long l = System.currentTimeMillis();

    if (paramBoolean) {
      this.inN = new cuK(true, l, paramDouble);
    } else if (paramLong > 0L) {
      this.inN = new btk(true, l, paramDouble, (1.0D - paramDouble) / paramLong);
    } else {
      cvS();
      cvY();
      return;
    }

    this.inK = cAo.cxf().a(this.inO, 100L, 1, -1);

    this.fLu = ((paramBoolean) && (this.fLt.bOG() > 1));
    if (paramBoolean) {
      cvW();
    }
    this.erb = paramByte;

    if (cBQ.cxL().mZ("help" + paramazX.getId()))
      cBQ.cxL().mW("help" + paramazX.getId());
    cBQ.cxL().a("collectingProgressDialog", VV.dJ("collectingProgressDialog"), 73856L, (short)10000);

    cBQ.cxL().a("collectingProgressDialog", byv.bFN().bFO().aeL());

    cvV();

    dLE.doY().a("collectInProgress", this, "collectingProgressDialog");

    mz("canDoAlone");
    mz("remainingSlots");
  }

  private void cvV() {
    cpa localcpa = cBQ.cxL().coO().nf("collectingProgressDialog");
    if (localcpa == null) {
      return;
    }
    this.inL = ((alP)localcpa.fi("progressBarWait"));
    this.cdb = ((alP)localcpa.fi("progressBar"));

    if ((this.inN != null) && (this.cdb != null) && (this.inL != null))
      this.inN.a(new alP[] { this.cdb, this.inL });
  }

  private void cvW() {
    String str = this.fLt.bOG() <= 1 ? "occupation.error.levelRequired" : "collect.warning.needHelp";

    CM.LV().f(bU.fH().getString(str), 3);
  }

  void cvX()
  {
    if (this.inN == null) {
      return;
    }
    long l = System.currentTimeMillis();

    if ((this.cdb != null) && (this.inL != null)) {
      this.inN.a(l, new alP[] { this.cdb, this.inL });
    }
    mz("slots");
    mz("drawNumber");
    mz("wait");

    if (this.inN.cO(l) >= 1.0D)
      if (this.inN.ddz)
        cvS();
      else
        cvY();
  }

  private void cvY()
  {
    byv.bFN().bFO().bSf();
    cYb.cLu().cLv();
  }

  public final void a(bKi parambKi, long paramLong)
  {
    cvS();

    this.fLt = parambKi;
    long l = System.currentTimeMillis();

    if (paramLong > 2147483647L) {
      this.inN = new cuK(true, l, 0.0D);
      cvW();
    } else if (paramLong > 0L) {
      this.inN = new btk(true, l, 0.0D, 1.0D / paramLong);
    } else {
      cvS();
      cvY();
      return;
    }

    this.inK = cAo.cxf().a(this.inO, 100L, 1, -1);

    this.erb = 0;

    cBQ.cxL().a("collectingProgressDialog", VV.dJ("collectingProgressDialog"), 73856L, (short)10000);

    cBQ.cxL().a("collectingProgressDialog", byv.bFN().bFO().aeL());
    dLE.doY().a("collectInProgress", this, "collectingProgressDialog");

    cvV();

    mz("canDoAlone");
    mz("remainingSlots");
  }

  public void G(long paramLong1, long paramLong2)
  {
    cvS();

    this.fst = paramLong1;
    this.inN = new btk(true, System.currentTimeMillis(), 0.0D, 1.0D / paramLong2);
    this.inK = cAo.cxf().a(this.inO, 100L, 1, -1);
    this.erb = 0;

    cBQ.cxL().a("collectingProgressDialog", VV.dJ("collectingProgressDialog"), 73856L, (short)10000);

    cBQ.cxL().a("collectingProgressDialog", byv.bFN().bFO().aeL());
    dLE.doY().a("collectInProgress", this, "collectingProgressDialog");

    cvV();

    mz("canDoAlone");
  }

  public void hV(long paramLong)
  {
    cvS();

    this.inN = new btk(true, System.currentTimeMillis(), 0.0D, 1.0D / paramLong, true);
    this.inK = cAo.cxf().a(this.inO, 100L, 1, -1);
    this.erb = 0;

    cBQ.cxL().a("collectingProgressDialog", VV.dJ("collectingProgressDialog"), 73856L, (short)10000);

    cBQ.cxL().a("collectingProgressDialog", byv.bFN().bFO().aeL());
    dLE.doY().a("collectInProgress", this, "collectingProgressDialog");

    cvV();

    mz("canDoAlone");
  }

  public void z(long paramLong, int paramInt)
  {
    cvS();

    this.aHf = paramInt;

    byz localbyz = byv.bFN().bFO();

    this.inN = new btk(false, System.currentTimeMillis(), 0.0D, 1.0D / paramLong);
    this.inK = cAo.cxf().a(this.inO, 100L, 1, -1);
    this.erb = 0;

    cBQ.cxL().a("collectingProgressDialog", VV.dJ("collectingProgressDialog"), 73856L, (short)10000);

    cBQ.cxL().a("collectingProgressDialog", localbyz.aeL());
    dLE.doY().a("collectInProgress", this, "collectingProgressDialog");

    cvV();

    mz("canDoAlone");
  }

  public void hW(long paramLong)
  {
    cvS();

    byz localbyz = byv.bFN().bFO();

    this.inN = new btk(false, System.currentTimeMillis(), 0.0D, 1.0D / paramLong);
    this.inK = cAo.cxf().a(this.inO, 100L, 1, -1);
    this.erb = 0;

    cBQ.cxL().a("collectingProgressDialog", VV.dJ("collectingProgressDialog"), 73856L, (short)10000);

    cBQ.cxL().a("collectingProgressDialog", localbyz.aeL());
    dLE.doY().a("collectInProgress", this, "collectingProgressDialog");

    cvV();

    mz("canDoAlone");
  }

  public void cvZ() {
    if (this.inM) {
      this.cdb = null;
      this.inL = null;
      cBQ.cxL().mW("collectingProgressDialog");
    }
    cAo.cxf().ia(this.inK);
  }

  public int axX() {
    return this.fLt == null ? this.aHf : this.fLt.axX();
  }

  public long cwa() {
    return this.fst;
  }
}