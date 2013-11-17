public abstract class dzv
  implements aij
{
  protected final aid deu;
  protected final cSR lGd;
  protected final cSR lGe;
  private cCw lGf;
  protected int lGg;
  protected int lGh;
  protected cIZ lGi;
  private static final TY lGj = new TY();

  public dzv(aid paramaid) {
    this.deu = paramaid;

    this.lGg = -1;
    this.lGh = -1;
    this.lGi = cIZ.iHa;

    this.lGd = new cSR();
    this.lGe = new cSR();
  }

  public void c(int paramInt, aCc paramaCc) {
    this.lGd.put(paramInt, paramaCc);
  }

  public void d(int paramInt, aCc paramaCc) {
    this.lGe.put(paramInt, paramaCc);
  }

  public cSR dcW() {
    return this.lGd;
  }

  public cSR dcX() {
    return this.lGe;
  }

  public int ZS() {
    return this.lGg;
  }

  public int ZT() {
    return this.lGh;
  }

  public cIZ ZU() {
    return this.lGi;
  }

  public void a(cIZ paramcIZ) {
    this.lGi = paramcIZ;
  }

  public void a(cCw paramcCw) {
    this.lGf = paramcCw;
  }

  public void b(dFu paramdFu) {
    lGj.reset();

    this.lGd.a(new bR(this, paramdFu));

    int i = lGj.getValue();
    if (i != this.lGg) {
      this.lGg = i;
      if (this.lGf != null)
        this.lGf.p(this.deu);
      aEY();
    }
  }

  public void c(dFu paramdFu) {
    lGj.reset();

    this.lGe.a(new bQ(this, paramdFu));

    int i = lGj.getValue();
    if (i != this.lGh) {
      this.lGh = i;
      if (this.lGf != null)
        this.lGf.p(this.deu);
      aEY();
    }
  }

  public void Cb(int paramInt) {
    this.lGg = paramInt;
  }

  public void Cc(int paramInt) {
    this.lGh = paramInt;
  }

  protected abstract void aEY();
}