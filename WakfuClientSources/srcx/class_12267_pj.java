import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class pj
  implements dMx
{
  private static final Logger K = Logger.getLogger(pj.class);
  private String m_name;

  pj()
  {
  }

  pj(String paramString)
  {
    this.m_name = paramString;
  }

  public byte[] j() {
    byte[] arrayOfByte = dzp.qC(this.m_name);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4 + arrayOfByte.length);
    localByteBuffer.putInt(arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte);
    this.m_name = dzp.aJ(arrayOfByte);
  }

  public void a(aCu paramaCu) {
    try {
      paramaCu.setName(this.m_name);
    } catch (bvZ localbvZ) {
      K.error("Impossible de changer le nom du familier", localbvZ);
    }
  }

  public cQy wt() {
    return cQy.kBw;
  }

  public String toString()
  {
    return "PetNameChangeEvent{m_name='" + this.m_name + '\'' + '}';
  }
}