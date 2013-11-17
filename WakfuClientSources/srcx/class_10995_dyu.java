import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public class dyu extends cjv
{
  protected static final Logger K = Logger.getLogger(dyu.class);

  private static final Object gTT = new Object();
  private static final HashMap gTU = new HashMap();

  private static final cYR dYR = new cYR();

  public static dyu qB(String paramString)
  {
    synchronized (gTT) {
      return (dyu)gTU.get(paramString);
    }
  }

  public static int bVG() {
    synchronized (gTT) {
      return gTU.size();
    }
  }

  public static Iterable bVH() {
    synchronized (gTT) {
      return gTU.keySet();
    }
  }

  public static void a(String paramString, dyu paramdyu) {
    synchronized (gTT) {
      int i = 0;
      String str = paramString;
      while (gTU.containsKey(str))
        str = paramString + " #" + i++;
      gTU.put(str, paramdyu);
    }
  }

  public static void dump()
  {
    StringBuilder localStringBuilder = new StringBuilder("**** dump MonitoredStackPool ***\n");
    for (Map.Entry localEntry : gTU.entrySet()) {
      dyu localdyu = (dyu)localEntry.getValue();
      int i = dYR.get(localdyu);
      localStringBuilder.append((String)localEntry.getKey() + " active=" + localdyu.Mo() + " idle=" + localdyu.Mn());
      localStringBuilder.append("  ").append(localdyu.Mo() - i);
      dYR.i(localdyu, localdyu.Mo());
      localStringBuilder.append("\n");
    }
    K.info(localStringBuilder.toString());
  }

  public dyu(aRy paramaRy, int paramInt)
  {
    super(paramaRy, paramInt);
    try {
      Object localObject = Mm();
      String str = localObject.getClass().getName();
      a(str, this);
      y(localObject);
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }

  public dyu(aRy paramaRy)
  {
    super(paramaRy);
    try
    {
      Object localObject = Mm();
      String str = localObject.getClass().getName();
      a(str, this);
      y(localObject);
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }
}