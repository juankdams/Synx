import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.EFX10;

public class JH extends bez
{
  private int[] bUC = { 0 };
  private int[] bUD = { 0 };

  public boolean TV() {
    if (!ALC10.alcIsExtensionPresent(ALC10.alcGetContextsDevice(ALC10.alcGetCurrentContext()), "ALC_EXT_EFX"))
      return false;
    try {
      this.bUD[0] = EFX10.alGenAuxiliaryEffectSlots();
      bAw.check();

      this.bUC[0] = EFX10.alGenEffects();
      bAw.check();
    } catch (Exception localException) {
      return false;
    }

    return true;
  }

  public void cleanUp() {
    if (this.bUD[0] != 0) {
      EFX10.alDeleteAuxiliaryEffectSlots(this.bUD[0]);
      bAw.check();
      this.bUD[0] = 0;
    }

    if (this.bUC[0] != 0) {
      EFX10.alDeleteEffects(this.bUC[0]);
      bAw.check();
      this.bUC[0] = 0;
    }

    this.bUC = null;
    this.bUD = null;

    super.cleanUp();
  }

  public dEX TW() {
    return dEX.lOm;
  }
}