import org.apache.log4j.Logger;

final class eZ extends Mo
{
  private final bdg aBX;

  private eZ(byz parambyz, bdg parambdg)
  {
    this.aBX = parambdg;
    this.aBX.ao().a(this);
  }

  public void aS() {
    byz.bHF().error("Les achievements ne sont pas serialisés par le client");
  }

  public void aT() {
    byz.a(this.iZ, dHn.lSk.dhS());
    byz.x(this.iZ).C(this.aBX.fny);
    byz.x(this.iZ).a(dSH.moM);
    this.aBX.fny = null;
  }
}