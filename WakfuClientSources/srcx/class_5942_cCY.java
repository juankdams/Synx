import java.util.HashMap;
import java.util.Map;

public enum cCY
{
  private static final Map cFX;
  private final int bQS;

  public static cCY xs(int paramInt)
  {
    return (cCY)cFX.get(Integer.valueOf(paramInt));
  }

  private cCY(int arg3)
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

    for (cCY localcCY : values())
      cFX.put(Integer.valueOf(localcCY.bQS), localcCY);
  }
}