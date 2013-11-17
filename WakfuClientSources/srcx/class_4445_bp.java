public class bp extends bXI
{
  public final String ki;
  public final String kj;
  public bAF kk;

  public bp(doA paramdoA, String paramString1, String paramString2)
  {
    super((dpI)paramdoA.bkc());
    this.ki = paramString1;
    this.kj = paramString2;
    this.kk = null;
  }

  private bp(bp parambp) {
    super(parambp.cwt);
    this.ki = parambp.ki;
    this.kj = parambp.kj;
    this.kk = null;
  }

  private static CG r(String paramString) {
    if (paramString == null)
      return null;
    if (paramString.charAt(1) == '_') {
      try {
        int i = Integer.parseInt("" + paramString.charAt(0));
        return CG.eu(i);
      } catch (NumberFormatException localNumberFormatException) {
        return null;
      }
    }
    return null;
  }

  public void a(cew paramcew) {
    dGk localdGk = new dGk(this, dsE.cYX());

    localdGk.jz(this.ki);

    CG localCG = r(this.kj);
    boolean bool1 = localCG == null;
    if (bool1)
      localdGk.c(paramcew.E());
    else {
      localdGk.c(localCG);
    }
    localdGk.eq("AnimStatique");

    localdGk.id(dLw.mbl.asR());
    localdGk.a(dsG.cYZ());
    localdGk.k(paramcew.fa(), paramcew.fb(), paramcew.fc());

    bQK.bXG().d(localdGk);
    boolean bool2 = this.kj == null;
    if (!bool2)
    {
      localdGk.eq(bool1 ? this.kj : this.kj.substring(2));
    }
    paramcew.a(localdGk, bool2, bool2, bool1);

    this.kk = localdGk;
  }

  public boolean a(bXI parambXI) {
    if (!super.a(parambXI))
      return false;
    if ((!bB) && (!(parambXI instanceof bp))) throw new AssertionError();
    bp localbp = (bp)parambXI;
    boolean bool = this.kj == null ? false : localbp.kj == null ? true : this.kj.equals(localbp.kj);
    return (this.ki.equals(localbp.ki)) && (bool);
  }

  public bp et() {
    return new bp(this);
  }
}