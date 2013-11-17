import java.util.Arrays;

public class cIp
  implements auW
{
  private static char[] iDL = { 'a', 'e', 'i', 'o', 'u', 'y', 'é', 'è', 'ë', 'ê', 'â', 'ä', 'ü', 'û', 'ù', 'ô', 'ö', 'î', 'ï' };

  private static char[] iDM = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z' };

  private static char[] iDN = { ' ', '-', '\'' };
  private int iDO;
  private int iDP;
  private int iDQ;
  private int iDR;
  private int iDS;
  private int iDT;
  private int iDU;
  private int iDV;
  private int iDW;
  private int iDX;

  private static boolean Q(char paramChar)
  {
    return Arrays.binarySearch(iDL, paramChar) >= 0;
  }

  private static boolean R(char paramChar) {
    return Arrays.binarySearch(iDM, paramChar) >= 0;
  }

  private static boolean S(char paramChar) {
    return Arrays.binarySearch(iDN, paramChar) >= 0;
  }

  private static boolean I(char paramChar) {
    return (R(paramChar)) || (Q(paramChar)) || (S(paramChar));
  }

  private static boolean a(Character paramCharacter1, Character paramCharacter2) {
    return dzp.ib(paramCharacter1.toString()).equals(dzp.ib(paramCharacter2.toString()));
  }

  public cIp(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10) {
    this.iDO = paramInt1;
    this.iDP = paramInt2;
    this.iDQ = paramInt3;
    this.iDR = paramInt4;
    this.iDS = paramInt5;
    this.iDT = paramInt6;
    this.iDU = paramInt7;
    this.iDV = paramInt8;
    this.iDW = paramInt9;
    this.iDX = paramInt10;
  }

  public bzE fL(String paramString) {
    char[] arrayOfChar1 = paramString.toCharArray();

    for (int i = 0; i < arrayOfChar1.length; i++) {
      if (!I(arrayOfChar1[i]))
        return bzE.gnR;
    }
    if (paramString.length() < this.iDO) {
      return bzE.gnP;
    }
    if (paramString.length() > this.iDP) {
      return bzE.gnQ;
    }

    i = 0;
    int j = 0;
    int k = 1;
    int m = 0;
    char c = '/';
    for (int n = 0; n < arrayOfChar1.length; n++) {
      i1 = arrayOfChar1[n];
      if (Q(i1)) {
        i++;
        j = 0;
      } else if (R(i1)) {
        j++;
        i = 0;
      } else {
        m++;
        i = j = 0;
      }
      if (a(Character.valueOf(c), Character.valueOf(i1)))
        k++;
      else
        k = 1;
      c = i1;

      if (i > this.iDQ)
        return bzE.gnT;
      if (j > this.iDR)
        return bzE.gnS;
      if (k > this.iDS)
        return bzE.gnU;
      if (m > this.iDT) {
        return bzE.gnZ;
      }
    }

    String[] arrayOfString = paramString.split("([ -])");
    for (int i1 = 0; i1 < arrayOfString.length; i1++)
    {
      i = j = m = 0;
      char[] arrayOfChar2 = arrayOfString[i1].toCharArray();
      for (int i2 = 0; i2 < arrayOfChar2.length; i2++) {
        if (Q(arrayOfChar2[i2]))
          i++;
        else if (R(arrayOfChar2[i2]))
          j++;
        else if (S(arrayOfChar2[i2])) {
          m++;
        }
      }
      if (i < this.iDU)
        return bzE.gnV;
      if (j < this.iDV)
        return bzE.gnW;
      if (m > this.iDW)
        return bzE.gnX;
      if (arrayOfChar2.length > this.iDX) {
        return bzE.gnY;
      }
    }
    return bzE.gnO;
  }

  static
  {
    char[] arrayOfChar = new char[iDL.length * 2];
    System.arraycopy(iDL, 0, arrayOfChar, 0, iDL.length);
    for (int i = 0; i < iDL.length; i++)
      arrayOfChar[(iDL.length + i)] = Character.toUpperCase(iDL[i]);
    iDL = arrayOfChar;

    arrayOfChar = new char[iDM.length * 2];
    System.arraycopy(iDM, 0, arrayOfChar, 0, iDM.length);
    for (i = 0; i < iDM.length; i++)
      arrayOfChar[(iDM.length + i)] = Character.toUpperCase(iDM[i]);
    iDM = arrayOfChar;

    Arrays.sort(iDL);
    Arrays.sort(iDM);
    Arrays.sort(iDN);
  }
}