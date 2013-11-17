public class cnS
{
  private final byte hVi;
  private final Xg hVj = new Xg(0);

  public cnS(byte paramByte) {
    this.hVi = paramByte;
  }

  public final void vU(int paramInt) {
    this.hVj.aV(paramInt);
  }

  public final void a(bGZ parambGZ) {
    this.hVj.put(parambGZ.getId(), parambGZ);
  }

  public final bGZ vV(int paramInt) {
    return (bGZ)this.hVj.get(paramInt);
  }

  public final bGZ vW(int paramInt) {
    return (bGZ)this.hVj.hc(paramInt);
  }

  public final int coe() {
    return this.hVj.size();
  }

  public final byte cof() {
    return this.hVi;
  }
}