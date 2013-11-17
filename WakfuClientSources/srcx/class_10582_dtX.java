import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class dtX
  implements dTK
{
  private static final Logger K = Logger.getLogger(dtX.class);
  private long lxE;

  dtX()
  {
  }

  dtX(aCl paramaCl)
  {
    this.lxE = paramaCl.getId();
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.lxE);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.lxE = paramByteBuffer.getLong();
  }

  public void a(aGO paramaGO) {
    try {
      paramaGO.dK(this.lxE);
    } catch (dPr localdPr) {
      K.error("Impossible de retirer le membre", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJI;
  }

  public String toString()
  {
    return "RemoveMemberChange{m_memberId=" + this.lxE + '}';
  }
}