import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;

class dE
  implements Runnable
{
  private static final int TW = 20000;
  private HashSet TX = new HashSet();
  private Method TY;
  private Method TZ;
  private dRV Ua = null;

  private boolean Ub = false;

  private boolean running = false;

  dE()
  {
    try
    {
      Class[] arrayOfClass = { Thread.class };
      this.TY = Runtime.class.getMethod("addShutdownHook", arrayOfClass);

      this.TZ = Runtime.class.getMethod("removeShutdownHook", arrayOfClass);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
    catch (Exception localException) {
      localException.printStackTrace();
    }
  }

  private void hB()
  {
    if ((this.TY != null) && (!this.running)) {
      this.Ua = new dRV(this);
      Object[] arrayOfObject = { this.Ua };
      try {
        this.TY.invoke(Runtime.getRuntime(), arrayOfObject);
        this.Ub = true;
      } catch (IllegalAccessException localIllegalAccessException) {
        localIllegalAccessException.printStackTrace();
      } catch (InvocationTargetException localInvocationTargetException) {
        Throwable localThrowable = localInvocationTargetException.getTargetException();
        if ((localThrowable != null) && (localThrowable.getClass() == IllegalStateException.class))
        {
          this.running = true;
        }
        else localInvocationTargetException.printStackTrace();
      }
    }
  }

  private void hC()
  {
    if ((this.TZ != null) && (this.Ub) && (!this.running)) {
      Object[] arrayOfObject = { this.Ua };
      try {
        Boolean localBoolean = (Boolean)this.TZ.invoke(Runtime.getRuntime(), arrayOfObject);

        if (!localBoolean.booleanValue())
          System.err.println("Could not remove shutdown hook");
      }
      catch (IllegalAccessException localIllegalAccessException) {
        localIllegalAccessException.printStackTrace();
      } catch (InvocationTargetException localInvocationTargetException) {
        Throwable localThrowable = localInvocationTargetException.getTargetException();
        if ((localThrowable != null) && (localThrowable.getClass() == IllegalStateException.class))
        {
          this.running = true;
        }
        else localInvocationTargetException.printStackTrace();

      }

      this.Ua.ls(false);
      if (!this.Ua.getThreadGroup().isDestroyed())
      {
        this.Ua.start();
      }
      try
      {
        this.Ua.join(20000L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
      this.Ua = null;
      this.Ub = false;
    }
  }

  public boolean hD()
  {
    return this.Ub;
  }

  public boolean a(Process paramProcess)
  {
    synchronized (this.TX)
    {
      if (this.TX.size() == 0) {
        hB();
      }
      return this.TX.add(paramProcess);
    }
  }

  public boolean b(Process paramProcess)
  {
    synchronized (this.TX) {
      boolean bool = this.TX.remove(paramProcess);
      if ((bool) && (this.TX.size() == 0)) {
        hC();
      }
      return bool;
    }
  }

  public void run()
  {
    synchronized (this.TX) {
      this.running = true;
      Iterator localIterator = this.TX.iterator();
      while (localIterator.hasNext())
        ((Process)localIterator.next()).destroy();
    }
  }
}