import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class aEI
  implements dTK
{
  private static final Logger K = Logger.getLogger(aEI.class);
  private aUJ dan;

  aEI()
  {
  }

  aEI(aUJ paramaUJ)
  {
    this.dan = paramaUJ;
  }

  public byte[] j() {
    return dPy.i(this.dan);
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.dan = dPy.aS(paramByteBuffer);
  }

  public void a(aGO paramaGO) {
    try {
      paramaGO.d(this.dan);
    } catch (dPr localdPr) {
      K.error("Impossible d'ajouter le rang", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJN;
  }

  public String toString()
  {
    return "AddRankChange{m_rank=" + this.dan + '}';
  }
}