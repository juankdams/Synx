import org.apache.log4j.Logger;

public class dpZ extends dfN
{
  public static final bOO cZr = new bOO(new pW());

  public cMb av()
  {
    bvj localbvj;
    try
    {
      localbvj = (bvj)cZr.Mm();
      bvj.a(localbvj, cZr);
    } catch (Exception localException) {
      bvj.Re().error("Erreur lors de l'extraction du pool", localException);
      localbvj = new bvj();
    }
    return localbvj;
  }
}