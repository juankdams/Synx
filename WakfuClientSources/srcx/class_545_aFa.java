import java.util.HashMap;
import org.apache.log4j.Logger;

public class aFa
{
  protected static final Logger K = Logger.getLogger(aFa.class);

  private static final aFa eaT = new aFa();

  protected final HashMap eaU = new HashMap();

  public static aFa aRA()
  {
    return eaT;
  }

  public bHF dQ(long paramLong)
  {
    return (bHF)this.eaU.get(Long.valueOf(paramLong));
  }

  public boolean a(bHF parambHF) {
    if (this.eaU.containsKey(Long.valueOf(parambHF.getId()))) {
      K.info("Impossible d'ajouter l'échange " + parambHF.getClass().getName() + " : un échange avec le même ID (" + parambHF.getId() + ") existe déjà.");
      return false;
    }
    if (this.eaU.containsKey(Long.valueOf(parambHF.bOZ()))) {
      K.info("Impossible d'ajouter l'échange " + parambHF.getClass().getName() + " : un échange avec le même ID (" + parambHF.bOZ() + ") existe déjà.");

      return false;
    }

    this.eaU.put(Long.valueOf(parambHF.getId()), parambHF);
    this.eaU.put(Long.valueOf(parambHF.bOZ()), parambHF);

    return true;
  }

  public boolean b(bHF parambHF) {
    return (this.eaU.remove(Long.valueOf(parambHF.getId())) != null) && (this.eaU.remove(Long.valueOf(parambHF.bOZ())) != null);
  }
}