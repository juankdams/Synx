public enum dNZ
{
  public static dNZ Dc(int paramInt)
  {
    for (dNZ localdNZ : values())
      if (localdNZ.ordinal() == paramInt)
        return localdNZ;
    return null;
  }
}