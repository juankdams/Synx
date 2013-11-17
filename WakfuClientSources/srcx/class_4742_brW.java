public class brW
{
  private final int aw;
  private final short fOf;
  private final byte dzE;
  private short fOg;
  private short dzG;
  private short dzH;
  private short dzI;

  public brW(int paramInt, short paramShort, byte paramByte)
  {
    this.aw = paramInt;
    this.fOf = paramShort;
    this.dzE = paramByte;
  }

  public int getId() {
    return this.aw;
  }

  public short arI() {
    return this.fOf;
  }

  public byte aDI() {
    return this.dzE;
  }

  public void b(short paramShort1, short paramShort2, short paramShort3, short paramShort4) {
    this.fOg = paramShort1;
    this.dzG = paramShort2;
    this.dzH = paramShort3;
    this.dzI = paramShort4;
  }

  public short bAp() {
    return this.fOg;
  }

  public short aDK() {
    return this.dzG;
  }

  public short aDL() {
    return this.dzH;
  }

  public short aDM() {
    return this.dzI;
  }
}