import java.io.Reader;
import java.util.Enumeration;
import java.util.Vector;

public class aAd extends bgQ
  implements bEc
{
  private Vector bTR = new Vector();

  private adq dSI = null;

  private String dSJ = null;

  private String aXy = null;

  private int aXz = 0;

  public aAd()
  {
  }

  public aAd(Reader paramReader)
  {
    super(paramReader);
  }

  public int read()
  {
    if (this.dSI == null) {
      this.dSI = new asN();
    }
    while ((this.aXy == null) || (this.aXy.length() == 0)) {
      this.aXy = this.dSI.g(this.in);
      if (this.aXy == null) {
        return -1;
      }
      for (Enumeration localEnumeration = this.bTR.elements(); localEnumeration.hasMoreElements(); ) {
        cBO localcBO = (cBO)localEnumeration.nextElement();
        this.aXy = localcBO.dR(this.aXy);
        if (this.aXy == null) {
          break;
        }
      }
      this.aXz = 0;
      if ((this.aXy != null) && 
        (this.dSI.apr().length() != 0)) {
        if (this.dSJ != null)
          this.aXy += this.dSJ;
        else {
          this.aXy += this.dSI.apr();
        }
      }
    }

    int i = this.aXy.charAt(this.aXz);
    this.aXz += 1;
    if (this.aXz == this.aXy.length()) {
      this.aXy = null;
    }
    return i;
  }

  public final Reader b(Reader paramReader)
  {
    aAd localaAd = new aAd(paramReader);
    localaAd.bTR = this.bTR;
    localaAd.dSI = this.dSI;
    localaAd.dSJ = this.dSJ;
    localaAd.b(Ga());
    return localaAd;
  }

  public void fW(String paramString)
  {
    this.dSJ = fX(paramString);
  }

  public void a(asN paramasN)
  {
    a(paramasN);
  }

  public void a(cJP paramcJP)
  {
    a(paramcJP);
  }

  public void a(bgV parambgV)
  {
    a(parambgV);
  }

  public void a(adq paramadq)
  {
    if (this.dSI != null) {
      throw new cJ("Only one tokenizer allowed");
    }
    this.dSI = paramadq;
  }

  public void a(dMm paramdMm)
  {
    this.bTR.addElement(paramdMm);
  }

  public void a(XX paramXX)
  {
    this.bTR.addElement(paramXX);
  }

  public void a(dHE paramdHE)
  {
    this.bTR.addElement(paramdHE);
  }

  public void a(aKL paramaKL)
  {
    this.bTR.addElement(paramaKL);
  }

  public void a(dxG paramdxG)
  {
    this.bTR.addElement(paramdxG);
  }

  public void a(dQD paramdQD)
  {
    this.bTR.addElement(paramdQD);
  }

  public void a(diD paramdiD)
  {
    this.bTR.addElement(paramdiD);
  }

  public void a(cBO paramcBO)
  {
    this.bTR.addElement(paramcBO);
  }

  public static String fX(String paramString)
  {
    return bof.fX(paramString);
  }

  public static int fY(String paramString)
  {
    return afN.eh(paramString);
  }
}