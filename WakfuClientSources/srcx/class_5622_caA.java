import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class caA
  implements dTK
{
  private static final Logger K = Logger.getLogger(caA.class);
  private long brD;

  caA()
  {
  }

  caA(aUJ paramaUJ)
  {
    this.brD = paramaUJ.getId();
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.brD);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.brD = paramByteBuffer.getLong();
  }

  public void a(aGO paramaGO) {
    try {
      paramaGO.dJ(this.brD);
    } catch (dPr localdPr) {
      K.error("Impossible d'ajouter le rang", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJO;
  }

  public String toString()
  {
    return "RemoveRankChange{m_rankId=" + this.brD + '}';
  }
}