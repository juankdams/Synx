import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

public class xk
{
  private static final float bpE = 0.01F;
  private static final float bpF = 2.1F;
  private int aVc;
  private int aVd;
  private int bpG;
  private int bpH = -2147483648; private int bpI = -2147483648; private int bpJ = -2147483648;

  private boolean aDl = false;
  private Object aOd;
  private bSl bpK;
  private int hY;
  private int hZ;
  private int bpL;
  private String aGq;
  private int bpM;
  private FreeParticleSystem bpN = null;
  private int kO;
  private int kP;
  private boolean bpO = false;
  private cyd bpP;
  private cyd bpQ;
  private cyd bpR;
  private cyd bpS;
  private cyd bpT;
  private cdm bpU;
  private aYY bpV;

  public xk(cdm paramcdm, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.bpU = paramcdm;
    this.aOd = paramObject;
    this.bpR = new cyd();
    this.bpR.setSpeed(2.1F);
    this.bpR.cs(0.01F);
    this.bpS = new cyd();
    this.bpS.setSpeed(2.1F);
    this.bpS.cs(0.01F);
    this.bpT = new cyd();
    this.bpT.setSpeed(2.1F);
    this.bpT.cs(0.01F);
    this.bpP = new cyd();
    this.bpP.setSpeed(2.1F);
    this.bpP.cs(0.01F);
    this.bpQ = new cyd();
    this.bpQ.setSpeed(2.1F);
    this.bpQ.cs(0.01F);
    this.bpM = paramInt1;
    this.aVc = paramInt2;
    this.aVd = paramInt3;
    this.bpG = paramInt4;
  }

  public void Gm() {
    this.bpU.a(this);
  }

  public void setScreenPosition(int paramInt1, int paramInt2) {
    this.bpP.set(paramInt1);
    this.bpQ.set(paramInt2);
  }

  public void L(int paramInt1, int paramInt2) {
    this.bpP.cu(paramInt1);
    this.bpQ.cu(paramInt2);
  }

  public int getScreenX() {
    return this.kO;
  }

  public int getScreenY() {
    return this.kP;
  }

  public int Gn() {
    return this.bpM;
  }

  public String fJ() {
    return this.aGq;
  }

  public void setIconUrl(String paramString) {
    this.aGq = paramString;
  }

  public void setValue(Object paramObject) {
    this.aOd = paramObject;
  }

  public Object getValue() {
    return this.aOd;
  }

  public void e(boolean paramBoolean1, boolean paramBoolean2) {
    if ((this.aDl) && (!paramBoolean2) && (this.bpO == paramBoolean1)) {
      return;
    }

    this.aDl = true;
    this.bpO = paramBoolean1;

    if (this.bpO)
      Gv();
    else
      Gw();
  }

  public void setPosition(int paramInt1, int paramInt2, int paramInt3)
  {
    this.bpR.set(paramInt1);
    this.bpS.set(paramInt2);
    this.bpT.set(paramInt3);
  }

  public void g(int paramInt1, int paramInt2, int paramInt3) {
    this.bpR.cu(paramInt1);
    this.bpS.cu(paramInt2);
    this.bpT.cu(paramInt3);
  }

  public int getX() {
    return (int)this.bpR.cvi();
  }

  public int getY() {
    return (int)this.bpS.cvi();
  }

  public int Go() {
    return (int)this.bpT.cvi();
  }

  public int getStartX() {
    return this.aVc;
  }

  public int getStartY() {
    return this.aVd;
  }

  public int Gp() {
    return this.bpG;
  }

  public int Gq() {
    return this.bpH;
  }

  public int Gr() {
    return this.bpI;
  }

  public int Gs() {
    return this.bpJ;
  }

  public boolean Gt() {
    return this.bpH != -2147483648;
  }

  public void h(int paramInt1, int paramInt2, int paramInt3) {
    this.bpH = paramInt1;
    this.bpI = paramInt2;
    this.bpJ = paramInt3;
  }

  public bSl Gu() {
    return this.bpK;
  }

  public void b(bSl parambSl) {
    if (this.bpK == parambSl) {
      return;
    }
    this.bpK = parambSl;
    if (this.bpN != null)
      this.bpN.b(parambSl);
  }

  public void cz(int paramInt) {
    this.kO = ((int)this.bpP.xd(paramInt));
    this.kP = ((int)this.bpQ.xd(paramInt));

    this.hY = ((int)this.bpR.xd(paramInt));
    this.hZ = ((int)this.bpS.xd(paramInt));
    this.bpL = ((int)this.bpT.xd(paramInt));

    if (this.bpN != null)
      this.bpN.k(this.hY, this.hZ, this.bpL);
  }

  private void Gv()
  {
    if (this.bpN != null) {
      return;
    }

    this.bpN = cof.cop().dC(this.bpM, 0);

    if (this.bpN != null) {
      if (this.bpK != null)
        this.bpN.b(this.bpK);
      else {
        this.bpN.k(this.hY, this.hZ, this.bpL);
      }
      cWS.cKD().b(this.bpN);
    }
  }

  private void Gw() {
    if (this.bpN == null) {
      return;
    }

    cWS.cKD().zk(this.bpN.getId());
    this.bpN = null;
  }

  private void Gx() {
    if (this.bpV != null) {
      aYY localaYY = this.bpV;
      this.bpV = null;
      localaYY.boh();
    }
  }

  public aYY Gy() {
    return this.bpV;
  }

  public void a(aYY paramaYY) {
    this.bpV = paramaYY;
  }

  public void clear() {
    Gx();
    this.bpU.b(this);
    this.bpK = null;
    Gw();
  }
}