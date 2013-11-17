import java.io.Reader;

public class diD extends dwE
  implements bEc, cBO
{
  private String leS = "";

  public void pi(String paramString)
  {
    this.leS = aAd.fX(paramString);
  }

  public String dR(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramString.length());
    for (int i = 0; i < paramString.length(); i++) {
      char c = paramString.charAt(i);
      if (!V(c)) {
        localStringBuffer.append(c);
      }
    }
    return localStringBuffer.toString();
  }

  public Reader b(Reader paramReader)
  {
    return new afh(this, paramReader);
  }

  private boolean V(char paramChar)
  {
    for (int i = 0; i < this.leS.length(); i++) {
      if (this.leS.charAt(i) == paramChar) {
        return true;
      }
    }
    return false;
  }
}