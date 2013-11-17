import org.apache.log4j.Logger;

public class dHf extends dfN
{
  private static bOO bf = new bOO(new arM());

  public cMb av()
  {
    EN localEN;
    try
    {
      localEN = (EN)bf.Mm();
      EN.a(localEN, bf);
    } catch (Exception localException) {
      EN.i().error("Erreur lors de l'extraction d'un " + EN.class.getName() + " du pool", localException);
      localEN = new EN();
    }
    return localEN;
  }
}