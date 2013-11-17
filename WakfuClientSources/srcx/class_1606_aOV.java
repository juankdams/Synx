import org.apache.log4j.Logger;

public class aOV extends dfN
{
  public static final bOO cZr = new bOO(new cky());

  public cMb av()
  {
    cJR localcJR;
    try
    {
      localcJR = (cJR)cZr.Mm();
      cJR.a(localcJR, cZr);
    } catch (Exception localException) {
      cJR.i().error("Erreur lors de l'extraction d'une CharacterStatue du pool", localException);
      localcJR = new cJR();
    }
    return localcJR;
  }
}