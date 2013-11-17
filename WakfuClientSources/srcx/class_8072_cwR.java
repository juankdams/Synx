public class cwR
{
  private final int aw;
  private final bZA aB;
  private final byte gBM;

  public cwR(int paramInt, bZA parambZA, byte paramByte)
  {
    this.aw = paramInt;
    this.aB = parambZA;
    this.gBM = paramByte;
  }

  public boolean a(dzI paramdzI, cRg paramcRg) {
    return (this.aB == null) || (this.aB.i(paramdzI, paramcRg, this, paramdzI.ayL()));
  }

  public int getId() {
    return this.aw;
  }

  public byte xH() {
    return this.gBM;
  }
}