import java.io.InputStream;
import java.io.OutputStream;

public class cxV
  implements Runnable
{
  private static final int ilX = 128;
  private final InputStream ilY;
  private final OutputStream ilZ;
  private volatile boolean ima;
  private volatile boolean finished;
  private final boolean imb;
  private boolean imc = false;
  private Exception exception = null;
  private int bufferSize = 128;
  private boolean started = false;
  private final boolean imd;
  private static final long ime = 100L;

  public cxV(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean)
  {
    this(paramInputStream, paramOutputStream, paramBoolean, false);
  }

  public cxV(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.ilY = paramInputStream;
    this.ilZ = paramOutputStream;
    this.imb = paramBoolean1;
    this.imd = paramBoolean2;
  }

  public cxV(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    this(paramInputStream, paramOutputStream, false);
  }

  void hK(boolean paramBoolean)
  {
    this.imc = paramBoolean;
  }

  public void run()
  {
    synchronized (this) {
      this.started = true;
    }
    this.finished = false;
    this.ima = false;

    ??? = new byte[this.bufferSize];
    try
    {
      while (true)
      {
        k(this.ilY);

        if ((this.ima) || (Thread.interrupted()))
        {
          break;
        }
        int i = this.ilY.read((byte[])???);
        if ((i <= 0) || (this.ima) || (Thread.interrupted())) {
          break;
        }
        this.ilZ.write((byte[])???, 0, i);
        if (this.imc) {
          this.ilZ.flush();
        }
      }
      this.ilZ.flush();
    } catch (InterruptedException ) {
    }
    catch (Exception ) {
      synchronized (this) {
        this.exception = ???;
      }
    } finally {
      if (this.imb) {
        wh.b(this.ilZ);
      }
      this.finished = true;
      synchronized (this) {
        notifyAll();
      }
    }
  }

  public boolean azx()
  {
    return this.finished;
  }

  public synchronized void cve()
  {
    while (!azx())
      wait();
  }

  public synchronized void setBufferSize(int paramInt)
  {
    if (this.started) {
      throw new IllegalStateException("Cannot set buffer size on a running StreamPumper");
    }
    this.bufferSize = paramInt;
  }

  public synchronized int getBufferSize()
  {
    return this.bufferSize;
  }

  public synchronized Exception getException()
  {
    return this.exception;
  }

  synchronized void stop()
  {
    this.ima = true;
    notifyAll();
  }

  private void k(InputStream paramInputStream)
  {
    if (this.imd)
      while ((!this.ima) && (paramInputStream.available() == 0)) {
        if (Thread.interrupted()) {
          throw new InterruptedException();
        }

        synchronized (this) {
          wait(100L);
        }
      }
  }
}