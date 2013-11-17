import java.io.Reader;
import java.util.Vector;

public final class GD extends bit
  implements bEc
{
  private static final String bOT = "comment";
  private Vector bOU = new Vector();

  private String aXy = null;

  public GD()
  {
  }

  public GD(Reader paramReader)
  {
    super(paramReader);
  }

  public int read()
  {
    if (!btp()) {
      initialize();
      ax(true);
    }

    int i = -1;

    if (this.aXy != null) {
      i = this.aXy.charAt(0);
      if (this.aXy.length() == 1)
        this.aXy = null;
      else
        this.aXy = this.aXy.substring(1);
    }
    else {
      this.aXy = readLine();
      int j = this.bOU.size();

      while (this.aXy != null) {
        for (int k = 0; k < j; k++) {
          String str = (String)this.bOU.elementAt(k);
          if (this.aXy.startsWith(str)) {
            this.aXy = null;
            break;
          }
        }

        if (this.aXy != null)
          break;
        this.aXy = readLine();
      }

      if (this.aXy != null) {
        return read();
      }
    }

    return i;
  }

  public void a(csR paramcsR)
  {
    this.bOU.addElement(paramcsR.getValue());
  }

  private void c(Vector paramVector)
  {
    this.bOU = paramVector;
  }

  private Vector QB()
  {
    return this.bOU;
  }

  public Reader b(Reader paramReader)
  {
    GD localGD = new GD(paramReader);
    localGD.c(QB());
    localGD.ax(true);
    return localGD;
  }

  private void initialize()
  {
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null)
      for (int i = 0; i < arrayOfdaL.length; i++)
        if ("comment".equals(arrayOfdaL[i].getType()))
          this.bOU.addElement(arrayOfdaL[i].getValue());
  }
}