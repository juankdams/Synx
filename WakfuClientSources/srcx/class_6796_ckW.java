public class ckW
{
  private String bYJ;
  private int hMw;
  private String hMx;
  private boolean hMy = false;

  private boolean hMz = false;

  private boolean hMA = false;

  private boolean hMB = false;

  private boolean hMC = false;

  private bVH hMD = null;

  private boolean bur = true;
  private String hME;
  private String hMF;
  private int hMG;
  private String hMH;

  public ckW(String paramString1, int paramInt, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, String paramString3)
  {
    this.bYJ = paramString1;
    this.hMw = paramInt;
    this.hMx = paramString2;
    this.hMy = paramBoolean1;
    this.hMz = paramBoolean2;
    this.hMA = paramBoolean3;
    this.hMC = paramBoolean4;
    this.hMB = paramBoolean5;
    this.hMH = paramString3;
    cmH();
  }

  private void cmH() {
    this.hMG = EE.a(this.hMA, this.hMz, this.hMy);
  }

  public String cmI() {
    return this.hMx;
  }

  public int getKeyCode() {
    return this.hMw;
  }

  public void hh(boolean paramBoolean) {
    this.hMy = paramBoolean;
  }

  public void hi(boolean paramBoolean) {
    this.hMz = paramBoolean;
  }

  public void hj(boolean paramBoolean) {
    this.hMA = paramBoolean;
  }

  public boolean cmJ() {
    return this.hMy;
  }

  public boolean cmK() {
    return this.hMz;
  }

  public boolean cmL() {
    return this.hMA;
  }

  public boolean cmM() {
    return this.hMB;
  }

  public void hk(boolean paramBoolean) {
    this.hMB = paramBoolean;
  }

  public String getId() {
    return this.bYJ;
  }

  public void setId(String paramString) {
    this.bYJ = paramString;
  }

  public boolean vG(int paramInt) {
    return this.hMw == paramInt;
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean) {
    this.bur = paramBoolean;
  }

  public void a(bVH parambVH) {
    this.hMD = parambVH;
  }

  public bVH cmN() {
    return this.hMD;
  }

  public String bwq() {
    return this.hME;
  }

  public void lo(String paramString) {
    this.hME = paramString;
  }

  public String getCategory() {
    return this.hMF;
  }

  public void setCategory(String paramString) {
    this.hMF = paramString;
  }

  public void setKeyCode(int paramInt) {
    this.hMw = paramInt;
  }

  public int cmO() {
    return this.hMG;
  }

  public void vH(int paramInt) {
    this.hMG = paramInt;

    this.hMA = ((this.hMG & 0x40) == 64);
    this.hMz = ((this.hMG & 0x200) == 512);
    this.hMy = ((this.hMG & 0x80) == 128);
  }

  public void lp(String paramString) {
    this.hMx = paramString;
  }

  public String cmP() {
    return this.hMH;
  }

  public void lq(String paramString) {
    this.hMH = paramString;
  }

  public boolean cmQ() {
    return this.hMC;
  }

  public ckW cmR() {
    ckW localckW = new ckW(this.bYJ, this.hMw, this.hMx, this.hMy, this.hMz, this.hMA, this.hMC, this.hMB, this.hMH);

    localckW.hME = this.hME;
    localckW.hMF = this.hMF;

    return localckW;
  }
}