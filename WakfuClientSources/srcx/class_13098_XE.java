import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class XE
{
  private int aw;
  private int aTm;
  private int RZ;
  private short cHY;
  private int bvk;
  private int bvl;
  private int cHZ;
  private String Sj;
  private boolean bUX;
  private byte bvo;

  public final String gB()
  {
    return this.Sj;
  }

  public final int ajB() {
    return this.aTm;
  }

  public final int getId() {
    return this.aw;
  }

  public final byte IS() {
    return this.bvo;
  }

  public final boolean IR() {
    return this.bUX;
  }

  public int gw() {
    return this.RZ;
  }

  public short ajC() {
    return this.cHY;
  }

  public int IT() {
    return this.bvk;
  }

  public int IQ() {
    return this.bvl;
  }

  public int ajD() {
    return this.cHZ;
  }

  public final byte[] j()
  {
    byte[] arrayOfByte = dzp.qC(this.Sj);
    int i = arrayOfByte.length;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(32 + i);

    localByteBuffer.putInt(this.aw);
    localByteBuffer.put(this.bvo);
    localByteBuffer.putInt(this.aTm);

    localByteBuffer.putInt(arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);

    localByteBuffer.put((byte)(this.bUX ? 1 : 0));

    localByteBuffer.putInt(this.RZ);
    localByteBuffer.putShort(this.cHY);

    localByteBuffer.putInt(this.bvk);
    localByteBuffer.putInt(this.bvl);
    localByteBuffer.putInt(this.cHZ);

    return localByteBuffer.array();
  }

  public final void dP(String paramString)
  {
    this.Sj = paramString;
  }

  public final void hj(int paramInt) {
    this.aTm = paramInt;
  }

  public final void d(int paramInt) {
    this.aw = paramInt;
  }

  public void aB(byte paramByte) {
    this.bvo = paramByte;
  }

  public final void bB(boolean paramBoolean) {
    this.bUX = paramBoolean;
  }

  public void ab(int paramInt) {
    this.RZ = paramInt;
  }

  public void ak(short paramShort) {
    this.cHY = paramShort;
  }

  public void hk(int paramInt) {
    this.bvk = paramInt;
  }

  public void hl(int paramInt) {
    this.bvl = paramInt;
  }

  public void hm(int paramInt) {
    this.cHZ = paramInt;
  }

  public final void v(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aw = localByteBuffer.getInt();
    this.bvo = localByteBuffer.get();
    this.aTm = localByteBuffer.getInt();

    byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
    localByteBuffer.get(arrayOfByte);
    try {
      this.Sj = new String(arrayOfByte, "UTF-8").intern();
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      cnq.an().error("Exception", localUnsupportedEncodingException);
    }

    this.bUX = (localByteBuffer.get() == 1);

    this.RZ = localByteBuffer.getInt();
    this.cHY = localByteBuffer.getShort();

    this.bvk = localByteBuffer.getInt();
    this.bvl = localByteBuffer.getInt();
    this.cHZ = localByteBuffer.getInt();
  }
}