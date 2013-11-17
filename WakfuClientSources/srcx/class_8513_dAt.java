import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dAt
  implements bWU, Iterator
{
  protected static final Logger K = Logger.getLogger(dAt.class);

  private static final bOO fFD = new bOO(new wF());
  private dDN fFE;
  private cHu fFF;
  private aVc fFG = null;
  private dle hyD;
  private ArrayList fFI = new ArrayList();
  private boolean lHA = false;

  private boolean fFK = false;

  public void aJ()
  {
  }

  public void bc()
  {
    for (int i = 0; i < this.fFI.size(); i++)
      this.fFE.H((aVc)this.fFI.get(i));
    this.fFI.clear();
    this.fFF = null;
    this.fFG = null;
    this.hyD = null;
    this.fFE = null;
    this.lHA = false;
  }

  public static dAt a(dDN paramdDN, cHu paramcHu, dle paramdle, boolean paramBoolean)
  {
    if ((paramcHu != null) && (paramdle != null))
    {
      dAt localdAt;
      try {
        localdAt = (dAt)fFD.Mm();
      } catch (Exception localException) {
        localdAt = new dAt();
        K.error("erreur dans le checkOut de " + localdAt.getClass());
      }
      localdAt.fFE = paramdDN;
      localdAt.fFF = paramcHu;
      localdAt.hyD = paramdle;
      localdAt.lHA = paramBoolean;
      return localdAt;
    }

    if (paramcHu == null) {
      throw new UnsupportedOperationException("checkOut d'un iterator sans liste derrière");
    }
    throw new UnsupportedOperationException("checkOut d'un  LinkedToEffectUserIterator sans effectUser");
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
      if (((this.fFG.bke() == this.hyD) && (!this.lHA)) || (this.fFG.bkf() == this.hyD)) {
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
    this.fFI.add(this.fFG);
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