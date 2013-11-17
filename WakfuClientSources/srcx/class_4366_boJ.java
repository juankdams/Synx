import java.util.ArrayList;

public class boJ
{
  public static final int[] fIi = { 255, 255, 255, 106, 106, 106, 255, 128, 128, 255, 0, 0, 255, 128, 192, 255, 0, 128, 255, 128, 255, 255, 0, 255, 128, 0, 255, 192, 128, 255, 128, 128, 255, 0, 0, 255, 0, 128, 255, 128, 192, 255, 128, 255, 255, 0, 255, 255, 0, 255, 128, 128, 255, 192, 128, 255, 128, 0, 255, 0, 128, 255, 0, 192, 255, 128, 255, 255, 128, 255, 255, 0, 255, 128, 0, 255, 192, 128 };

  private static final boJ fIj = new boJ();
  private final ArrayList biK;

  private boJ()
  {
    this.biK = new ArrayList();

    int i = fIi.length / 3;

    for (int j = 0; j < i; j++) {
      bNa localbNa1 = new bNa(fIi[(j * 3)], fIi[(j * 3 + 1)], fIi[(j * 3 + 2)], 255);
      this.biK.add(localbNa1);
      for (float f = 0.8F; f >= 0.4F; f -= 0.2F) {
        bNa localbNa2 = new bNa(localbNa1);
        localbNa2.bx(localbNa2.bUS() * f);
        this.biK.add(localbNa2);
      }
    }
  }

  public static boJ byr()
  {
    return fIj;
  }

  public int DK()
  {
    return this.biK.size();
  }

  public short e(bNa parambNa) {
    return (short)this.biK.indexOf(parambNa);
  }

  public bNa db(int paramInt) {
    return (bNa)this.biK.get(paramInt);
  }

  public ArrayList bys() {
    return this.biK;
  }
}