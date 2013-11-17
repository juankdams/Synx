public class dbQ
  implements Qk
{
  private Process kUm;
  private volatile boolean kUn = false;

  private Exception kUo = null;

  private volatile boolean kUp = false;
  private aQZ kUq;

  public dbQ(long paramLong)
  {
    this.kUq = new aQZ(paramLong);
    this.kUq.a(this);
  }

  public dbQ(int paramInt)
  {
    this(paramInt);
  }

  public synchronized void e(Process paramProcess)
  {
    if (paramProcess == null) {
      throw new NullPointerException("process is null.");
    }
    if (this.kUm != null) {
      throw new IllegalStateException("Already running.");
    }
    this.kUo = null;
    this.kUp = false;
    this.kUn = true;
    this.kUm = paramProcess;
    this.kUq.start();
  }

  public synchronized void stop()
  {
    this.kUq.stop();
    cleanUp();
  }

  public synchronized void a(aQZ paramaQZ)
  {
    try
    {
      try
      {
        this.kUm.exitValue();
      }
      catch (IllegalThreadStateException localIllegalThreadStateException)
      {
        if (this.kUn) {
          this.kUp = true;
          this.kUm.destroy();
        }
      }
    } catch (Exception localException) {
      this.kUo = localException;
    } finally {
      cleanUp();
    }
  }

  protected synchronized void cleanUp()
  {
    this.kUn = false;
    this.kUm = null;
  }

  public synchronized void cNz()
  {
    if (this.kUo != null)
      throw new cJ("Exception in ExecuteWatchdog.run: " + this.kUo.getMessage(), this.kUo);
  }

  public boolean isWatching()
  {
    return this.kUn;
  }

  public boolean cvL()
  {
    return this.kUp;
  }
}