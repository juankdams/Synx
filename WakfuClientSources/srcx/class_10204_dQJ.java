public class dQJ extends cWT
{
  private cIZ mln;

  public aDD qw()
  {
    if (this.mln == cIZ.iHd)
      return aDD.dYz;
    if (this.mln == cIZ.iHb) {
      return aDD.dYA;
    }
    return aDD.dYy;
  }

  public void f(cIZ paramcIZ) {
    this.mln = paramcIZ;
  }

  public cIZ drK() {
    return this.mln;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof dQJ))
      return false;
    dQJ localdQJ = (dQJ)paramObject;
    return localdQJ.drK().equals(drK());
  }

  public String[] getParams()
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(this.mln.bJ());

    return arrayOfString;
  }
}