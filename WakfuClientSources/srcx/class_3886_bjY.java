import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.log4j.Logger;
import org.eclipse.swt.widgets.Display;

public class bjY
{
  static final String fAq = File.separator + "xulrunner-" + cwl.ctO().getName();

  private static final Logger K = Logger.getLogger(bjY.class);
  private static Display fAr = null;

  private static boolean aDl = false;

  public static boolean ais() {
    return aDl;
  }

  public static void bva() {
    if ((!bB) && (fAr != null)) throw new AssertionError();

    if (cwl.ctP())
      try {
        e(new bnN());

        aDl = true;
      } catch (IllegalStateException localIllegalStateException) {
        K.warn("Impossible de créer le Display : ", localIllegalStateException);
        aDl = false;
      }
    else
      try {
        fAr = new Display();
        aDl = true;
      } catch (Throwable localThrowable) {
        K.warn("Impossible de créer le Display : ", localThrowable);
        aDl = false;
      }
  }

  public static void d(Runnable paramRunnable)
  {
    if ((aDl) && (fAr != null))
      fAr.asyncExec(paramRunnable);
  }

  public static void bvb()
  {
    if (!aDl) {
      return;
    }

    if (cwl.ctP()) {
      e(new bnL());
    }
    else
    {
      bvc();
    }
  }

  private static void bvc() {
    while (!fAr.isDisposed())
      try {
        if (!fAr.readAndDispatch()) {
          fAr.sleep();
        }

      }
      catch (Exception localException)
      {
        K.error("kaboom", localException);
      }
  }

  public static String bvd()
  {
    String str1 = System.getProperty("java.library.path");
    String[] arrayOfString1 = str1.split(File.pathSeparator);

    for (String str2 : arrayOfString1) {
      File localFile = new File(str2 + fAq);
      if (localFile.exists())
      {
        try
        {
          return localFile.getCanonicalPath();
        } catch (IOException localIOException) {
          throw new IllegalArgumentException("Invalide XulRunnerPath : " + localFile);
        }
      }
    }
    return null;
  }

  public static void bve() {
    String str = bvd();
    if (str == null) {
      throw new IllegalArgumentException("Impossible de trouver le path xulRunner");
    }

    System.setProperty("sun.awt.xembedserver", "true");
    System.setProperty("org.eclipse.swt.browser.XULRunnerPath", str);
    K.info("xul runner path : " + str);
    System.setProperty("MOZ_PLUGIN_PATH", str + File.separator + "plugins");
  }

  public static boolean bvf() {
    String str = System.getProperty("org.eclipse.swt.browser.XULRunnerPath");
    return (str != null) && (str.length() != 0);
  }

  private static void e(Runnable paramRunnable) {
    Executor localExecutor;
    try {
      Object localObject1 = Class.forName("com.apple.concurrent.Dispatch").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);

      localExecutor = (Executor)localObject1.getClass().getMethod("getNonBlockingMainQueueExecutor", new Class[0]).invoke(localObject1, new Object[0]);
    }
    catch (Exception localException)
    {
      throw new IllegalStateException("Failed to use the Mac Dispatch executor. This may happen if the version of Java that is used is too old.", localException);
    }

    AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    AtomicReference localAtomicReference = new AtomicReference();
    synchronized (localAtomicBoolean) {
      localExecutor.execute(new bnI(paramRunnable, localAtomicReference, localAtomicBoolean));

      while (!localAtomicBoolean.get())
        try {
          localAtomicBoolean.wait();
        }
        catch (InterruptedException localInterruptedException) {
        }
    }
    ??? = (Throwable)localAtomicReference.get();
    if (??? != null)
      K.error("Erreur dans le thread SWT : ", (Throwable)???);
  }
}