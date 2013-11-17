import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.Collections;
import java.util.List;

public enum bYP
{
  private final boolean hoJ;
  private final Nc hoK;

  private static int b(DisplayedScreenElement paramDisplayedScreenElement1, DisplayedScreenElement paramDisplayedScreenElement2)
  {
    long l1 = paramDisplayedScreenElement1.GG().mnP;
    long l2 = paramDisplayedScreenElement2.GG().mnP;
    if (l1 < l2)
      return 1;
    if (l1 > l2) {
      return -1;
    }
    return 0;
  }

  private bYP(boolean arg3, Nc arg4)
  {
    boolean bool;
    this.hoJ = bool;
    Object localObject;
    this.hoK = localObject;
  }

  public void a(List paramList, abR paramabR) {
    this.hoK.a(paramabR);
    Collections.sort(paramList, this.hoK);
  }

  public boolean cdv() {
    return this.hoJ;
  }
}