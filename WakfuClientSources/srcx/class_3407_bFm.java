public final class bFm
{
  public static boolean a(dhJ paramdhJ, bfE parambfE, bzj parambzj)
  {
    int i = parambzj.e(parambfE, paramdhJ, null, paramdhJ.bEY());
    int j = paramdhJ.d(eu.ayO).value();
    if (i > 0) {
      if (paramdhJ.c(cfY.hBG))
        j = -1;
      else if (paramdhJ.c(cfY.hBF))
        j -= 2;
      else if (paramdhJ.c(cfY.hBE)) {
        j--;
      }
    }

    return i <= j;
  }

  public static boolean b(dhJ paramdhJ, bfE parambfE, bzj parambzj) {
    int i = parambzj.d(parambfE, paramdhJ, null, paramdhJ.bEY());
    int j = paramdhJ.d(eu.ayP).value();

    if (i > 0) {
      if (paramdhJ.c(cfY.hBx))
        j = -1;
      else if (paramdhJ.c(cfY.hBw))
        j -= 2;
      else if (paramdhJ.c(cfY.hBv)) {
        j--;
      }
    }
    return i <= j;
  }

  public static boolean c(dhJ paramdhJ, bfE parambfE, bzj parambzj) {
    int i = parambzj.c(parambfE, paramdhJ, null, paramdhJ.bEY());
    int j = paramdhJ.d(eu.ayN).value();
    if (i > 0) {
      if (paramdhJ.c(cfY.hBW))
        return false;
      if (paramdhJ.c(cfY.hBD))
        j = -1;
      else if (paramdhJ.c(cfY.hBC))
        j -= 2;
      else if (paramdhJ.c(cfY.hBB)) {
        j--;
      }
    }
    return i <= j;
  }

  public static boolean a(dhJ paramdhJ, eu parameu, bfE parambfE, bzj parambzj) {
    bPk localbPk = parambzj.b(parambfE, paramdhJ, null, paramdhJ.bEY());
    int i = localbPk.j(parameu);
    if (i == 0) {
      return true;
    }
    int j = paramdhJ.d(parameu).value();
    return i <= j;
  }

  public static boolean a(bzj parambzj) {
    return parambzj.bHY();
  }

  public static boolean c(dhJ paramdhJ, bzj parambzj) {
    return (!paramdhJ.cLK()) || (parambzj.bIb());
  }
}