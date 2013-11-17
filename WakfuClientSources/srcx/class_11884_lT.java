public class lT
  implements bFp
{
  private final int aw;
  private final int aPF;
  private final int aPG;
  private final cds aPH;
  private final dxL aPI;
  private dxL aPJ;

  public lT(int paramInt1, int paramInt2, int paramInt3, dxL paramdxL1, cds paramcds, dxL paramdxL2)
  {
    this.aw = paramInt1;
    this.aPF = paramInt2;
    this.aPH = paramcds;
    this.aPI = paramdxL1;
    this.aPJ = paramdxL2;
    this.aPG = (paramcds.isEmpty() ? 0 : paramInt3);
  }

  public int getId() {
    return this.aw;
  }

  public int ts() {
    return this.aPF;
  }

  public int tt() {
    return this.aPG;
  }

  public cds tu() {
    return this.aPH;
  }

  public dxL tv() {
    return this.aPI;
  }

  public dxL tw() {
    return this.aPJ;
  }
}