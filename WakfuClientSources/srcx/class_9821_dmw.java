import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.media.opengl.Threading;
import org.apache.log4j.Logger;

class dmw extends dnJ
{
  dmw(cjO paramcjO)
  {
    super(null);
  }
  public void run() { setName("Worker (in OpenGL thread)");
    cjO.Re().info("Worker running (in OpenGL thread)");
    av(true);
    while (isRunning()) {
      try
      {
        if (!Threading.isOpenGLThread())
          Threading.invokeOnOpenGLThread(cjO.a(this.hYz));
        else {
          cjO.a(this.hYz).run();
        }

        long l = dka.cSF().cSI();
        if (l > 0L) {
          this.hYz.hJC.lock();
          this.hYz.bQe.await(l, TimeUnit.MILLISECONDS);
          this.hYz.hJC.unlock();
        }
      }
      catch (Throwable localThrowable) {
        cjO.a(this.hYz, localThrowable);
      }
    }
    cjO.Re().info("Worker stopped");
    cjO.a(this.hYz, null);
  }
}