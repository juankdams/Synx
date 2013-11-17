import java.nio.ByteBuffer;

public class Qc extends aRw
{
  private short bmv;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);

    localByteBuffer.putShort(this.bmv);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 5249;
  }

  public void T(short paramShort) {
    this.bmv = paramShort;
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MergeIntoItemSetRequestMessage");
    localStringBuilder.append("{m_itemSetId=").append(this.bmv);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}