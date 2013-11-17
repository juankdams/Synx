import org.apache.log4j.Logger;

public class dJN extends cYL
{
  private static final Logger K = Logger.getLogger(dJN.class);
  public static final int FILE_VERSION = 0;
  protected bGO lVp;
  private float dyF;
  private long lVq;
  private long lVr;
  private long lVs;
  private long lVt;
  private bnl lVu;

  public byte cob()
  {
    return 0;
  }

  public final boolean bsn() {
    return bnl.c(this.lVu);
  }

  public boolean ak(int paramInt1, int paramInt2, short paramShort) {
    return al(paramInt1, paramInt2, paramShort) == null;
  }

  public CG al(int paramInt1, int paramInt2, short paramShort)
  {
    if (this.lVu == null) {
      return CG.bFP;
    }
    if (this.lVu.bsn()) {
      localObject = (bey)this.lVu;
      CG localCG = ((bey)localObject).I(paramInt1, paramInt2, paramShort);
      return localCG;
    }

    Object localObject = (cbx)this.lVu;
    return a(((cbx)localObject).cft(), paramInt1, paramInt2, paramShort) ? null : CG.bFP;
  }

  private boolean a(btB parambtB, int paramInt1, int paramInt2, short paramShort) {
    if (parambtB == null)
      return false;
    byte b1 = (byte)(paramInt1 - this.aEd * 18);
    byte b2 = (byte)(paramInt2 - this.aEe * 18);
    return parambtB.a(b1, b2, paramShort);
  }

  public final boolean ai(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 - this.aEd * 18;
    int j = paramInt2 - this.aEe * 18;
    return aj(i, j, paramInt3);
  }

  public final boolean aj(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, paramInt2, paramInt3) == 0;
  }

  public final short ak(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 - this.aEd * 18;
    int j = paramInt2 - this.aEe * 18;
    return a(i, j, paramInt3);
  }

  public short a(int paramInt1, int paramInt2, int paramInt3)
  {
    return blh.bwj().a(paramInt1, paramInt2, paramInt3, this.lVp);
  }

  public float aDe() {
    return this.dyF;
  }

  public long diW() {
    return this.lVq;
  }

  public long diX() {
    return this.lVr;
  }

  public long diY() {
    return this.lVs;
  }

  public long diZ() {
    return this.lVt;
  }

  public void d(aYQ paramaYQ)
  {
    super.d(paramaYQ);
    K(paramaYQ);
    this.dyF = (paramaYQ.readByte() / 100.0F);
    this.lVq = paramaYQ.readLong();
    this.lVr = paramaYQ.readLong();
    this.lVs = paramaYQ.readLong();
    this.lVt = paramaYQ.readLong();
    L(paramaYQ);
  }

  private void K(aYQ paramaYQ) {
    this.lVp = bGO.a(paramaYQ, (short)0);
  }

  private void L(aYQ paramaYQ) {
    this.lVu = bnl.o(paramaYQ);
  }

  public void b(dSw paramdSw)
  {
    super.b(paramdSw);
    m(paramdSw);
    paramdSw.writeByte((byte)(int)(this.dyF * 100.0F));
    paramdSw.writeLong(this.lVq);
    paramdSw.writeLong(this.lVr);
    paramdSw.writeLong(this.lVs);
    paramdSw.writeLong(this.lVt);
    n(paramdSw);
  }

  public final void a(bGO parambGO) {
    this.lVp = parambGO;
  }

  public void dx(float paramFloat) {
    if ((!bB) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) throw new AssertionError();
    this.dyF = paramFloat;
  }

  public void kB(long paramLong) {
    this.lVq = paramLong;
  }

  public void kC(long paramLong) {
    this.lVr = paramLong;
  }

  public void kD(long paramLong) {
    this.lVs = paramLong;
  }

  public void kE(long paramLong) {
    this.lVt = paramLong;
  }

  private void m(dSw paramdSw) {
    if (this.lVp == null) {
      paramdSw.writeByte((byte)0);
      return;
    }

    this.lVp.d(paramdSw);
  }

  public void d(bnl parambnl) {
    this.lVu = parambnl;
  }

  private void n(dSw paramdSw) {
    bnl.a(paramdSw, this.lVu);
  }

  public void clear()
  {
    super.clear();
    this.lVp = null;
    this.dyF = 0.0F;
    this.lVq = 0L;
    this.lVr = 0L;
    this.lVs = 0L;
    this.lVt = 0L;
    this.lVu = null;
  }
}