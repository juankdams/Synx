import org.apache.log4j.Logger;

public class cpS extends dfN
{
  public static final bOO bf = new bOO(new cEE());

  public cMb av()
  {
    acT localacT;
    try
    {
      localacT = (acT)bf.Mm();
      acT.a(localacT, bf);
    } catch (Exception localException) {
      acT.i().error("Erreur lors de l'extraction d'une DungeonLadderBoard du pool", localException);
      localacT = new acT();
    }
    return localacT;
  }
}