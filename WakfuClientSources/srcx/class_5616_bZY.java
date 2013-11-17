public enum bZY
{
  private int value;

  private bZY(int arg3)
  {
    int j;
    this.value = j;
  }

  public final int value()
  {
    return this.value;
  }

  public static int a(bZY[] paramArrayOfbZY)
  {
    int i = 0;
    for (bZY localbZY : paramArrayOfbZY) {
      i |= localbZY.value();
    }
    return i;
  }

  public static int b(bZY[] paramArrayOfbZY)
  {
    int i = hqD.value;
    for (bZY localbZY : paramArrayOfbZY) {
      i &= (localbZY.value() ^ 0xFFFFFFFF);
    }
    return i;
  }

  public static boolean a(int paramInt, bZY parambZY)
  {
    return (paramInt & parambZY.value()) != 0;
  }

  public static boolean b(int paramInt, bZY parambZY)
  {
    return (paramInt & parambZY.value()) == 0;
  }
}