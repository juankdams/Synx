public class aZu
{
  private static final String fgl = "";
  private static final String[] fgm = new String[''];
  public static final char LF = '\n';
  public static final char CR = '\r';

  public static Character w(char paramChar)
  {
    return Character.valueOf(paramChar);
  }

  public static Character hF(String paramString)
  {
    if (cOg.f(paramString)) {
      return null;
    }
    return Character.valueOf(paramString.charAt(0));
  }

  public static char a(Character paramCharacter)
  {
    if (paramCharacter == null) {
      throw new IllegalArgumentException("The Character must not be null");
    }
    return paramCharacter.charValue();
  }

  public static char a(Character paramCharacter, char paramChar)
  {
    if (paramCharacter == null) {
      return paramChar;
    }
    return paramCharacter.charValue();
  }

  public static char hG(String paramString)
  {
    if (cOg.f(paramString)) {
      throw new IllegalArgumentException("The String must not be empty");
    }
    return paramString.charAt(0);
  }

  public static char b(String paramString, char paramChar)
  {
    if (cOg.f(paramString)) {
      return paramChar;
    }
    return paramString.charAt(0);
  }

  public static int x(char paramChar)
  {
    if (!F(paramChar)) {
      throw new IllegalArgumentException("The character " + paramChar + " is not in the range '0' - '9'");
    }
    return paramChar - '0';
  }

  public static int a(char paramChar, int paramInt)
  {
    if (!F(paramChar)) {
      return paramInt;
    }
    return paramChar - '0';
  }

  public static int b(Character paramCharacter)
  {
    if (paramCharacter == null) {
      throw new IllegalArgumentException("The character must not be null");
    }
    return x(paramCharacter.charValue());
  }

  public static int a(Character paramCharacter, int paramInt)
  {
    if (paramCharacter == null) {
      return paramInt;
    }
    return a(paramCharacter.charValue(), paramInt);
  }

  public static String toString(char paramChar)
  {
    if (paramChar < '') {
      return fgm[paramChar];
    }
    return new String(new char[] { paramChar });
  }

  public static String c(Character paramCharacter)
  {
    if (paramCharacter == null) {
      return null;
    }
    return toString(paramCharacter.charValue());
  }

  public static String y(char paramChar)
  {
    if (paramChar < '\020')
      return "\\u000" + Integer.toHexString(paramChar);
    if (paramChar < 'Ā')
      return "\\u00" + Integer.toHexString(paramChar);
    if (paramChar < 'က') {
      return "\\u0" + Integer.toHexString(paramChar);
    }
    return "\\u" + Integer.toHexString(paramChar);
  }

  public static String d(Character paramCharacter)
  {
    if (paramCharacter == null) {
      return null;
    }
    return y(paramCharacter.charValue());
  }

  public static boolean z(char paramChar)
  {
    return paramChar < '';
  }

  public static boolean A(char paramChar)
  {
    return (paramChar >= ' ') && (paramChar < '');
  }

  public static boolean B(char paramChar)
  {
    return (paramChar < ' ') || (paramChar == '');
  }

  public static boolean C(char paramChar)
  {
    return ((paramChar >= 'A') && (paramChar <= 'Z')) || ((paramChar >= 'a') && (paramChar <= 'z'));
  }

  public static boolean D(char paramChar)
  {
    return (paramChar >= 'A') && (paramChar <= 'Z');
  }

  public static boolean E(char paramChar)
  {
    return (paramChar >= 'a') && (paramChar <= 'z');
  }

  public static boolean F(char paramChar)
  {
    return (paramChar >= '0') && (paramChar <= '9');
  }

  public static boolean G(char paramChar)
  {
    return ((paramChar >= 'A') && (paramChar <= 'Z')) || ((paramChar >= 'a') && (paramChar <= 'z')) || ((paramChar >= '0') && (paramChar <= '9'));
  }

  static
  {
    for (int i = 127; i >= 0; i--)
      fgm[i] = "".substring(i, i + 1);
  }
}