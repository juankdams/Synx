import org.apache.log4j.Logger;

public class ccd extends bXI
{
  public final String gAn;

  public ccd(doA paramdoA, String paramString)
  {
    super((dpI)paramdoA.bkc());
    this.gAn = paramString;
  }

  private ccd(ccd paramccd)
  {
    super(paramccd.cwt);
    this.gAn = paramccd.gAn;
  }

  public ccd cfB() {
    return new ccd(this);
  }

  public void a(cew paramcew) {
    if (paramcew.aty() == null) {
      asg.ch().error("Impossible d'appliquer le changement d'anim statique " + this.gAn);
      return;
    }
    paramcew.c(new dJh(this, paramcew));
  }

  public boolean a(bXI parambXI)
  {
    if (!super.a(parambXI))
      return false;
    if ((!bB) && (!(parambXI instanceof ccd))) throw new AssertionError();
    ccd localccd = (ccd)parambXI;
    return this.gAn == null ? false : localccd.gAn == null ? true : localccd.gAn.equals(this.gAn);
  }
}