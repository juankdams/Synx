import org.apache.log4j.Logger;

public final class cIB
{
  protected static final Logger K = Logger.getLogger(cIB.class);
  private float iFZ;
  private float iGa;
  private float fGc;
  private float[] iGb;
  private float iGc;
  private Pr iGd = Pr.chF;
  private bzM iGe = bzM.gok;
  private float iGf = 0.0F;
  private int iGg = -1;
  private float iGh;
  private float aFn;
  private float iGi;
  private xU iGj = xU.bqN;
  private boolean iGk = true;

  private boolean iGl = true;
  private Pr iGm = Pr.chF;
  private xU iGn = xU.bqN;
  private float iGo;
  private float iGp;
  private float aFm;

  public float oy()
  {
    return this.aFm;
  }

  public float aIQ() {
    return this.fGc;
  }

  public void cO(float paramFloat) {
    this.fGc = paramFloat;
  }

  public float cCw() {
    return this.iFZ;
  }

  public float cCx() {
    return this.iGa;
  }

  public float cCy() {
    return this.iGb != null ? this.iGb[0] : 0.0F;
  }

  public float cCz() {
    return this.iGb != null ? this.iGb[1] : 0.0F;
  }

  public float cCA() {
    return this.iGc;
  }

  public float cCB() {
    return this.iGf;
  }

  public float oz() {
    return this.aFn;
  }

  public Pr cCC() {
    return this.iGd;
  }

  public bzM cCD() {
    return this.iGe;
  }

  public xU cCE() {
    return this.iGj;
  }

  public Pr cCF() {
    return this.iGm;
  }

  public xU cCG() {
    return this.iGn;
  }

  public static xU cP(float paramFloat) {
    if (paramFloat < 0.33F)
      return xU.bqN;
    if (paramFloat < 0.66F) {
      return xU.bqO;
    }
    return xU.bqP;
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float[] paramArrayOfFloat, float paramFloat5, int paramInt, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    Pr localPr = cpC.v(paramFloat5 + paramFloat6, paramFloat1 + paramFloat4, paramFloat7 + paramFloat8);
    if (localPr != this.iGd) {
      this.iGk = true;
      this.iGd = localPr;
    }

    this.iGe = bzM.by(paramFloat5 + paramFloat6);

    this.iGf = paramFloat5;
    this.iGg = paramInt;
    this.fGc = paramFloat1;
    this.iFZ = paramFloat2;
    this.iGa = paramFloat3;

    this.iGb = paramArrayOfFloat;

    this.iGc = paramFloat4;
    this.iGi = paramFloat8;
    this.iGh = paramFloat6;

    this.aFn = paramFloat7;
    xU localxU = cP(paramFloat7);
    if (this.iGj != localxU) {
      this.iGj = localxU;
      this.iGk = true;
    }
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    this.iGo = (paramFloat1 + paramFloat3);
    this.iGp = (paramFloat2 + paramFloat3);
    this.aFm = paramFloat6;

    float f = paramFloat4 + paramFloat5;

    Pr localPr = cpC.v(paramFloat6 + paramFloat7, (this.iGo + this.iGp) * 0.5F, f);
    if (localPr != this.iGm) {
      this.iGl = true;
      this.iGm = localPr;
    }

    xU localxU = cP(f);
    if (localxU != this.iGn) {
      this.iGl = true;
      this.iGn = localxU;
    }
  }

  public void h(ayn paramayn)
  {
    sS.Al().a(this);

    anK.drx.d(this.iGd);
    anK.drx.az(this.aFn);

    if (this.iGl) {
      this.iGl = false;
      aRM localaRM = (aRM)aAA.dTo.aMA();
      localaRM.o(paramayn);
      biI.fzg.b(localaRM);
    }

    if (this.iGk) {
      this.iGk = false;
    }

    K.debug("****** Mise à jour des vues relatives à la météo : " + toString());
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("Weather {\n");

    localStringBuffer.append("\t").append("temperature : ").append(this.fGc).append("°").append("\n");
    localStringBuffer.append("\t").append("tendance : ").append(this.iGd.toString()).append("\n");
    localStringBuffer.append("\t").append("precipitations : d=").append(this.iGg).append(", i=").append(this.iGf).append("\n");
    localStringBuffer.append("\t").append("wind : ").append(this.aFn).append(" / 1.0\n");

    localStringBuffer.append("}\n");
    return localStringBuffer.toString();
  }
}