public class cvL extends bXI
{
  public final diH ihk;

  public cvL(doA paramdoA, String paramString, boolean paramBoolean)
  {
    super((dpI)paramdoA.bkc());
    this.ihk = new diH(paramString, paramBoolean);
  }

  public cvL cty()
  {
    return new cvL(this);
  }

  private cvL(cvL paramcvL) {
    super(paramcvL.cwt);
    this.ihk = paramcvL.ihk;
  }

  public void a(cew paramcew)
  {
    paramcew.a(this.ihk);
    this.ihk.bh(paramcew.cbD());
  }

  public boolean a(bXI parambXI)
  {
    if (!super.a(parambXI)) {
      return false;
    }
    if ((!bB) && (!(parambXI instanceof cvL))) throw new AssertionError();
    cvL localcvL = (cvL)parambXI;
    return this.ihk.b(localcvL.ihk);
  }
}