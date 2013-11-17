public class bcn extends bXI
{
  public final String ki;

  public bcn(doA paramdoA, String paramString)
  {
    super((dpI)paramdoA.bkc());
    this.ki = paramString;
  }

  private bcn(bcn parambcn) {
    super(parambcn.cwt);
    this.ki = parambcn.ki;
  }

  public bcn bqz() {
    return new bcn(this);
  }

  public void a(cew paramcew) {
    a(paramcew, true);
  }

  public void a(cew paramcew, boolean paramBoolean) {
    Su localSu = paramcew.cbD();
    localSu.gE(Integer.parseInt(this.ki));

    if (paramBoolean)
      localSu.aek();
    else
      paramcew.jz(this.ki);
  }

  public boolean a(bXI parambXI)
  {
    if (!super.a(parambXI))
      return false;
    if ((!bB) && (!(parambXI instanceof bcn))) throw new AssertionError();
    bcn localbcn = (bcn)parambXI;
    return this.ki == null ? false : localbcn.ki == null ? true : localbcn.ki.equals(this.ki);
  }
}