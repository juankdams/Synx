import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class dFB extends bRt
{
  private static final wh aIk = wh.Fo();

  private long lPH = -1L;
  private String lBP = null;
  private boolean lPI = false;
  private long lBR = 0L;
  private String pattern;
  private auZ lBQ = auZ.dJQ;
  public static final String lPJ = "millis";
  public static final String lPK = "datetime";
  public static final String lPL = "checkdirs";
  public static final String lPM = "granularity";
  public static final String ktH = "when";
  public static final String lPN = "pattern";

  public dFB()
  {
    this.lBR = aIk.Fp();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{dateselector date: ");
    localStringBuilder.append(this.lBP);
    localStringBuilder.append(" compare: ").append(this.lBQ.getValue());
    localStringBuilder.append(" granularity: ");
    localStringBuilder.append(this.lBR);
    if (this.pattern != null) {
      localStringBuilder.append(" pattern: ").append(this.pattern);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void setMillis(long paramLong)
  {
    this.lPH = paramLong;
  }

  public long getMillis()
  {
    if (this.lBP != null) {
      validate();
    }
    return this.lPH;
  }

  public void qY(String paramString)
  {
    this.lBP = paramString;
    this.lPH = -1L;
  }

  public void kT(boolean paramBoolean)
  {
    this.lPI = paramBoolean;
  }

  public void eG(int paramInt)
  {
    this.lBR = paramInt;
  }

  public void a(dHB paramdHB)
  {
    a(paramdHB);
  }

  public void a(auZ paramauZ)
  {
    this.lBQ = paramauZ;
  }

  public void setPattern(String paramString)
  {
    this.pattern = paramString;
  }

  public void a(daL[] paramArrayOfdaL)
  {
    super.a(paramArrayOfdaL);
    if (paramArrayOfdaL != null)
      for (int i = 0; i < paramArrayOfdaL.length; i++) {
        String str = paramArrayOfdaL[i].getName();
        if ("millis".equalsIgnoreCase(str)) {
          try {
            setMillis(Long.parseLong(paramArrayOfdaL[i].getValue()));
          } catch (NumberFormatException localNumberFormatException1) {
            be("Invalid millisecond setting " + paramArrayOfdaL[i].getValue());
          }
        }
        else if ("datetime".equalsIgnoreCase(str))
          qY(paramArrayOfdaL[i].getValue());
        else if ("checkdirs".equalsIgnoreCase(str))
          kT(FF.bP(paramArrayOfdaL[i].getValue()));
        else if ("granularity".equalsIgnoreCase(str)) {
          try {
            eG(Integer.parseInt(paramArrayOfdaL[i].getValue()));
          } catch (NumberFormatException localNumberFormatException2) {
            be("Invalid granularity setting " + paramArrayOfdaL[i].getValue());
          }
        }
        else if ("when".equalsIgnoreCase(str))
          a(new auZ(paramArrayOfdaL[i].getValue()));
        else if ("pattern".equalsIgnoreCase(str))
          setPattern(paramArrayOfdaL[i].getValue());
        else
          be("Invalid parameter " + str);
      }
  }

  public void cd()
  {
    if ((this.lBP == null) && (this.lPH < 0L)) {
      be("You must provide a datetime or the number of milliseconds.");
    }
    else if ((this.lPH < 0L) && (this.lBP != null))
    {
      SimpleDateFormat localSimpleDateFormat = this.pattern == null ? DateFormat.getDateTimeInstance(3, 3, Locale.US) : new SimpleDateFormat(this.pattern);
      try
      {
        setMillis(localSimpleDateFormat.parse(this.lBP).getTime());
        if (this.lPH < 0L) {
          be("Date of " + this.lBP + " results in negative milliseconds value" + " relative to epoch (January 1, 1970, 00:00:00 GMT).");
        }
      }
      catch (ParseException localParseException)
      {
        be("Date of " + this.lBP + " Cannot be parsed correctly. It should be in" + (this.pattern == null ? " MM/DD/YYYY HH:MM AM_PM" : this.pattern) + " format.");
      }
    }
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    validate();

    return ((paramFile2.isDirectory()) && (!this.lPI)) || (this.lBQ.b(paramFile2.lastModified(), this.lPH, this.lBR));
  }
}