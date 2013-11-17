import org.apache.log4j.Logger;

final class cKZ extends Mo
{
  private final att iJK;

  private cKZ(byz parambyz, att paramatt)
  {
    this.iJK = paramatt;
    this.iJK.ao().a(this);
  }

  public void aS() {
    byz.bHD().error("Les aptitudes ne devraient pas être sérialisées par le client.");
  }

  public void aT() {
    byz.r(this.iZ).b(this.iJK.dEN);
  }
}