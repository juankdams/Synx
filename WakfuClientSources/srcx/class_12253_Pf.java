public class Pf extends ciH
{
  public Pf()
  {
    this(new dRo(0L));
  }

  public Pf(dRo paramdRo) {
    super(2);
    a(paramdRo);
  }

  public void a(dRo paramdRo) {
    sF().setInt(0L, paramdRo.intValue());
  }

  public dRo abe() {
    return new dRo(sF().getInt(0L));
  }
}