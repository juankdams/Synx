import java.util.Comparator;

public enum cpu
{
  private final byte hV;
  private final short hYI;

  private cpu(byte arg3, short arg4)
  {
    byte b;
    this.hV = b;
    short s;
    this.hYI = s;
  }

  public static cpu dO(byte paramByte) {
    for (cpu localcpu : values()) {
      if (localcpu.hV == paramByte) {
        return localcpu;
      }
    }

    return null;
  }

  public byte bJ() {
    return this.hV;
  }

  public short aHZ() {
    return this.hYI;
  }

  public boolean h(bBn parambBn) {
    switch (aCU.duB[ordinal()]) {
    case 1:
      return (parambBn.bKD() != aRQ.eOT) && (parambBn.nU() < 200);
    case 2:
      return (parambBn.bKD() != aRQ.eOT) && (cxg.cuz().compare(parambBn.bKs(), Bd.bwW) > 0);
    case 3:
      return parambBn.bKD() == aRQ.eOU;
    }
    return false;
  }

  public short dj(short paramShort)
  {
    switch (aCU.duB[ordinal()]) {
    case 1:
      return Bd.z(paramShort);
    }
    return paramShort;
  }

  public cxg c(cxg paramcxg)
  {
    switch (aCU.duB[ordinal()]) {
    case 2:
      return paramcxg.cuA();
    }
    return paramcxg;
  }

  public aRQ b(aRQ paramaRQ)
  {
    switch (aCU.duB[ordinal()]) {
    case 3:
      if (paramaRQ == aRQ.eOU)
        return aRQ.eOV;
      break;
    }
    return paramaRQ;
  }
}