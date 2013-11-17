import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public class us
{
  private long bia;
  private boolean eof;
  private long bib;
  private long bic;
  private char bid;
  private Reader reader;
  private boolean bie;

  public us(Reader paramReader)
  {
    this.reader = (paramReader.markSupported() ? paramReader : new BufferedReader(paramReader));

    this.eof = false;
    this.bie = false;
    this.bid = '\000';
    this.bib = 0L;
    this.bia = 1L;
    this.bic = 1L;
  }

  public us(InputStream paramInputStream)
  {
    this(new InputStreamReader(paramInputStream));
  }

  public us(String paramString)
  {
    this(new StringReader(paramString));
  }

  public void back()
  {
    if ((this.bie) || (this.bib <= 0L)) {
      throw new dbt("Stepping back two steps is not supported");
    }
    this.bib -= 1L;
    this.bia -= 1L;
    this.bie = true;
    this.eof = false;
  }

  public static int g(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      return paramChar - '0';
    }
    if ((paramChar >= 'A') && (paramChar <= 'F')) {
      return paramChar - '7';
    }
    if ((paramChar >= 'a') && (paramChar <= 'f')) {
      return paramChar - 'W';
    }
    return -1;
  }

  public boolean Dl() {
    return (this.eof) && (!this.bie);
  }

  public boolean Dm()
  {
    next();
    if (Dl()) {
      return false;
    }
    back();
    return true;
  }

  public char next()
  {
    int i;
    if (this.bie) {
      this.bie = false;
      i = this.bid;
    } else {
      try {
        i = this.reader.read();
      } catch (IOException localIOException) {
        throw new dbt(localIOException);
      }

      if (i <= 0) {
        this.eof = true;
        i = 0;
      }
    }
    this.bib += 1L;
    if (this.bid == '\r') {
      this.bic += 1L;
      this.bia = (i == 10 ? 0L : 1L);
    } else if (i == 10) {
      this.bic += 1L;
      this.bia = 0L;
    } else {
      this.bia += 1L;
    }
    this.bid = ((char)i);
    return this.bid;
  }

  public char h(char paramChar)
  {
    char c = next();
    if (c != paramChar) {
      throw aL("Expected '" + paramChar + "' and instead saw '" + c + "'");
    }

    return c;
  }

  public String cZ(int paramInt)
  {
    if (paramInt == 0) {
      return "";
    }

    char[] arrayOfChar = new char[paramInt];
    int i = 0;

    while (i < paramInt) {
      arrayOfChar[i] = next();
      if (Dl()) {
        throw aL("Substring bounds error");
      }
      i++;
    }
    return new String(arrayOfChar);
  }

  public char Dn()
  {
    while (true)
    {
      char c = next();
      if ((c == 0) || (c > ' '))
        return c;
    }
  }

  public String i(char paramChar)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    while (true) {
      char c = next();
      switch (c) {
      case '\000':
      case '\n':
      case '\r':
        throw aL("Unterminated string");
      case '\\':
        c = next();
        switch (c) {
        case 'b':
          localStringBuffer.append('\b');
          break;
        case 't':
          localStringBuffer.append('\t');
          break;
        case 'n':
          localStringBuffer.append('\n');
          break;
        case 'f':
          localStringBuffer.append('\f');
          break;
        case 'r':
          localStringBuffer.append('\r');
          break;
        case 'u':
          localStringBuffer.append((char)Integer.parseInt(cZ(4), 16));
          break;
        case '"':
        case '\'':
        case '/':
        case '\\':
          localStringBuffer.append(c);
          break;
        default:
          throw aL("Illegal escape.");
        }
        break;
      default:
        if (c == paramChar) {
          return localStringBuffer.toString();
        }
        localStringBuffer.append(c);
      }
    }
  }

  public String j(char paramChar)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    while (true) {
      char c = next();
      if ((c == paramChar) || (c == 0) || (c == '\n') || (c == '\r')) {
        if (c != 0) {
          back();
        }
        return localStringBuffer.toString().trim();
      }
      localStringBuffer.append(c);
    }
  }

  public String aK(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    while (true) {
      char c = next();
      if ((paramString.indexOf(c) >= 0) || (c == 0) || (c == '\n') || (c == '\r'))
      {
        if (c != 0) {
          back();
        }
        return localStringBuffer.toString().trim();
      }
      localStringBuffer.append(c);
    }
  }

  public Object Do()
  {
    char c = Dn();

    switch (c) {
    case '"':
    case '\'':
      return i(c);
    case '{':
      back();
      return new aoF(this);
    case '[':
      back();
      return new dQs(this);
    }

    StringBuffer localStringBuffer = new StringBuffer();
    while ((c >= ' ') && (",:]}/\\\"[{;=#".indexOf(c) < 0)) {
      localStringBuffer.append(c);
      c = next();
    }
    back();

    String str = localStringBuffer.toString().trim();
    if ("".equals(str)) {
      throw aL("Missing value");
    }
    return aoF.stringToValue(str);
  }

  public char k(char paramChar)
  {
    char c;
    try
    {
      long l1 = this.bib;
      long l2 = this.bia;
      long l3 = this.bic;
      this.reader.mark(1000000);
      do {
        c = next();
        if (c == 0) {
          this.reader.reset();
          this.bib = l1;
          this.bia = l2;
          this.bic = l3;
          return c;
        }
      }
      while (c != paramChar);
    } catch (IOException localIOException) {
      throw new dbt(localIOException);
    }

    back();
    return c;
  }

  public dbt aL(String paramString)
  {
    return new dbt(paramString + toString());
  }

  public String toString()
  {
    return " at " + this.bib + " [character " + this.bia + " line " + this.bic + "]";
  }
}