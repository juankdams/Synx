public enum cSO
  implements ccI
{
  private final int aw;
  private final boolean aTo;
  private final int ib;
  private final boolean kFw;
  private final int kFx;
  private final float kFy;
  private final String aKM;

  private cSO(int paramInt2, boolean paramBoolean2, int paramInt3, boolean paramFloat, int paramString, float arg8, String arg9)
  {
    this.aw = paramInt2;
    this.aTo = paramBoolean2;
    this.ib = paramInt3;
    this.kFw = paramFloat;
    this.kFx = paramString;
    Object localObject1;
    this.kFy = localObject1;
    Object localObject2;
    this.aKM = localObject2;
  }

  public final boolean bZ() {
    return this.aTo;
  }

  public final int getHeight() {
    return this.ib;
  }

  public final boolean cIH() {
    return this.kFw;
  }

  public final int cII() {
    return this.kFx;
  }

  public final float cIJ() {
    return this.kFy;
  }

  public final String bK() {
    return String.valueOf(this.aw);
  }

  public final String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public static boolean b(cSO paramcSO) {
    return (paramcSO == kFt) || (paramcSO == kFq);
  }

  public static boolean c(cSO paramcSO) {
    return (paramcSO == kFq) || (paramcSO == kFu) || (paramcSO == kFr);
  }
}