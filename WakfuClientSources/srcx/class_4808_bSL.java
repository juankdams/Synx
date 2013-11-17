import java.util.Comparator;

class bSL
  implements Comparator
{
  static final bSL hdZ = new bSL();

  static int a(CharSequence paramCharSequence1, CharSequence paramCharSequence2) {
    int i = 0;
    int j = 0;
    int k = 0;
    while (true)
    {
      char c1 = c(paramCharSequence1, j);
      char c2 = c(paramCharSequence2, k);

      if ((!Character.isDigit(c1)) && (!Character.isDigit(c2)))
        return i;
      if (!Character.isDigit(c1))
        return -1;
      if (!Character.isDigit(c2))
        return 1;
      if (c1 < c2) {
        if (i == 0)
          i = -1;
      }
      else if (c1 > c2) {
        if (i == 0)
          i = 1;
      }
      else if ((c1 == 0) && (c2 == 0))
        return i;
      j++; k++;
    }
  }

  public int b(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    String str1 = paramCharSequence1.toString();
    String str2 = paramCharSequence2.toString();

    int i = 0; int j = 0;
    int k = 0; int m = 0;
    while (true)
    {
      k = m = 0;

      char c1 = c(str1, i);
      char c2 = c(str2, j);

      while ((Character.isSpaceChar(c1)) || (c1 == '0')) {
        if (c1 == '0') {
          k++;
        }
        else {
          k = 0;
        }

        c1 = c(str1, ++i);
      }

      while ((Character.isSpaceChar(c2)) || (c2 == '0')) {
        if (c2 == '0') {
          m++;
        }
        else {
          m = 0;
        }

        c2 = c(str2, ++j);
      }
      int n;
      if ((Character.isDigit(c1)) && (Character.isDigit(c2)) && 
        ((n = a(str1.substring(i), str2.substring(j))) != 0)) {
        return n;
      }

      if ((c1 == 0) && (c2 == 0))
      {
        return k - m;
      }

      if (c1 < c2) {
        return -1;
      }
      if (c1 > c2) {
        return 1;
      }

      i++;
      j++;
    }
  }

  static char c(CharSequence paramCharSequence, int paramInt) {
    return paramInt >= paramCharSequence.length() ? '\000' : paramCharSequence.charAt(paramInt);
  }
}