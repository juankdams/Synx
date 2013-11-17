import java.io.Reader;

public class asN extends dwE
  implements adq
{
  private static final int dCL = -2;
  private String dCM = "";
  private int dCN = -2;
  private boolean dCO = false;

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

    this.dCM = "";
    StringBuffer localStringBuffer = new StringBuffer();

    int j = 0;
    while (i != -1) {
      if (j == 0) {
        if (i == 13) {
          j = 1; } else {
          if (i == 10) {
            this.dCM = "\n";
            break;
          }
          localStringBuffer.append((char)i);
        }
      } else {
        j = 0;
        if (i == 10) {
          this.dCM = "\r\n"; break;
        }
        this.dCN = i;
        this.dCM = "\r";

        break;
      }
      i = paramReader.read();
    }
    if ((i == -1) && (j == 1)) {
      this.dCM = "\r";
    }

    if (this.dCO) {
      localStringBuffer.append(this.dCM);
    }
    return localStringBuffer.toString();
  }

  public String apr()
  {
    if (this.dCO) {
      return "";
    }
    return this.dCM;
  }
}