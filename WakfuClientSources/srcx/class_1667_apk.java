import com.ankamagames.wakfu.client.binaryStorage.StaticEffectBinaryData;
import org.apache.log4j.Logger;

class apk
  implements aVS
{
  apk(ciQ paramciQ)
  {
  }

  public StaticEffectBinaryData js(int paramInt)
  {
    try
    {
      StaticEffectBinaryData localStaticEffectBinaryData = new StaticEffectBinaryData();
      if (cze.cwb().a(paramInt, localStaticEffectBinaryData))
        return localStaticEffectBinaryData;
    }
    catch (Exception localException) {
      ciQ.ch().error("erreur lors du chargement de l'effet " + paramInt, localException);
    }
    return null;
  }
}