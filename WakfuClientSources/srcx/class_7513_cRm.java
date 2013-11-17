public class cRm extends cnS
{
  private final cSO kDA;
  private final float[] kDB;
  private final float kDC;

  public cRm(byte paramByte, cSO paramcSO, float[] paramArrayOfFloat, float paramFloat)
  {
    super(paramByte);
    this.kDA = paramcSO;

    this.kDB = paramArrayOfFloat;
    this.kDC = paramFloat;
  }

  public cSO cHM() {
    return this.kDA;
  }

  public float[] cHN() {
    return this.kDB;
  }

  public float cHO() {
    return this.kDC;
  }

  public boolean cHP() {
    return this.kDB != null;
  }
}