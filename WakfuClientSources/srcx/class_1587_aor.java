import java.nio.ByteBuffer;

public class aor extends dzz
{
  private long iI;
  private int Sk;
  private int dtt;
  private boolean dtu;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.iI = localByteBuffer.getLong();
    this.Sk = localByteBuffer.getInt();
    this.dtt = localByteBuffer.getInt();
    this.dtu = (localByteBuffer.get() == 1);
    return true;
  }

  public int getId() {
    return 15720;
  }

  public long eq() {
    return this.iI;
  }

  public int gC() {
    return this.Sk;
  }

  public int aAI() {
    return this.dtt;
  }

  public boolean aAJ() {
    return this.dtu;
  }
}