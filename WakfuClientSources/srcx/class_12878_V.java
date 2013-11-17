import org.apache.log4j.Logger;

public class V extends dfN
{
  private static bOO bf = new bOO(new cSB());

  public cMb av()
  {
    bvo localbvo;
    try
    {
      localbvo = (bvo)bf.Mm();
      bvo.a(localbvo, bf);
    } catch (Exception localException) {
      bvo.i().error("Erreur lors de l'extraction d'un " + bvo.class.getName() + " du pool", localException);
      localbvo = new bvo();
    }
    return localbvo;
  }
}