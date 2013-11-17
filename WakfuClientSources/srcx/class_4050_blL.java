import org.apache.log4j.Logger;

public class blL extends dfN
{
  private static final bOO bf = new bOO(new bGK());

  public ctf bwN()
  {
    ctf localctf;
    try
    {
      localctf = (ctf)bf.Mm();
      ctf.a(localctf, bf);
    } catch (Exception localException) {
      ctf.K.error("Erreur lors de l'extraction d'un DimensionalBagShelf du pool", localException);
      localctf = new ctf();
    }
    return localctf;
  }
}