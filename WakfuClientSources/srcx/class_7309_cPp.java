import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cPp
{
  private static final GregorianCalendar kyk = new GregorianCalendar(TimeZone.getTimeZone("GMT+1"));

  public static cYq iX(long paramLong) {
    kyk.setTime(new Date(paramLong));
    return new cYq(0, 0, 0, kyk.get(5), kyk.get(2) + 1, kyk.get(1));
  }
}