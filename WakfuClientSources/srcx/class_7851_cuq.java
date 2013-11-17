import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class cuq
  implements dTK
{
  private static final Logger K = Logger.getLogger(cuq.class);
  private aUJ dan;

  cuq()
  {
  }

  cuq(aUJ paramaUJ)
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
      paramaGO.e(this.dan.getId(), this.dan.getName());
      paramaGO.w(this.dan.getId(), this.dan.bjT());
    } catch (dPr localdPr) {
      K.error("Impossible de modifier le rang", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJP;
  }

  public String toString()
  {
    return "ModifyRankChange{m_rank=" + this.dan + '}';
  }
}