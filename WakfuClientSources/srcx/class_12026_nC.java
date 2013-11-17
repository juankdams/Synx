final class nC extends Mo
{
  private final Xf aRP;

  private nC(dhJ paramdhJ, Xf paramXf)
  {
    this.aRP = paramXf;
    this.aRP.ao().a(this);
  }

  public void aS() {
    this.aRP.ayt = this.bO.sN();
    this.aRP.type = this.bO.getType();
  }

  public void aT() {
    this.bO.aI(this.aRP.ayt);
    this.bO.setType(this.aRP.type);
    for (azg localazg : this.bO.lcU)
      localazg.z(this.bO);
  }
}