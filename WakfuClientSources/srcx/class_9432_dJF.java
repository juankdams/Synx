import java.nio.ByteBuffer;

public class dJF extends dzz
{
  private long dPu;
  private int lVm;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dPu = localByteBuffer.getLong();
    this.lVm = localByteBuffer.getInt();
    return true;
  }

  public long aKF() {
    return this.dPu;
  }

  public int diU() {
    return this.lVm;
  }

  public int getId()
  {
    return 13102;
  }

  public String toString()
  {
    return "GemResultMessage{m_gemmedItemId" + this.dPu + ", m_gemRefItemId" + this.lVm + '}';
  }
}