public abstract class dNE
{
  protected final djj le;
  protected final bSW lf;

  protected dNE(djj paramdjj, bSW parambSW)
  {
    this.le = paramdjj;
    this.lf = parambSW;
  }

  protected void finalize()
  {
    aHA.debug("finalize()", new Object[0]);
    aHA.debug("Media player has been garbage collected", new Object[0]);
    super.finalize();
  }
}