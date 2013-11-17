import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;

public final class bdB
{
  private static final int fpp = 0;
  private static final byte fpq = -1;

  public static void b(aVn paramaVn)
  {
    paramaVn.j(0, (short)-1);
  }

  public static boolean c(aVn paramaVn) {
    return paramaVn.OW() == -1;
  }

  public static void a(aVn paramaVn, DisplayedScreenElement paramDisplayedScreenElement) {
    if (paramDisplayedScreenElement == null)
      b(paramaVn);
    else
      paramaVn.j(paramDisplayedScreenElement.OV(), paramDisplayedScreenElement.OW());
  }
}