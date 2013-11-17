import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

class bCt
  implements dTK
{
  private static final Logger K = Logger.getLogger(bCt.class);
  private String aLm;

  bCt()
  {
  }

  bCt(String paramString)
  {
    this.aLm = paramString;
  }

  public byte[] j() {
    byte[] arrayOfByte = dzp.qC(this.aLm);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4 + arrayOfByte.length);
    localByteBuffer.putInt(arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte);
    this.aLm = dzp.aJ(arrayOfByte);
  }

  public void a(aGO paramaGO) {
    try {
      paramaGO.gz(this.aLm);
    } catch (dPr localdPr) {
      K.error("Impossible de changer la description", localdPr);
    }
  }

  public bIY k() {
    return bIY.gJS;
  }

  public String toString()
  {
    return "DescriptionChange{m_description='" + this.aLm + '\'' + '}';
  }
}