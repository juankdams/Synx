import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.EFX10;

public class cgL extends bez
{
  private int[] hEH = { 0 };

  public boolean TV() {
    if (!ALC10.alcIsExtensionPresent(ALC10.alcGetContextsDevice(ALC10.alcGetCurrentContext()), "ALC_EXT_EFX"))
      return false;
    try {
      this.hEH[0] = EFX10.alGenFilters();
      bAw.check();

      EFX10.alFilteri(this.hEH[0], 32769, 1);
      bAw.check();
    } catch (Exception localException) {
      bAw.bIJ().ei(false);
      return false;
    }

    bAw.bIJ().ei(true);
    return true;
  }

  public void cleanUp() {
    if (this.hEH[0] != 0) {
      bAw.check();
      EFX10.alDeleteFilters(this.hEH[0]);
      bAw.check();
      this.hEH[0] = 0;
    }

    this.hEH = null;
    super.cleanUp();
  }

  public dEX TW() {
    return dEX.lOn;
  }
}