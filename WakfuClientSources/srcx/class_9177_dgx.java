import java.util.ArrayList;

public enum dgx
{
  private final byte hV;
  private final dBY[] lbx;

  private dgx(byte arg3, dBY[] arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.lbx = localObject;
  }

  static void init()
  {
    dgx localdgx = lbt;
  }

  public static dgx eX(byte paramByte) {
    for (dgx localdgx : values()) {
      if (localdgx.hV == paramByte) {
        return localdgx;
      }
    }

    return null;
  }

  public byte bJ() {
    return this.hV;
  }

  public dBY[] cPQ() {
    return this.lbx;
  }

  public static dBY a(dgx paramdgx, ArrayList paramArrayList) {
    int i = 0; for (int j = paramArrayList.size(); i < j; i++) {
      dBY localdBY = (dBY)paramArrayList.get(i);
      if (aUP.c(paramdgx.cPQ(), localdBY)) {
        return localdBY;
      }
    }
    return null;
  }

  static
  {
    for (dgx localdgx : values())
      for (dBY localdBY : localdgx.cPQ())
        localdBY.a(localdgx);
  }
}