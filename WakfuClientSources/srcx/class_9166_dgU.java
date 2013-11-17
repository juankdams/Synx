import com.ankamagames.framework.script.JavaFunctionLoader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class dgU
{
  private final akR lcd = new akR();

  public void a(InputStream paramInputStream, String paramString1, String paramString2, akR paramakR) {
    bcm localbcm = i(new InputStreamReader(paramInputStream));
    if (localbcm == null) {
      return;
    }
    paramakR.put(bf(paramString2, paramString1), localbcm);
  }

  public final bcm i(Reader paramReader) {
    bcm localbcm = new bcm();
    try {
      BufferedReader localBufferedReader = new BufferedReader(paramReader);
      String str = localBufferedReader.readLine();
      while (str != null) {
        b(str, localbcm);
        str = localBufferedReader.readLine();
      }
      localBufferedReader.close();
    } catch (IOException localIOException) {
      JavaFunctionLoader.ch().error("", localIOException);
      return null;
    }
    return localbcm;
  }

  public static String bf(String paramString1, String paramString2) {
    return paramString1 + "/" + paramString2;
  }

  private void b(String paramString, Collection paramCollection) {
    this.lcd.b(new bmL(this, paramString, paramCollection));
  }

  public void e(hQ[] paramArrayOfhQ)
  {
    try
    {
      for (hQ localhQ : paramArrayOfhQ) {
        if (a(localhQ))
        {
          dsg[] arrayOfdsg1 = localhQ.b(null);
          if (arrayOfdsg1 != null) {
            for (dsg localdsg1 : arrayOfdsg1) {
              if (a(localdsg1)) {
                this.lcd.put(localhQ.getName() + "." + localdsg1.getName(), localdsg1.getClass());
              }
            }
          }

          ??? = localhQ.c(null);
          if (??? != null)
            for (dsg localdsg2 : ???)
              if (a(localdsg2))
                this.lcd.put(localdsg2.getName(), localdsg2.getClass());
        }
      }
    }
    catch (Exception localException)
    {
      throw new cJ(localException);
    }
  }

  private static boolean a(hQ paramhQ) {
    try {
      paramhQ.getClass().getDeclaredConstructor(new Class[0]);
      return true; } catch (NoSuchMethodException localNoSuchMethodException) {
    }
    return false;
  }

  private static boolean a(dsg paramdsg)
  {
    try {
      paramdsg.getClass().getDeclaredConstructor(new Class[] { LuaState.class });
      return true; } catch (NoSuchMethodException localNoSuchMethodException) {
    }
    return false;
  }
}