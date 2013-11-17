import java.util.Iterator;
import org.apache.log4j.Logger;

public class cMm
  implements bWU, Iterator
{
  protected static final Logger K = Logger.getLogger(cMm.class);

  private static final bOO fFD = new bOO(new dca());
  private dDN dcP;
  private cHu fFF;
  private aVc fFG = null;
  private gA aUe;
  private boolean fFK = false;

  public void aJ()
  {
  }

  public void bc()
  {
    this.fFF = null;
    this.fFG = null;
    this.aUe = null;
    this.dcP = null;
  }

  public static cMm a(dDN paramdDN, cHu paramcHu, gA paramgA) {
    if ((paramcHu != null) && (paramgA != null))
    {
      cMm localcMm;
      try {
        localcMm = (cMm)fFD.Mm();
      } catch (Exception localException) {
        localcMm = new cMm();
        K.error("erreur dans le checkOut de " + localcMm.getClass());
      }
      localcMm.dcP = paramdDN;
      localcMm.fFF = paramcHu;
      localcMm.aUe = paramgA;
      return localcMm;
    }

    if (paramcHu == null) {
      throw new UnsupportedOperationException("checkOut d'un iterator sans liste derrière");
    }
    throw new UnsupportedOperationException("checkOut d'un LinkedToItemIterator sans item");
  }

  public boolean hasNext()
  {
    this.fFK = true;
    if (!this.fFF.hasNext()) {
      return false;
    }
    while (this.fFF.hasNext()) {
      this.fFF.fl();
      this.fFG = ((aVc)this.fFF.value());

      Ce localCe = this.fFG.wa();
      if ((localCe != null) && 
        (localCe.nS() == 12) && 
        ((localCe instanceof gA)))
      {
        if (((gA)localCe).oj() == this.aUe.oj())
          return true; 
      }
    }
    return false;
  }

  public aVc bxt() {
    if ((!this.fFK) && 
      (!hasNext()))
      throw new UnsupportedOperationException("Depassement de liste, cause probable : appel de next() sans vérification");
    this.fFK = false;
    return this.fFG;
  }

  public void remove() {
    this.fFF.remove();
    this.dcP.H(this.fFG);
  }

  public void release() {
    if (fFD != null)
      try {
        fFD.y(this);
      } catch (Exception localException) {
        K.error("impossible");
      }
    else
      bc();
  }
}