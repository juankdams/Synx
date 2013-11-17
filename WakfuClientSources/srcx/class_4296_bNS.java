import java.io.Reader;
import java.util.Vector;

public final class bNS extends bit
  implements bEc
{
  private static final String gSU = "regexp";
  private static final String dBb = "negate";
  private static final String iD = "casesensitive";
  private Vector gSV = new Vector();

  private String aXy = null;

  private boolean dFF = false;
  private int gSW = 0;

  public bNS()
  {
  }

  public bNS(Reader paramReader)
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
      int j = this.gSV.size();

      for (this.aXy = readLine(); this.aXy != null; this.aXy = readLine()) {
        boolean bool = true;
        for (int k = 0; (bool) && (k < j); k++) {
          aeB localaeB = (aeB)this.gSV.elementAt(k);

          cyp localcyp = localaeB.r(Ga());
          bool = localcyp.u(this.aXy, this.gSW);
        }
        if ((bool ^ ajF())) {
          break;
        }
      }
      if (this.aXy != null) {
        return read();
      }
    }
    return i;
  }

  public void a(aeB paramaeB)
  {
    this.gSV.addElement(paramaeB);
  }

  private void e(Vector paramVector)
  {
    this.gSV = paramVector;
  }

  private Vector bVn()
  {
    return this.gSV;
  }

  public Reader b(Reader paramReader)
  {
    bNS localbNS = new bNS(paramReader);
    localbNS.e(bVn());
    localbNS.cN(ajF());
    localbNS.setCaseSensitive(!afN.aX(this.gSW, 256));

    return localbNS;
  }

  public void cN(boolean paramBoolean)
  {
    this.dFF = paramBoolean;
  }

  public void setCaseSensitive(boolean paramBoolean)
  {
    this.gSW = afN.bW(paramBoolean);
  }

  public boolean ajF()
  {
    return this.dFF;
  }

  private void initialize()
  {
    daL[] arrayOfdaL = buy();
    if (arrayOfdaL != null)
      for (int i = 0; i < arrayOfdaL.length; i++)
        if ("regexp".equals(arrayOfdaL[i].getType())) {
          String str = arrayOfdaL[i].getValue();
          aeB localaeB = new aeB();
          localaeB.setPattern(str);
          this.gSV.addElement(localaeB);
        } else if ("negate".equals(arrayOfdaL[i].getType())) {
          cN(FF.bP(arrayOfdaL[i].getValue()));
        } else if ("casesensitive".equals(arrayOfdaL[i].getType())) {
          setCaseSensitive(FF.bP(arrayOfdaL[i].getValue()));
        }
  }
}