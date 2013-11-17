import java.io.IOException;
import org.apache.log4j.Logger;

public abstract class cJK extends bdK
{
  private static final Logger K = Logger.getLogger(cJK.class);
  private static final bhG iHX = new aeZ();

  private final aoL iHY = new aoL();

  public void initialize() {
    cDI();
  }

  public void chX() {
    this.iHY.b(iHX);
  }

  protected void clear() {
    this.iHY.clear();
  }

  private void cDI() {
    cYL localcYL = cPV.cGZ().V((short)getX(), (short)getY());
    if (localcYL == null) {
      return;
    }
    dsc[] arrayOfdsc = localcYL.aDh();
    for (int i = 0; i < arrayOfdsc.length; i++) {
      dsc localdsc = arrayOfdsc[i];
      try {
        Wj localWj = Wj.a(localcYL, localdsc);
        localWj.initialize();
        e(localWj);
      } catch (IOException localIOException) {
        K.error("Impossible de charger le fichier d'animation de l'élément dynamic " + localdsc, localIOException);
      } catch (Exception localException) {
        K.error("Impossible de charger l'élément dynamic " + localdsc, localException);
      }
    }
  }

  public void e(Wj paramWj) {
    if (this.iHY.containsKey(paramWj.getId())) {
      K.error("Impossible d'ajouter un éléments interactif d'ID=" + paramWj.getId() + " à la partition " + this + " qui le contient déjà.");
      return;
    }
    this.iHY.put(paramWj.getId(), paramWj);
    dps.cXa().k(paramWj);
  }

  public void iM(long paramLong) {
    Wj localWj = (Wj)this.iHY.remove(paramLong);
    if (localWj != null) {
      localWj.clear();
      dps.cXa().l(localWj);
    }
  }

  public boolean U(dGy paramdGy) {
    return this.iHY.s(paramdGy);
  }
}