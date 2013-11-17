import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class Lb
  implements dTK
{
  private static final Logger K = Logger.getLogger(Lb.class);
  private aCl bwv;

  Lb()
  {
  }

  Lb(aCl paramaCl)
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
      paramaGO.s(this.bwv.getId(), this.bwv.ajD());
      paramaGO.x(this.bwv.getId(), this.bwv.ayX());
      paramaGO.y(this.bwv.getId(), this.bwv.aOC());
      paramaGO.f(this.bwv.getId(), this.bwv.isConnected());
      paramaGO.b(this.bwv.getId(), this.bwv.aOD());
      paramaGO.t(this.bwv.getId(), this.bwv.bP());
    } catch (dPr localdPr) {
      K.error("Impossible de modifier le membre", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJJ;
  }

  public String toString()
  {
    return "ModifyMemberChange{m_member=" + this.bwv + '}';
  }
}