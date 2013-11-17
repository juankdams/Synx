import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class UF extends bRt
  implements bNe
{
  private String cyg = null;
  private boolean cyh = true;
  private boolean cyi = false;
  private String encoding = null;
  public static final String iC = "expression";
  public static final String cyj = "text";
  public static final String cyk = "casesensitive";
  public static final String cyl = "ignorewhitespace";

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{containsselector text: ");
    localStringBuilder.append('"').append(this.cyg).append('"');
    localStringBuilder.append(" casesensitive: ");
    localStringBuilder.append(this.cyh ? "true" : "false");
    localStringBuilder.append(" ignorewhitespace: ");
    localStringBuilder.append(this.cyi ? "true" : "false");
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void setText(String paramString)
  {
    this.cyg = paramString;
  }

  public void setEncoding(String paramString)
  {
    this.encoding = paramString;
  }

  public void bu(boolean paramBoolean)
  {
    this.cyh = paramBoolean;
  }

  public void bv(boolean paramBoolean)
  {
    this.cyi = paramBoolean;
  }

  public void a(daL[] paramArrayOfdaL)
  {
    super.a(paramArrayOfdaL);
    if (paramArrayOfdaL != null)
      for (int i = 0; i < paramArrayOfdaL.length; i++) {
        String str = paramArrayOfdaL[i].getName();
        if ("text".equalsIgnoreCase(str))
          setText(paramArrayOfdaL[i].getValue());
        else if ("casesensitive".equalsIgnoreCase(str)) {
          bu(FF.bP(paramArrayOfdaL[i].getValue()));
        }
        else if ("ignorewhitespace".equalsIgnoreCase(str)) {
          bv(FF.bP(paramArrayOfdaL[i].getValue()));
        }
        else
          be("Invalid parameter " + str);
      }
  }

  public void cd()
  {
    if (this.cyg == null)
      be("The text attribute is required");
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    return a(new WO(paramFile2));
  }

  public boolean a(bFe parambFe)
  {
    validate();

    if ((parambFe.isDirectory()) || (this.cyg.length() == 0)) {
      return true;
    }

    String str1 = this.cyg;
    if (!this.cyh) {
      str1 = this.cyg.toLowerCase();
    }
    if (this.cyi) {
      str1 = dvA.qv(str1);
    }
    BufferedReader localBufferedReader = null;
    try {
      if (this.encoding != null)
        localBufferedReader = new BufferedReader(new InputStreamReader(parambFe.getInputStream(), this.encoding));
      else
        localBufferedReader = new BufferedReader(new InputStreamReader(parambFe.getInputStream()));
    }
    catch (Exception localException) {
      throw new cJ("Could not get InputStream from " + parambFe.bMV(), localException);
    }
    try
    {
      String str2 = localBufferedReader.readLine();
      boolean bool;
      while (str2 != null) {
        if (!this.cyh) {
          str2 = str2.toLowerCase();
        }
        if (this.cyi) {
          str2 = dvA.qv(str2);
        }
        if (str2.indexOf(str1) > -1) {
          return true;
        }
        str2 = localBufferedReader.readLine();
      }
      return false;
    } catch (IOException localIOException) {
      throw new cJ("Could not read " + parambFe.bMV());
    } finally {
      wh.e(localBufferedReader);
    }
  }
}