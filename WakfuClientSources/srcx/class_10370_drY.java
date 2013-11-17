public class drY
{
  protected int aw;
  protected boolean dgG;
  protected boolean luq;
  protected short lur;
  protected short lus;
  protected short dhJ;
  protected short lut;
  protected aBO[] luu;

  public int getId()
  {
    return this.aw;
  }

  public boolean avy() {
    return this.dgG;
  }

  public boolean cYF() {
    return this.luq;
  }

  public short cYG() {
    return this.lur;
  }

  public short cYH() {
    return this.lus;
  }

  public short avV() {
    return this.dhJ;
  }

  public short cYI() {
    return this.lut;
  }

  public aBO[] cYJ() {
    return this.luu;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dgG = parambUT.readBoolean();
    this.luq = parambUT.readBoolean();
    this.lur = parambUT.getShort();
    this.lus = parambUT.getShort();
    this.dhJ = parambUT.getShort();
    this.lut = parambUT.getShort();

    int i = parambUT.getInt();
    this.luu = new aBO[i];
    for (int j = 0; j < i; j++) {
      this.luu[j] = new aBO();
      this.luu[j].a(parambUT);
    }
  }
}