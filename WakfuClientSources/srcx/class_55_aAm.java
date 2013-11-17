public class aAm extends blM
  implements aFO
{
  private aQS dSN;
  private String name;

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void a(aGK paramaGK)
  {
    if (this.dSN != null) {
      throw new cJ("Only one nested element allowed");
    }
    if (!(paramaGK instanceof aQS)) {
      throw new cJ("addTask called with a task that is not an unknown element");
    }

    this.dSN = ((aQS)paramaGK);
  }

  public void execute()
  {
    if (this.dSN == null) {
      throw new cJ("Missing nested element");
    }
    if (this.name == null) {
      throw new cJ("Name not specified");
    }
    this.name = dhB.bg(getURI(), this.name);

    aXW localaXW = aXW.v(Ga());

    String str = dhB.bg(this.dSN.getNamespace(), this.dSN.getTag());

    dTY localdTY = localaXW.hx(str);
    if (localdTY == null) {
      throw new cJ("Unable to find typedef " + str);
    }

    bBD localbBD = new bBD(localdTY, this.dSN);

    localbBD.setName(this.name);

    localaXW.a(localbBD);
    d("defining preset " + this.name, 3);
  }
}