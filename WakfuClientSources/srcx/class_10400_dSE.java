import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class dSE
  implements jI
{
  private static final Logger K = Logger.getLogger(dSE.class);
  private int RZ;
  private short aFe;

  dSE()
  {
  }

  dSE(int paramInt, short paramShort)
  {
    this.RZ = paramInt;
    this.aFe = paramShort;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(6);
    localByteBuffer.putInt(this.RZ);
    localByteBuffer.putShort(this.aFe);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.RZ = paramByteBuffer.getInt();
    this.aFe = paramByteBuffer.getShort();
  }

  public void a(deU paramdeU) {
    try {
      paramdeU.F(this.RZ, this.aFe);
    } catch (wR localwR) {
      K.error("Impossible d'ajouter l'item", localwR);
    }
  }

  public JC rq() {
    return JC.bUx;
  }

  public String toString()
  {
    return "ItemQuantityChange{m_itemId=" + this.RZ + ", m_quantity=" + this.aFe + '}';
  }
}