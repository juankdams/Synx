import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class bMa
  implements dTK
{
  private static final Logger K = Logger.getLogger(bMa.class);
  private bqd ad;

  bMa()
  {
  }

  bMa(bqd parambqd)
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
      paramaGO.g(this.ad.ajL(), this.ad.bza());
    } catch (dPr localdPr) {
      K.error("Impossible de modifier le bonus", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJM;
  }

  public String toString()
  {
    return "ModifyBonusChange{m_bonus=" + this.ad + '}';
  }
}