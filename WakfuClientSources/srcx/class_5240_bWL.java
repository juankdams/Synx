import java.util.HashMap;
import java.util.Map;

public enum bWL
{
  private static final Map cFX;
  private final int bQS;

  public static bWL uk(int paramInt)
  {
    return (bWL)cFX.get(Integer.valueOf(paramInt));
  }

  private bWL(int arg3)
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

    for (bWL localbWL : values())
      cFX.put(Integer.valueOf(localbWL.bQS), localbWL);
  }
}