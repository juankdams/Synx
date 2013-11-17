final class bHh extends Mo
{
  private final aEh gFv;

  private bHh(dhJ paramdhJ, aEh paramaEh)
  {
    this.gFv = paramaEh;
    this.gFv.ao().a(this);
  }

  public void aS() {
    this.gFv.id = this.bO.getId();
  }

  public void aT() {
    this.bO.a(this.gFv.id);
    for (azg localazg : this.bO.lcU)
      localazg.z(this.bO);
  }
}