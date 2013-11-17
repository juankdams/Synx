import org.apache.log4j.Logger;

public final class aoJ extends ad
{
  private static final aee bx = new bOO(new agD());

  public aoJ aAX()
  {
    aoJ localaoJ;
    try
    {
      localaoJ = (aoJ)bx.Mm();
      localaoJ.aOr = bx;
    } catch (Exception localException) {
      localaoJ = new aoJ();
      localaoJ.aOr = null;
      K.error("Erreur lors d'un newInstance sur un StateDecurseWithoutNotification : " + localException.getMessage());
    }
    return localaoJ;
  }

  public boolean RI() {
    return true;
  }
}