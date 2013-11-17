public class cgp extends ciH
{
  public cgp()
  {
    this(new dln(0L));
  }

  public cgp(dln paramdln) {
    super(4);
    a(paramdln);
  }

  public void a(dln paramdln) {
    sF().setInt(0L, paramdln.intValue());
  }

  public dln ciy() {
    return new dln(sF().getInt(0L));
  }
}