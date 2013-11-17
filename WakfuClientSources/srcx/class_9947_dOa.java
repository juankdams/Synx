import org.apache.log4j.Logger;

public class dOa extends ccf
{
  protected static final dOa meC = new dOa();

  public int a(bZH parambZH1, bZH parambZH2, gA paramgA, dle paramdle, cOE paramcOE)
  {
    return -1;
  }

  public int a(bZH parambZH1, short paramShort1, bZH parambZH2, short paramShort2, gA paramgA, dle paramdle, cOE paramcOE) {
    gA localgA = (gA)parambZH2.dB(paramShort2);

    if (localgA != null) {
      if ((parambZH1.ajz().a(parambZH1, paramgA) != 0) || (parambZH2.ajz().a(parambZH2, localgA) != 0))
      {
        return 1;
      }

      if ((parambZH1.ajz().a(parambZH1, paramgA, localgA) != 0) || (parambZH2.ajz().a(parambZH2, localgA, paramgA) != 0))
      {
        return 1;
      }

      try
      {
        a(paramgA, parambZH1);
        a(localgA, parambZH2);

        a(localgA, parambZH1, paramShort1);
        throw new Exception("");
      }
      catch (Exception localException)
      {
        K.error("[DESTRUCTION POTENTIELLE D'ITEM] Exception lors de la tentative de déplacement des item " + paramgA + " et " + localgA + " pour le joueur " + paramdle, localException);

        return 1;
      }

    }

    if ((parambZH1.ajz().a(parambZH1, paramgA) != 0) || (parambZH2.ajz().a(parambZH2, paramgA, paramShort2) != 0))
    {
      return 1;
    }
    try
    {
      parambZH1.d(paramgA);
      parambZH2.b(paramgA, paramShort2);
      return 0;
    } catch (bQT localbQT) {
      K.error("[DESTRUCTION POTENTIELLE D'ITEM] Exception lors de la tentative de déplacement des item " + paramgA + " et " + localgA + " pour le joueur " + paramdle, localbQT);
    }
    return 1;
  }

  public static dOa dqf()
  {
    return meC;
  }
}