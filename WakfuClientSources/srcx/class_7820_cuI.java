public class cuI extends cC
{
  public cuI(int paramInt, String paramString)
  {
    super(paramInt, paramString);
    j(true);
  }

  public String getName()
  {
    aYU localaYU = aYU.ox(getId());
    return bU.fH().getString(localaYU.name());
  }

  public String gp()
  {
    aYU localaYU = aYU.ox(getId());
    return localaYU.bnW();
  }

  public String fJ()
  {
    return ay.bd().F(this.aw);
  }
}