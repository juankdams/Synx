import java.util.HashMap;
import java.util.Map;

public enum dCM
{
  private static final Map cFX;
  private final int bQS;

  public static dCM Cs(int paramInt)
  {
    return (dCM)cFX.get(Integer.valueOf(paramInt));
  }

  private dCM(int arg3)
  {
    int j;
    this.bQS = j;
  }

  public int intValue() {
    return this.bQS;
  }

  static
  {
    cFX = new HashMap();

    for (dCM localdCM : values())
      cFX.put(Integer.valueOf(localdCM.bQS), localdCM);
  }
}