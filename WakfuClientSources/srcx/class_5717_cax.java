import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class cax
  implements jI
{
  private static final Logger K = Logger.getLogger(cax.class);
  private int RZ;

  cax()
  {
  }

  cax(int paramInt)
  {
    this.RZ = paramInt;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.RZ);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.RZ = paramByteBuffer.getInt();
  }

  public void a(deU paramdeU) {
    try {
      paramdeU.removeItem(this.RZ);
    } catch (wR localwR) {
      K.error("Impossible d'ajouter l'item", localwR);
    }
  }

  public JC rq() {
    return JC.bUw;
  }

  public String toString()
  {
    return "RemoveItemChange{m_itemId=" + this.RZ + '}';
  }
}