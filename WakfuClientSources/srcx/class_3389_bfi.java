public class bfi
{
  public static boolean a(Yp paramYp1, Yp paramYp2)
  {
    if ((paramYp1 == null) || (paramYp2 == null)) {
      return false;
    }
    if (paramYp1 == Yp.cIQ) {
      return paramYp2 != Yp.cIQ;
    }
    if (paramYp1 == Yp.cIR) {
      return (paramYp2 != Yp.cIQ) && (paramYp2 != Yp.cIR);
    }
    return false;
  }

  public static boolean b(Yp paramYp1, Yp paramYp2) {
    if ((paramYp1 == null) || (paramYp2 == null)) {
      return false;
    }
    if (paramYp1 == paramYp2) {
      return true;
    }
    if (paramYp1 == Yp.cIQ) {
      return true;
    }
    if (paramYp1 == Yp.cIR) {
      return paramYp2 != Yp.cIQ;
    }
    return false;
  }

  public static boolean d(Yp paramYp) {
    if (paramYp == null)
      return false;
    switch (QQ.brU[paramYp.ordinal()]) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      return true;
    }
    return false;
  }

  public static boolean e(Yp paramYp)
  {
    if (paramYp == null)
      return false;
    switch (QQ.brU[paramYp.ordinal()]) {
    case 1:
    case 2:
    case 3:
      return true;
    }
    return false;
  }

  public static boolean f(Yp paramYp)
  {
    if (paramYp == null)
      return false;
    switch (QQ.brU[paramYp.ordinal()]) {
    case 1:
    case 2:
    case 6:
      return true;
    }
    return false;
  }

  public static boolean g(Yp paramYp)
  {
    if (paramYp == null)
      return false;
    switch (QQ.brU[paramYp.ordinal()]) {
    case 1:
    case 2:
    case 4:
      return true;
    case 3:
    }return false;
  }

  public static boolean h(Yp paramYp)
  {
    if (paramYp == null)
      return false;
    switch (QQ.brU[paramYp.ordinal()]) {
    case 1:
    case 2:
    case 4:
      return true;
    case 3:
    }return false;
  }

  public static boolean i(Yp paramYp)
  {
    if (paramYp == null)
      return false;
    switch (QQ.brU[paramYp.ordinal()]) {
    case 1:
    case 2:
    case 5:
      return true;
    case 3:
    case 4: } return false;
  }

  public static boolean j(Yp paramYp)
  {
    if (paramYp == null)
      return false;
    switch (QQ.brU[paramYp.ordinal()]) {
    case 1:
    case 2:
      return true;
    }
    return false;
  }

  public static boolean k(Yp paramYp)
  {
    if (paramYp == null)
      return false;
    switch (QQ.brU[paramYp.ordinal()]) {
    case 1:
    case 2:
      return true;
    }
    return false;
  }
}