import java.util.Comparator;

public class cJb
  implements Comparator
{
  public static final cJb iHg = new cJb();

  public int a(dxl paramdxl1, dxl paramdxl2) {
    if (paramdxl1.nU() < paramdxl2.nU()) {
      return 1;
    }
    if (paramdxl1.nU() > paramdxl2.nU()) {
      return -1;
    }
    return 0;
  }

  public static cJb cDv() {
    return iHg;
  }
}