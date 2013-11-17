public class coS
{
  private static final int hXN = 300;
  private cMS aCo;
  private String Tl;
  private int aCk = 300;
  private int aKS = 2147483647;

  public coS(cMS paramcMS, String paramString) {
    this.aCo = paramcMS;
    this.Tl = paramString;
  }

  public coS(cMS paramcMS, String paramString, int paramInt) {
    this.aCo = paramcMS;
    this.Tl = paramString;
    this.aKS = paramInt;
  }

  public coS(cMS paramcMS, String paramString, int paramInt1, int paramInt2) {
    this.aCo = paramcMS;
    this.Tl = paramString;
    this.aCk = paramInt1;
    this.aKS = paramInt2;
  }

  public int coI() {
    return this.aCk;
  }

  public int getDuration() {
    return this.aKS;
  }

  public cMS mn() {
    return this.aCo;
  }

  public String getMessage() {
    return this.Tl;
  }

  public void wb(int paramInt) {
    this.aCk = paramInt;
  }

  public void setDuration(int paramInt) {
    this.aKS = paramInt;
  }
}