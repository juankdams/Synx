import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class bPW
  implements nX
{
  private Thread gYf;
  private Thread gYg;
  private Thread gYh;
  private OutputStream out;
  private OutputStream gYi;
  private InputStream gYj;
  private final boolean gYk;
  private static final long gYl = 200L;

  public bPW(OutputStream paramOutputStream1, OutputStream paramOutputStream2, InputStream paramInputStream, boolean paramBoolean)
  {
    this.out = paramOutputStream1;
    this.gYi = paramOutputStream2;
    this.gYj = paramInputStream;
    this.gYk = paramBoolean;
  }

  public bPW(OutputStream paramOutputStream1, OutputStream paramOutputStream2, InputStream paramInputStream)
  {
    this(paramOutputStream1, paramOutputStream2, paramInputStream, false);
  }

  public bPW(OutputStream paramOutputStream1, OutputStream paramOutputStream2)
  {
    this(paramOutputStream1, paramOutputStream2, null);
  }

  public bPW(OutputStream paramOutputStream)
  {
    this(paramOutputStream, paramOutputStream);
  }

  public bPW()
  {
    this(System.out, System.err);
  }

  public void b(InputStream paramInputStream)
  {
    a(paramInputStream, this.out);
  }

  public void a(InputStream paramInputStream)
  {
    if (this.gYi != null)
      b(paramInputStream, this.gYi);
  }

  public void a(OutputStream paramOutputStream)
  {
    if (this.gYj != null)
      this.gYh = a(this.gYj, paramOutputStream, true, this.gYk);
    else
      try {
        paramOutputStream.close();
      }
      catch (IOException localIOException)
      {
      }
  }

  public void start()
  {
    this.gYf.start();
    this.gYg.start();
    if (this.gYh != null)
      this.gYh.start();
  }

  public void stop()
  {
    b(this.gYh);
    try
    {
      this.gYi.flush();
    }
    catch (IOException localIOException1) {
    }
    try {
      this.out.flush();
    }
    catch (IOException localIOException2) {
    }
    b(this.gYf);
    b(this.gYg);
  }

  protected final void b(Thread paramThread)
  {
    if (paramThread == null)
    {
      return;
    }
    try {
      cxV localcxV = null;
      if ((paramThread instanceof eY)) {
        localcxV = ((eY)paramThread).lY();
      }
      if ((localcxV != null) && (localcxV.azx())) {
        return;
      }
      if (!paramThread.isAlive()) {
        return;
      }

      paramThread.join(200L);
      if ((localcxV != null) && (!localcxV.azx())) {
        localcxV.stop();
      }
      while (((localcxV == null) || (!localcxV.azx())) && (paramThread.isAlive())) {
        paramThread.interrupt();
        paramThread.join(200L);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }

  protected OutputStream bXn()
  {
    return this.gYi;
  }

  protected OutputStream bXo()
  {
    return this.out;
  }

  protected void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    this.gYf = c(paramInputStream, paramOutputStream);
  }

  protected void b(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    this.gYg = c(paramInputStream, paramOutputStream);
  }

  protected Thread c(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    return a(paramInputStream, paramOutputStream, false);
  }

  protected Thread a(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean)
  {
    return a(paramInputStream, paramOutputStream, paramBoolean, true);
  }

  protected Thread a(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean1, boolean paramBoolean2)
  {
    cxV localcxV = new cxV(paramInputStream, paramOutputStream, paramBoolean1, paramBoolean2);
    localcxV.hK(true);
    eY localeY = new eY(localcxV);
    localeY.setDaemon(true);
    return localeY;
  }
}