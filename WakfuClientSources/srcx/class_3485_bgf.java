final class bgf extends Jo
{
  private static final long serialVersionUID = 1L;

  bgf()
  {
    cl("[");
    co(ati.LINE_SEPARATOR + "  ");
    aQ(true);
    cm(ati.LINE_SEPARATOR + "]");
  }

  private Object readResolve()
  {
    return Jo.bTc;
  }
}