import java.util.HashMap;
import java.util.Map;

public enum dWm
{
  private static final Map cFX;
  private final int bQS;

  public static dWm Em(int paramInt)
  {
    return (dWm)cFX.get(Integer.valueOf(paramInt));
  }

  private dWm(int arg3)
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

    for (dWm localdWm : values())
      cFX.put(Integer.valueOf(localdWm.bQS), localdWm);
  }
}