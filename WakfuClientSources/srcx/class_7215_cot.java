import org.apache.log4j.Logger;

public class cot extends ccf
{
  protected static final cot hVR = new cot();

  public int a(dfy paramdfy1, dfy paramdfy2, gA paramgA, dle paramdle, cOE paramcOE)
  {
    return -1;
  }

  public int a(dfy paramdfy1, dfy paramdfy2, short paramShort1, gA paramgA1, short paramShort2, gA paramgA2, dle paramdle, cOE paramcOE)
  {
    if ((paramgA1.nP() > paramShort2) && (paramShort2 != -1))
    {
      localgA = (gA)paramdfy2.dB(paramShort1);

      if (localgA == paramgA1) {
        K.warn("on veut déplacer un item où il est déja ! ");
        return 1;
      }
      if (localgA != null) {
        if (!localgA.b(paramgA1)) {
          return 1;
        }
        if (localgA.nP() + paramShort2 < localgA.nR()) {
          localgA.a(paramShort2);
          paramgA1.a((short)-paramShort2);
          return 0;
        }
        int i = localgA.nR() - localgA.nP();
        localgA.a((short)i);
        if (paramgA1.nP() <= i)
          paramdfy1.e(paramgA1);
        else {
          paramgA1.a((short)-i);
        }
        return 0;
      }

      paramgA2.l(paramShort2);

      if (paramdfy2.ajz().b(paramdfy2, paramgA2) == 0)
      {
        paramdfy1.c(paramgA1.oj(), (short)-paramShort2);
        try
        {
          paramdfy2.b(paramgA2, paramShort1);
        } catch (Exception localException1) {
          K.error("Impossible d'ajouter l'objet a la position donné", localException1);
        }
        return 0;
      }
      return 1;
    }

    gA localgA = (gA)paramdfy2.dB(paramShort1);

    if (localgA == paramgA1) {
      K.warn("on veut déplacer un item où il est déja ! ");
      return 1;
    }
    if (localgA == null)
    {
      if ((paramdfy1.ajz().a(paramdfy1, paramgA1) == 0) && (paramdfy2.ajz().b(paramdfy2, paramgA1) == 0) && (paramdfy1.d(paramgA1)))
      {
        try
        {
          paramdfy2.b(paramgA1, paramShort1);
        } catch (Exception localException2) {
          K.error("Impossible d'ajouter l'objet a la position donné", localException2);
        }
        return 0;
      }
      return 1;
    }

    if (!localgA.b(paramgA1)) {
      if ((paramdfy2.ajz().a(paramdfy2, localgA, paramgA1) == 0) && (paramdfy1.ajz().a(paramdfy1, paramgA1, localgA) == 0))
      {
        short s = paramdfy1.il(paramgA1.oj());

        paramdfy1.d(paramgA1);
        paramdfy2.d(localgA);
        try
        {
          paramdfy1.b(localgA, s);
        } catch (Exception localException3) {
          K.error("Erreur lors de l ajout de l'objet a la position" + s + " dans ", localException3);
        }
        try {
          paramdfy2.b(paramgA1, paramShort1);
        } catch (Exception localException4) {
          K.error("Erreur lors de l ajout de l'objet a la position" + paramShort1 + " dans ", localException4);
        }

        if (paramdfy1.ajz().a(paramdfy1, paramdle, paramcOE)) {
          return 0;
        }

        paramdfy1.d(localgA);
        paramdfy2.d(paramgA1);
        try
        {
          paramdfy1.b(paramgA1, s);
        } catch (Exception localException5) {
          K.error("Erreur lors de l ajout de l'objet a la position" + s + " dans ", localException5);
        }
        try {
          paramdfy2.b(localgA, paramShort1);
        } catch (Exception localException6) {
          K.error("Erreur lors de l ajout de l'objet a la position" + paramShort1 + " dans ", localException6);
        }
        return 1;
      }

      return 1;
    }

    if (localgA.nP() + paramgA1.nP() <= localgA.nR()) {
      paramdfy2.c(localgA.oj(), paramgA1.nP());

      paramdfy1.e(paramgA1);
      return 0;
    }
    int j = localgA.nR() - localgA.nP();
    paramdfy2.c(localgA.oj(), (short)j);

    paramdfy1.c(paramgA1.oj(), (short)-j);

    return 0;
  }

  public int a(dfy paramdfy1, short paramShort1, dfy paramdfy2, short paramShort2, gA paramgA, dle paramdle, cOE paramcOE)
  {
    return -1;
  }

  public static cot cox() {
    return hVR;
  }
}