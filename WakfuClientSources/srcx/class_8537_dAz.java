import java.util.ArrayList;

public enum dAz
  implements ccI
{
  private final short lHX;
  private final byte lHY;

  private dAz(short arg3, byte arg4)
  {
    short s;
    this.lHX = s;
    byte b;
    this.lHY = b;
  }

  public static dAz eB(short paramShort) {
    for (dAz localdAz : values()) {
      if (localdAz.ddU() == paramShort)
        return localdAz;
    }
    return null;
  }

  public short ddU() {
    return this.lHX;
  }

  public byte ddV() {
    return this.lHY;
  }

  public String bK()
  {
    return Short.toString(this.lHX);
  }

  public String bL() {
    return toString();
  }

  public String bN() {
    return null;
  }

  public static ArrayList eC(short paramShort) {
    ArrayList localArrayList = new ArrayList();
    for (dAz localdAz : values())
    {
      if ((localdAz != lHU) && (localdAz != lHV) && (localdAz != lHL))
      {
        if ((localdAz.ddU() & paramShort) == localdAz.ddU())
          localArrayList.add(localdAz);
      }
    }
    return localArrayList;
  }
}