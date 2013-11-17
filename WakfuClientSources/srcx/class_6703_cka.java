import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

public final class cka extends bit
  implements bEc
{
  private static final char hKk = '@';
  private static final char hKl = '@';
  private String dLi = null;

  private String hKm = null;

  private int hKn = -1;

  private int hKo = -1;

  private Hashtable hKp = new Hashtable();

  private char hKq = '@';

  private char hKr = '@';

  public cka()
  {
  }

  public cka(Reader paramReader)
  {
    super(paramReader);
  }

  private int cmf() {
    if (this.hKo != -1) {
      int i = this.dLi.charAt(this.hKo++);
      if (this.hKo >= this.dLi.length()) {
        this.hKo = -1;
      }
      return i;
    }

    return this.in.read();
  }

  public int read()
  {
    if (!btp()) {
      initialize();
      ax(true);
    }

    if (this.hKn != -1) {
      i = this.hKm.charAt(this.hKn++);
      if (this.hKn >= this.hKm.length()) {
        this.hKn = -1;
      }
      return i;
    }

    int i = cmf();

    if (i == this.hKq) {
      StringBuffer localStringBuffer = new StringBuffer("");
      do {
        i = cmf();
        if (i == -1) break;
        localStringBuffer.append((char)i);
      }

      while (i != this.hKr);

      if (i == -1) {
        if ((this.dLi == null) || (this.hKo == -1))
          this.dLi = localStringBuffer.toString();
        else {
          this.dLi = (localStringBuffer.toString() + this.dLi.substring(this.hKo));
        }

        if (this.dLi.length() > 0)
          this.hKo = 0;
        else {
          this.hKo = -1;
        }
        return this.hKq;
      }
      localStringBuffer.setLength(localStringBuffer.length() - 1);

      String str1 = (String)this.hKp.get(localStringBuffer.toString());
      if (str1 != null) {
        if (str1.length() > 0) {
          this.hKm = str1;
          this.hKn = 0;
        }
        return read();
      }
      String str2 = localStringBuffer.toString() + this.hKr;
      if ((this.dLi == null) || (this.hKo == -1))
        this.dLi = str2;
      else {
        this.dLi = (str2 + this.dLi.substring(this.hKo));
      }
      this.hKo = 0;
      return this.hKq;
    }

    return i;
  }

  public void N(char paramChar)
  {
    this.hKq = paramChar;
  }

  private char cmg()
  {
    return this.hKq;
  }

  public void O(char paramChar)
  {
    this.hKr = paramChar;
  }

  private char cmh()
  {
    return this.hKr;
  }

  public void e(bFe parambFe)
  {
    g(parambFe);
  }

  public void a(wA paramwA)
  {
    this.hKp.put(paramwA.getKey(), paramwA.getValue());
  }

  private Properties f(bFe parambFe)
  {
    InputStream localInputStream = null;
    Properties localProperties = new Properties();
    try {
      localInputStream = parambFe.getInputStream();
      localProperties.load(localInputStream);
    } catch (IOException localIOException) {
      localIOException.printStackTrace();
    } finally {
      wh.c(localInputStream);
    }

    return localProperties;
  }

  private void a(Hashtable paramHashtable)
  {
    this.hKp = paramHashtable;
  }

  private Hashtable cmi()
  {
    return this.hKp;
  }

  public Reader b(Reader paramReader)
  {
    cka localcka = new cka(paramReader);
    localcka.N(cmg());
    localcka.O(cmh());
    localcka.a(cmi());
    localcka.ax(true);
    return localcka;
  }

  private void initialize()
  {
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null)
      for (int i = 0; i < arrayOfdaL.length; i++)
        if (arrayOfdaL[i] != null) {
          String str1 = arrayOfdaL[i].getType();
          String str2;
          String str3;
          if ("tokenchar".equals(str1)) {
            str2 = arrayOfdaL[i].getName();
            str3 = arrayOfdaL[i].getValue();
            if ("begintoken".equals(str2)) {
              if (str3.length() == 0) {
                throw new cJ("Begin token cannot be empty");
              }

              this.hKq = arrayOfdaL[i].getValue().charAt(0);
            } else if ("endtoken".equals(str2)) {
              if (str3.length() == 0) {
                throw new cJ("End token cannot be empty");
              }

              this.hKr = arrayOfdaL[i].getValue().charAt(0);
            }
          } else if ("token".equals(str1)) {
            str2 = arrayOfdaL[i].getName();
            str3 = arrayOfdaL[i].getValue();
            this.hKp.put(str2, str3);
          } else if ("propertiesfile".equals(str1)) {
            g(new WO(new File(arrayOfdaL[i].getValue())));
          }
        }
  }

  private void g(bFe parambFe)
  {
    Properties localProperties = f(parambFe);
    for (Enumeration localEnumeration = localProperties.keys(); localEnumeration.hasMoreElements(); ) {
      String str1 = (String)localEnumeration.nextElement();
      String str2 = localProperties.getProperty(str1);
      this.hKp.put(str1, str2);
    }
  }
}