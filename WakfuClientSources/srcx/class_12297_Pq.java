import org.apache.log4j.Logger;

public enum Pq
{
  private static final Logger K = Logger.getLogger(Pq.class);

  public static final Pq[] chC = new Pq[0];
  private final czc chD;

  private Pq(czc arg3)
  {
    Object localObject;
    this.chD = localObject;
  }

  public czc abq() {
    if (this.chD == null) {
      K.error("Accès à un parser non implémenté dans ParserType." + name());
    }
    return this.chD;
  }
}