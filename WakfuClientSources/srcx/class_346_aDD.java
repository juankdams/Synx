public enum aDD
{
  private byte hV;
  private String bU;

  private aDD(byte arg3, String arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.bU = localObject;
  }

  public static aDD bC(byte paramByte) {
    for (aDD localaDD : values()) {
      if (localaDD.hV == paramByte)
        return localaDD;
    }
    return null;
  }

  public byte bJ() {
    return this.hV;
  }

  public String ata() {
    return this.bU;
  }

  public static aDD b(cIZ paramcIZ) {
    switch (dnQ.ceo[paramcIZ.ordinal()]) {
    case 1:
      return dYA;
    case 2:
      return dYz;
    }

    return dYy;
  }
}