import org.apache.log4j.Logger;

public class bGz extends dfN
{
  public static bOO bf = new bOO(new xX());

  public cMb av()
  {
    AZ localAZ;
    try
    {
      localAZ = (AZ)bf.Mm();
      AZ.a(localAZ, bf);
    } catch (Exception localException) {
      AZ.i().error("Erreur lors de l'extraction d'une CharacterStatue du pool", localException);
      localAZ = new AZ();
    }
    return localAZ;
  }
}