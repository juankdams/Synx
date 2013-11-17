import java.util.BitSet;
import java.util.Collection;
import org.apache.log4j.Logger;

public final class aIz extends bIL
{
  private static final aee bx = new bOO(new dxB());

  protected aee Bq()
  {
    return bx;
  }

  public aIz() {
    aH();
    this.eWR.set(2124);
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    aAn localaAn = bMF.bUo().fo(this.cxl);
    if ((localaAn != null) && (this.eUw != null) && (this.evo != null)) {
      d(localaAn);
      if ((this.ejP == null) || (this.ejP.LC() == null)) {
        K.warn("Impossible d'ajouter une zone d'effet au combat le contexte est null ou l'effectAreaManager est null");
        return;
      }
      b(paramaVc, paramBoolean);
    } else {
      K.error("Impossible d'ajouter une zone inconnue " + this.cxl);
      jJ(true);
    }
    Object localObject = null;
    Collection localCollection = this.ejP.LC().bbj();
    for (cjK localcjK : localCollection) {
      if (localcjK.axG() == this.evo)
      {
        if (localcjK.getType() == xj.bpt.xj()) {
          localObject = localcjK;
          break;
        }
      }
    }
    if (localObject == null) {
      this.gIX = null;
      return;
    }
    int i = localObject.fa();
    int j = localObject.fb();
    short s = localObject.fc();

    ((wN)this.gIX).i(this.eUw);
    ((wN)this.gIX).j(new cYk(i, j, s));
    this.gIX.mk();
    this.ejP.LC().g(this.gIX);
  }
}