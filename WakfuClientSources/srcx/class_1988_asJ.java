import org.apache.log4j.Logger;

public class asJ extends dfN
{
  public static bOO bf = new bOO(new cTA());

  public cMb av()
  {
    dgO localdgO;
    try
    {
      localdgO = (dgO)bf.Mm();
      dgO.a(localdgO, bf);
    } catch (Exception localException) {
      dgO.an().error("Erreur lors de l'extraction d'une RecycleMachine du pool", localException);
      localdgO = new dgO(null);
    }
    return localdgO;
  }
}