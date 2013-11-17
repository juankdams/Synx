import org.apache.log4j.Logger;

public class ata extends dfN
{
  public static final bOO cZr = new bOO(new aIl());

  public cMb av()
  {
    dFo localdFo;
    try
    {
      localdFo = (dFo)cZr.Mm();
      dFo.a(localdFo, cZr);
    } catch (Exception localException) {
      dFo.an().error("Erreur lors de l'extraction d'une CharacterStatue du pool", localException);
      localdFo = new dFo();
    }
    return localdFo;
  }
}