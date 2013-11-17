public class dQm extends bXI
{
  public final String UV;

  public dQm(doA paramdoA, String paramString)
  {
    super((dpI)paramdoA.bkc());
    this.UV = paramString;
  }

  private dQm(dQm paramdQm)
  {
    super(paramdQm.cwt);
    this.UV = paramdQm.UV;
  }

  public dQm drm() {
    return new dQm(this);
  }

  public void a(cew paramcew) {
    if (paramcew.J(this.UV)) {
      paramcew.eq(this.UV);
      paramcew.cgQ();
    }
  }

  public boolean a(bXI parambXI) {
    if (!super.a(parambXI))
      return false;
    if ((!bB) && (!(parambXI instanceof dQm))) throw new AssertionError();
    dQm localdQm = (dQm)parambXI;
    return this.UV == null ? false : localdQm.UV == null ? true : localdQm.UV.equals(this.UV);
  }
}