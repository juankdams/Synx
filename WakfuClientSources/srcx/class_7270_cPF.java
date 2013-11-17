import java.nio.ByteBuffer;

public class cPF extends dzz
{
  private int dfl;
  private dxL hJe;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.dfl = localByteBuffer.getInt();
    this.hJe = cYq.jq(localByteBuffer.getLong());

    return true;
  }

  public dxL aIl() {
    return this.hJe;
  }

  public int coC() {
    return this.dfl;
  }

  public int getId()
  {
    return 15500;
  }
}