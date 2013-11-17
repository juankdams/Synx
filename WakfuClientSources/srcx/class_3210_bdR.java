public class bdR extends ciH
{
  public bdR()
  {
    this(new WP(0L));
  }
  public bdR(WP paramWP) {
    super(axA.SIZE);
    a(paramWP);
  }
  public void a(WP paramWP) {
    if (axA.SIZE == 4) {
      sF().setInt(0L, paramWP.intValue());
    }
    else
      sF().setLong(0L, paramWP.longValue());
  }

  public WP brT() {
    return new WP(axA.SIZE == 4 ? sF().getInt(0L) : sF().getLong(0L));
  }
}