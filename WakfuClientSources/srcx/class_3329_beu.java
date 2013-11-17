public class beu
{
  private float[] fru;
  private bNa[] frv;
  private int[] frw;

  public bNa[] bsj()
  {
    return this.frv;
  }

  public void a(bNa[] paramArrayOfbNa, int[] paramArrayOfInt) {
    this.frv = paramArrayOfbNa;
    this.frw = paramArrayOfInt;
  }

  public float[] bsk() {
    return this.fru;
  }

  public int[] bsl() {
    return this.frw;
  }

  public void w(float[] paramArrayOfFloat) {
    this.fru = paramArrayOfFloat;
  }

  public float[] pe(int paramInt) {
    int i = this.fru.length;
    jY localjY = new jY();

    for (int j = 0; j < i; j++) {
      localjY.add(bMs.db(paramInt, j));
      localjY.add(this.fru[j]);
    }

    return localjY.rI();
  }
}