import java.util.Comparator;

public enum ctB
{
  private static final dPx gws;
  public final byte bUy;
  public final Comparator cdQ;

  private ctB(int arg3, Comparator arg4)
  {
    int i;
    this.bUy = ((byte)i);
    Object localObject;
    this.cdQ = localObject;
  }

  public static ctB dV(byte paramByte) {
    return (ctB)gws.bf(paramByte);
  }

  static
  {
    gws = new dPx();

    ctB[] arrayOfctB = values();
    for (int i = 0; i < arrayOfctB.length; i++) {
      ctB localctB = arrayOfctB[i];
      gws.c(localctB.bUy, localctB);
    }
  }
}