public class bsx
{
  public static int qJ(int paramInt)
  {
    if (paramInt == -1)
      return 100;
    int i = paramInt;
    int j = i / 1000 + 1;
    int k = j * 100;
    return i + k;
  }
}