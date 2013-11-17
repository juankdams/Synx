public enum a
{
  private int value;

  private a(int arg3)
  {
    int n;
    this.value = n;
  }

  public final int value()
  {
    return this.value;
  }

  public static int a(a[] paramArrayOfa)
  {
    int i = 0;
    for (a locala : paramArrayOfa) {
      i |= locala.value();
    }
    return i;
  }

  public static int b(a[] paramArrayOfa)
  {
    int i = I.value;
    for (a locala : paramArrayOfa) {
      i &= (locala.value() ^ 0xFFFFFFFF);
    }
    return i;
  }

  public static boolean a(int paramInt, a parama)
  {
    return (paramInt & parama.value()) != 0;
  }

  public static boolean b(int paramInt, a parama)
  {
    return (paramInt & parama.value()) == 0;
  }
}