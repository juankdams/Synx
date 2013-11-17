import java.io.Reader;

public class bBK extends dwE
  implements adq
{
  private static final int dCL = -2;
  private String guB = "";
  private int dCN = -2;
  private char[] guC = null;
  private boolean guD = false;
  private boolean guE = false;
  private boolean dCO = false;

  public void jD(String paramString)
  {
    this.guC = bof.fX(paramString).toCharArray();
  }

  public void fU(boolean paramBoolean)
  {
    this.guD = paramBoolean;
  }

  public void fV(boolean paramBoolean)
  {
    this.guE = paramBoolean;
  }

  public void cQ(boolean paramBoolean)
  {
    this.dCO = paramBoolean;
  }

  public String g(Reader paramReader)
  {
    int i = -1;
    if (this.dCN != -2) {
      i = this.dCN;
      this.dCN = -2;
    } else {
      i = paramReader.read();
    }
    if (i == -1) {
      return null;
    }
    int j = 1;
    this.guB = "";
    StringBuffer localStringBuffer1 = new StringBuffer();
    StringBuffer localStringBuffer2 = new StringBuffer();
    while (i != -1) {
      char c = (char)i;
      boolean bool = J(c);
      if (j != 0) {
        if (bool) {
          if (this.guD) {
            if (localStringBuffer1.length() == 0) {
              localStringBuffer1.append(c); break;
            }
            this.dCN = i;

            break;
          }
          localStringBuffer2.append(c);
          j = 0;
        } else {
          localStringBuffer1.append(c);
        }
      }
      else if (bool) {
        localStringBuffer2.append(c);
      } else {
        this.dCN = i;
        break;
      }

      i = paramReader.read();
    }
    this.guB = localStringBuffer2.toString();
    if (this.dCO) {
      localStringBuffer1.append(this.guB);
    }
    return localStringBuffer1.toString();
  }

  public String apr()
  {
    return (this.guE) || (this.dCO) ? "" : this.guB;
  }

  private boolean J(char paramChar) {
    if (this.guC == null) {
      return Character.isWhitespace(paramChar);
    }
    for (int i = 0; i < this.guC.length; i++) {
      if (this.guC[i] == paramChar) {
        return true;
      }
    }
    return false;
  }
}