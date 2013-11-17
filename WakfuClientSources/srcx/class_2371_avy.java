import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class avy
  implements jI
{
  private static final Logger K = Logger.getLogger(avy.class);
  private cEG dKc;

  avy()
  {
  }

  avy(cEG paramcEG)
  {
    this.dKc = paramcEG;
  }

  public byte[] j() {
    cRT localcRT = lR.a(this.dKc);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(localcRT.O());
    localcRT.g(localByteBuffer);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    cRT localcRT = new cRT();
    localcRT.h(paramByteBuffer);
    try {
      this.dKc = lR.a(localcRT, Hh.QM());
    } catch (wR localwR) {
      K.error("Impossible de dé-sérialiser l'item " + localcRT, localwR);
    }
  }

  public void a(deU paramdeU) {
    try {
      paramdeU.e(this.dKc);
    } catch (wR localwR) {
      K.error("Impossible d'ajouter l'item", localwR);
    }
  }

  public JC rq() {
    return JC.bUv;
  }

  public String toString()
  {
    return "AddItemChange{m_item=" + this.dKc + '}';
  }
}