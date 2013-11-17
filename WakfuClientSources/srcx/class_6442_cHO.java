import java.io.InputStream;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.log4j.Logger;

public abstract class cHO
{
  public static final String iCV = "dateFormat.yearMonthDay.short";
  public static final String iCW = "dateFormat.yearMonthDayHourMinute.short";
  public static final String iCX = "dateFormat.monthDayHourMinute.short";
  public static final String iCY = "dateFormat.yearMonthDayHourMinuteSecond";
  public static final String iCZ = "durationFormat.yearMonthDayHourMinuteSecond.short";
  public static final String iDa = "durationFormat.yearMonthDayHourMinuteSecond.veryShort";
  private static final Logger K = Logger.getLogger(cHO.class);

  protected static cHO iDb = null;
  private cFI cIj;
  private String SK;
  private bfQ iDc;
  public static final TimeZone iDd = TimeZone.getTimeZone("UTC");
  private NumberFormat iDe;
  private NumberFormat iDf;
  private NumberFormat iDg;
  private DateFormat iDh;
  private DateFormat iDi;
  private DateFormat iDj;
  private DateFormat iDk;

  public static cHO cCa()
  {
    return iDb;
  }

  public cHO() {
    b(cCb());
  }

  public void b(cFI paramcFI) {
    this.cIj = paramcFI;
    cCc();
  }

  public cFI ajJ() {
    return this.cIj;
  }

  public void setPath(String paramString) {
    this.SK = paramString;
    cCc();
  }

  public String getString(String paramString)
  {
    return bjv.format(nq(paramString), new Object[0]);
  }

  public String getString(String paramString, Object[] paramArrayOfObject)
  {
    String str = nq(paramString);
    try {
      return bjv.format(str, paramArrayOfObject);
    } catch (IllegalFormatException localIllegalFormatException) {
      K.warn(localIllegalFormatException.getMessage());
    }return str;
  }

  public String nq(String paramString)
  {
    String str = this.iDc != null ? this.iDc.get(paramString) : null;

    if (str == null) {
      K.warn("Propriété introuvable dans le Translator key=" + paramString);
      StringBuilder localStringBuilder = new StringBuilder(paramString.length() + 2);
      return '!' + paramString + '!';
    }

    return str;
  }

  public boolean containsKey(String paramString)
  {
    if (this.iDc != null) {
      return this.iDc.containsKey(paramString);
    }
    return false;
  }

  public static cFI cCb()
  {
    String str = System.getProperty("user.language");
    cFI localcFI = cFI.no(str);
    if (localcFI == null) {
      return cFI.iAm;
    }
    return localcFI;
  }

  private boolean cCc()
  {
    if ((this.SK != null) && (this.cIj != null)) {
      try {
        InputStream localInputStream = dtb.pT(this.SK + "_" + this.cIj.getLocale().getLanguage() + ".properties");
        this.iDc = new bfQ(localInputStream);
        localInputStream.close();
      }
      catch (Exception localException) {
        K.error("Exception sur le chargement de la langue " + this.cIj, localException);
        return false;
      }
    }

    if (this.cIj != null) {
      f(this.cIj);
    }
    return false;
  }

  private void f(cFI paramcFI)
  {
    this.iDe = NumberFormat.getIntegerInstance(paramcFI.cAZ());
    this.iDf = NumberFormat.getNumberInstance(paramcFI.cAZ());
    this.iDg = NumberFormat.getPercentInstance(paramcFI.cAZ());
    this.iDh = DateFormat.getDateInstance(0, paramcFI.cAZ());
    this.iDj = DateFormat.getTimeInstance(3, paramcFI.cAZ());
    this.iDi = DateFormat.getDateInstance(3, paramcFI.cAZ());
    this.iDk = DateFormat.getDateTimeInstance(3, 3, paramcFI.cAZ());
    this.iDh.setTimeZone(iDd);
    this.iDj.setTimeZone(iDd);
    this.iDi.setTimeZone(iDd);
    this.iDk.setTimeZone(iDd);
  }

  public String R(double paramDouble) {
    return this.iDf.format(paramDouble);
  }

  public String iK(long paramLong) {
    return this.iDe.format(paramLong);
  }

  public String S(double paramDouble) {
    return this.iDg.format(paramDouble);
  }

  public String d(Date paramDate) {
    return this.iDh.format(paramDate);
  }

  public String e(Date paramDate) {
    return this.iDj.format(paramDate);
  }

  public String f(Date paramDate) {
    return this.iDi.format(paramDate);
  }

  public String g(Date paramDate) {
    return this.iDk.format(paramDate);
  }
}