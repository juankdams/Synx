import java.lang.reflect.Field;

public abstract class Wb extends aTJ
{
  public static final int cFn = 11;
  public static final int cFo = 12;
  public static final int cFp = 14;
  public static final int cFq = 15;
  public static final int cFr = 16;
  public static final int Zd = 17;
  public static final int abo = 18;
  public static final int cFs = 19;
  public static final int cFt = 20;
  public static final int cFu = 21;
  public static final int cFv = 22;
  public static final int cFw = 23;
  public static final int cFx = 24;
  public static final int cFy = 25;
  public static final int cFz = 26;
  public static final int cFA = 27;
  public static final int cFB = 28;
  public static final int cFC = 29;
  public static final int cFD = 30;
  public static final int cFE = 31;
  public static final int ZS = 32;
  public static final int cFF = 33;
  public static final int cFG = 34;

  public static String getTypeName(int paramInt)
  {
    for (Field localField : Wb.class.getFields())
      try {
        if (localField.getInt(null) == paramInt)
          return localField.getName();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
      }
    return "UNKNOWN_CONTAINER_TYPE (" + paramInt + ")";
  }
}