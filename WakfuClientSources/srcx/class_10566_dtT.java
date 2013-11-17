import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class dtT
{
  private static final int ind = 1000;
  private static final int lxb = 60;
  private static final int lxc = 60;
  private static final int lxd = 10;
  public static final String lxe = "yyyy-MM-dd'T'HH:mm:ss";
  public static final String lxf = "yyyy-MM-dd";
  public static final String lxg = "HH:mm:ss";
  public static final DateFormat lxh = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss ", Locale.US);

  private static final DateFormat lxi = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss ", Locale.US);

  private static final MessageFormat lxj = new MessageFormat("{0}{1}");

  private static final double[] lxk = { 0.0D, 1.0D, 2.0D };

  private static final String[] lxl = { "", "1 minute ", "{0,number,###############} minutes " };

  private static final String[] lxm = { "0 seconds", "1 second", "{1,number} seconds" };

  private static final ChoiceFormat lxn = new ChoiceFormat(lxk, lxl);

  private static final ChoiceFormat lxo = new ChoiceFormat(lxk, lxm);

  public static String j(long paramLong, String paramString)
  {
    return format(new Date(paramLong), paramString);
  }

  public static String format(Date paramDate, String paramString)
  {
    DateFormat localDateFormat = qi(paramString);
    return localDateFormat.format(paramDate);
  }

  public static String km(long paramLong)
  {
    long l1 = paramLong / 1000L;
    long l2 = l1 / 60L;
    Object[] arrayOfObject = { new Long(l2), new Long(l1 % 60L) };
    return lxj.format(arrayOfObject);
  }

  private static DateFormat qi(String paramString)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(paramString);
    TimeZone localTimeZone = TimeZone.getTimeZone("GMT");
    localSimpleDateFormat.setTimeZone(localTimeZone);
    localSimpleDateFormat.setLenient(true);
    return localSimpleDateFormat;
  }

  public static int a(Calendar paramCalendar)
  {
    int i = paramCalendar.get(6);
    int j = (paramCalendar.get(1) - 1900) % 19 + 1;
    int k = (11 * j + 18) % 30;
    if (((k == 25) && (j > 11)) || (k == 24)) {
      k++;
    }
    return ((i + k) * 6 + 11) % 177 / 22 & 0x7;
  }

  public static String cZV()
  {
    Calendar localCalendar = Calendar.getInstance();
    TimeZone localTimeZone = localCalendar.getTimeZone();
    int i = localTimeZone.getOffset(localCalendar.get(0), localCalendar.get(1), localCalendar.get(2), localCalendar.get(5), localCalendar.get(7), localCalendar.get(14));

    StringBuffer localStringBuffer = new StringBuffer(i < 0 ? "-" : "+");
    i = Math.abs(i);
    int j = i / 3600000;
    int k = i / 60000 - 60 * j;
    if (j < 10) {
      localStringBuffer.append("0");
    }
    localStringBuffer.append(j);
    if (k < 10) {
      localStringBuffer.append("0");
    }
    localStringBuffer.append(k);
    synchronized (lxi) {
      return lxi.format(localCalendar.getTime()) + localStringBuffer.toString();
    }
  }

  public static Date qj(String paramString)
  {
    synchronized (lxi) {
      return lxi.parse(paramString);
    }
  }

  public static Date qk(String paramString)
  {
    return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(paramString);
  }

  public static Date ql(String paramString)
  {
    return new SimpleDateFormat("yyyy-MM-dd").parse(paramString);
  }

  public static Date qm(String paramString)
  {
    try
    {
      return qk(paramString); } catch (ParseException localParseException) {
    }
    return ql(paramString);
  }

  static
  {
    lxj.setFormat(0, lxn);
    lxj.setFormat(1, lxo);
  }
}