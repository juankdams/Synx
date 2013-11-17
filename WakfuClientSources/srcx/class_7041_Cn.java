import org.apache.log4j.Logger;

public class Cn
{
  private static final Logger K = Logger.getLogger(Cn.class);
  public static final int bEQ = 0;
  public static final int WARNING = 1;
  public static final int bER = 2;
  public static final int bES = 3;
  public static final int ZS = 4;
  public static final int bET = 5;
  public static final int bEU = 6;
  public static final int INFO = 7;
  public static final int ZT = 8;

  public static String et(int paramInt)
  {
    try
    {
      return String.format(ay.bd().getString("messageBoxIconsPath"), new Object[] { Integer.valueOf(paramInt) });
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage(), localbdh);
    }return null;
  }
}