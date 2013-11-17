import org.apache.log4j.Logger;

public class dOr extends dfN
{
  public static final bOO cZr = new bOO(new bhF());

  public cMb av()
  {
    bRR localbRR;
    try {
      localbRR = (bRR)cZr.Mm();
      bRR.a(localbRR, cZr);
    } catch (Exception localException) {
      bRR.i().error("Erreur lors de l'extraction du pool", localException);
      localbRR = new bRR();
    }
    return localbRR;
  }
}