public enum bCe
{
  private static final dPx gws;
  public final byte ewr;
  public final short goO;

  private bCe(int arg3, int arg4)
  {
    int i;
    this.ewr = ((byte)i);
    int j;
    this.goO = ((short)j);
  }

  public static bCe dm(byte paramByte) {
    return (bCe)gws.bf(paramByte);
  }

  public static bCe co(short paramShort) {
    bCe[] arrayOfbCe = values();
    for (int i = 0; i < arrayOfbCe.length; i++) {
      bCe localbCe = arrayOfbCe[i];
      if (localbCe.goO == paramShort)
        return localbCe;
    }
    return null;
  }

  static
  {
    gws = new dPx();

    bCe[] arrayOfbCe = values();
    for (int i = 0; i < arrayOfbCe.length; i++) {
      bCe localbCe = arrayOfbCe[i];
      gws.c(localbCe.ewr, localbCe);
    }
  }
}