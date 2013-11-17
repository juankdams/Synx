import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class bGw
  implements dMx
{
  private static final Logger K = Logger.getLogger(bGw.class);
  private long gDb;

  bGw()
  {
  }

  bGw(dxL paramdxL)
  {
    this.gDb = paramdxL.rP();
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.gDb);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.gDb = paramByteBuffer.getLong();
  }

  public void a(aCu paramaCu) {
    try {
      if (this.gDb > 0L)
        paramaCu.w(cYq.jq(this.gDb));
      else
        paramaCu.aOK();
    } catch (bvZ localbvZ) {
      K.error("Impossible de changer la date de sommeil du familier", localbvZ);
    }
  }

  public cQy wt() {
    return cQy.kBF;
  }

  public String toString()
  {
    return "PetSleepDateChange{m_sleepDate=" + this.gDb + '}';
  }
}