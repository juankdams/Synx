import java.util.HashMap;
import java.util.Map;

public enum afm
{
  private static final Map cFX;
  private final int bQS;

  public static afm hU(int paramInt)
  {
    return (afm)cFX.get(Integer.valueOf(paramInt));
  }

  private afm(int arg3)
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

    for (afm localafm : values())
      cFX.put(Integer.valueOf(localafm.bQS), localafm);
  }
}