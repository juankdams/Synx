public class acd extends bXI
{
  public final String cQS;

  public acd(doA paramdoA, String paramString)
  {
    super((dpI)paramdoA.bkc());
    this.cQS = paramString;
  }

  public acd aon() {
    return new acd(this);
  }

  private acd(acd paramacd)
  {
    super(paramacd.cwt);
    this.cQS = paramacd.cQS;
  }

  public void a(cew paramcew)
  {
    paramcew.er(this.cQS);
  }

  public boolean a(bXI parambXI) {
    if (!super.a(parambXI))
      return false;
    if ((!bB) && (!(parambXI instanceof acd))) throw new AssertionError();
    acd localacd = (acd)parambXI;
    return this.cQS == null ? false : localacd.cQS == null ? true : localacd.cQS.equals(this.cQS);
  }
}