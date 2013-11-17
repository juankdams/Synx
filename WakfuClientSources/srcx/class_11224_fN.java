import org.apache.log4j.Logger;

public class fN extends ccf
{
  protected static final fN aCZ = new fN();

  public int a(bZH parambZH, short paramShort1, dfy paramdfy, short paramShort2, gA paramgA, dle paramdle, cOE paramcOE)
  {
    return -1;
  }

  public int a(bZH parambZH, dfy paramdfy, gA paramgA, dle paramdle, cOE paramcOE) {
    int i = parambZH.ajz().a(parambZH, paramgA);
    int j = paramdfy.ajz().b(paramdfy, paramgA);
    short s = parambZH.n(paramgA);

    if ((i == 0) && (j == 0))
    {
      if ((a(paramgA, parambZH)) || 
        (parambZH.ajz().a(parambZH, paramdle, paramcOE))) {
        if (!paramdfy.c(paramgA))
        {
          return 1;
        }
        return 0;
      }
      try {
        a(paramgA, parambZH, s);
      } catch (bQT localbQT) {
        return 1;
      }
      return 1;
    }

    return 1;
  }

  public int a(bZH parambZH, dfy paramdfy, short paramShort, gA paramgA, dle paramdle, cOE paramcOE)
  {
    gA localgA = (gA)paramdfy.dB(paramShort);
    if ((paramShort >= 0) && (localgA != null) && (!paramgA.b(localgA))) {
      return 1;
    }
    int i = parambZH.ajz().a(parambZH, paramgA);
    int j = paramdfy.ajz().b(paramdfy, paramgA);
    short s = parambZH.n(paramgA);

    if ((i != 0) || (j != 0)) {
      return 1;
    }
    if (!a(paramgA, parambZH)) {
      return 1;
    }
    boolean bool = false;
    try {
      if (paramShort >= 0) {
        if (localgA != null)
          bool = paramdfy.c(localgA.oj(), paramgA.nP());
        else
          bool = paramdfy.b(paramgA, paramShort);
      }
      else bool = paramdfy.c(paramgA); 
    }
    catch (Exception localException) { K.trace("Impossible d'ajouter l'objet a la position donné", localException); }


    if (bool) {
      return 0;
    }
    try
    {
      a(paramgA, parambZH, s);
    } catch (bQT localbQT) {
      K.error("Impossible de remettre l'objet a sa position d'origine", localbQT);
    }

    return 1;
  }

  public static fN mS() {
    return aCZ;
  }
}