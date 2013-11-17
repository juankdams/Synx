public enum aHB
{
  private final ccY efB;

  private aHB(ccY arg3)
  {
    Object localObject;
    this.efB = localObject;
  }

  public static auY bK(byte paramByte) {
    aHB localaHB = values()[paramByte];
    if (localaHB == null)
      throw new UnsupportedOperationException("Impossible de trouver le type d'action " + localaHB);
    return (auY)localaHB.efB.gy();
  }
}