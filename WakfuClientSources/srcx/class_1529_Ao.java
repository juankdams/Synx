import org.apache.log4j.Logger;

public class Ao extends dfN
{
  public static final bOO bf = new bOO(new Es());

  public cMb av()
  {
    bTF localbTF;
    try
    {
      localbTF = (bTF)bf.Mm();
      bTF.a(localbTF, bf);
    } catch (Exception localException) {
      bTF.i().error("Erreur lors de l'extraction d'une CharacterStatue du pool", localException);
      localbTF = new bTF();
    }
    return localbTF;
  }
}