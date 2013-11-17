import java.util.Iterator;
import org.apache.log4j.Logger;

public class dgc
  implements bWU, Iterator
{
  protected static final Logger K = Logger.getLogger(dgc.class);

  private static final bOO fFD = new bOO(new dHG());
  private dDN fFE;
  private cHu fFF;
  private aVc fFG = null;
  private Ce lba;
  private boolean fFK = false;

  public void aJ()
  {
  }

  public void bc()
  {
    this.fFF = null;
    this.fFG = null;
    this.lba = null;
    this.fFE = null;
  }

  public static dgc a(dDN paramdDN, cHu paramcHu, Ce paramCe)
  {
    if ((paramcHu != null) && (paramCe != null))
    {
      dgc localdgc;
      try {
        localdgc = (dgc)fFD.Mm();
      } catch (Exception localException) {
        localdgc = new dgc();
        K.error("erreur dans le checkOut de " + localdgc.getClass());
      }
      localdgc.fFE = paramdDN;
      localdgc.fFF = paramcHu;
      localdgc.lba = paramCe;
      return localdgc;
    }

    if (paramcHu == null) {
      throw new UnsupportedOperationException("checkOut d'un iterator sans liste derrière");
    }
    throw new UnsupportedOperationException("checkOut d'un  LinkedToEffectContainerIterator sans container");
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
      if ((this.fFG.wa() != null) && (this.fFG.wa().nS() == this.lba.nS()) && (this.fFG.wa().nT() == this.lba.nT()))
      {
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

  public void release()
  {
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