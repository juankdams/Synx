import org.apache.log4j.Logger;

public class cRk extends aJD
{
  private static aee kDz = new bOO(new dqR());

  public static cRk a(ayT paramayT, cOE paramcOE)
  {
    cRk localcRk;
    try
    {
      localcRk = (cRk)kDz.Mm();
      localcRk.a(kDz);
    }
    catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type EffectAreaManager : " + localException.getMessage());
      localcRk = new cRk();
      localcRk.a(null);
      localcRk.aJ();
    }
    localcRk.a(paramayT);
    localcRk.b(paramcOE);
    return localcRk;
  }

  public cjK ee(long paramLong)
  {
    aAn localaAn = bMF.bUo().fo(paramLong);
    if (localaAn == null) {
      K.error("pas de modele de zone d'effet d'id " + paramLong);
      return null;
    }
    return localaAn.a(null);
  }
}