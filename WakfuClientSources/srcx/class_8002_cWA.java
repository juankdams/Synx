import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class cWA
  implements dMx
{
  private static final Logger K = Logger.getLogger(cWA.class);
  private int kJs;

  cWA()
  {
  }

  cWA(int paramInt)
  {
    this.kJs = paramInt;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.kJs);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.kJs = paramByteBuffer.getInt();
  }

  public void a(aCu paramaCu) {
    try {
      if (this.kJs > 0)
        paramaCu.lR(this.kJs);
      else
        paramaCu.aOI();
    } catch (bvZ localbvZ) {
      K.error("Impossible de changer le dernier repas du familier", localbvZ);
    }
  }

  public cQy wt() {
    return cQy.kBE;
  }

  public String toString()
  {
    return "PetEquipmentChange{m_equipmentRefItemId=" + this.kJs + '}';
  }
}