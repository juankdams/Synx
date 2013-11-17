import org.apache.log4j.Logger;

final class beL extends Mo
{
  private final dEe fsa;

  private beL(byz parambyz, dEe paramdEe)
  {
    this.fsa = paramdEe;
    this.fsa.ao().a(this);
  }

  public void aS() {
    byz.aUg().error("Le client ne devrait pas s?rialiser les racourcis");
  }

  public void aT() {
    byz.g(this.iZ).a(this.fsa);
  }
}