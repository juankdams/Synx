public class ko extends ciH
{
  public ko()
  {
    this(new XM(0));
  }

  public ko(XM paramXM) {
    super(4);
    a(paramXM);
  }

  public void a(XM paramXM) {
    sF().setInt(0L, paramXM.intValue());
  }

  public XM sd() {
    return new XM(sF().getInt(0L));
  }
}