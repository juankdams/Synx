import org.apache.log4j.Logger;

public class aOD extends dfN
{
  private static bOO bf = new bOO(new xe());

  public cMb av()
  {
    bLV localbLV;
    try
    {
      localbLV = (bLV)bf.Mm();
      bLV.a(localbLV, bf);
    } catch (Exception localException) {
      bLV.K.error("Erreur lors de l'extraction d'un " + bLV.class + " du pool", localException);
      localbLV = new bLV();
    }
    return localbLV;
  }
}