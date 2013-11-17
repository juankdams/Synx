import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class h
  implements dTK
{
  private static final Logger K = Logger.getLogger(h.class);
  private bqd ad;

  h()
  {
  }

  h(bqd parambqd)
  {
    this.ad = parambqd;
  }

  public byte[] j() {
    return dPy.l(this.ad);
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.ad = dPy.aT(paramByteBuffer);
  }

  public void a(aGO paramaGO) {
    try {
      paramaGO.f(this.ad);
    } catch (dPr localdPr) {
      K.error("Impossible d'ajouter le bonus", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJK;
  }

  public String toString()
  {
    return "AddBonusChange{m_bonus=" + this.ad + '}';
  }
}