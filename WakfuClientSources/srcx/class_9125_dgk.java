import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dgk
{
  private static Logger K = Logger.getLogger(dgk.class);
  private final ArrayList lbj;
  private final int lbk;
  private final String lbl;
  private final URL aJK;
  private final cEa lbm;
  private static int kYj = 0;

  protected dgk(String paramString, int paramInt) {
    dFb localdFb = cBQ.cxL().mP(paramString);
    if (localdFb == null) {
      throw new Exception("Ressource invalide : " + paramString);
    }

    if (localdFb.lOx != null) {
      cEa localcEa = null;
      try {
        localcEa = (cEa)localdFb.lOx.newInstance();
      }
      catch (Exception localException) {
      }
      this.aJK = null;
      this.lbm = localcEa;
    } else {
      this.lbm = null;
      this.aJK = localdFb.aJK;
    }

    this.lbk = paramInt;
    this.lbl = paramString;
    this.lbj = new ArrayList(paramInt);
  }

  private boolean r(aNL paramaNL)
  {
    if (this.lbj.size() < this.lbk) {
      this.lbj.add(paramaNL);
      return true;
    }
    return false;
  }

  public aNL cPL()
  {
    if (this.lbj.size() > 0) {
      return (aNL)this.lbj.remove(0);
    }
    return null;
  }

  public int getMaxSize()
  {
    return this.lbk;
  }

  public String cFZ()
  {
    return this.lbl;
  }

  public boolean cPM()
  {
    return this.lbk > this.lbj.size();
  }

  public void cPN()
  {
    cDA localcDA = cBQ.cxL().coO();
    while (cPM()) {
      aNL localaNL = null;
      cpa localcpa = localcDA.nd(this.lbl + kYj++);
      if (this.lbm != null)
        localaNL = (aNL)this.lbm.a(localcDA, localcpa);
      else if (this.aJK != null) {
        try {
          localaNL = cBQ.cxL().a(this.aJK, localcDA, localcpa, false, null, null, null);
        } catch (Exception localException) {
          K.error("Problème lors du changement d'un xml : " + this.aJK, localException);
        }
      }
      if (localaNL != null)
        if (!r(localaNL))
          localaNL.release();
        else
          K.info("Chargement d'une ressource " + this.lbl);
    }
  }

  public void clean()
  {
    for (int i = this.lbj.size() - 1; i >= 0; i--) {
      ((aNL)this.lbj.get(i)).release();
    }
    this.lbj.clear();
  }
}