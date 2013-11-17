import java.util.Iterator;
import org.apache.log4j.Logger;

public class bLC
  implements bWU, Iterator
{
  protected static final Logger K = Logger.getLogger(bLC.class);

  private static bOO fFD = new bOO(new LN());
  private dDN fFE;
  private cHu fFF;
  private aVc fFG = null;
  private aVc gPk;
  private boolean fFK = false;

  public void aJ()
  {
  }

  public void bc()
  {
    this.fFF = null;
    this.fFG = null;
    this.gPk = null;
    this.fFE = null;
  }

  public static bLC a(dDN paramdDN, cHu paramcHu, aVc paramaVc)
  {
    if ((paramcHu != null) && (paramaVc != null))
    {
      bLC localbLC;
      try {
        localbLC = (bLC)fFD.Mm();
      } catch (Exception localException) {
        localbLC = new bLC();
        K.error("erreur dans le checkOut de " + localbLC.getClass());
      }
      localbLC.fFE = paramdDN;
      localbLC.fFF = paramcHu;
      localbLC.gPk = paramaVc;
      return localbLC;
    }

    if (paramcHu == null) {
      throw new UnsupportedOperationException("checkOut d'un iterator sans liste derrière");
    }
    throw new UnsupportedOperationException("checkOut d'un  ChildIterator sans parent");
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
      if (this.fFG.bkn() == this.gPk) {
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
    this.fFE.H(this.fFG);
  }
}