public class chk
  implements dBv
{
  public static final String gjI = "backgroundImage";
  public static final String hFt = "backgroundSize";
  public static final String hFu = "leftPage";
  public static final String hFv = "rightPage";
  public static final String hFw = "previousExisting";
  public static final String hFx = "nextExisting";
  public static final String hFy = "hasPages";
  public static final String[] bF = { "backgroundImage", "backgroundSize", "leftPage", "rightPage", "previousExisting", "nextExisting", "hasPages" };

  private int hFz = -1;
  private final cOU[] hFA;
  private final bdD bxl;
  private final Or hFB;

  public chk(bdD parambdD, cOU[] paramArrayOfcOU)
  {
    this.bxl = parambdD;
    this.hFA = paramArrayOfcOU;
    this.hFz = 0;

    this.hFB = (this.bxl.brI() ? new Or(1000, 612) : new Or(450, 612));
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("backgroundImage"))
      return this.bxl == bdD.fpy ? null : ay.bd().M(this.bxl.getId());
    if (paramString.equals("backgroundSize"))
      return this.hFB;
    if (paramString.equals("leftPage"))
      return this.hFA[this.hFz];
    if (paramString.equals("rightPage")) {
      int i = this.hFz + 1;
      return i < this.hFA.length ? this.hFA[i] : null;
    }if (paramString.equals("previousExisting"))
      return Boolean.valueOf(cjn());
    if (paramString.equals("nextExisting"))
      return Boolean.valueOf(cjo());
    if (paramString.equals("hasPages")) {
      return Boolean.valueOf(this.hFA.length > 2);
    }
    return null;
  }

  private boolean cjn() {
    return this.hFz - 2 >= 0;
  }

  private boolean cjo() {
    return this.hFz + 2 < this.hFA.length;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString) {
    return false;
  }

  public void cjp() {
    if (!cjn())
      return;
    this.hFz -= 2;
    dLE.doY().a(this, bF);
  }

  public void cjq() {
    if (!cjo())
      return;
    this.hFz += 2;
    dLE.doY().a(this, bF);
  }

  public bdD Kw() {
    return this.bxl;
  }
}