import java.util.HashMap;
import org.apache.log4j.Logger;

public class bOO extends dSD
{
  protected static final Logger K = Logger.getLogger(bOO.class);
  protected String gTS = null;

  protected static final Object gTT = new Object();
  protected static final HashMap gTU = new HashMap();

  public static bOO ki(String paramString) {
    synchronized (gTT) {
      return (bOO)gTU.get(paramString);
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

  public static void a(String paramString, bOO parambOO) {
    synchronized (gTT) {
      int i = 0;
      String str = paramString;
      while (gTU.containsKey(str))
        str = paramString + " #" + i++;
      parambOO.gTS = str;
      gTU.put(str, parambOO);
    }
  }

  public bOO(aRy paramaRy)
  {
    super(paramaRy);
    try {
      Object localObject = Mm();
      this.gTS = localObject.getClass().getName();
      a(this.gTS, this);
      y(localObject);
    } catch (Exception localException) {
      K.error("Exception levée : ", localException);
    }
  }

  public String getName() {
    return this.gTS;
  }

  public bOO(aRy paramaRy, int paramInt)
  {
    super(paramaRy);
    if (paramInt < 1) {
      paramInt = 1;
    }
    try
    {
      Object[] arrayOfObject = new Object[paramInt];

      for (int i = 0; i < paramInt; i++) {
        arrayOfObject[i] = Mm();
      }
      for (i = 0; i < paramInt; i++) {
        y(arrayOfObject[i]);
        arrayOfObject[i] = null;
      }

      Object localObject = Mm();
      y(localObject);

      this.gTS = localObject.getClass().getName();
      a(this.gTS, this);
    } catch (Exception localException) {
      K.error("Exception levée : ", localException);
    }
  }

  public synchronized Object Mm()
  {
    Object localObject = super.Mm();
    ov.add(localObject);
    return localObject;
  }

  public synchronized void y(Object paramObject)
  {
    super.y(paramObject);
    ov.remove(paramObject);
  }
}