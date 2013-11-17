public class bPe
{
  public static String f(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    String str1 = "";
    String str2;
    if ((paramInt2 != -1) && (paramInt1 == paramInt2)) {
      str1 = paramInt1 >= 0 ? "+" : "";
      str2 = "FFF82D";
    } else if (paramInt1 < 0) {
      str2 = "C62700";
    } else {
      str1 = "+";
      str2 = "55AA55";
    }

    String str3 = str1 + paramInt1 + '%';
    if (paramBoolean) {
      lZ locallZ = new lZ();
      locallZ.tI().am(str2).a(str3);
      return locallZ.tP();
    }
    return str3;
  }

  public static String tI(int paramInt)
  {
    lZ locallZ = new lZ();
    if (paramInt < 0)
      locallZ.tI().am("C62700");
    else if (paramInt > 0) {
      locallZ.tI().am("55AA55").a("+");
    }

    locallZ.bw(paramInt);
    return locallZ.tP();
  }
}