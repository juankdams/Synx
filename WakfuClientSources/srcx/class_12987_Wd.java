import java.util.HashMap;
import java.util.Map;

public enum Wd
{
  private static final Map cFX;
  private final int bQS;

  public static Wd hb(int paramInt)
  {
    return (Wd)cFX.get(Integer.valueOf(paramInt));
  }

  private Wd(int arg3)
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

    for (Wd localWd : values())
      cFX.put(Integer.valueOf(localWd.bQS), localWd);
  }
}