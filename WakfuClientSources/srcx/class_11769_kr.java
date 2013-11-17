public class kr extends bEj
{
  private final dVg aNR;

  public kr(dVg paramdVg)
  {
    super(paramdVg);
    this.aNR = paramdVg;
  }

  public int next()
  {
    abv();
    return this.aNR.mtW[this._index];
  }
}