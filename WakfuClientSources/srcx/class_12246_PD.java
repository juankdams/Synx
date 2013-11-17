public class PD
{
  private final int aw;
  private final short bNX;
  private final short aSh;
  private final short TD;
  private final cSi cic = new cSi();

  public PD(int paramInt, short paramShort1, short paramShort2, short paramShort3, int[] paramArrayOfInt) {
    this.aw = paramInt;
    this.bNX = paramShort1;
    this.aSh = paramShort2;
    this.TD = paramShort3;
    this.cic.add(paramArrayOfInt);
  }

  public int getId() {
    return this.aw;
  }

  public short Lk() {
    return this.TD;
  }

  public short nV() {
    return this.aSh;
  }

  public short Qb() {
    return this.bNX;
  }

  public boolean f(cIw paramcIw) {
    return this.cic.g(paramcIw);
  }
}