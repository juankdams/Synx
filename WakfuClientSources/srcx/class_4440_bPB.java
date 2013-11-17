public class bPB
{
  protected int m_index;
  protected JT[] gWk;
  protected int gWl;
  protected int gWm;
  protected int gWn;
  protected int bFx;
  protected int gWo;

  public int getIndex()
  {
    return this.m_index;
  }
  public JT[] bWd() {
    return this.gWk;
  }
  public int bWe() {
    return this.gWl;
  }
  public int bWf() {
    return this.gWm;
  }
  public int bWg() {
    return this.gWn;
  }
  public int LI() {
    return this.bFx;
  }
  public int bWh() {
    return this.gWo;
  }

  public void a(bUT parambUT) {
    this.m_index = parambUT.getInt();

    int i = parambUT.getInt();
    this.gWk = new JT[i];
    for (int j = 0; j < i; j++) {
      this.gWk[j] = new JT();
      this.gWk[j].a(parambUT);
    }

    this.gWl = parambUT.getInt();
    this.gWm = parambUT.getInt();
    this.gWn = parambUT.getInt();
    this.bFx = parambUT.getInt();
    this.gWo = parambUT.getInt();
  }
}