import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class dJY
{
  protected static final wh aIk = wh.Fo();

  private static dJY lWu = null;
  private static dJY lWv = null;

  public Process a(FF paramFF, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if (paramFF != null) {
      paramFF.d("Execute:CommandLauncher: " + aDr.i(paramArrayOfString1), 4);
    }

    return Runtime.getRuntime().exec(paramArrayOfString1, paramArrayOfString2);
  }

  public Process a(FF paramFF, String[] paramArrayOfString1, String[] paramArrayOfString2, File paramFile)
  {
    if (paramFile == null) {
      return a(paramFF, paramArrayOfString1, paramArrayOfString2);
    }
    throw new IOException("Cannot execute a process in different directory under this JVM");
  }

  public static dJY ab(FF paramFF)
  {
    dJY localdJY = a("ant.shellLauncher", paramFF);

    if (localdJY == null) {
      localdJY = lWv;
    }

    return localdJY;
  }

  public static dJY ac(FF paramFF)
  {
    dJY localdJY = a("ant.vmLauncher", paramFF);

    if (localdJY == null) {
      localdJY = lWu;
    }
    return localdJY;
  }

  private static dJY a(String paramString, FF paramFF)
  {
    dJY localdJY = null;
    if (paramFF != null) {
      localdJY = (dJY)paramFF.bR(paramString);
    }

    if (localdJY == null) {
      localdJY = rk(paramString);
    }
    return localdJY;
  }

  private static dJY rk(String paramString) {
    dJY localdJY = null;
    String str = System.getProperty(paramString);
    if (str != null) {
      try {
        localdJY = (dJY)Class.forName(str).newInstance();
      }
      catch (InstantiationException localInstantiationException)
      {
        System.err.println("Could not instantiate launcher class " + str + ": " + localInstantiationException.getMessage());
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        System.err.println("Could not instantiate launcher class " + str + ": " + localIllegalAccessException.getMessage());
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        System.err.println("Could not instantiate launcher class " + str + ": " + localClassNotFoundException.getMessage());
      }

    }

    return localdJY;
  }

  public static void a(FF paramFF, dJY paramdJY)
  {
    if (paramFF != null)
      paramFF.g("ant.vmLauncher", paramdJY);
  }

  public static void b(FF paramFF, dJY paramdJY)
  {
    if (paramFF != null)
      paramFF.g("ant.shellLauncher", paramdJY);
  }

  static
  {
    if (!aCt.gd("os/2")) {
      lWu = new dRB();
    }

    if ((aCt.gd("mac")) && (!aCt.gd("unix")))
    {
      lWv = new Kj(new dJY());
    } else if (aCt.gd("os/2"))
    {
      lWv = new dyb(new dJY());
    }
    else
    {
      dJY localdJY;
      if (aCt.gd("windows")) {
        localdJY = new dJY();

        if (!aCt.gd("win9x"))
        {
          lWv = new bxL(localdJY);
        }
        else {
          lWv = new bPm("bin/antRun.bat", localdJY);
        }
      }
      else if (aCt.gd("netware"))
      {
        localdJY = new dJY();

        lWv = new Wo("bin/antRun.pl", localdJY);
      }
      else if (aCt.gd("openvms"))
      {
        lWv = new aFj();
      }
      else {
        lWv = new bPm("bin/antRun", new dJY());
      }
    }
  }
}