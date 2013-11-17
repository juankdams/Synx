public abstract class Gz
{
  protected final bNi bOP;

  protected Gz(bNi parambNi)
  {
    this.bOP = parambNi;
  }

  public bNi Qw() {
    return this.bOP;
  }

  public MD Qx() {
    return this.bOP.Qx();
  }

  public abstract cLT yE();

  public boolean a(Gz paramGz) {
    if (this == paramGz) {
      return true;
    }
    if ((paramGz == null) || (getClass() != paramGz.getClass())) {
      return false;
    }

    return this.bOP.equals(paramGz.bOP);
  }
}