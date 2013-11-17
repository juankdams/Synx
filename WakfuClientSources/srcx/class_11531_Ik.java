import org.apache.log4j.Logger;

public final class Ik extends bZG
{
  private static final aee bx = new bOO(new alj());

  public Ik RH()
  {
    Ik localIk;
    try
    {
      localIk = (Ik)bx.Mm();
      localIk.aOr = bx;
    } catch (Exception localException) {
      localIk = new Ik();
      localIk.aOr = null;
      K.error("Erreur lors d'un newInstance sur un ApplyStateWithoutNotification : " + localException.getMessage());
    }
    a(localIk);
    return localIk;
  }

  public boolean RI() {
    return true;
  }

  public void b(aVc paramaVc, boolean paramBoolean)
  {
  }
}