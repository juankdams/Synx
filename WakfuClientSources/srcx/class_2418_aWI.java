import org.apache.log4j.Logger;

public class aWI extends dfN
{
  public static bOO bf = new bOO(new buh());
  private final dFN dln;

  public aWI(dFN paramdFN)
  {
    this.dln = paramdFN;
  }

  public cMb av()
  {
    L localL;
    try {
      localL = (L)bf.Mm();
      L.a(localL, bf);
    } catch (Exception localException) {
      L.an().error("Erreur lors de l'extraction du pool", localException);
      localL = new L();
    }
    localL.dln = this.dln;
    return localL;
  }
}