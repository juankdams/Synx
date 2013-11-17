import org.apache.log4j.Logger;

public class akW extends dfN
{
  public static final bOO cZr = new bOO(new brU());

  public cMb av()
  {
    bNm localbNm;
    try
    {
      localbNm = (bNm)cZr.Mm();
      bNm.a(localbNm, cZr);
    } catch (Exception localException) {
      bNm.i().error("Erreur lors de l'extraction d'une NationSelectionBoard du pool", localException);
      localbNm = new bNm();
    }
    return localbNm;
  }
}