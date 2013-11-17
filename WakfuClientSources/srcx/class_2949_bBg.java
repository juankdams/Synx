import org.apache.log4j.Logger;

public class bBg
{
  private static final Logger K = Logger.getLogger(bBg.class);
  private final qD gtv;
  private long gtw;
  private int gtx;
  private long gty;
  private long gtz;
  private int gtA;
  private int gtB;
  private int gtC;
  private short az;
  private final aoL bEs = new aoL();
  private int cZL;

  public bBg(qD paramqD)
  {
    this.gtv = paramqD;
  }

  public bBg(bBg parambBg) {
    this.gtv = parambBg.gtv;
    this.gtw = parambBg.gtw;
    this.gtx = parambBg.gtx;
    this.gty = parambBg.gty;
    this.gtz = parambBg.gtz;
    this.gtA = parambBg.gtA;
    this.gtB = parambBg.gtB;
    this.gtC = parambBg.gtC;
    this.cZL = parambBg.cZL;
    this.bEs.e(parambBg.bEs);
  }

  public long bJR() {
    return this.gtw;
  }

  public long bJS() {
    return this.gty;
  }

  public long bJT() {
    return bJR() - bJS();
  }

  public int arK() {
    return this.gtx + this.gtC;
  }

  public int bJU() {
    return this.gtA;
  }

  public int bJV() {
    return this.gtB;
  }

  public int bJW() {
    return arK() - bJU() - bJV();
  }

  public int bJX() {
    return arK() - bJU();
  }

  public short D() {
    return this.az;
  }

  public boolean o(dGy paramdGy) {
    return this.bEs.s(paramdGy);
  }

  public void d(cKg paramcKg) {
    a(this.gtw, paramcKg);
  }

  public void a(long paramLong, cKg paramcKg) {
    this.bEs.clear();

    this.gtA = 0;
    this.gtC = 0;
    this.gty = 0L;
    this.gtz = 0L;

    this.gtw = paramLong;
    this.gtx = paramcKg.arK();
    this.cZL = paramcKg.arM();
    this.gty = 0L;
    this.gtz = 0L;
    this.gtB = 0;

    paramcKg.o(new ayE(this));

    this.az = paramcKg.arI();
  }

  public void n(aXL paramaXL) {
    bOB localbOB = paramaXL.bna();
    this.gtB += localbOB.bVx();
    this.gtC += localbOB.bVy();
    cUh localcUh1 = paramaXL.adj();
    cUh localcUh2 = aDF.f(localcUh1);
    this.gty += dGu.a(localcUh2, this.az);
    this.gtz += dGu.b(localcUh2, this.az);
    this.bEs.put(paramaXL.gv(), paramaXL);
  }

  public boolean o(aXL paramaXL) {
    long l = paramaXL.gv();

    cUh localcUh1 = paramaXL.adj();
    if (paramaXL.isTemporary()) {
      bOB localbOB = paramaXL.bna();
      this.gtB -= localbOB.bVx();
      this.gtC -= localbOB.bVy();
      cUh localcUh2 = aDF.f(localcUh1);
      this.gty -= dGu.a(localcUh2, this.az);
      this.gtz -= dGu.b(localcUh2, this.az);
    }
    else if (aDF.g(paramaXL.adj()) != aAb.dSs) {
      this.gtA -= localcUh1.cJv();
      this.gtC -= localcUh1.bVy();
    }

    return this.bEs.remove(l) != null;
  }

  public void b(cDs paramcDs) {
    this.gty += paramcDs.ahA();
  }

  public void a(bAb parambAb) {
    this.gty += parambAb.ahA();
  }

  public long bJY() {
    return this.gtz;
  }

  public int arM() {
    return this.cZL;
  }

  public void hZ(int paramInt) {
    this.cZL = paramInt;
  }

  public boolean rW(int paramInt) {
    return paramInt <= bJT();
  }
}