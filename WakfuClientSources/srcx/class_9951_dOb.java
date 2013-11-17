import org.apache.log4j.Logger;

public abstract class dOb extends dqt
  implements bye
{
  private static final Logger K = Logger.getLogger(dOb.class);

  protected dOb(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, paramInt3);
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(this);
    cAo.cxf().ia(this.aPT);
    bZw();
  }

  public boolean a(cWG paramcWG)
  {
    K.warn("le personnage n'est pas encore arrivé a destination, le timer termine l'action.");
    return super.a(paramcWG);
  }
}