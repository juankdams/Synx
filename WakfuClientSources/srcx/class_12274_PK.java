public class PK extends ciH
{
  public PK()
  {
    this(new bkT(0));
  }

  public PK(bkT parambkT) {
    super(4);
    a(parambkT);
  }

  public void a(bkT parambkT) {
    sF().setInt(0L, parambkT.intValue());
  }

  public bkT abw() {
    return new bkT(sF().getInt(0L));
  }
}