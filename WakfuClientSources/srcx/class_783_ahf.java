import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class ahf
  implements dMx
{
  private static final Logger K = Logger.getLogger(ahf.class);
  private int dbv;

  ahf()
  {
  }

  ahf(int paramInt)
  {
    this.dbv = paramInt;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.dbv);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.dbv = paramByteBuffer.getInt();
  }

  public void a(aCu paramaCu) {
    try {
      if (this.dbv > 0)
        paramaCu.lU(this.dbv);
      else
        paramaCu.aOJ();
    } catch (bvZ localbvZ) {
      K.error("Impossible de changer l'objet de sommeil du familier", localbvZ);
    }
  }

  public cQy wt() {
    return cQy.kBG;
  }

  public String toString()
  {
    return "PetSleepRefItemIdChange{m_sleepRefItemId=" + this.dbv + '}';
  }
}