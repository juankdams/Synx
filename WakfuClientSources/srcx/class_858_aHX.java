import java.io.Reader;

public class aHX extends bit
  implements bEc
{
  private StringBuffer ego;

  public aHX()
  {
    this.ego = new StringBuffer();
  }

  public aHX(Reader paramReader)
  {
    super(paramReader);
    this.ego = new StringBuffer();
  }

  public final int read()
  {
    if (!btp()) {
      initialize();
      ax(true);
    }

    int i = -1;
    if (this.ego.length() == 0) {
      i = this.in.read();
      if (i != -1) {
        char c = (char)i;
        if (c >= '') {
          this.ego = aZC.H(c);
          i = 92;
        }
      }
    } else {
      i = this.ego.charAt(0);
      this.ego.deleteCharAt(0);
    }
    return i;
  }

  public final Reader b(Reader paramReader)
  {
    aHX localaHX = new aHX(paramReader);
    localaHX.ax(true);
    return localaHX;
  }

  private void initialize()
  {
  }
}