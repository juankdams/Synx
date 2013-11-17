import java.text.ParsePosition;

final class djT
  implements ce
{
  public String a(String paramString, ParsePosition paramParsePosition, aSz paramaSz)
  {
    int i = paramParsePosition.getIndex();

    if ((paramString.length() - i >= 3) && ('$' == paramString.charAt(i)) && ('{' == paramString.charAt(i + 1)))
    {
      int j = i + 2;

      int k = paramString.indexOf('}', j);
      if (k < 0) {
        throw new cJ("Syntax error in property: " + paramString.substring(i));
      }

      paramParsePosition.setIndex(k + 1);
      return j == k ? "" : paramString.substring(j, k);
    }
    return null;
  }
}