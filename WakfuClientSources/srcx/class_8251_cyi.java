import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class cyi
  implements dTK
{
  private static final Logger K = Logger.getLogger(cyi.class);
  private String Tl;

  cyi()
  {
  }

  cyi(String paramString)
  {
    this.Tl = paramString;
  }

  public byte[] j() {
    byte[] arrayOfByte = dzp.qC(this.Tl);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4 + arrayOfByte.length);
    localByteBuffer.putInt(arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte);
    this.Tl = dzp.aJ(arrayOfByte);
  }

  public void a(aGO paramaGO) {
    try {
      paramaGO.gA(this.Tl);
    } catch (dPr localdPr) {
      K.error("Impossible de changer le message", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJT;
  }

  public String toString()
  {
    return "MessageChange{m_message='" + this.Tl + '\'' + '}';
  }
}