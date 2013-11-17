import com.ankamagames.wakfu.client.alea.graphics.particle.WakfuFreeParticleSystem;
import java.io.FileNotFoundException;
import org.apache.log4j.Logger;

public class cyY extends cof
{
  public WakfuFreeParticleSystem H(String paramString, int paramInt)
  {
    WakfuFreeParticleSystem localWakfuFreeParticleSystem = new WakfuFreeParticleSystem(false);
    try
    {
      a(paramString, paramInt, localWakfuFreeParticleSystem);
    } catch (FileNotFoundException localFileNotFoundException) {
      K.error("FICHIER APS MANQUANT : " + paramString);
    } catch (Exception localException) {
      K.error("Erreur à la création d'une particule : ", localException);
    }

    return localWakfuFreeParticleSystem;
  }

  public boolean wa(int paramInt)
  {
    if (paramInt == -1)
      return true;
    return dmM.cUe().AN(paramInt);
  }
}