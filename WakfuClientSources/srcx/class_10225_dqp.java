import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.Comparator;

final class dqp
  implements Comparator
{
  public int a(DisplayedScreenElement paramDisplayedScreenElement1, DisplayedScreenElement paramDisplayedScreenElement2)
  {
    if (paramDisplayedScreenElement1 == paramDisplayedScreenElement2)
      return 0;
    return paramDisplayedScreenElement1.fis.lHr - paramDisplayedScreenElement2.fis.lHr;
  }
}