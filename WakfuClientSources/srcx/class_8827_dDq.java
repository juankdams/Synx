import java.util.ArrayList;

public final class dDq
{
  private int ia;
  private int ib;
  public float eVH;
  public float hYM;
  public float hYN;
  public float eVG;
  private uz UI;
  private int hY;
  private int hZ;
  private boolean lLz;
  private boolean lLA;
  private boolean gWe = false;
  private boolean gWf = false;

  private bOo lLB = bOo.gTu;

  private final ArrayList lLC = new ArrayList();

  public dDq() {
    this.hY = 0;
    this.hZ = 0;
    this.ia = -1;
    this.ib = -1;
    this.lLA = true;
  }

  public dDq(uz paramuz) {
    if ((!bB) && (paramuz == null)) throw new AssertionError();

    this.UI = paramuz;
    this.UI.gQ();
    this.hY = 0;
    this.hZ = 0;
    this.ia = -1;
    this.ib = -1;
    this.lLA = true;
    dfn();
  }

  public dDq(uz paramuz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if ((!bB) && (paramuz == null)) throw new AssertionError();

    this.UI = paramuz;
    this.UI.gQ();
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.ia = paramInt3;
    this.ib = paramInt4;
    this.lLA = false;

    dfn();
  }

  public void a(asO paramasO)
  {
    if ((!bB) && (paramasO == null)) throw new AssertionError("Client can't be null");
    if ((!bB) && (this.lLC.contains(paramasO))) throw new AssertionError("Client already registered for this pixmap");
    this.lLC.add(paramasO);
  }

  public void b(asO paramasO) {
    if ((!bB) && (paramasO == null)) throw new AssertionError("Client can't be null");
    this.lLC.remove(paramasO);
  }

  public uz hN() {
    return this.UI;
  }

  public int dfj() {
    return this.ib;
  }

  public int dfk() {
    return this.ia;
  }

  public int getHeight() {
    return this.lLB.bVu() ? this.ia : this.ib;
  }

  public int getWidth() {
    return this.lLB.bVu() ? this.ib : this.ia;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public float bjJ() {
    return this.eVH;
  }

  public float bjK() {
    return this.hYM;
  }

  public float bjM() {
    return this.hYN;
  }

  public float bjL() {
    return this.eVG;
  }

  public void setTexture(uz paramuz) {
    if (paramuz != null)
      paramuz.gQ();
    if (this.UI != null)
      this.UI.axl();
    this.UI = paramuz;
    this.lLz = false;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
    this.lLz = false;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
    this.lLz = false;
  }

  public void setWidth(int paramInt) {
    this.ia = paramInt;
    this.lLz = false;
  }

  public void setHeight(int paramInt) {
    this.ib = paramInt;
    this.lLz = false;
  }

  public void setFlipVerticaly(boolean paramBoolean) {
    this.gWf = paramBoolean;
    this.lLz = false;
  }

  public void setFlipHorizontaly(boolean paramBoolean) {
    this.gWe = paramBoolean;
    this.lLz = false;
  }

  public boolean bVX() {
    return this.gWe;
  }

  public boolean bVY() {
    return this.gWf;
  }

  public bOo getRotation() {
    return this.lLB;
  }

  public void setRotation(bOo parambOo) {
    if (parambOo != this.lLB) {
      this.lLB = parambOo;
      this.lLz = false;
    }
  }

  public void kQ(boolean paramBoolean) {
    this.lLA = paramBoolean;
    this.lLz = false;
  }

  public boolean dfl() {
    return this.lLA;
  }

  public boolean dfm() {
    return !this.lLz;
  }

  public void dfn()
  {
    if (this.UI == null)
      return;
    MD localMD1;
    float f3;
    if (this.lLA) {
      localMD1 = this.UI.cqv();
      MD localMD2 = this.UI.cqw();
      f3 = localMD2.getX();
      float f4 = localMD2.getY();

      this.hY = 0;
      this.hZ = 0;
      this.ia = localMD1.getX();
      this.ib = localMD1.getY();
      this.eVG = 0.0F;
      this.eVH = 0.0F;
      this.hYN = (this.ib / f4);
      this.hYM = (this.ia / f3);
    } else {
      localMD1 = this.UI.cqw();
      float f2 = localMD1.getX();
      f3 = localMD1.getY();
      this.eVH = (this.hY / f2);
      this.hYM = ((this.hY + this.ia) / f2);

      this.eVG = (this.hZ / f3);
      this.hYN = ((this.hZ + this.ib) / f3);
    }
    float f1;
    if (this.gWe) {
      f1 = this.eVH;
      this.eVH = this.hYM;
      this.hYM = f1;
    }

    if (this.gWf) {
      f1 = this.eVG;
      this.eVG = this.hYN;
      this.hYN = f1;
    }

    this.lLz = true;

    for (int i = this.lLC.size() - 1; i >= 0; i--)
      ((asO)this.lLC.get(i)).a(this);
  }
}