import org.apache.log4j.Logger;

public abstract class alA
{
  private static final Logger K = Logger.getLogger(alA.class);
  protected cXf cQs;
  private int dms;
  private int dmt;
  private int dmu = 0;
  private bOl dmv;

  protected alA()
  {
    ayh();
  }

  public final void bd(int paramInt1, int paramInt2) {
    this.dms = paramInt1;
    this.dmt = paramInt2;
  }

  public final void ayh() {
    bd(1000, 1000);
  }

  public void jc(int paramInt) {
    this.dmu = paramInt;
  }

  private void ayi() {
    dnq localdnq = ayj();
    this.cQs = localdnq.Dg();
  }

  protected abstract dnq ayj();

  protected abstract void ayk();

  protected abstract void ayl();

  public final void cr(boolean paramBoolean) {
    if (paramBoolean) {
      a(aym(), this.dmu);
    }
    ayi();
    a(this.dms, this.dmt, this.cQs);
  }

  private dnV aym()
  {
    return new brH(this);
  }

  private void a(dnV paramdnV, int paramInt)
  {
    IH localIH = IH.Sd();
    localIH.a(paramdnV);

    if (paramInt > 0) {
      long l = System.currentTimeMillis();
      localIH.a(new brI(this, l, paramInt, localIH));
    }
  }

  public final void ayn()
  {
    ayi();
    IH.Sd().reset();
    a(IH.Sd(), this.dms, this.cQs);
  }

  public void a(IH paramIH, int paramInt, cXf paramcXf) {
    if (this.dmv != null) {
      K.warn("on était déjà en attente d'un monde", new Exception());

      this.dmv = null;
    }

    this.dmv = new brJ(this, paramcXf, paramInt, paramIH);

    paramIH.a(this.dmv);
  }

  private void a(int paramInt1, int paramInt2, cXf paramcXf) {
    IH localIH = IH.Sd();
    bAU localbAU = ayj().rs();

    localbAU.a(paramcXf);
    localbAU.a(paramcXf);
    cXf localcXf = paramcXf.cLe();
    localIH.a(paramInt1, localcXf);
    paramcXf.cLd();
    localIH.fm(paramInt2);

    a(localIH, paramInt1, paramcXf);

    localIH.a(new brK(this, localIH, localcXf, localbAU, paramcXf));
  }
}