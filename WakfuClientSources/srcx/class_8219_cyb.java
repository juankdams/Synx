public class cyb
  implements dUd
{
  public static final int imj = 300;
  protected static final cyb imk = new cyb();
  private int hY;
  private int hZ;
  private int iml = 300;
  private dOc imm;
  private long aTz;
  private int imn = 0;

  private cyb() {
    this.aTz = hashCode();
    cAo.cxf().start();
  }

  public static cyb cvg() {
    return imk;
  }

  public void dm(int paramInt1, int paramInt2) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public long getId()
  {
    return this.aTz;
  }

  public void a(long paramLong)
  {
    this.aTz = paramLong;
  }

  public int cvh() {
    return this.iml;
  }

  public void xc(int paramInt) {
    this.iml = paramInt;
  }

  public void a(dOc paramdOc, dMr paramdMr) {
    cAo.cxf().b(this);
    if ((this.imm == paramdOc) && (this.imn == paramdMr.getButton())) {
      d(paramdOc, dMr.l(paramdMr));
      c(paramdOc, dMr.l(paramdMr));
      this.imm = null;
    } else {
      this.imm = paramdOc;
      this.imn = paramdMr.getButton();
    }
  }

  public void b(dOc paramdOc, dMr paramdMr)
  {
    if (this.imm == paramdOc) {
      cAo.cxf().b(this);
      cAo.cxf().a(this, this.iml, paramdOc.hashCode(), 1);
      d(paramdOc, dMr.l(paramdMr));
      return;
    }

    this.imm = null;
    this.imn = 0;
  }

  public boolean a(cWG paramcWG)
  {
    if ((paramcWG instanceof dKQ)) {
      this.imn = 0;
      this.imm = null;

      return false;
    }
    return true;
  }

  public void c(dOc paramdOc, dMr paramdMr)
  {
    paramdMr.b(CH.bGx);
    paramdMr.CW(2);
    paramdMr.iH(true);
    paramdOc.g(paramdMr);
  }

  public void d(dOc paramdOc, dMr paramdMr)
  {
    paramdMr.b(CH.bGw);
    paramdMr.CW(1);
    paramdOc.g(paramdMr);
  }

  public boolean v(dOc paramdOc)
  {
    int i = paramdOc.getDisplayX();
    int j = paramdOc.getDisplayY();
    return paramdOc.getAppearance().bQ(this.hY - i, this.hZ - j);
  }
}