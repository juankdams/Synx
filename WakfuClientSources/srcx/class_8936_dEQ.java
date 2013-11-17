import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class dEQ
{
  private static final Calendar lNP = new GregorianCalendar(cYq.iDd);

  public static short j(Date paramDate) {
    synchronized (lNP) {
      lNP.setTime(paramDate);

      byte b1 = (byte)lNP.get(5);
      byte b2 = (byte)lNP.get(2);

      return bCO.l(b1, b2);
    }
  }

  public static short ac(dxL paramdxL) {
    byte b1 = (byte)paramdxL.getDay();
    byte b2 = (byte)(paramdxL.getMonth() - 1);

    return bCO.l(b1, b2);
  }
}