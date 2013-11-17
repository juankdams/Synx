public class anC extends ciH
{
  public anC()
  {
    this(new dan(0L));
  }

  public anC(dan paramdan) {
    super(8);
    a(paramdan);
  }

  public void a(dan paramdan) {
    sF().setLong(0L, paramdan.longValue());
  }

  public dan aAa() {
    return new dan(sF().getLong(0L));
  }
}