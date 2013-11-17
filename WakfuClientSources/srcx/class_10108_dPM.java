import java.io.Reader;

public final class dPM extends bgQ
  implements bEc
{
  private int miT = -1;

  private boolean miU = false;

  private boolean miV = false;

  public dPM()
  {
  }

  public dPM(Reader paramReader)
  {
    super(paramReader);
  }

  public int read()
  {
    int i = -1;
    if (this.miT != -1) {
      i = this.miT;
      this.miT = -1;
    } else {
      i = this.in.read();
      if ((i == 34) && (!this.miV)) {
        this.miU = (!this.miU);
        this.miV = false;
      } else if (i == 92) {
        this.miV = (!this.miV);
      } else {
        this.miV = false;
        if ((!this.miU) && 
          (i == 47)) {
          i = this.in.read();
          if (i == 47) {
            while ((i != 10) && (i != -1) && (i != 13))
              i = this.in.read();
          }
          if (i == 42) {
            do { do { if (i == -1) break;
                i = this.in.read(); }
              while (i != 42);
              i = this.in.read();
              while (i == 42) {
                i = this.in.read();
              }
            }
            while (i != 47);
            i = read();
          }
          else
          {
            this.miT = i;
            i = 47;
          }
        }
      }

    }

    return i;
  }

  public Reader b(Reader paramReader)
  {
    dPM localdPM = new dPM(paramReader);
    return localdPM;
  }
}