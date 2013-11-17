public class R
{
  protected final bqc be;

  public R(bqc parambqc)
  {
    this.be = parambqc;
  }

  public bqc au()
  {
    return this.be;
  }

  public String toString()
  {
    return '{' + getClass().getSimpleName() + " type : " + this.be.toString() + '}';
  }
}