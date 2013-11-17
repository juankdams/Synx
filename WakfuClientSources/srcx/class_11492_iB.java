public class iB extends cWT
{
  private bva aIz;

  public bva qv()
  {
    return this.aIz;
  }

  public void a(bva parambva) {
    this.aIz = parambva;
  }

  public aDD qw() {
    return aDD.dYA;
  }

  public String[] getParams()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null)
      return null;
    String[] arrayOfString = new String[2];
    String str = null;
    if (bU.fH().ed(66, this.aIz.getId())) {
      str = bU.fH().b(66, this.aIz.getId(), new Object[0]);
    }
    arrayOfString[0] = String.valueOf(str);
    arrayOfString[1] = String.valueOf(this.aIz.getId() == localbyz.afd() ? 1 : 0);

    return arrayOfString;
  }
}