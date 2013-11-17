import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dEY extends cxw
{
  private short dhr;
  private short aFe;
  private byte eRb;

  public dEY()
  {
    this.bkH = -1L;
    this.ilv = -1L;
    this.eRb = -1;
    this.dhr = -1;
    this.aFe = -1;
  }

  public byte[] encode()
  {
    int i = 21;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.putLong(this.bkH);
    localByteBuffer.putShort(this.aFe);
    localByteBuffer.put(this.eRb);
    localByteBuffer.putLong(this.htC);
    localByteBuffer.putShort(this.dhr);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5215;
  }

  public void aC(short paramShort) {
    this.dhr = paramShort;
  }

  public void l(short paramShort) {
    this.aFe = paramShort;
  }

  public void setSourcePosition(byte paramByte) {
    this.eRb = paramByte;
  }

  public void hT(long paramLong) {
    K.warn("On essaie d'indiquer une source pour un message provenant forcément de l'inventaire temporaire");
  }
}