import java.nio.ByteBuffer;

public abstract class drI
{
  protected int lub = -1;
  private uz UI;
  private cSJ luc;
  private long lud;
  private float hYN;
  private float eVG;
  private float eVH;
  private float hYM;

  public drI()
  {
    this.hYN = 0.0F;
    this.eVG = 1.0F;
    this.eVH = 0.0F;
    this.hYM = 1.0F;
    this.lud = this.lub;
  }

  protected void initialize()
  {
    this.UI = new cdg(bPg.bVP(), 32, 32, false);
    this.luc = this.UI.wn(0);
    this.luc.eF(cIB());
    cYu();
    this.lud = -1L;
  }

  public abstract byte cIB();

  public void w(bSr parambSr) {
    long l = cYt();

    if ((l == this.lud) || (l == this.lub)) {
      return;
    }
    ByteBuffer localByteBuffer = getImageData();
    if (localByteBuffer == null) {
      return;
    }
    this.luc.a(localByteBuffer, getImageWidth(), getImageHeight());
    this.UI.h(parambSr);
    cYu();

    this.lud = l; } 
  protected abstract int getImageWidth();

  protected abstract int getImageHeight();

  protected abstract long cYt();

  protected abstract ByteBuffer getImageData();

  private void cYu() { MD localMD = this.UI.wo(0);
    float f1 = getImageWidth();
    float f2 = getImageHeight();

    this.hYN = 0.0F;
    this.eVG = (f2 / localMD.getY());
    this.eVH = 0.0F;
    this.hYM = (f1 / localMD.getX()); }

  public boolean cYv()
  {
    return this.UI != null;
  }

  public uz hN() {
    return this.UI;
  }

  public float bjM() {
    return this.hYN;
  }

  public float bjL() {
    return this.eVG;
  }

  public float bjJ() {
    return this.eVH;
  }

  public float bjK() {
    return this.hYM;
  }

  public int cYw() {
    return getImageWidth();
  }

  public int cYx() {
    return getImageHeight();
  }
}