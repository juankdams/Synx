import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import org.apache.log4j.Logger;

public class bHg extends bDf
{
  private static final bHg gFu = new bHg();
  private static final Logger K = Logger.getLogger(bHg.class);

  public static bHg bOQ()
  {
    return gFu;
  }

  public final XulorParticleSystem jM(String paramString)
  {
    return A(paramString, gyc);
  }

  public XulorParticleSystem A(String paramString, int paramInt) {
    XulorParticleSystem localXulorParticleSystem = new XulorParticleSystem();
    try
    {
      a(paramString, paramInt, localXulorParticleSystem);
    } catch (Exception localException) {
      K.error("erreur de création de particule " + paramString, localException);
      return null;
    }

    return localXulorParticleSystem;
  }
}