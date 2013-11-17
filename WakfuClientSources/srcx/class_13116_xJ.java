import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class xJ
  implements dBv
{
  public static final String bqr = "calendar";
  public static final String bqs = "selectedMonth";
  public static final String bqt = "monthesList";
  public static final String bqu = "selectedYear";
  public static final String bqv = "yearsList";
  public static final String bqw = "hour";
  public static final String bqx = "minute";
  private static final int bqy;
  private static final ArrayList bqz = new ArrayList(3);
  private static final ArrayList bqA = new ArrayList(12);

  private Calendar bqB = new GregorianCalendar(bU.fH().ajJ().cAZ());
  private ces bqC;
  private Integer bqD;

  public xJ()
  {
    GJ();
  }

  public Calendar getCalendar() {
    return this.bqB;
  }

  public void GJ() {
    this.bqB.setTime(new Date());

    GP();

    this.bqC = ((ces)bqA.get(this.bqB.get(2) + bqA.size() - 12));
    int i = bqz.indexOf(Integer.valueOf(this.bqB.get(1)));
    this.bqD = ((Integer)bqz.get(i));
  }

  public void h(dxL paramdxL) {
    dD(paramdxL.getYear());
    dC(paramdxL.getMonth() - 1);
    dB(paramdxL.getDay());
    dE(paramdxL.getHours());
    dF(paramdxL.getMinutes());
  }

  public void dB(int paramInt) {
    this.bqB.set(5, paramInt);
  }

  public int GK() {
    return this.bqB.get(5);
  }

  public void dC(int paramInt) {
    this.bqB.set(2, paramInt);
    this.bqC = ((ces)bqA.get(Math.max(paramInt + bqA.size() - 12, 0)));

    dLE.doY().a(this, new String[] { "monthesList", "selectedMonth", "calendar" });
  }

  public int GL()
  {
    return this.bqC.cgN();
  }

  public void dD(int paramInt) {
    this.bqB.set(1, paramInt);
    int i = bqz.indexOf(Integer.valueOf(paramInt));
    this.bqD = ((Integer)bqz.get(i));

    GP();

    dLE.doY().a(this, new String[] { "monthesList", "selectedMonth", "selectedYear", "calendar" });
  }

  public int GM()
  {
    return this.bqD.intValue();
  }

  public void dE(int paramInt) {
    this.bqB.set(11, paramInt);

    dLE.doY().a(this, new String[] { "hour" });
  }

  public int GN()
  {
    return this.bqB.get(11);
  }

  public void dF(int paramInt) {
    this.bqB.set(12, paramInt);

    dLE.doY().a(this, new String[] { "minute" });
  }

  public int GO()
  {
    return this.bqB.get(12);
  }

  private void GP() {
    int i = 0;
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    localGregorianCalendar.setTime(new Date());
    if (localGregorianCalendar.get(1) == this.bqB.get(1)) {
      i = localGregorianCalendar.get(2);
    }

    int j = this.bqC != null ? this.bqC.cgN() : -1;

    bqA.clear();
    for (int k = i; k < 12; k++) {
      bqA.add(new ces(k));
    }

    this.bqC = null;
    if (j != -1) {
      for (k = bqA.size() - 1; k >= 0; k--) {
        ces localces = (ces)bqA.get(k);
        if (localces.cgN() == j) {
          this.bqC = localces;
          break;
        }
      }
    }

    if (this.bqC == null) {
      this.bqC = ((ces)bqA.get(0));
    }

    dC(this.bqC.cgN());
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("calendar"))
      return this.bqB;
    if (paramString.equals("monthesList"))
      return bqA;
    if (paramString.equals("selectedMonth"))
      return this.bqC;
    if (paramString.equals("yearsList"))
      return bqz;
    if (paramString.equals("selectedYear"))
      return this.bqD;
    if (paramString.equals("hour"))
      return Integer.valueOf(this.bqB.get(11));
    if (paramString.equals("minute")) {
      return Integer.valueOf(this.bqB.get(12));
    }
    return null;
  }

  public String[] getFields() {
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  static
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    localGregorianCalendar.setTime(new Date());
    bqy = localGregorianCalendar.get(1);

    for (int i = 0; i < 2; i++)
      bqz.add(Integer.valueOf(bqy + i));
  }
}