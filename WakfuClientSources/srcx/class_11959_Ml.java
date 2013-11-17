import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class Ml
  implements dTK
{
  private static final Logger K = Logger.getLogger(Ml.class);
  private aCl bwv;

  Ml()
  {
  }

  Ml(aCl paramaCl)
  {
    this.bwv = paramaCl;
  }

  public byte[] j() {
    return dPy.i(this.bwv);
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.bwv = dPy.aU(paramByteBuffer);
  }

  public void a(aGO paramaGO) {
    try {
      paramaGO.d(this.bwv);
    } catch (dPr localdPr) {
      K.error("Impossible d'ajouter le membre", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJH;
  }

  public String toString()
  {
    return "AddMemberChange{m_member=" + this.bwv + '}';
  }
}