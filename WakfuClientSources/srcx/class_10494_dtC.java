import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class dtC
  implements dTK
{
  private static final Logger K = Logger.getLogger(dtC.class);
  private short lwE;

  dtC()
  {
  }

  dtC(short paramShort)
  {
    this.lwE = paramShort;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.putShort(this.lwE);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.lwE = paramByteBuffer.getShort();
  }

  public void a(aGO paramaGO) {
    try {
      paramaGO.bd(this.lwE);
    } catch (dPr localdPr) {
      K.error("Impossible de retirer le membre", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJR;
  }

  public String toString()
  {
    return "GuildPointsChange{m_guildLevel=" + this.lwE + '}';
  }
}