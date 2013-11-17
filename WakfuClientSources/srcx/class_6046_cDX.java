import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import java.io.IOException;
import org.apache.log4j.Logger;

public class cDX
  implements aRn
{
  private aOv cLK;

  public cDX(SoundFunctionsLibrary paramSoundFunctionsLibrary, aOv paramaOv)
  {
    if (paramaOv == null) {
      throw new IllegalArgumentException("le groupe défini est null !");
    }
    this.cLK = paramaOv;
  }

  public final aVB a(long paramLong1, float paramFloat, int paramInt1, long paramLong2, long paramLong3, int paramInt2) {
    if ((!bB) && (this.cLK == null)) throw new AssertionError("Le groupe est null ! Comment est-ce possible ?");

    if (!this.cLK.bfg().bIK()) {
      SoundFunctionsLibrary.K.warn("On essaie de jouer un son alors que le son n'est pas initialisé");
      return null;
    }
    blq localblq;
    try
    {
      localblq = this.cLK.bfh().gL(paramLong1);
    } catch (IOException localIOException) {
      return null;
    }

    if (localblq == null) {
      return null;
    }

    ZG localZG = this.cLK.a(localblq, -1L);
    if (localZG == null) {
      return null;
    }

    localZG.ae(paramFloat);
    if (paramInt1 == 0)
      localZG.bE(true);
    else if (paramInt1 > 1) {
      localZG.hy(paramInt1);
    }

    if (paramLong2 != -1L) {
      localZG.cv(paramLong2);
    }

    if (paramLong3 != -1L) {
      localZG.cw(paramLong3);
    }

    this.cLK.a(localZG);

    return localZG;
  }

  public aVB a(long paramLong1, float paramFloat, int paramInt1, long paramLong2, long paramLong3, int paramInt2, cbI paramcbI, int paramInt3, boolean paramBoolean)
  {
    return a(paramLong1, paramFloat, paramInt1, paramLong2, paramLong3, paramInt2);
  }

  public void a(long paramLong, ZG paramZG) {
    this.cLK.bfg(); bAw.e(paramZG);
  }

  public void bbc()
  {
  }

  public void G(float paramFloat1, float paramFloat2)
  {
  }

  public void bbb()
  {
  }
}