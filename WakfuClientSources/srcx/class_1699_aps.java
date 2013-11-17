import java.util.Date;

public class aps extends dcr
  implements dBv
{
  public static final String dvp = "nickname";
  public static final String dvq = "expirationDate";
  public static final String[] bF = { "nickname", "expirationDate" };

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("nickname")) {
      return cNV();
    }
    if (paramString.equals("expirationDate")) {
      long l = cNS();

      l = Math.max(l - new Date().getTime(), 0L);

      short s1 = (short)(int)(l / 31536000000L);
      l -= s1 * 31536000000L;
      short s2 = (short)(int)(l / 2678400000L);
      l -= s2 * 2678400000L;
      short s3 = (short)(int)(l / 86400000L);
      l -= s3 * 86400000L;
      short s4 = (short)(int)(l / 3600000L);
      l -= s4 * 3600000L;
      short s5 = (short)(int)(l / 60000L);
      bU localbU = bU.fH();

      return localbU.getString("dateFormat.yearMonthDayHourMin", new Object[] { Short.valueOf(s1), Short.valueOf(s2), Short.valueOf(s3), Short.valueOf(s4), Short.valueOf(s5) });
    }
    return null;
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

  public boolean l(String paramString)
  {
    return false;
  }
}