import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class UR
  implements dMx
{
  private static final Logger K = Logger.getLogger(UR.class);
  private byte czf;

  UR()
  {
  }

  UR(byte paramByte)
  {
    this.czf = paramByte;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1);
    localByteBuffer.put(this.czf);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.czf = paramByteBuffer.get();
  }

  public void a(aCu paramaCu) {
    try {
      paramaCu.by(this.czf);
    } catch (bvZ localbvZ) {
      K.error("Impossible de changer le nombre de combat du familier", localbvZ);
    }
  }

  public cQy wt() {
    return cQy.kBy;
  }

  public String toString() {
    return "PetFightCounterChange{m_fightCounter=" + this.czf + '}';
  }
}