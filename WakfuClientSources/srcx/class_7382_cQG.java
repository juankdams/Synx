public class cQG
{
  private long kCa;
  private long kCb;
  private byte kCc;
  private short kCd;
  private byte bvo;
  private int kCe;

  public cQG()
  {
  }

  public cQG(long paramLong, byte paramByte1, short paramShort, byte paramByte2)
  {
    this(paramLong, paramByte1, paramShort, paramByte2, 1);
  }

  public cQG(long paramLong, byte paramByte1, short paramShort, byte paramByte2, int paramInt) {
    this(paramLong, paramLong, paramByte1, paramShort, paramByte2, paramInt);
  }

  public cQG(long paramLong1, long paramLong2, byte paramByte1, short paramShort, byte paramByte2, int paramInt) {
    this.kCa = paramLong1;
    this.kCb = paramLong2;
    this.kCc = paramByte1;
    this.kCd = paramShort;
    this.bvo = paramByte2;
    this.kCe = paramInt;
  }

  public long cHs() {
    return this.kCa;
  }

  public long cHt() {
    return this.kCb == -1L ? this.kCa : this.kCb;
  }

  public byte cHu() {
    return this.kCc;
  }

  public short cHv() {
    return this.kCd;
  }

  public byte IS() {
    return this.bvo;
  }

  public int cHw() {
    return this.kCe;
  }

  public void d(aYQ paramaYQ) {
    this.kCa = paramaYQ.readLong();
    this.kCb = paramaYQ.readLong();
    this.kCc = paramaYQ.readByte();
    this.kCd = paramaYQ.readShort();
    this.bvo = paramaYQ.readByte();
    this.kCe = paramaYQ.readInt();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeLong(this.kCa);
    paramdSw.writeLong(this.kCb);
    paramdSw.writeByte(this.kCc);
    paramdSw.writeShort(this.kCd);
    paramdSw.writeByte(this.bvo);
    paramdSw.writeInt(this.kCe);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }

    if (!(paramObject instanceof cQG)) {
      return false;
    }

    cQG localcQG = (cQG)paramObject;
    return (this.kCa == localcQG.kCa) && (this.kCb == localcQG.kCb) && (this.kCc == localcQG.kCc) && (this.kCd == localcQG.kCd) && (this.bvo == localcQG.bvo) && (this.kCe == localcQG.kCe);
  }
}