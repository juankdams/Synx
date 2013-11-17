import java.nio.ByteBuffer;

public class axb
  implements auY
{
  public static final ccY Sd = new bEo();
  private long cfv;
  private short aFe;
  private byte dMs;

  public axb(long paramLong, short paramShort)
  {
    this.cfv = paramLong;
    this.aFe = paramShort;
    this.dMs = -1;
  }

  public axb(long paramLong, short paramShort, byte paramByte) {
    this.cfv = paramLong;
    this.aFe = paramShort;
    this.dMs = paramByte;
  }

  private axb() {
  }

  public int O() {
    return 11;
  }

  public void v(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.cfv);
    paramByteBuffer.putShort(this.aFe);
    paramByteBuffer.put(this.dMs);
  }

  public void w(ByteBuffer paramByteBuffer) {
    this.cfv = paramByteBuffer.getLong();
    this.aFe = paramByteBuffer.getShort();
    this.dMs = paramByteBuffer.get();
  }

  public aHB um() {
    return aHB.efv;
  }

  public long anE() {
    return this.cfv;
  }

  public short nP() {
    return this.aFe;
  }

  public byte getDestinationPosition() {
    return this.dMs;
  }

  public String toString()
  {
    return "InventoryAddItemAction{m_itemId=" + this.cfv + ", m_quantity=" + this.aFe + ", m_destinationPosition=" + this.dMs + '}';
  }
}