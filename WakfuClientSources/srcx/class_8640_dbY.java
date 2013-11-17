import java.nio.ByteBuffer;

public class dbY
{
  private long aTz;
  private byte kUD;
  private byte kUE;
  private short kUF;
  private short kUG;

  public dbY(byte paramByte1, short paramShort1, byte paramByte2, short paramShort2)
  {
    this.kUD = paramByte1;
    this.kUF = paramShort1;
    this.kUE = paramByte2;
    this.kUG = paramShort2;
    cNN();
  }

  public dbY(long paramLong) {
    this.aTz = paramLong;
    int i = bCO.gs(paramLong);
    int j = bCO.gt(paramLong);
    this.kUD = ((byte)bCO.sg(i));
    this.kUE = ((byte)bCO.sh(i));
    this.kUF = bCO.sg(j);
    this.kUG = bCO.sh(j);
  }

  public byte cNJ() {
    return this.kUD;
  }

  public short cNK() {
    return this.kUF;
  }

  public byte cNL() {
    return this.kUE;
  }

  public short cNM() {
    return this.kUG;
  }

  public long getId() {
    if (this.aTz == 0L)
      cNN();
    return this.aTz;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(bCO.l(this.kUD, this.kUE));
    paramByteBuffer.putInt(bCO.G(this.kUF, this.kUG));
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    short s = paramByteBuffer.getShort();
    int i = paramByteBuffer.getInt();

    this.kUD = bCO.cp(s);
    this.kUE = bCO.cq(s);
    this.kUF = bCO.sg(i);
    this.kUG = bCO.sh(i);

    cNN();

    return true;
  }

  private void cNN() {
    int i = bCO.G((short)this.kUD, (short)this.kUE);
    int j = bCO.G(this.kUF, this.kUG);
    this.aTz = bCO.cM(i, j);
  }

  public int O() {
    return 6;
  }

  public String toString()
  {
    return "GuildBlazon{m_shapeId=" + this.kUD + ", m_symbolId=" + this.kUE + ", m_shapeColor=" + this.kUF + ", m_symbolColor=" + this.kUG + '}';
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof dbY)) {
      return false;
    }
    dbY localdbY = (dbY)paramObject;

    if (this.aTz != localdbY.aTz) {
      return false;
    }
    return true;
  }

  public int hashCode()
  {
    return (int)(this.aTz ^ this.aTz >>> 32);
  }
}