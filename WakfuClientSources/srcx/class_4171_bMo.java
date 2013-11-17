public class bMo extends coS
{
  private final String kd;

  public bMo(cMS paramcMS, String paramString1, String paramString2)
  {
    super(paramcMS, paramString1);
    this.kd = paramString2;
  }

  public bMo(cMS paramcMS, String paramString1, int paramInt, String paramString2) {
    super(paramcMS, paramString1, paramInt);
    this.kd = paramString2;
  }

  public bMo(cMS paramcMS, String paramString1, int paramInt1, int paramInt2, String paramString2) {
    super(paramcMS, paramString1, paramInt1, paramInt2);
    this.kd = paramString2;
  }

  public String bTI() {
    return this.kd;
  }
}