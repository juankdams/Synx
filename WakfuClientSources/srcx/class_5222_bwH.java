import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class bwH
{
  protected static final Logger K = Logger.getLogger(bwH.class);
  protected ciK ghg;
  protected final ArrayList bWD = new ArrayList();

  public final void a(ciK paramciK)
  {
    this.ghg = paramciK;
  }

  public ciK bEn() {
    return this.ghg;
  }

  public final void a(cIq paramcIq)
  {
    this.bWD.add(paramcIq);
  }

  public final void b(cIq paramcIq)
  {
    this.bWD.remove(paramcIq);
  }

  public void bEo()
  {
    this.bWD.clear();
  }

  public aZK gh(long paramLong)
  {
    return l(paramLong, false);
  }

  public aZK l(long paramLong, boolean paramBoolean) {
    try {
      for (cIq localcIq : this.bWD) {
        dmf localdmf = localcIq.iL(paramLong);
        if (localdmf != null)
        {
          aZK localaZK = a(paramLong, localdmf.dYr, localdmf.bFC, paramBoolean);
          a(localaZK, localcIq);
          return localaZK;
        }
      }
      K.error("Aucune définition trouvée pour l'instance d'élement interactif " + paramLong);
    } catch (Exception localException) {
      K.error("Exception lors de InteractiveElementFactory.createInteractiveElement(" + paramLong + ")", localException);
    }
    return null;
  }

  public aZK a(long paramLong, short paramShort, byte[] paramArrayOfByte)
  {
    return a(paramLong, paramShort, paramArrayOfByte, true);
  }

  private aZK a(long paramLong, short paramShort, byte[] paramArrayOfByte, boolean paramBoolean) {
    dfN localdfN = this.ghg.dc(paramShort);
    if (localdfN == null) {
      K.error("Aucune factory d'enregistrée pour un élément interactif de type " + paramShort);
      return null;
    }
    aZK localaZK = (aZK)localdfN.p();
    if (paramBoolean)
      localaZK.boO();
    localaZK.a(paramLong);
    localaZK.bD(paramShort);
    localaZK.q(paramArrayOfByte);
    return localaZK;
  }

  protected abstract void a(aZK paramaZK, cIq paramcIq);
}