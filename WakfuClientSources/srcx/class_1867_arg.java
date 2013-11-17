public enum arg
{
  public static final short dze = 21;
  private final SB czh;
  private final short dzf;

  private arg(SB arg3, int arg4)
  {
    Object localObject;
    this.czh = localObject;
    int i;
    this.dzf = ((short)i);
  }

  public static short jE(int paramInt) {
    arg[] arrayOfarg = values();
    int i = 0; for (int j = arrayOfarg.length; i < j; i++) {
      arg localarg = arrayOfarg[i];
      if (localarg.czh.uO() == paramInt)
        return localarg.dzf;
    }
    return 0;
  }
}