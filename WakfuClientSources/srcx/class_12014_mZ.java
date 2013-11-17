import org.apache.log4j.Logger;

public class mZ extends dfN
{
  private static bOO bf = new bOO(new cqo());

  public cMb av()
  {
    bVa localbVa;
    try
    {
      localbVa = (bVa)bf.Mm();
      bVa.a(localbVa, bf);
    } catch (Exception localException) {
      bVa.i().error("Erreur lors de l'extraction d'un Lever du pool", localException);
      localbVa = new bVa();
    }
    return localbVa;
  }
}