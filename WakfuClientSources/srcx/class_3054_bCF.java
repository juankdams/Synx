import java.util.ArrayList;

public class bCF
  implements agn, bSl
{
  private float dcl;
  private float dcm;
  private float cQv;
  private int kO = -2147483648;
  private int kP = -2147483648;
  private int kQ;
  private ArrayList dcp;

  public bCF()
  {
  }

  public bCF(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.dcl = paramFloat1;
    this.dcm = paramFloat2;
    this.cQv = paramFloat3;
  }

  public bCF(bSl parambSl) {
    this(parambSl.getWorldX(), parambSl.getWorldY(), parambSl.getAltitude());
  }

  public float atu() {
    return 0.0F;
  }

  public short fc() {
    return (short)bCO.bD(this.cQv);
  }

  public float getAltitude() {
    return this.cQv;
  }

  public int fa() {
    return bCO.bC(this.dcl);
  }

  public int fb() {
    return bCO.bC(this.dcm);
  }

  public float getWorldX() {
    return this.dcl;
  }

  public float getWorldY() {
    return this.dcm;
  }

  public void x(float paramFloat1, float paramFloat2) {
    this.dcl = paramFloat1;
    this.dcm = paramFloat2;
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.dcl = paramFloat1;
    this.dcm = paramFloat2;
    this.cQv = paramFloat3;
  }

  public int getScreenX() {
    return this.kO;
  }

  public int getScreenY() {
    return this.kP;
  }

  public void setScreenX(int paramInt) {
    if (this.kO == paramInt) {
      return;
    }

    this.kO = paramInt;
    atF();
  }

  public void setScreenY(int paramInt) {
    if (this.kP == paramInt) {
      return;
    }

    this.kP = paramInt;
    atF();
  }

  public void T(int paramInt) {
    if (this.kQ == paramInt) {
      return;
    }

    this.kQ = paramInt;
    atF();
  }

  public int eY() {
    return this.kQ;
  }

  public boolean eZ() {
    return (this.kO != -2147483648) && (this.kP != -2147483648);
  }

  public void a(bUe parambUe) {
    if (this.dcp == null) {
      this.dcp = new ArrayList();
    }
    this.dcp.add(parambUe);
  }

  public void b(bUe parambUe) {
    if (this.dcp == null) {
      return;
    }
    this.dcp.remove(parambUe);

    if (this.dcp.isEmpty()) {
      this.dcp = null;
      this.kO = -2147483648;
      this.kP = -2147483648;
    }
  }

  protected void atF() {
    if (this.dcp != null)
      for (int i = 0; i < this.dcp.size(); i++)
        ((bUe)this.dcp.get(i)).a(this, this.kO, this.kP, this.kQ);
  }

  public boolean isVisible()
  {
    return true;
  }
}