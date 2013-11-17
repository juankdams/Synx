public class cUY extends ciH
{
  public cUY()
  {
    this(new cSe(0L));
  }

  public cUY(cSe paramcSe) {
    super(4);
    a(paramcSe);
  }

  public void a(cSe paramcSe) {
    sF().setInt(0L, paramcSe.intValue());
  }

  public cSe cJV() {
    return new cSe(sF().getInt(0L));
  }
}