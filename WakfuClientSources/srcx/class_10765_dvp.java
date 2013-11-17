public class dvp extends ciH
{
  public dvp()
  {
    this(new dKt(0L));
  }

  public dvp(dKt paramdKt) {
    super(8);
    a(paramdKt);
  }

  public void a(dKt paramdKt) {
    sF().setLong(0L, paramdKt.longValue());
  }

  public dKt daT() {
    return new dKt(sF().getLong(0L));
  }
}