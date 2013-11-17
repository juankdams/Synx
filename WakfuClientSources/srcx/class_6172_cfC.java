public class cfC extends cwV
{
  public static final String cVU = "substitution";
  private String hAE;

  public cfC()
  {
    this.hAE = null;
  }

  public void setExpression(String paramString)
  {
    this.hAE = paramString;
  }

  public String P(FF paramFF)
  {
    if (cum()) {
      return Q(paramFF).P(paramFF);
    }

    return this.hAE;
  }

  public cfC Q(FF paramFF)
  {
    return (cfC)U(paramFF);
  }
}