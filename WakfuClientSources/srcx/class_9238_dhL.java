import java.nio.ByteBuffer;

public class dhL
{
  private final long aTz;
  private final int dFY;
  private final byte erX;
  private final int eec;
  private short ldC;

  public dhL(long paramLong, int paramInt1, bCe parambCe, int paramInt2)
  {
    this.aTz = paramLong;
    this.dFY = paramInt1;
    this.erX = parambCe.ewr;
    this.eec = paramInt2;
    this.ldC = 0;
  }

  public dhL(long paramLong, int paramInt1, bCe parambCe, int paramInt2, short paramShort) {
    this.aTz = paramLong;
    this.dFY = paramInt1;
    this.erX = parambCe.ewr;
    this.eec = paramInt2;
    this.ldC = paramShort;
  }

  public long getId() {
    return this.aTz;
  }

  public int aFY() {
    return this.dFY;
  }

  public bCe Hy() {
    return bCe.dm(this.erX);
  }

  public int bdJ() {
    return this.eec;
  }

  public short cRs() {
    return this.ldC;
  }

  public int cRt() {
    return this.ldC * this.eec;
  }

  public void eg(short paramShort) {
    this.ldC = ((short)(this.ldC + paramShort));
  }

  public byte[] bdN() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(19);
    localByteBuffer.putLong(this.aTz);
    localByteBuffer.putInt(this.dFY);
    localByteBuffer.put(this.erX);
    localByteBuffer.putInt(this.eec);
    localByteBuffer.putShort(this.ldC);
    return localByteBuffer.array();
  }

  public static dhL aJ(ByteBuffer paramByteBuffer) {
    long l = paramByteBuffer.getLong();
    int i = paramByteBuffer.getInt();
    bCe localbCe = bCe.dm(paramByteBuffer.get());
    int j = paramByteBuffer.getInt();
    short s = paramByteBuffer.getShort();

    return new dhL(l, i, localbCe, j, s);
  }

  public String toString() {
    return "MarketHistoryEntry{m_id=" + this.aTz + ", m_itemRefId=" + this.dFY + ", m_packType=" + this.erX + ":" + Hy() + ", m_packPrice=" + this.eec + ", m_packSoldNumber=" + this.ldC + '}';
  }
}