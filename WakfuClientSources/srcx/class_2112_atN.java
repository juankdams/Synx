import java.io.Reader;
import java.util.Vector;

public final class atN extends bit
  implements bEc
{
  private static final String cyj = "contains";
  private static final String dBb = "negate";
  private Vector dFE = new Vector();

  private String aXy = null;

  private boolean dFF = false;

  public atN()
  {
  }

  public atN(Reader paramReader)
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
      int j = this.dFE.size();

      for (this.aXy = readLine(); this.aXy != null; this.aXy = readLine()) {
        int k = 1;
        for (int m = 0; (k != 0) && (m < j); m++) {
          String str = (String)this.dFE.elementAt(m);
          k = this.aXy.indexOf(str) >= 0 ? 1 : 0;
        }
        if ((k ^ ajF()) != 0) {
          break;
        }
      }
      if (this.aXy != null) {
        return read();
      }
    }
    return i;
  }

  public void a(OI paramOI)
  {
    this.dFE.addElement(paramOI.getValue());
  }

  public void cN(boolean paramBoolean)
  {
    this.dFF = paramBoolean;
  }

  public boolean ajF()
  {
    return this.dFF;
  }

  private void d(Vector paramVector)
  {
    this.dFE = paramVector;
  }

  private Vector aFS()
  {
    return this.dFE;
  }

  public Reader b(Reader paramReader)
  {
    atN localatN = new atN(paramReader);
    localatN.d(aFS());
    localatN.cN(ajF());
    return localatN;
  }

  private void initialize()
  {
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null)
      for (int i = 0; i < arrayOfdaL.length; i++)
        if ("contains".equals(arrayOfdaL[i].getType()))
          this.dFE.addElement(arrayOfdaL[i].getValue());
        else if ("negate".equals(arrayOfdaL[i].getType()))
          cN(FF.bP(arrayOfdaL[i].getValue()));
  }
}