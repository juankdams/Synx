import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class cof extends bDf
{
  protected static final Logger K = Logger.getLogger(cof.class);

  private static cof hVK = new cof();

  public static cof cop() {
    return hVK;
  }

  public static void a(cof paramcof)
  {
    hVK = paramcof;
  }

  public final FreeParticleSystem vY(int paramInt)
  {
    return lC(ss(paramInt));
  }

  public final FreeParticleSystem dC(int paramInt1, int paramInt2)
  {
    return G(ss(paramInt1), paramInt2);
  }

  public final FreeParticleSystem lC(String paramString)
  {
    return G(paramString, gyc);
  }

  public FreeParticleSystem G(String paramString, int paramInt)
  {
    return b(paramString, paramInt, false);
  }

  public FreeParticleSystem b(String paramString, int paramInt, boolean paramBoolean)
  {
    FreeParticleSystem localFreeParticleSystem = new FreeParticleSystem(paramBoolean);
    try
    {
      a(paramString, paramInt, localFreeParticleSystem);
    } catch (Exception localException) {
      K.error("particle " + paramString, localException);
    }
    return localFreeParticleSystem;
  }

  public final CellParticleSystem vZ(int paramInt)
  {
    return dD(paramInt, gyc);
  }

  public CellParticleSystem dD(int paramInt1, int paramInt2)
  {
    try
    {
      CellParticleSystem localCellParticleSystem = coq();
      a(paramInt1, paramInt2, localCellParticleSystem);

      if (localCellParticleSystem.getDuration() != 0) {
        K.error("Le systeme de particule attaché à la cellule " + localCellParticleSystem.getX() + "/" + localCellParticleSystem.getY() + " possède une durée.");
      }
      return localCellParticleSystem;
    }
    catch (Exception localException) {
      K.error("Impossible de charger le système de particule : " + paramInt1 + " " + ss(paramInt1), localException);
    }
    return null;
  }

  protected CellParticleSystem coq()
  {
    return new CellParticleSystem(false);
  }

  public boolean wa(int paramInt) {
    return true;
  }
}