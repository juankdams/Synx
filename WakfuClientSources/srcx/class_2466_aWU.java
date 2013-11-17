public class aWU
{
  public static CharSequence b(CharSequence paramCharSequence, int paramInt)
  {
    return paramCharSequence == null ? null : paramCharSequence.subSequence(paramInt, paramCharSequence.length());
  }

  static int b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if ((paramCharSequence instanceof String)) {
      return ((String)paramCharSequence).indexOf(paramInt1, paramInt2);
    }
    int i = paramCharSequence.length();
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    for (int j = paramInt2; j < i; j++) {
      if (paramCharSequence.charAt(j) == paramInt1) {
        return j;
      }
    }
    return -1;
  }

  static int a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    return paramCharSequence1.toString().indexOf(paramCharSequence2.toString(), paramInt);
  }

  static int c(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if ((paramCharSequence instanceof String)) {
      return ((String)paramCharSequence).lastIndexOf(paramInt1, paramInt2);
    }
    int i = paramCharSequence.length();
    if (paramInt2 < 0) {
      return -1;
    }
    if (paramInt2 >= i) {
      paramInt2 = i - 1;
    }
    for (int j = paramInt2; j >= 0; j--) {
      if (paramCharSequence.charAt(j) == paramInt1) {
        return j;
      }
    }
    return -1;
  }

  static int b(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    return paramCharSequence1.toString().lastIndexOf(paramCharSequence2.toString(), paramInt);
  }

  static char[] d(CharSequence paramCharSequence)
  {
    if ((paramCharSequence instanceof String)) {
      return ((String)paramCharSequence).toCharArray();
    }
    int i = paramCharSequence.length();
    char[] arrayOfChar = new char[paramCharSequence.length()];
    for (int j = 0; j < i; j++) {
      arrayOfChar[j] = paramCharSequence.charAt(j);
    }
    return arrayOfChar;
  }

  static boolean a(CharSequence paramCharSequence1, boolean paramBoolean, int paramInt1, CharSequence paramCharSequence2, int paramInt2, int paramInt3)
  {
    if (((paramCharSequence1 instanceof String)) && ((paramCharSequence2 instanceof String))) {
      return ((String)paramCharSequence1).regionMatches(paramBoolean, paramInt1, (String)paramCharSequence2, paramInt2, paramInt3);
    }

    return paramCharSequence1.toString().regionMatches(paramBoolean, paramInt1, paramCharSequence2.toString(), paramInt2, paramInt3);
  }
}