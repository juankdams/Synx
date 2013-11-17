public class dAi
  implements Comparable
{
  private final short lGZ;
  private final short lHa;
  private final cds lHb;
  private final short gTZ;
  private final byte bvo;

  public dAi(short paramShort1, short paramShort2, short paramShort3, long paramLong, byte paramByte)
  {
    this.gTZ = paramShort1;
    this.lGZ = paramShort2;
    this.lHa = paramShort3;
    this.lHb = kb.J(paramLong);
    this.bvo = paramByte;
  }

  public short bVJ() {
    return this.gTZ;
  }

  public short ddw() {
    return this.lGZ;
  }

  public short ddx() {
    return this.lHa;
  }

  public cds ddy() {
    return this.lHb;
  }

  public boolean ddz() {
    return !this.lHb.rN();
  }

  public int b(dAi paramdAi) {
    return this.bvo - paramdAi.bvo;
  }
}