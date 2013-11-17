import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class aEb
  implements dTK
{
  private static final Logger K = Logger.getLogger(aEb.class);
  private int bJP;

  aEb()
  {
  }

  aEb(bqd parambqd)
  {
    this.bJP = parambqd.ajL();
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.bJP);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.bJP = paramByteBuffer.getInt();
  }

  public void a(aGO paramaGO) {
    try {
      paramaGO.lG(this.bJP);
    } catch (dPr localdPr) {
      K.error("Impossible de retirer le bonus", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJL;
  }

  public String toString()
  {
    return "RemoveBonusChange{m_bonusId=" + this.bJP + '}';
  }
}