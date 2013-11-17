public enum cuU
{
  public final byte bUy;

  private cuU(int arg3)
  {
    int j;
    this.bUy = bCO.gn(j);
  }

  public static cuU dY(byte paramByte) {
    cuU[] arrayOfcuU = values();
    int i = 0; for (int j = arrayOfcuU.length; i < j; i++) {
      cuU localcuU = arrayOfcuU[i];
      if (localcuU.bUy == paramByte)
        return localcuU;
    }
    throw new IllegalArgumentException("Impossible de récupérer le GroupType d'Id " + paramByte);
  }
}