public class aiX
{
  public static final aiX dhv = new aiX(-1, -1, -1, new int[0]);
  private final int aw;
  private final int baj;
  private final int aPh;
  private final adz dhw = new adz();

  public aiX(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt) {
    this.aw = paramInt1;
    this.baj = paramInt2;
    this.aPh = paramInt3;
    this.dhw.n(paramArrayOfInt);
    this.dhw.o(cpR.hZa);
  }

  public int sY() {
    return this.aPh;
  }

  public adz avI() {
    return this.dhw;
  }

  public int getId() {
    return this.aw;
  }

  public boolean iN(int paramInt) {
    return this.dhw.contains(paramInt);
  }

  public int yC() {
    return this.baj;
  }

  public boolean avJ() {
    return this.aw == dhv.aw;
  }
}