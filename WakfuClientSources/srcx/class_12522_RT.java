import org.apache.log4j.Logger;

final class RT extends Mo
{
  private final bSf cry;

  private RT(byz parambyz, bSf parambSf)
  {
    this.cry = parambSf;
    this.cry.ao().a(this);
  }

  public void aS() {
    byz.bHw().error("Les spells ne devraient pas ?tre s?rialis?s par le client.");
  }

  public void aT() {
    this.iZ.gMY = new ahQ(this.iZ);
    this.iZ.gMY.auK().c(this.cry.hcE);
    this.iZ.kx(this.cry.hcD);
  }
}