import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dwx
  implements bNe
{
  private static final String lBN = "Either the millis or the datetime attribute must be set.";
  private static final wh aIk = wh.Fo();

  private Long lBO = null;
  private String lBP = null;
  private String pattern = null;
  private auZ lBQ = auZ.dJQ;
  private long lBR = aIk.Fp();

  public synchronized void setMillis(long paramLong)
  {
    this.lBO = new Long(paramLong);
  }

  public synchronized long getMillis()
  {
    return this.lBO == null ? -1L : this.lBO.longValue();
  }

  public synchronized void setDateTime(String paramString)
  {
    this.lBP = paramString;
    this.lBO = null;
  }

  public synchronized String dbN()
  {
    return this.lBP;
  }

  public synchronized void kq(long paramLong)
  {
    this.lBR = paramLong;
  }

  public synchronized long dbO()
  {
    return this.lBR;
  }

  public synchronized void setPattern(String paramString)
  {
    this.pattern = paramString;
  }

  public synchronized String getPattern()
  {
    return this.pattern;
  }

  public synchronized void a(auZ paramauZ)
  {
    this.lBQ = paramauZ;
  }

  public synchronized auZ dbP()
  {
    return this.lBQ;
  }

  public synchronized boolean a(bFe parambFe)
  {
    if ((this.lBP == null) && (this.lBO == null)) {
      throw new cJ("Either the millis or the datetime attribute must be set.");
    }
    if (this.lBO == null) {
      SimpleDateFormat localSimpleDateFormat = this.pattern == null ? DateFormat.getDateTimeInstance(3, 3, Locale.US) : new SimpleDateFormat(this.pattern);
      try
      {
        long l = localSimpleDateFormat.parse(this.lBP).getTime();
        if (l < 0L) {
          throw new cJ("Date of " + this.lBP + " results in negative milliseconds value" + " relative to epoch (January 1, 1970, 00:00:00 GMT).");
        }

        setMillis(l);
      } catch (ParseException localParseException) {
        throw new cJ("Date of " + this.lBP + " Cannot be parsed correctly. It should be in" + (this.pattern == null ? " MM/DD/YYYY HH:MM AM_PM" : this.pattern) + " format.");
      }

    }

    return this.lBQ.b(parambFe.getLastModified(), this.lBO.longValue(), this.lBR);
  }
}