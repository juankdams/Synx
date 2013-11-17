import org.apache.log4j.Logger;

public class aAu extends cHP
{
  protected static final Logger K = Logger.getLogger(aAu.class);
  private long Rc;

  protected boolean aM(String paramString)
  {
    try
    {
      this.Rc = Long.parseLong(paramString);
      return true;
    } catch (NumberFormatException localNumberFormatException) {
      K.error("Impossible d'initialiser un " + getClass().getName() + " : " + paramString + " n'est pas un id de son valide");
    }return false;
  }

  public cVZ Ds()
  {
    return cVZ.kIK;
  }

  public long alu() {
    return this.Rc;
  }
}