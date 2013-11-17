public class uu extends gA
{
  private gA big;

  public uu(long paramLong, bBn parambBn, gA paramgA)
  {
    super(paramLong);
    this.big = paramgA;

    b(parambBn);
  }

  public void bc()
  {
    super.bc();
    this.big = null;
  }

  public void release()
  {
    this.big = null;
  }

  public gA Dp() {
    return this.big;
  }

  public boolean isActive() {
    return false;
  }
}