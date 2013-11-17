import java.util.ArrayList;

public class aTY
  implements dQR
{
  private final int aw;
  private final short aA;
  private final bZA eUB;
  private final ArrayList dcd;

  public aTY(int paramInt, short paramShort, bZA parambZA)
  {
    this.aw = paramInt;
    this.aA = paramShort;
    this.eUB = parambZA;

    this.dcd = new ArrayList();
  }

  public void a(Ig paramIg) {
    this.dcd.add(paramIg);
  }

  public ArrayList bjo() {
    return this.dcd;
  }

  public int getId() {
    return this.aw;
  }

  public bZA F() {
    return this.eUB;
  }

  public short G() {
    return this.aA;
  }
}