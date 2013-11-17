import java.util.HashMap;
import java.util.Map;

public enum cns
{
  private static final Map cFX;
  private final int bQS;

  public static cns vS(int paramInt)
  {
    return (cns)cFX.get(Integer.valueOf(paramInt));
  }

  private cns(int arg3)
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

    for (cns localcns : values())
      cFX.put(Integer.valueOf(localcns.bQS), localcns);
  }
}