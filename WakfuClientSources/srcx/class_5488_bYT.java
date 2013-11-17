import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.apache.log4j.Logger;

public abstract class bYT extends cGj
{
  protected static Logger K = Logger.getLogger(bYT.class);
  public static final String bC = "name";
  public static final String hpd = "nameWithDuration";
  public static final String hpe = "nameWithRemainingTime";
  public static final String RI = "description";
  public static final String RH = "iconUrl";
  public static final String hpf = "price";
  public static final String Ac = "duration";
  public static final String dQQ = "remainingTime";
  public static final String hpg = "buyEnabled";
  private final ld hph;

  protected bYT(ld paramld)
  {
    this.hph = paramld;
  }

  public abstract String getName();

  public abstract bmt aaN();

  public Object getFieldValue(String paramString) {
    if (paramString.equals("price"))
      return DecimalFormat.getIntegerInstance().format(cdz().Hv()) + "§";
    if (paramString.equals("buyEnabled")) {
      bxH localbxH = bWW.ccf().FB().aKi();
      return Boolean.valueOf((localbxH != null) && (localbxH.c(aaN()) >= cdz().Hv()));
    }if (paramString.equals("duration"))
      return cdy();
    if (paramString.equals("remainingTime")) {
      return cdx();
    }

    return null;
  }

  public void Pp() {
    dLE.doY().a(this, new String[] { "nameWithRemainingTime", "remainingTime" });
  }

  public void Pq()
  {
    dLE.doY().a(this, new String[] { "buyEnabled" });
  }

  protected Object cdx() {
    long l = (this.hph.ccG() + this.hph.getDuration() - dDE.dft().bcy()) / 1000L;
    if ((this.hph.ccG() == -1L) || (l <= 0L)) {
      return null;
    }
    return new lZ().a(bU.fH().getString("remaining.duration")).a(" ").a(bXW.k(new kb(l))).tP();
  }

  protected String cdy()
  {
    return new lZ().a(bU.fH().getString("duration")).a(" ").a(bXW.k(kb.I(this.hph.getDuration() / 1000L))).tP();
  }

  public ld cdz()
  {
    return this.hph;
  }

  public String[] getFields() {
    return null;
  }
}