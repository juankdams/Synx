public enum aPb
  implements ccI
{
  private final byte ewr;
  private final String ews;

  private aPb(int arg3, String arg4)
  {
    int i;
    this.ewr = ((byte)i);
    Object localObject;
    this.ews = localObject;
  }

  public String bK() {
    return String.valueOf(this.ewr);
  }

  public String bL() {
    return toString();
  }

  public String bN() {
    return this.ews;
  }

  public static aPb bX(byte paramByte) {
    aPb[] arrayOfaPb = values();
    for (int i = 0; i < arrayOfaPb.length; i++) {
      aPb localaPb = arrayOfaPb[i];
      if (localaPb.ewr == paramByte)
        return localaPb;
    }
    return null;
  }
}