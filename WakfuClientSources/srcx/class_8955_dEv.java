public enum dEv
{
  private final byte hV;

  private dEv(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static dEv fH(byte paramByte) {
    dEv[] arrayOfdEv = values();
    for (int i = 0; i < arrayOfdEv.length; i++) {
      dEv localdEv = arrayOfdEv[i];
      if (localdEv.hV == paramByte)
        return localdEv;
    }
    return null;
  }
}