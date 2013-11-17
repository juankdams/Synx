public class dQd extends cih
{
  public static final dQd mkh = new dQd(0, 0, 0, (short)0, 0, (short)0, false, (short)0, 0);

  private final chC mki = new chC();
  private final cLM mkj = new cLM();
  private final int bFx;
  private final short hVX;
  private final int mkk;
  private final short mkl;
  private final boolean cxI;
  private final short mkm;
  private final int dfl;

  public dQd(int paramInt1, int paramInt2, int paramInt3, short paramShort1, int paramInt4, short paramShort2, boolean paramBoolean, short paramShort3, int paramInt5)
  {
    super(paramInt1, paramInt2, aPb.ewn, 0);
    this.bFx = paramInt3;
    this.hVX = paramShort1;
    this.mkk = paramInt4;
    this.mkl = paramShort2;
    this.cxI = paramBoolean;
    this.mkm = paramShort3;
    this.dfl = paramInt5;
  }

  public int LI() {
    return this.bFx;
  }

  public short coA() {
    return this.hVX;
  }

  public int drf() {
    return this.mkk;
  }

  public short drg() {
    return this.mkl;
  }

  public boolean ahy() {
    return this.cxI;
  }

  public short drh() {
    return this.mkm;
  }

  public int coC() {
    return this.dfl;
  }

  public void b(w paramw) {
    this.mki.a(paramw);
    this.mkj.dK(paramw.D());
  }

  public w p(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    return (w)this.mki.j(paramObject1, paramObject2, paramObject3, paramObject4);
  }

  public w Dq(int paramInt) {
    return (w)this.mki.vn(paramInt);
  }

  public short[] dri() {
    return this.mkj.cEM();
  }

  public boolean ae(dGy paramdGy) {
    return this.mki.cjy().s(paramdGy);
  }
}