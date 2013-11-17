import org.apache.log4j.Logger;

public final class dbs extends oy
{
  private static final aee bx = new bOO(new btO());

  public dbs()
  {
    aH();
  }

  public dbs cNg()
  {
    dbs localdbs;
    try {
      localdbs = (dbs)bx.Mm();
      localdbs.aOr = bx;
    } catch (Exception localException) {
      localdbs = new dbs();
      localdbs.aOr = null;
      localdbs.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ReplaceAreaByAnotherUsingTarget : " + localException.getMessage());
    }
    return localdbs;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN() {
    return false;
  }
}