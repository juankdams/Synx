import java.text.ParsePosition;

final class djX
  implements ce
{
  public String a(String paramString, ParsePosition paramParsePosition, aSz paramaSz)
  {
    int i = paramParsePosition.getIndex();
    if (paramString.length() - i >= 2)
    {
      if (('$' == paramString.charAt(i)) && ('$' == paramString.charAt(++i))) {
        paramParsePosition.setIndex(i);
      }
    }
    return null;
  }
}