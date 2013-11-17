import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class aS extends bRt
  implements bNe
{
  private String ix = null;
  private aeB iy = null;
  private cyp iz = null;
  private boolean caseSensitive = true;
  private boolean iA = false;
  private boolean iB = false;
  public static final String iC = "expression";
  private static final String iD = "casesensitive";
  private static final String iE = "multiline";
  private static final String iF = "singleline";

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{containsregexpselector expression: ");

    localStringBuilder.append(this.ix);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void setExpression(String paramString)
  {
    this.ix = paramString;
  }

  public void setCaseSensitive(boolean paramBoolean)
  {
    this.caseSensitive = paramBoolean;
  }

  public void d(boolean paramBoolean)
  {
    this.iA = paramBoolean;
  }

  public void e(boolean paramBoolean)
  {
    this.iB = paramBoolean;
  }

  public void a(daL[] paramArrayOfdaL)
  {
    super.a(paramArrayOfdaL);
    if (paramArrayOfdaL != null)
      for (int i = 0; i < paramArrayOfdaL.length; i++) {
        String str = paramArrayOfdaL[i].getName();
        if ("expression".equalsIgnoreCase(str))
          setExpression(paramArrayOfdaL[i].getValue());
        else if ("casesensitive".equalsIgnoreCase(str)) {
          setCaseSensitive(FF.bP(paramArrayOfdaL[i].getValue()));
        }
        else if ("multiline".equalsIgnoreCase(str))
          d(FF.bP(paramArrayOfdaL[i].getValue()));
        else if ("singleline".equalsIgnoreCase(str))
          e(FF.bP(paramArrayOfdaL[i].getValue()));
        else
          be("Invalid parameter " + str);
      }
  }

  public void cd()
  {
    if (this.ix == null)
      be("The expression attribute is required");
  }

  public boolean a(File paramFile1, String paramString, File paramFile2)
  {
    return a(new WO(paramFile2));
  }

  public boolean a(bFe parambFe)
  {
    String str = null;
    BufferedReader localBufferedReader = null;

    validate();

    if (parambFe.isDirectory()) {
      return true;
    }

    if (this.iy == null) {
      this.iy = new aeB();
      this.iy.setPattern(this.ix);
      this.iz = this.iy.r(Ga());
    }
    try
    {
      localBufferedReader = new BufferedReader(new InputStreamReader(parambFe.getInputStream()));
    } catch (Exception localException1) {
      throw new cJ("Could not get InputStream from " + parambFe.bMV(), localException1);
    }
    try
    {
      str = localBufferedReader.readLine();
      boolean bool;
      while (str != null)
      {
        if (this.iz.u(str, afN.b(this.caseSensitive, this.iA, this.iB)))
        {
          return true;
        }
        str = localBufferedReader.readLine();
      }

      return false;
    } catch (IOException localIOException) {
      throw new cJ("Could not read " + parambFe.bMV());
    } finally {
      try {
        localBufferedReader.close();
      } catch (Exception localException4) {
        throw new cJ("Could not close " + parambFe.bMV());
      }
    }
  }
}