public enum bib
  implements ccI
{
  private byte hV;
  private String aKM;
  private boolean fxW = false;

  private bib(byte arg3, String arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.aKM = localObject;
  }

  private bib(byte paramBoolean, String arg4, boolean arg5) {
    this.hV = paramBoolean;
    Object localObject;
    this.aKM = localObject;
    boolean bool;
    this.fxW = bool;
  }

  public byte bJ()
  {
    return this.hV;
  }

  public boolean btW() {
    return this.fxW;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public static bib cM(byte paramByte) {
    for (bib localbib : values()) {
      if (localbib.hV == paramByte) {
        return localbib;
      }
    }

    return null;
  }

  public static bib[] btX() {
    bib[] arrayOfbib1 = values();
    bib[] arrayOfbib2 = new bib[arrayOfbib1.length - 1];

    int i = 0;
    for (bib localbib : arrayOfbib1) {
      if (localbib != fwX)
      {
        arrayOfbib2[(i++)] = localbib;
      }
    }
    return arrayOfbib2;
  }

  public String toString()
  {
    return this.aKM;
  }
}