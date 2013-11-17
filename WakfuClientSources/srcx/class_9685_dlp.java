public class dlp
{
  private final int aw;
  private final String ki;
  private final int bvH;
  private final cYR liI = new cYR();
  private final ctR liJ = new ctR();
  private final Xg liK = new Xg();
  private final Do liL;
  private final adz liM = new adz();

  private final Xg liN = new Xg();
  private final int liO;
  private final cds liP;
  private final byte dGe;
  private final byte liQ;
  private final short dGg;
  private final short aSh;

  public dlp(int paramInt1, String paramString, int paramInt2, int paramInt3, long paramLong1, long paramLong2, byte paramByte1, long paramLong3, byte paramByte2, byte paramByte3, short paramShort1, short paramShort2)
  {
    this.aw = paramInt1;
    this.ki = paramString;

    this.liO = paramInt2;
    this.bvH = paramInt3;

    this.liL = new Do(paramLong1, paramLong2, paramByte1);

    this.liP = kb.I(paramLong3);
    this.dGe = paramByte2;
    this.liQ = paramByte3;

    this.dGg = paramShort1;
    this.aSh = paramShort2;
  }

  public int a(cDI paramcDI, int paramInt) {
    return this.liI.i(paramcDI, paramInt);
  }

  public int a(cDI paramcDI) {
    return this.liI.get(paramcDI);
  }

  public void eJ(int paramInt1, int paramInt2) {
    this.liJ.put(paramInt1, paramInt2);
  }

  public boolean Au(int paramInt) {
    return this.liJ.contains(paramInt);
  }

  public int Av(int paramInt) {
    return this.liJ.get(paramInt);
  }

  public int[] cTg() {
    return this.liJ.qe();
  }

  public void a(int paramInt, cds paramcds) {
    this.liK.put(paramInt, paramcds);
  }

  public boolean Aw(int paramInt) {
    return this.liK.contains(paramInt);
  }

  public cds Ax(int paramInt) {
    return (cds)this.liK.get(paramInt);
  }

  public void d(int paramInt, boolean paramBoolean) {
    this.liL.d(paramInt, paramBoolean);
  }

  public boolean Ay(int paramInt) {
    return this.liM.hL(paramInt);
  }

  public void ad(int paramInt1, int paramInt2, int paramInt3) {
    dSe localdSe = (dSe)this.liN.get(paramInt1);
    if (localdSe == null) {
      this.liN.put(paramInt1, localdSe = new dSe());
    }
    localdSe.e(paramInt2, new bNa(paramInt3));
  }

  public int getId() {
    return this.aw;
  }

  public String asS() {
    return this.ki;
  }

  public int cTh() {
    return this.liO;
  }

  public dSe Az(int paramInt) {
    return (dSe)this.liN.get(paramInt);
  }

  public int aGa() {
    return this.bvH;
  }

  public cds MC() {
    return this.liL.MC();
  }

  public cds MD() {
    return this.liL.MD();
  }

  public byte ME() {
    return this.liL.ME();
  }

  public boolean eB(int paramInt) {
    return this.liL.eB(paramInt);
  }

  public boolean c(cIw paramcIw) {
    return this.liL.c(paramcIw);
  }

  public boolean AA(int paramInt) {
    return this.liM.contains(paramInt);
  }

  public boolean AB(int paramInt) {
    return this.liN.contains(paramInt);
  }

  public cds cTi() {
    return this.liP;
  }

  public byte aGf() {
    return this.dGe;
  }

  public byte cTj() {
    return this.liQ;
  }

  public short aGh() {
    return this.dGg;
  }

  public short nV() {
    return this.aSh;
  }

  public int ei(short paramShort) {
    return Math.min(this.aSh, paramShort) * this.dGg;
  }

  public String toString()
  {
    return "PetDefinition{m_id=" + this.aw + '}';
  }

  int[] cTk() {
    adz localadz = new adz();
    int i = 0; for (int j = this.liN.size(); i < j; i++) {
      localadz.hL(this.liN.uM(i));
    }
    localadz.n(this.liM.toArray());
    return localadz.toArray();
  }
}