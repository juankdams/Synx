import java.text.ParsePosition;
import java.util.Collection;

public class azu
  implements aSz
{
  private final FF aIn;
  private final Yb dQH;
  private final Collection dQI;

  public azu(FF paramFF, Collection paramCollection, Yb paramYb)
  {
    this.aIn = paramFF;
    this.dQI = paramCollection;
    this.dQH = paramYb;
  }

  public FF Ga()
  {
    return this.aIn;
  }

  public Object ei(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return paramString;
    }
    int i = paramString.length();
    ParsePosition localParsePosition = new ParsePosition(0);
    Object localObject = a(paramString, localParsePosition);
    if ((localObject != null) && (localParsePosition.getIndex() >= i)) {
      return localObject;
    }
    StringBuffer localStringBuffer = new StringBuffer(i * 2);
    if (localObject == null) {
      localStringBuffer.append(paramString.charAt(localParsePosition.getIndex()));
      localParsePosition.setIndex(localParsePosition.getIndex() + 1);
    } else {
      localStringBuffer.append(localObject);
    }
    while (localParsePosition.getIndex() < i) {
      localObject = a(paramString, localParsePosition);
      if (localObject == null) {
        localStringBuffer.append(paramString.charAt(localParsePosition.getIndex()));
        localParsePosition.setIndex(localParsePosition.getIndex() + 1);
      } else {
        localStringBuffer.append(localObject);
      }
    }
    return localStringBuffer.toString();
  }

  public boolean ej(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    int i = paramString.length();
    for (ParsePosition localParsePosition = new ParsePosition(0); localParsePosition.getIndex() < i; ) {
      if (b(paramString, localParsePosition) != null) {
        return true;
      }
      localParsePosition.setIndex(localParsePosition.getIndex() + 1);
    }
    return false;
  }

  public Object a(String paramString, ParsePosition paramParsePosition)
  {
    int i = paramParsePosition.getIndex();

    if (i > paramString.length())
    {
      return null;
    }

    String str = b(paramString, paramParsePosition);
    if (str != null) {
      Object localObject = getProperty(str);
      if (localObject != null) {
        return localObject;
      }
      if (this.aIn != null) {
        this.aIn.d("Property \"" + str + "\" has not been set", 3);
      }

      return paramString.substring(i, paramParsePosition.getIndex());
    }
    return null;
  }

  private String b(String paramString, ParsePosition paramParsePosition) {
    for (ce localce : this.dQI) {
      String str = localce.a(paramString, paramParsePosition, this);
      if (str != null)
      {
        return str;
      }
    }
    return null;
  }

  private Object getProperty(String paramString) {
    return this.dQH.getProperty(paramString);
  }
}