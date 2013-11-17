import java.util.ArrayList;

public class cKL
{
  private ArrayList hqr = new ArrayList(2);
  private bNa[] iJv;
  private int[] frw;

  public void a(beu parambeu)
  {
    this.hqr.add(parambeu);
  }

  public ArrayList ceo() {
    return this.hqr;
  }

  public void clear() {
    this.hqr.clear();
  }

  public void a(bNa[] paramArrayOfbNa, int[] paramArrayOfInt) {
    this.iJv = paramArrayOfbNa;
    this.frw = paramArrayOfInt;
  }

  public bNa[] bsj() {
    return this.iJv;
  }

  public int[] bsl() {
    return this.frw;
  }

  public float[] pe(int paramInt) {
    if (this.hqr.size() == 0) {
      return new float[0];
    }

    float[] arrayOfFloat1 = ((beu)this.hqr.get(0)).bsk();
    float[] arrayOfFloat2 = ((beu)this.hqr.get(1)).bsk();

    int i = arrayOfFloat1.length;
    jY localjY = new jY();
    for (int j = 0; j < i; j++) {
      localjY.add(bMs.db(paramInt, j));
      localjY.add(arrayOfFloat1[j]);
      localjY.add(bMs.db(paramInt, j));
      localjY.add(arrayOfFloat2[j]);
    }

    return localjY.rI();
  }
}