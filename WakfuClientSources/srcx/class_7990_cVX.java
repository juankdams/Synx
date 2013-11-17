import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cVX
{
  private int aw;
  private int kIy;
  private boolean kIz;
  private boolean kIA;
  private String kIB;
  private String kIC;

  public final int getId()
  {
    return this.aw;
  }

  public final int cKn() {
    return this.kIy;
  }

  public final String cKo() {
    return this.kIC;
  }

  public final String cKp() {
    return this.kIB;
  }

  public final boolean cKq() {
    return this.kIz;
  }

  public final boolean cKr() {
    return this.kIA;
  }

  public final byte[] j() {
    ByteBuffer localByteBuffer = null;
    try
    {
      byte[] arrayOfByte1 = this.kIB == null ? new byte[0] : this.kIB.getBytes("UTF-8");
      byte[] arrayOfByte2 = this.kIC == null ? new byte[0] : this.kIC.getBytes("UTF-8");

      localByteBuffer = ByteBuffer.allocate(9 + arrayOfByte1.length + 4 + 1 + 4 + arrayOfByte2.length);

      localByteBuffer.putInt(this.aw);
      localByteBuffer.put((byte)(this.kIz ? 1 : 0));

      localByteBuffer.putInt(arrayOfByte1.length);
      localByteBuffer.put(arrayOfByte1);

      localByteBuffer.put((byte)(this.kIA ? 1 : 0));
      localByteBuffer.putInt(this.kIy);
      localByteBuffer.putInt(arrayOfByte2.length);
      localByteBuffer.put(arrayOfByte2);
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      cnq.ch().error("Exception", localUnsupportedEncodingException);
    }

    return localByteBuffer.array();
  }

  public final void iL(boolean paramBoolean) {
    this.kIz = paramBoolean;
  }

  public final void iM(boolean paramBoolean) {
    this.kIA = paramBoolean;
  }

  public final void d(int paramInt) {
    this.aw = paramInt;
  }

  public final void zh(int paramInt) {
    this.kIy = paramInt;
  }

  public final void oB(String paramString) {
    this.kIC = paramString;
  }

  public final void oC(String paramString) {
    this.kIB = paramString;
  }

  public final void v(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aw = localByteBuffer.getInt();
    this.kIz = (localByteBuffer.get() == 1);
    try
    {
      byte[] arrayOfByte1 = new byte[localByteBuffer.getInt()];
      localByteBuffer.get(arrayOfByte1);
      this.kIB = new String(arrayOfByte1, "UTF-8").intern();

      this.kIA = (localByteBuffer.get() == 1);
      this.kIy = localByteBuffer.getInt();
      byte[] arrayOfByte2 = new byte[localByteBuffer.getInt()];
      localByteBuffer.get(arrayOfByte2);
      this.kIC = new String(arrayOfByte2, "UTF-8").intern();
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      cnq.i().error("Exception", localUnsupportedEncodingException);
    }
  }
}