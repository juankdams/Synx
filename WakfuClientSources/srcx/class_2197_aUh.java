public class aUh extends bmY
{
  private static final long serialVersionUID = 1L;
  private final long eUO;

  public aUh(long paramLong, dAW paramdAW)
  {
    super(paramdAW);
    this.eUO = paramLong;
  }

  public void a(djj paramdjj, ctQ paramctQ)
  {
    aHA.debug("attach()", new Object[0]);
    this.fFS.a(paramdjj, paramctQ, this.eUO);
    aHA.debug("video surface attached", new Object[0]);
  }
}