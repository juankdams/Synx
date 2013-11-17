import java.nio.ByteBuffer;

public class cjz
  implements auY
{
  public static final ccY Sd = new bXl();
  private long cfv;
  private short aFe;
  private long htC;
  private byte dMs;

  public cjz(long paramLong1, short paramShort, long paramLong2, byte paramByte)
  {
    this.cfv = paramLong1;
    this.aFe = paramShort;
    this.htC = paramLong2;
    this.dMs = paramByte;
  }

  private cjz() {
  }

  public long anE() {
    return this.cfv;
  }

  public short nP() {
    return this.aFe;
  }

  public long clk() {
    return this.htC;
  }

  public byte getDestinationPosition() {
    return this.dMs;
  }

  public int O() {
    return 19;
  }

  public void v(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.cfv);
    paramByteBuffer.putShort(this.aFe);
    paramByteBuffer.putLong(this.htC);
    paramByteBuffer.put(this.dMs);
  }

  public void w(ByteBuffer paramByteBuffer) {
    this.cfv = paramByteBuffer.getLong();
    this.aFe = paramByteBuffer.getShort();
    this.htC = paramByteBuffer.getLong();
    this.dMs = paramByteBuffer.get();
  }

  public aHB um() {
    return aHB.efw;
  }

  public String toString()
  {
    return "InventoryRemoveItemAction{m_itemId=" + this.cfv + ", m_quantity=" + this.aFe + ", m_destinationId=" + this.htC + ", m_destinationPosition=" + this.dMs + '}';
  }
}