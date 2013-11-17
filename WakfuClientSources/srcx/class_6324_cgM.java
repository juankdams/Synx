import org.apache.log4j.Logger;

final class cgM extends Mo
{
  private final le aHp;

  cgM(bKm parambKm, le paramle)
  {
    this.aHp = paramle;
    this.aHp.ao().a(this);
  }

  public void aS() {
    bKm.asA().error("[NATION] Pas de sérialization de la nation ID dans le client (SERVER => CLIENT)", new UnsupportedOperationException());
  }

  public void aT()
  {
    bXb.cci().a(this.aHq, this.aHp.bL);
  }
}