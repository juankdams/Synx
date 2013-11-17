import java.util.ArrayList;
import org.apache.log4j.Logger;

public class jQ
{
  protected static final Logger K = Logger.getLogger(jQ.class);

  private static final jQ aME = new jQ();

  private cjT aMF = new cjT();

  public static jQ rA()
  {
    return aME;
  }

  public static cHP a(cVZ paramcVZ, String paramString, boolean paramBoolean)
  {
    try
    {
      cHP localcHP = (cHP)paramcVZ.getRepresentationClass().newInstance();
      localcHP.jdMethod_if(paramBoolean);
      if (localcHP.aM(paramString)) {
        return localcHP;
      }
      K.error("Impossible d'initialiser l'HMIAction de type " + paramcVZ + " parametres=" + paramString);
      return null;
    } catch (InstantiationException localInstantiationException) {
      K.error("Erreur d'instanciation d'un actionType : " + paramcVZ.getLabel());
      return null;
    } catch (IllegalAccessException localIllegalAccessException) {
      K.error("Accès non authorisé pour l'instanciation d'un actionType : " + paramcVZ.getLabel());
    }return null;
  }

  public cHP a(byte paramByte, String paramString, boolean paramBoolean)
  {
    return b(cVZ.eI(paramByte), paramString, paramBoolean);
  }

  private cHP b(cVZ paramcVZ, String paramString, boolean paramBoolean) {
    cHP localcHP = a(paramcVZ, paramString, paramBoolean);
    if (localcHP != null) {
      this.aMF.set(localcHP.getId(), localcHP);
    }
    return localcHP;
  }

  public static ArrayList af(String paramString) {
    ArrayList localArrayList = new ArrayList();
    if (paramString.length() == 0) {
      return localArrayList;
    }
    for (String str : dzp.c(paramString, '~')) {
      cHP localcHP = cHP.nr(str);
      if (localcHP != null) {
        localArrayList.add(localcHP);
      }
    }
    return localArrayList;
  }

  public cHP be(int paramInt) {
    return (cHP)this.aMF.get(paramInt);
  }

  public int rB() {
    return this.aMF.size();
  }
}