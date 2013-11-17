import java.nio.ByteBuffer;

public class bug extends aRw
{
  private int Rm;
  private boolean gdx;
  private long kD = -1L;

  public byte[] encode() {
    int i = 13;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.putInt(this.Rm);
    localByteBuffer.put((byte)(this.gdx ? 1 : 0));
    localByteBuffer.putLong(this.kD);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15401;
  }

  public void qV(int paramInt) {
    this.Rm = paramInt;
  }

  public void fo(boolean paramBoolean) {
    this.gdx = paramBoolean;
  }

  public void O(long paramLong) {
    this.kD = paramLong;
  }
}