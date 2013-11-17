public class bP
{
  protected int aw;
  protected int kY;
  protected IG[] kZ;

  public int getId()
  {
    return this.aw;
  }
  public int fn() {
    return this.kY;
  }
  public IG[] fo() {
    return this.kZ;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.kY = parambUT.getInt();

    int i = parambUT.getInt();
    this.kZ = new IG[i];
    for (int j = 0; j < i; j++) {
      this.kZ[j] = new IG();
      this.kZ[j].a(parambUT);
    }
  }
}