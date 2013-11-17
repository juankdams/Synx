import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cSx
  implements bBz, bWU
{
  private static final Logger K = Logger.getLogger(cSx.class);

  private static final aee aOr = new bOO(new dUO());
  protected aee fnG;
  protected boolean kEQ = false;

  protected CH kER = null;

  protected boolean kES = false;
  protected aNL kET;
  protected aNL kEU;
  protected final ArrayList kEV = new ArrayList();

  public void o(aNL paramaNL)
  {
    this.kEV.add(paramaNL);
  }

  public aNL cIh()
  {
    int i = this.kEV.size();
    return i > 0 ? (aNL)this.kEV.remove(i - 1) : null;
  }

  public boolean cIi()
  {
    return !this.kEV.isEmpty();
  }

  public boolean cIj()
  {
    return this.kEQ;
  }

  public void iG(boolean paramBoolean)
  {
    this.kEQ = paramBoolean;
  }

  public aNL cIk()
  {
    return this.kEU;
  }

  public void p(aNL paramaNL)
  {
    this.kEU = paramaNL;
  }

  public aNL cIl()
  {
    return this.kET;
  }

  public aNL cIm()
  {
    return cIk();
  }

  public void q(aNL paramaNL)
  {
    this.kET = paramaNL;
  }

  public CH mp()
  {
    return this.kER;
  }

  public void b(CH paramCH)
  {
    this.kER = paramCH;
  }

  public boolean cIn() {
    return this.kES;
  }

  public void iH(boolean paramBoolean) {
    this.kES = paramBoolean;
  }

  public static cSx cIo()
  {
    cSx localcSx;
    try
    {
      localcSx = (cSx)aOr.Mm();
      localcSx.fnG = aOr;
    } catch (Exception localException) {
      K.error("Problème au borrowObject.");
      localcSx = new cSx();
      localcSx.aJ();
    }
    return localcSx;
  }

  public void release() {
    if (this.fnG == null) {
      bc();
      return;
    }
    try
    {
      this.fnG.y(this);
    } catch (Exception localException) {
      bc();
    }
  }

  public void bc()
  {
    this.kET = null;
    this.kEU = null;

    this.kEV.clear();

    this.fnG = null;
  }

  public void aJ() {
    this.kES = false;
    this.kEQ = false;
  }

  public String toString()
  {
    return "Event type=" + mp();
  }
}