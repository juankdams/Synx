import java.nio.ByteBuffer;

public class dPQ
  implements auY
{
  public static final ccY Sd = new cP();
  private long cfv;
  private byte dMs;

  public dPQ(long paramLong, byte paramByte)
  {
    this.cfv = paramLong;
    this.dMs = paramByte;
  }

  private dPQ() {
  }

  public int O() {
    return 9;
  }

  public void v(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.cfv);
    paramByteBuffer.put(this.dMs);
  }

  public void w(ByteBuffer paramByteBuffer) {
    this.cfv = paramByteBuffer.getLong();
    this.dMs = paramByteBuffer.get();
  }

  public aHB um() {
    return aHB.efx;
  }

  public long anE() {
    return this.cfv;
  }

  public byte getDestinationPosition() {
    return this.dMs;
  }

  public String toString()
  {
    return "InventoryMoveItemAction{m_itemId=" + this.cfv + ", m_destinationPosition=" + this.dMs + '}';
  }
}