import com.ankamagames.wakfu.client.WakfuClientInstance;

public class aqQ extends bzu
{
  private static bpt dqO = new dMz(8);

  boolean dqP = true;
  private int dyw;
  private int dyx;
  private int dyy;
  private static boolean dyz;

  public static void q(int paramInt1, int paramInt2, int paramInt3)
  {
    a((short)19998, paramInt1, paramInt2, paramInt3);
  }

  public static void r(int paramInt1, int paramInt2, int paramInt3) {
    a((short)19992, paramInt1, paramInt2, paramInt3);
  }

  public static void bm(int paramInt1, int paramInt2) {
    a((short)19994, paramInt1, paramInt2, 0);
  }

  public static void bn(int paramInt1, int paramInt2) {
    a((short)19995, paramInt1, paramInt2, 0);
  }

  public static void s(int paramInt1, int paramInt2, int paramInt3) {
    a((short)19997, paramInt1, paramInt2, paramInt3);
  }

  public static void t(int paramInt1, int paramInt2, int paramInt3) {
    a((short)19995, paramInt1, paramInt2, paramInt3);
  }

  private static void a(short paramShort, int paramInt1, int paramInt2, int paramInt3) {
    aqQ localaqQ = j(paramShort, paramInt1, paramInt2, paramInt3);
    if ((!bB) && (localaqQ.getId() != paramShort)) throw new AssertionError();
    cjO.clE().j(localaqQ);
  }

  private static aqQ j(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    aqQ localaqQ = (aqQ)dqO.byL();
    localaqQ.a(bpt.fJT);
    localaqQ.d(paramInt1);
    localaqQ.aJ();
    localaqQ.dyx = paramInt2;
    localaqQ.dyy = paramInt3;
    localaqQ.dyw = paramInt4;
    return localaqQ;
  }

  public aqQ aCT() {
    aqQ localaqQ = (aqQ)dqO.aOk();
    localaqQ.d(getId());
    localaqQ.dqP = false;
    localaqQ.dyx = this.dyx;
    localaqQ.dyy = this.dyy;
    localaqQ.dyw = this.dyw;
    return localaqQ;
  }

  public boolean aCU() {
    return this.dyw == 1;
  }

  public boolean aCV() {
    return this.dyw == 2;
  }

  public boolean aCW() {
    return this.dyw == 3;
  }

  public int aCX() {
    if ((!bB) && (this.dqP)) throw new AssertionError();
    return this.dyx;
  }

  public int aCY() {
    if ((!bB) && (this.dqP)) throw new AssertionError();
    return this.dyy;
  }

  private static boolean isButtonDown(int paramInt) {
    return ((aTL)WakfuClientInstance.awy().Dg()).isButtonDown(paramInt);
  }

  public static boolean aCZ() {
    return isButtonDown(1);
  }

  public static boolean aDa() {
    return isButtonDown(2);
  }

  public static boolean aDb() {
    return isButtonDown(3);
  }

  public void release()
  {
    bc();
  }

  public void bc()
  {
    if ((!bB) && (this.dqP)) throw new AssertionError();
    super.bc();
    this.dqP = true;
  }

  public void aJ()
  {
    if ((!bB) && (!this.dqP)) throw new AssertionError();
    super.aJ();
    this.dqP = false;
  }
}