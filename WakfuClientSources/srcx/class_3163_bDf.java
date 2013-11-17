import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.io.FilenameFilter;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class bDf extends dPs
{
  public static final String gyb = ".xps";
  public static int gyc = 1;

  public final FilenameFilter gyd = new YG(this);

  protected bDf()
  {
    super(5242880L, true);
  }

  public abstract ParticleSystem jI(String paramString);

  public String getExtension()
  {
    return ".xps";
  }

  public final FilenameFilter getFilenameFilter()
  {
    return this.gyd;
  }

  protected String ss(int paramInt)
  {
    return getPath() + paramInt + getExtension();
  }

  protected void a(int paramInt1, int paramInt2, ParticleSystem paramParticleSystem) {
    String str = ss(paramInt1);
    a(str, paramInt2, paramParticleSystem);
  }
  protected void a(String paramString, int paramInt, ParticleSystem paramParticleSystem) { a(paramParticleSystem, paramString);
    b(paramString, paramInt, paramParticleSystem);
    paramParticleSystem.cjb();
    long l;
    try {
      l = 0x0 | paramParticleSystem.hEX;
    } catch (Exception localException) {
      K.error("The name of a particle system must be a number" + localException);
      l = 0x0 | byn.jp(dtb.pY(paramString));
    }

    String str = dtb.qa(paramString) + '/' + paramParticleSystem.hEX + ".tga";
    tq localtq = tq.Bg();
    uz localuz = localtq.aw(l);
    if (localuz == null) {
      crX localcrX = new crX(str);
      localuz = localtq.a(dHL.lSB.dhZ(), l, localcrX, false);
      localcrX.axl();
    }
    paramParticleSystem.g(localuz);
  }

  protected void b(String paramString, int paramInt, ParticleSystem paramParticleSystem)
  {
    QX.log("particule", paramString);
    paramParticleSystem.SL = paramString;
    paramParticleSystem.hEY = bUD.f(dtb.pY(paramString), 0);
    dEs.a(paramString, paramParticleSystem, paramInt); } 
  protected void a(ParticleSystem paramParticleSystem, String paramString) { int i = paramString.lastIndexOf('/');
    int j = paramString.lastIndexOf('\\');
    int k = i > j ? i : j;
    int m = paramString.indexOf('.', k);
    String str = paramString.substring(k + 1, m);
    long l;
    try { l = 0x0 | Integer.parseInt(str);
    } catch (Exception localException) {
      l = 0x0 | byn.jp(str);
    }
    paramParticleSystem.hs(l);
  }

  public final void a(int paramInt, ParticleSystem paramParticleSystem)
  {
    try
    {
      paramParticleSystem.cja().clear();
      Emitter[] arrayOfEmitter = paramParticleSystem.cji();
      dEs.a(paramParticleSystem.SL, paramParticleSystem, paramInt);
      int i = 0; for (int j = arrayOfEmitter.length; i < j; i++) {
        dmN localdmN = (dmN)paramParticleSystem.cja().get(i);
        arrayOfEmitter[i].a(localdmN);
      }
      paramParticleSystem.cjd();
    } catch (Exception localException) {
      K.error("", localException);
    }
  }

  protected final ahb ah(byte[] paramArrayOfByte)
  {
    return new ahb(this, paramArrayOfByte);
  }
}