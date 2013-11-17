import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bmO
  implements bWU, Iterator
{
  protected static final Logger K = Logger.getLogger(bmO.class);

  private static final bOO fFD = new bOO(new baI());
  private dDN fFE;
  private cHu fFF;
  private aVc fFG = null;
  private dle evo;
  private int fFH;
  private ArrayList fFI = new ArrayList();
  private boolean fFJ = false;

  private boolean fFK = false;

  public void aJ()
  {
  }

  public void bc()
  {
    for (aVc localaVc : this.fFI)
      this.fFE.H(localaVc);
    this.fFI.clear();
    this.fFF = null;
    this.fFG = null;
    this.evo = null;
    this.fFH = 0;
    this.fFE = null;
    this.fFJ = false;
  }

  public static bmO a(dDN paramdDN, cHu paramcHu, dle paramdle, int paramInt, boolean paramBoolean)
  {
    if ((paramcHu != null) && (paramdle != null))
    {
      bmO localbmO = null;
      try {
        localbmO = (bmO)fFD.Mm();
      } catch (Exception localException) {
        localbmO = new bmO();
        K.error("erreur dans le checkOut de " + localbmO.getClass());
      }
      localbmO.fFE = paramdDN;
      localbmO.fFF = paramcHu;
      localbmO.evo = paramdle;
      localbmO.fFH = paramInt;
      localbmO.fFJ = paramBoolean;
      return localbmO;
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
      if ((this.fFG.bke() == this.evo) && (this.fFG.wa() != null) && (((bqk)this.fFG.wa()).aI(this.fFH)))
      {
        return true;
      }
      if ((this.fFJ) && (this.fFG.getId() == bsj.fSj.getId())) {
        bPD localbPD = (bPD)this.fFG;
        if ((localbPD.bWs() == this.evo.getId()) && (localbPD.bWt().get(this.fFH))) {
          return true;
        }
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