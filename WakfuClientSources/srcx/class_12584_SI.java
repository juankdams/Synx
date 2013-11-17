public class SI
{
  protected int boL;
  protected int cuc;
  protected int cud;
  protected byte cue;
  protected int cuf;

  public int getUid()
  {
    return this.boL;
  }
  public int afQ() {
    return this.cuc;
  }
  public int afR() {
    return this.cud;
  }
  public byte afS() {
    return this.cue;
  }
  public int afT() {
    return this.cuf;
  }

  public void a(bUT parambUT) {
    this.boL = parambUT.getInt();
    this.cuc = parambUT.getInt();
    this.cud = parambUT.getInt();
    this.cue = parambUT.get();
    this.cuf = parambUT.getInt();
  }
}