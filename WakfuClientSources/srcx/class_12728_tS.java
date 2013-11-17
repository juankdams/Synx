import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class tS
  implements dMx
{
  private static final Logger K = Logger.getLogger(tS.class);
  private int bgt;

  tS()
  {
  }

  tS(int paramInt)
  {
    this.bgt = paramInt;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.bgt);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.bgt = paramByteBuffer.getInt();
  }

  public void a(aCu paramaCu) {
    try {
      paramaCu.lT(this.bgt);
    } catch (bvZ localbvZ) {
      K.error("Impossible de changer la couleur du familier", localbvZ);
    }
  }

  public cQy wt() {
    return cQy.kBD;
  }

  public String toString()
  {
    return "PetColorChange{m_colorItemRefId='" + this.bgt + '\'' + '}';
  }
}