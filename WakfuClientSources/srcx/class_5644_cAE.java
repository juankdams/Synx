public class cAE
{
  public byte[] iqt;
  public int iqu;
  public int iqv;
  public int iqw;
  public int iqx;
  public long iqy;
  public long gSE;

  void clear()
  {
    this.iqu = 0;
    this.iqv = 0;
    this.iqw = 0;
    this.iqx = 0;
    this.iqt = null;
    this.iqy = 0L;
    this.gSE = 0L;
  }

  public void xo() {
    clear();
  }
}