import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dDE extends aKS
  implements cdt
{
  private static final dDE lLO = new dDE();

  protected static final Logger K = Logger.getLogger(dDE.class);

  private boolean lLP = false;
  private ArrayList lLQ;
  private ArrayList lLR;
  private boolean lLS;
  private float lLT;
  private float lLU;

  public static dDE dft()
  {
    return lLO;
  }

  protected void bcC()
  {
    b(new cwY(VN(), new yd(aWL.fbW)));

    yd localyd = new yd(aWL.fbX);
    K.info("WakfuGameCalendar : adding periodic DayNightCycleUpdateEvent event, period=" + localyd);
    b(new Lo(VN(), localyd));

    int i = dft().VN().getYear();

    for (clK localclK : clK.values()) {
      dxL localdxL = localclK.cnd();
      cYq localcYq = new cYq(localdxL.getSeconds(), localdxL.getMinutes(), localdxL.getHours(), localdxL.getDay(), localdxL.getMonth(), i - 1);

      b(new bxk(localcYq, localclK, yd.brx));
    }

    ??? = new cYq(VN());
    ((cYq)???).cLR();
    b(new aky((dxL)???));

    ((cYq)???).cLQ();
    b(new dzT((dxL)???));

    super.bcC();
  }

  public void eh(long paramLong) {
    super.eh(paramLong);
    dfu();
  }

  public void run()
  {
    super.run();

    if (this.eoW)
      dfu();
  }

  public void a(Hz paramHz)
  {
    if (paramHz == null) {
      return;
    }

    if (this.lLQ == null) {
      this.lLQ = new ArrayList(2);
    }

    this.lLQ.add(paramHz);
  }

  public void b(Hz paramHz) {
    if ((paramHz == null) || (this.lLQ == null)) {
      return;
    }

    this.lLQ.remove(paramHz);
  }

  public void a(gH paramgH) {
    if (paramgH == null) {
      return;
    }

    if (this.lLR == null) {
      this.lLR = new ArrayList(1);
    }

    this.lLR.add(paramgH);
  }

  public void b(gH paramgH) {
    if ((paramgH == null) || (this.lLR == null)) {
      return;
    }

    this.lLR.remove(paramgH);
  }

  private void dfu()
  {
    boolean bool = this.lLS;

    long l1 = bcB() / 1000L;
    int i = 86400;
    long l2 = l1 % 86400L;

    this.lLU = ((float)l2 / 86400.0F * 100.0F);
    int j = 17;
    int k = 83;

    this.lLS = ((this.lLU < 83.0F) && (this.lLU >= 17.0F));

    this.lLT = b(this.lLU, 83, 17);
    int m;
    int n;
    if ((bool != this.lLS) && 
      (this.lLQ != null)) {
      m = 0; for (n = this.lLQ.size(); m < n; m++) {
        ((Hz)this.lLQ.get(m)).aH(this.lLS);
      }
    }

    if (this.lLR != null) {
      m = 0; for (n = this.lLR.size(); m < n; m++) {
        ((gH)this.lLR.get(m)).a(this.lLT, this.lLS);
      }
    }

    this.lLP = true;
  }

  private static float b(float paramFloat, int paramInt1, int paramInt2)
  {
    int i = Math.min(paramInt1, paramInt2);
    int j = Math.max(paramInt1, paramInt2);
    int k = j - i;
    int m = 100 - k;

    int n = (paramFloat > i) && (paramFloat <= j) ? k : m;
    float f;
    if (paramFloat < j) {
      if (paramFloat < i)
        f = 1.0F + (paramFloat - i) / n;
      else
        f = (paramFloat - i) / n;
    }
    else {
      f = (paramFloat - j) / n;
    }

    return f * 100.0F;
  }

  public boolean bcG()
  {
    return this.lLS;
  }

  public float dfv() {
    return this.lLT;
  }

  public float bcv() {
    return this.lLU;
  }

  public boolean dfw() {
    return this.lLP;
  }

  private dDE()
  {
    super(1970, 1);
  }

  public long bMO()
  {
    return bcy();
  }

  static
  {
    lLO.setFirstDayOfWeek(2);
  }
}