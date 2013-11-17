import java.util.HashMap;
import java.util.Map;

public enum bGj
{
  private static final Map cFX;
  private final int bQS;

  public static bGj sM(int paramInt)
  {
    return (bGj)cFX.get(Integer.valueOf(paramInt));
  }

  private bGj(int arg3)
  {
    int j;
    this.bQS = j;
  }

  public int intValue()
  {
    return this.bQS;
  }

  static
  {
    cFX = new HashMap();

    for (bGj localbGj : values())
      cFX.put(Integer.valueOf(localbGj.bQS), localbGj);
  }
}