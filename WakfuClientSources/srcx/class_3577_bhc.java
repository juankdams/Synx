import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bhc extends vD
{
  protected static final Logger K = Logger.getLogger(bhc.class);
  private static final long fva = 131072L;
  public static final String fvb = "remainingTime";
  public static final String bke = "rewards";
  public static final String fvc = "failures";
  public static final String fvd = "goal";
  public static final String fve = "isFinished";
  public static final String fvf = "isLaunched";
  public static final String ceY = "isActivated";
  public static final String fvg = "isFailed";
  public static final String fvh = "selectedReward";
  public static final String fvi = "isProposed";
  public static final String fvj = "needActivation";
  public static final String KU = "compass";
  public static final String fvk = "stateText";
  public static final String fvl = "coloredTitle";
  public static final String[] fvm = { "remainingTime", "rewards", "goal", "isFinished", "isLaunched", "isActivated", "isFailed", "selectedReward", "isProposed", "needActivation", "stateText", "coloredTitle" };

  public static final String[] aOb = new String[fvm.length + bKm.aOb.length];
  protected amY fvn;
  private String fvo;
  private byte fvp;

  public bhc(amY paramamY)
  {
    super(paramamY.EE());
    this.fvn = paramamY;
  }

  public bhc(bhc parambhc) {
    super(parambhc.EE());
    this.fvn = parambhc.auO();
  }

  public amY auO() {
    return this.fvn;
  }

  public String btv() {
    return this.fvo;
  }

  public void in(String paramString) {
    this.fvo = paramString;
  }

  public String[] getFields() {
    return aOb;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isModel"))
      return Boolean.valueOf(false);
    if (paramString.equals("goal")) {
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = this.bjV.aLj();
      int i = localArrayList2.size();
      for (int j = 0; j < i; j++);
      return localArrayList1;
    }if (paramString.equals("rewards"))
      return this.fvn.azz().length > 0 ? this.fvn.azz() : null;
    if (paramString.equals("failures"))
      return (this.fvn.azA() != null) && (this.fvn.azA().length > 0) ? this.fvn.azA() : null;
    if (paramString.equals("isFinished"))
      return Boolean.valueOf(this.fvn.azx());
    if (paramString.equals("isLaunched"))
      return Boolean.valueOf(this.fvn.azw());
    if (paramString.equals("isActivated"))
      return Boolean.valueOf(this.fvn.apR());
    if (paramString.equals("selectedReward"))
      return this.fvn.azy();
    if (paramString.equals("isProposed"))
      return Boolean.valueOf(this.fvn.azv());
    if (paramString.equals("remainingTime")) {
      short s = this.fvn.azB();
      return s > 0 ? bN(s) : null;
    }if (paramString.equals("needActivation"))
      return Boolean.valueOf((!this.fvn.azv()) && (!this.bjV.dfW()) && (!this.fvn.apR()));
    if (paramString.equals("isFailed"))
      return Boolean.valueOf((!this.fvn.azx()) && (this.fvn.azH()));
    if (paramString.equals("stateText"))
      return btx();
    if (paramString.equals("coloredTitle")) {
      String str = this.bjV.dfQ();
      if ((str != null) && (str.length() == 0)) {
        return null;
      }
      if (azv()) {
        return "<text color=\"7ad1d6\">" + str + "</text>";
      }
      if (btw()) {
        return str;
      }
      return "<text color=\"7ad1d6\">" + str + "</text>";
    }

    return super.getFieldValue(paramString);
  }

  public static String bN(short paramShort)
  {
    int i = paramShort / 60;
    int j = paramShort - 60 * i;
    return String.format("%d:%s", new Object[] { Integer.valueOf(i), "0" + j });
  }

  public short azI() {
    return this.fvn.azI();
  }

  public void e(dxL paramdxL) {
    this.fvn.e(paramdxL);
  }

  public void a(Ym paramYm) {
    this.fvn.a(paramYm);
  }

  public Ym azy() {
    return this.fvn.azy();
  }

  public boolean azF() {
    return this.fvn.azF();
  }

  public aF EH() {
    return this.fvn.EH();
  }

  public boolean azx() {
    return this.fvn.azx();
  }

  public void bz(boolean paramBoolean) {
    this.fvn.bz(paramBoolean);

    dLE.doY().a(this, new String[] { "isFinished" });
  }

  public boolean azH() {
    return this.fvn.azH();
  }

  public void cA(boolean paramBoolean) {
    this.fvn.cA(paramBoolean);
  }

  public boolean apR() {
    return this.fvn.apR();
  }

  public void cz(boolean paramBoolean) {
    this.fvn.cz(paramBoolean);
  }

  public boolean btw() {
    return this.fvn.azw();
  }

  public void cy(boolean paramBoolean) {
    this.fvn.cy(paramBoolean);
  }

  public boolean FC() {
    return this.fvn.FC();
  }

  public boolean azv() {
    return this.fvn.azv();
  }

  public void cx(boolean paramBoolean) {
    this.fvn.cx(paramBoolean);
  }

  public boolean azD() {
    return this.fvn.azD();
  }

  public int getId() {
    return this.fvn.getId();
  }

  public String getTitle() {
    return this.fvn.getTitle();
  }

  public String btx() {
    if (azv()) {
      return "<text color=\"7ad1d6\">" + bU.fH().getString("challenge.state.proposal") + "</text>";
    }
    if (apR()) {
      if (btw()) {
        return "<text color=\"7ad1d6\">" + bU.fH().getString("challenge.state.activatedAndLaunched") + "</text>";
      }

      return "<text color=\"BB0606\">" + bU.fH().getString("challenge.state.activatedNotLaunched") + "</text>";
    }

    if (azx()) {
      return "<text color=\"14C800\">" + bU.fH().getString("challenge.state.complete") + "</text>";
    }
    if (azH()) {
      return "<text color=\"BB0606\">" + bU.fH().getString("challenge.state.failed") + "</text>";
    }
    if (btw()) {
      return "<text color=\"BB0606\">" + bU.fH().getString("challenge.state.launchedWaitStart") + "</text>";
    }

    return "<text color=\"BB0606\">" + bU.fH().getString("challenge.state.activatedNotLaunched") + "</text>";
  }

  public void bot()
  {
    dLE.doY().a(this, fvm);
    dLE.doY().a(this, bF);
  }

  public void bty()
  {
    if (cBQ.cxL().mZ(this.fvo))
      cBQ.cxL().mW(this.fvo);
  }

  public void Pp()
  {
    if (cBQ.cxL().mZ(this.fvo))
      dLE.doY().a(this, new String[] { "remainingTime" });
  }

  public void btz()
  {
    bot();
  }

  public boolean btA() {
    return false;
  }

  public String toString() {
    return getTitle();
  }

  public void cK(byte paramByte)
  {
    this.fvp = paramByte;
  }

  public byte btB() {
    return this.fvp;
  }

  public void aLn()
  {
  }

  public void btC()
  {
  }

  public void btD()
  {
  }

  public void btE()
  {
  }

  public void btF()
  {
  }

  public void btG()
  {
  }

  public void btH()
  {
  }

  static
  {
    System.arraycopy(fvm, 0, aOb, 0, fvm.length);
    System.arraycopy(vD.bF, 0, aOb, fvm.length, vD.bF.length);
  }
}