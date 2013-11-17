final class ahn
  implements dkI
{
  private final int aw;
  private final int cuh;
  private final int dcH;
  private final String dcI;
  private final String dcJ;
  private final aRk[] dcK;

  ahn(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, aRk[] paramArrayOfaRk)
  {
    this.aw = paramInt1;
    this.cuh = paramInt2;
    this.dcH = paramInt3;
    this.dcI = paramString1;
    this.dcJ = paramString2;
    this.dcK = paramArrayOfaRk;
  }

  public String agf() {
    return this.dcI;
  }

  public int agg() {
    return this.cuh;
  }

  public String getColor() {
    return this.dcJ;
  }

  public int agh() {
    return this.dcH;
  }

  public boolean a(aRk paramaRk) {
    for (int i = 0; i < this.dcK.length; i++) {
      if (this.dcK[i].equals(paramaRk))
        return true;
    }
    return false;
  }

  public int getId() {
    return this.aw;
  }
}