public enum amI
{
  public final int mask;

  private amI()
  {
    this.mask = (1 << ordinal());
  }

  public static int b(Iterable paramIterable) {
    int i = 0;
    for (amI localamI : paramIterable)
      i |= localamI.mask;
    return i;
  }
}