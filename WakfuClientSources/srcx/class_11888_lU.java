public class lU
{
  private final dFu aPK;
  private final dFu aPL;
  private final dFu aPM;
  private final il aPN;
  private final dFu aPO;
  private final dFu aPP;
  private final dFu aPQ;
  private final il aPR;

  public lU()
  {
    this.aPK = new dFu();
    this.aPL = new dFu();
    this.aPM = new dFu();
    this.aPN = new il();
    this.aPO = new dFu();
    this.aPP = new dFu();
    this.aPQ = new dFu();
    this.aPR = new il();
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, short paramShort) {
    this.aPK.fg(paramInt1, paramInt2);
    this.aPL.fg(paramInt1, paramInt3);
    this.aPM.fg(paramInt1, paramInt4);
    this.aPN.a(paramInt1, paramShort);
  }

  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, short paramShort) {
    this.aPO.fg(paramInt1, paramInt2);
    this.aPP.fg(paramInt1, paramInt3);
    this.aPQ.fg(paramInt1, paramInt4);
    this.aPR.a(paramInt1, paramShort);
  }

  public int bo(int paramInt) {
    return this.aPK.get(paramInt);
  }

  public int bp(int paramInt) {
    return this.aPL.get(paramInt);
  }

  public int bq(int paramInt) {
    return this.aPM.get(paramInt);
  }

  public short br(int paramInt) {
    return this.aPN.get(paramInt);
  }

  public int bs(int paramInt) {
    return this.aPO.get(paramInt);
  }

  public int bt(int paramInt) {
    return this.aPP.get(paramInt);
  }

  public int bu(int paramInt) {
    return this.aPQ.get(paramInt);
  }

  public short bv(int paramInt) {
    return this.aPR.get(paramInt);
  }

  public int[] tx() {
    return this.aPK.qe();
  }

  public int[] ty() {
    return this.aPO.qe();
  }
}