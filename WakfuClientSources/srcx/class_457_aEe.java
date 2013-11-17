public class aEe
  implements Comparable
{
  private int dZw;
  private long aHS = -1L;
  private String dZx;
  private String Tl;
  private String dcJ;
  private final dxL dZy;
  private final long dZz;
  private boolean dZA;
  private static long bkH = -9223372036854775808L;

  public aEe(String paramString1, String paramString2) {
    this.dZx = paramString1;
    this.Tl = paramString2;
    this.dZy = aat.cOE.VN();
    if (bkH == 9223372036854775807L) {
      bkH = -9223372036854775808L;
    }
    this.dZz = (bkH++);
  }

  public aEe(String paramString) {
    this(null, paramString);
  }

  public aEe(long paramLong, String paramString) {
    this(paramString);
    this.aHS = paramLong;
  }

  public aEe(String paramString1, long paramLong, String paramString2) {
    this(paramString1, paramString2);
    this.aHS = paramLong;
  }

  public int aQj() {
    return this.dZw;
  }

  public void mm(int paramInt) {
    this.dZw = paramInt;
  }

  public long aQk() {
    return this.aHS;
  }

  public String getSourceName() {
    return this.dZx;
  }

  public void setSourceName(String paramString) {
    this.dZx = paramString;
  }

  public String getMessage() {
    return this.Tl;
  }

  public void setMessage(String paramString) {
    this.Tl = paramString;
  }

  public dxL aQl() {
    return this.dZy;
  }

  public void setColor(String paramString) {
    this.dcJ = paramString;
  }

  public String getColor() {
    return this.dcJ;
  }

  public boolean isResizable() {
    return this.dZA;
  }

  public void setResizable(boolean paramBoolean) {
    this.dZA = paramBoolean;
  }

  public int e(aEe paramaEe) {
    int i = this.dZy.U(paramaEe.dZy);
    if (i == 0) {
      return (int)(this.dZz - paramaEe.dZz);
    }

    return i;
  }
}