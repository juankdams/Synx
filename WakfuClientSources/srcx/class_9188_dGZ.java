import java.io.File;
import java.util.StringTokenizer;

public class dGZ
{
  private StringTokenizer lRT;
  private String lRU = null;

  private boolean lRV = aCt.gd("netware");
  private boolean lRW;

  public dGZ(String paramString)
  {
    if (this.lRV)
    {
      this.lRT = new StringTokenizer(paramString, ":;", true);
    }
    else
    {
      this.lRT = new StringTokenizer(paramString, ":;", false);
    }
    this.lRW = (File.pathSeparatorChar == ';');
  }

  public boolean hasMoreTokens()
  {
    if (this.lRU != null) {
      return true;
    }

    return this.lRT.hasMoreTokens();
  }

  public String nextToken()
  {
    String str1 = null;
    if (this.lRU != null) {
      str1 = this.lRU;
      this.lRU = null;
    } else {
      str1 = this.lRT.nextToken().trim();
    }
    String str2;
    if (!this.lRV) {
      if ((str1.length() == 1) && (Character.isLetter(str1.charAt(0))) && (this.lRW) && (this.lRT.hasMoreTokens()))
      {
        str2 = this.lRT.nextToken().trim();
        if ((str2.startsWith("\\")) || (str2.startsWith("/")))
        {
          str1 = str1 + ":" + str2;
        }
        else {
          this.lRU = str2;
        }
      }
    }
    else
    {
      if ((str1.equals(File.pathSeparator)) || (str1.equals(":")))
      {
        str1 = this.lRT.nextToken().trim();
      }

      if (this.lRT.hasMoreTokens())
      {
        str2 = this.lRT.nextToken().trim();

        if (!str2.equals(File.pathSeparator)) {
          if (str2.equals(":")) {
            if ((!str1.startsWith("/")) && (!str1.startsWith("\\")) && (!str1.startsWith(".")) && (!str1.startsWith("..")))
            {
              String str3 = this.lRT.nextToken().trim();
              if (!str3.equals(File.pathSeparator)) {
                str1 = str1 + ":" + str3;
              } else {
                str1 = str1 + ":";
                this.lRU = str3;
              }
            }

          }
          else
          {
            this.lRU = str2;
          }
        }
      }
    }
    return str1;
  }
}