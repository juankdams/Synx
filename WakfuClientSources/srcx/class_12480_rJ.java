import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

final class rJ extends Nc
{
  public int a(DisplayedScreenElement paramDisplayedScreenElement1, DisplayedScreenElement paramDisplayedScreenElement2)
  {
    abR localabR = Xe();
    float f1 = localabR.cQt;
    float f2 = localabR.cQu;
    cXf localcXf = localabR.cQs;

    float f3 = a(paramDisplayedScreenElement1, f1, f2, localcXf);
    float f4 = a(paramDisplayedScreenElement2, f1, f2, localcXf);

    if (f3 > f4) {
      return 1;
    }
    if (f3 < f4) {
      return -1;
    }
    return 0;
  }

  private float a(DisplayedScreenElement paramDisplayedScreenElement, float paramFloat1, float paramFloat2, cXf paramcXf) {
    ScreenElement localScreenElement = paramDisplayedScreenElement.bpc();
    cYm localcYm = up.a(paramcXf, localScreenElement.ddI(), localScreenElement.ddJ(), localScreenElement.ddH());
    return cEl.ag(paramFloat1 - localcYm.aOR, paramFloat2 - localcYm.aOS);
  }
}