import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bXT
  implements dUd
{
  private static final Logger K = Logger.getLogger(bXT.class);

  public static final bXT hnW = new bXT();

  private final ArrayList aBf = new ArrayList();

  public void a(nc paramnc) {
    synchronized (this.aBf) {
      if (!this.aBf.contains(paramnc))
        this.aBf.add(paramnc);
    }
  }

  public void b(nc paramnc)
  {
    synchronized (this.aBf) {
      this.aBf.remove(paramnc);
    }
  }

  public void start() {
    cAo.cxf().a(this, 1000L, -1);
  }

  public void stop() {
    cAo.cxf().b(this);
    synchronized (this.aBf) {
      this.aBf.clear();
    }
  }

  public boolean a(cWG paramcWG) {
    if ((paramcWG instanceof dKQ)) {
      synchronized (this.aBf) {
        int i = 0; for (int j = this.aBf.size(); i < j; i++) {
          try {
            ((nc)this.aBf.get(i)).uD();
          } catch (Throwable localThrowable) {
            K.warn("Erreur durant un TimeTick", localThrowable);
          }
        }
      }
    }
    return false;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TimeManager");
    localStringBuilder.append("{m_listeners=").append(this.aBf);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}