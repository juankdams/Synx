import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class apW extends dzz
{
  protected static final Logger K = Logger.getLogger(apW.class);
  private long kD;
  private int bXf;
  private byte[] bXg;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.kD = localByteBuffer.getLong();
    this.bXf = localByteBuffer.getInt();

    this.bXg = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.bXg);

    return true;
  }

  public int getId() {
    return 6322;
  }

  public long gA() {
    return this.kD;
  }

  public int Vc() {
    return this.bXf;
  }

  public byte[] Vd() {
    return this.bXg;
  }
}