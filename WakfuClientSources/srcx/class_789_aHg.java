public class aHg
{
  protected int eeH;
  protected String aRT;
  protected bSe[] eeI;
  protected int eeJ;
  protected bYO[] eeK;
  protected int eeL;

  public int aTc()
  {
    return this.eeH;
  }
  public String uL() {
    return this.aRT;
  }
  public bSe[] aTd() {
    return this.eeI;
  }
  public int aTe() {
    return this.eeJ;
  }
  public bYO[] aTf() {
    return this.eeK;
  }
  public int aTg() {
    return this.eeL;
  }

  public void a(bUT parambUT) {
    this.eeH = parambUT.getInt();
    this.aRT = parambUT.caP();

    int i = parambUT.getInt();
    this.eeI = new bSe[i];
    for (int j = 0; j < i; j++) {
      this.eeI[j] = new bSe();
      this.eeI[j].a(parambUT);
    }

    this.eeJ = parambUT.getInt();

    j = parambUT.getInt();
    this.eeK = new bYO[j];
    for (int k = 0; k < j; k++) {
      this.eeK[k] = new bYO();
      this.eeK[k].a(parambUT);
    }

    this.eeL = parambUT.getInt();
  }
}