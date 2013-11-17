import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class dX extends JY
{
  private static final Logger K = Logger.getLogger(dX.class);

  private final aoL VB = new aoL();

  private final List VC = new ArrayList();

  protected dX(aYr paramaYr) {
    super(paramaYr);
  }

  void a(cTK paramcTK) {
    for (int i = this.VC.size() - 1; i >= 0; i--)
      ((qT)this.VC.get(i)).i(paramcTK);
  }

  void b(cTK paramcTK) {
    for (int i = this.VC.size() - 1; i >= 0; i--)
      ((qT)this.VC.get(i)).a(UI(), paramcTK);
  }

  public void ir()
  {
  }

  public cTK o(long paramLong) {
    return (cTK)this.VB.get(paramLong);
  }

  public void a(qT paramqT)
  {
    if (paramqT == null)
      return;
    this.VC.add(paramqT);
  }

  public void b(qT paramqT)
  {
    this.VC.remove(paramqT);
  }

  public boolean c(cTK paramcTK) {
    cTK localcTK = (cTK)this.VB.get(paramcTK.getId());

    if ((!bB) && (localcTK != null) && (localcTK != paramcTK)) throw new AssertionError("On a trouvé 2 citoyens différents mais avec le même id dans la nation " + UI() + " : " + paramcTK + " - " + localcTK);

    return localcTK != null;
  }

  public abstract void d(cTK paramcTK);

  public abstract void p(long paramLong);

  public void a(long paramLong, dLC paramdLC)
  {
    throw new UnsupportedOperationException();
  }

  public void b(long paramLong, dLC paramdLC) {
    throw new UnsupportedOperationException();
  }

  public void e(cTK paramcTK)
  {
    cvY localcvY = paramcTK.cJf();

    if (localcvY.UI() != UI()) {
      K.error("[NATION] On essaye d'enregister le character " + paramcTK + " à la nation " + UI() + " mais il est semble etre dans la nation " + localcvY.UI());

      return;
    }

    if (this.VB.containsKey(paramcTK.getId())) {
      K.error("[NATION] On essaye d'enregistrer le character " + paramcTK + " à la nation " + UI().bP() + " mais il est déjà dedans");
      return;
    }

    this.VB.put(paramcTK.getId(), paramcTK);

    a(paramcTK);
  }

  public boolean f(cTK paramcTK)
  {
    if (this.VB.containsKey(paramcTK.getId())) {
      K.error("[NATION] On essaye d'ajouter le character " + paramcTK + " à la nation " + UI().bP() + " mais il est déjà dedans");
      return false;
    }

    cvY localcvY = paramcTK.cJf();
    aYr localaYr = localcvY.UI();

    boolean bool = localaYr.g(paramcTK);
    if (!bool) {
      K.error("[NATION] Impossible d'ajouter le joueur " + paramcTK + " à la nation " + UI() + " car on ne peut pas l'enlever à sa nation courante (" + localaYr + ")");

      return false;
    }

    this.VB.put(paramcTK.getId(), paramcTK);

    localcvY.c(UI());

    a(paramcTK);

    return true;
  }

  public boolean g(cTK paramcTK)
  {
    cTK localcTK = (cTK)this.VB.remove(paramcTK.getId());

    if (UI() != aYr.feh) {
      if (localcTK == null) {
        K.error("[NATION] On essaye de supprimer le character " + paramcTK + " de la nation " + UI() + " mais il n'est pas dans la liste des membres");
        return false;
      }

      if (localcTK != paramcTK) {
        K.error("[NATION] On essaye de supprimer le character + " + paramcTK + " d'id " + paramcTK.getId() + " de la nation " + UI() + " mais l'id donne le perso " + localcTK + ". Conflit d'ID ?");

        return false;
      }
    }

    b(paramcTK);
    return true;
  }

  public void a(dGy paramdGy)
  {
    this.VB.s(paramdGy);
  }

  public void q(long paramLong) {
    cTK localcTK = (cTK)this.VB.get(paramLong);

    if (localcTK == null) {
      K.error("[NATION] On essaye de retirer le character " + paramLong + " à la nation " + UI() + " suite à une déco mais il n'en fait pas partie");
      return;
    }

    this.VB.remove(paramLong);
  }

  public int is() {
    return this.VB.size();
  }
}