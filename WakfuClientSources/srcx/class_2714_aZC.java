public class aZC
{
  public static StringBuffer H(char paramChar)
  {
    StringBuffer localStringBuffer = new StringBuffer("u0000");
    String str = Integer.toHexString(paramChar);

    for (int i = 0; i < str.length(); i++) {
      localStringBuffer.setCharAt(localStringBuffer.length() - str.length() + i, str.charAt(i));
    }

    return localStringBuffer;
  }
}