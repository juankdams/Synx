import java.util.Iterator;

public class cVY
  implements bPr
{
  public static final int kID = -2;
  public static final int kIE = -3;
  public static final int kIF = -5;
  public static final int kIG = -6;
  public static final int kIH = -7;
  public static final int kII = 0;
  private static final cVY kIJ = new cVY();

  public static cVY cKs()
  {
    return kIJ;
  }

  public int a(dno paramdno, gA paramgA)
  {
    return -2;
  }

  public int a(dno paramdno, gA paramgA, short paramShort)
  {
    if (!(paramdno instanceof bZH)) {
      return -6;
    }
    bZH localbZH = (bZH)paramdno;
    if (!localbZH.cH(paramShort)) {
      return -3;
    }
    if (!paramgA.oi().bKn().a(azO.bu((byte)paramShort))) {
      return -5;
    }
    if (localbZH.dC((byte)paramShort)) {
      return -2;
    }

    if (!aO(paramgA)) {
      return -2;
    }

    if (!a(localbZH, null, paramgA)) {
      return -7;
    }
    azO[] arrayOfazO1 = paramgA.oi().bKn().nj();
    if (arrayOfazO1 != null) {
      for (azO localazO : arrayOfazO1) {
        if (!localbZH.cH((short)localazO.bJ())) {
          gA localgA = (gA)localbZH.dB((short)localazO.bJ());
          if (localgA != null) {
            return -3;
          }
        }
      }
    }

    return 0;
  }

  public int a(dno paramdno, gA paramgA1, gA paramgA2)
  {
    if (!(paramdno instanceof bZH)) {
      return -6;
    }
    bZH localbZH = (bZH)paramdno;
    int i = localbZH.n(paramgA1);
    if (!paramgA2.oi().bKn().a(azO.bu((byte)i))) {
      return -5;
    }
    if (localbZH.dC((byte)i)) {
      return -2;
    }

    if (!aO(paramgA2)) {
      return -2;
    }

    if (!a(localbZH, paramgA1, paramgA2)) {
      return -7;
    }
    azO[] arrayOfazO1 = paramgA2.oi().bKn().nj();
    if (arrayOfazO1 != null) {
      for (azO localazO : arrayOfazO1) {
        if (!localbZH.cH((short)localazO.bJ())) {
          gA localgA = (gA)localbZH.dB((short)localazO.bJ());
          if ((localgA != null) && (localgA.isActive()) && (b(localbZH, localgA) != 0)) {
            return -3;
          }
        }
      }
    }
    return 0;
  }

  public int b(dno paramdno, gA paramgA)
  {
    if (!(paramdno instanceof bZH)) {
      return -6;
    }
    bZH localbZH = (bZH)paramdno;
    int i = localbZH.n(paramgA);
    if (localbZH.dC((byte)i)) {
      return -2;
    }
    return paramgA.isActive() ? 0 : -2;
  }

  public boolean a(gA paramgA, dle paramdle, cOE paramcOE) {
    if (!a(paramgA, paramdle)) {
      return false;
    }

    if (!aO(paramgA)) {
      return false;
    }

    return (paramgA.oi().a(Aq.bvQ) == null) || (paramgA.oi().a(Aq.bvQ).i(paramdle, paramdle, paramgA, paramcOE));
  }

  public boolean a(dno paramdno, dle paramdle, cOE paramcOE)
  {
    for (gA localgA : paramdno) {
      if (localgA.isActive())
      {
        if (!a(localgA, paramdle)) {
          return false;
        }

        if (!aO(localgA)) {
          return false;
        }

        if ((localgA.oi().a(Aq.bvQ) != null) && (!localgA.oi().a(Aq.bvQ).i(paramdle, paramdle, localgA, paramcOE)))
        {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean a(bBn parambBn, dle paramdle) {
    if (parambBn.nI()) {
      return true;
    }

    int i = 0;
    if (paramdle.b(eu.azz)) {
      i = paramdle.e(eu.azz);
    }

    return ((paramdle instanceof dhJ)) && (parambBn.nU() <= ((cTK)paramdle).nU() + i);
  }

  public static boolean a(gA paramgA, dle paramdle)
  {
    bBn localbBn = paramgA.oi();
    if (localbBn.nI()) {
      return true;
    }

    int i = 0;
    if (paramdle.b(eu.azz)) {
      i = paramdle.e(eu.azz);
    }

    return ((paramdle instanceof dhJ)) && (paramgA.nU() <= ((cTK)paramdle).nU() + i);
  }

  public static boolean aO(gA paramgA)
  {
    if (!paramgA.nI()) {
      return true;
    }

    cUb localcUb = paramgA.nJ();
    return (localcUb.isActive()) && (localcUb.aGa() > 0);
  }

  public static boolean a(bZH parambZH, gA paramgA1, gA paramgA2) {
    if (!paramgA2.oi().b(bGS.gDM))
      return true;
    for (Iterator localIterator = parambZH.iterator(); localIterator.hasNext(); ) {
      gA localgA = (gA)localIterator.next();
      if ((paramgA2 != localgA) && (paramgA1 != localgA) && (localgA.oi().b(bGS.gDM)))
        return false;
    }
    return true;
  }
}