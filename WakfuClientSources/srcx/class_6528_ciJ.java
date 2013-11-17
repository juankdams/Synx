public class ciJ
  implements Ed
{
  private final int aDH;
  private final int gdo;
  private final cZR hHX;
  private final cSi hHY;
  private final cSi hHZ;

  public ciJ(int paramInt1, int paramInt2, cZR paramcZR)
  {
    this.aDH = paramInt1;
    this.gdo = paramInt2;
    this.hHX = paramcZR;

    this.hHY = new cSi();
    this.hHZ = new cSi();
  }

  public void vq(int paramInt) {
    if (!this.hHY.contains(paramInt))
      this.hHY.add(paramInt);
  }

  public void vr(int paramInt) {
    if (!this.hHZ.contains(paramInt))
      this.hHZ.add(paramInt);
  }

  public int nn() {
    return this.aDH;
  }

  public cSi ckz() {
    return this.hHY;
  }

  public cSi ckA() {
    return this.hHZ;
  }

  public int ok() {
    return this.aDH;
  }

  public int ckB() {
    return this.gdo;
  }

  public cZR ckC() {
    return this.hHX;
  }
}