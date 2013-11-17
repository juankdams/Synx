public enum aeL
{
  private byte hV;

  private aeL(int arg3)
  {
    int j;
    this.hV = ((byte)j);
  }

  public static aeL hP(int paramInt) {
    aeL[] arrayOfaeL = values();
    int i = 0; for (int j = arrayOfaeL.length; i < j; i++) {
      aeL localaeL = arrayOfaeL[i];
      if (localaeL.hV == paramInt)
        return localaeL;
    }
    return null;
  }

  public byte bJ() {
    return this.hV;
  }
}