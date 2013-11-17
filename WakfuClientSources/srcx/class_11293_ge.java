public abstract class ge
{
  private static final azO[] aDw = new azO[0];
  private final short aDx;
  private ge aDy;
  private final short aDz;
  private final cjT aDA = new cjT();
  private azO[] aDB;
  private azO[] aDC = null;

  private boolean aDD = true;
  private boolean aDE = true;
  private boolean aDF = false;

  protected ge(short paramShort1, short paramShort2, azO[] paramArrayOfazO)
  {
    this.aDx = paramShort1;
    this.aDz = paramShort2;
    this.aDB = paramArrayOfazO;
  }

  public short nc() {
    return this.aDx;
  }

  public short nd() {
    return this.aDz;
  }

  public ge ne() {
    return this.aDy;
  }

  public void a(ge paramge) {
    this.aDy = paramge;
  }

  protected boolean nf() {
    return this.aDA.size() != 0;
  }

  protected cjT ng() {
    return this.aDA;
  }

  public void b(ge paramge) {
    this.aDA.add(paramge);
  }

  public boolean c(ge paramge) {
    if (this == paramge)
      return true;
    for (ge localge = this.aDy; localge != null; localge = localge.ne())
      if (localge == paramge)
        return true;
    return false;
  }

  public azO[] nh()
  {
    if ((!ni()) && (ne() != null))
      return ne().nh();
    return this.aDB != null ? this.aDB : aDw;
  }

  public boolean ni() {
    return (this.aDB != null) && (this.aDB.length > 0);
  }

  public void a(azO[] paramArrayOfazO) {
    this.aDB = paramArrayOfazO;
  }

  public boolean a(azO paramazO) {
    azO[] arrayOfazO = nh();
    for (int i = arrayOfazO.length - 1; i >= 0; i--)
      if (arrayOfazO[i] == paramazO)
        return true;
    return false;
  }

  public azO[] nj() {
    return this.aDC != null ? this.aDC : aDw;
  }

  public void b(azO[] paramArrayOfazO) {
    this.aDC = paramArrayOfazO;
  }

  public boolean nk() {
    return this.aDD;
  }

  public void n(boolean paramBoolean) {
    this.aDD = paramBoolean;
  }

  public boolean nl() {
    return this.aDE;
  }

  public void o(boolean paramBoolean) {
    this.aDE = paramBoolean;
  }

  public boolean d(ge paramge)
  {
    return (paramge.nc() == this.aDx) || ((this.aDy != null) && (this.aDy.d(paramge)));
  }

  public boolean nm()
  {
    ge localge = this;
    while (!localge.ni()) {
      localge = localge.ne();
      if (localge == null) {
        return false;
      }
    }
    return localge.aDF;
  }

  public void p(boolean paramBoolean) {
    this.aDF = paramBoolean;
  }
}