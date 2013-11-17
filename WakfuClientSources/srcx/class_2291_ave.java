public abstract class ave
  implements KN
{
  private static final String bdh = "@(#) $RCSfile: AbstractFilter.java,v $ $Revision: 1.5 $ $Date: 2004/02/27 11:32:58 $";

  public KN a(KN paramKN)
  {
    return new uK(this, paramKN);
  }

  public abstract boolean matches(Object paramObject);

  public KN aHh()
  {
    return new ccN(this);
  }

  public KN b(KN paramKN) {
    return new bTR(this, paramKN);
  }
}