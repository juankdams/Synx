public class bVU extends Ff
{
  private dCe hhT;
  private final cCH kC = new bfO(this, 22);

  public dJO eR()
  {
    return this.hhT.adT();
  }

  public csx[] am()
  {
    return this.hhT.adN();
  }

  public short OL()
  {
    return this.hhT.OL();
  }

  public String getName()
  {
    return this.hhT.getName();
  }

  public dJO[] eS()
  {
    return this.hhT.eS();
  }

  public void al()
  {
    this.hhT.hI(this.fgH);
    this.hhT.al();
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    return this.hhT.a(paramdJO, parambhL);
  }

  public void bc()
  {
    super.bc();
    this.hhT.release();
    this.hhT = null;
  }

  public void aJ()
  {
    super.aJ();
    if ((!bB) && (this.hhT != null)) throw new AssertionError();
    this.hhT = ((dCe)tR.bfd.Ct().p());
  }

  public void a(abc paramabc)
  {
    this.hhT.a(paramabc);
  }

  public void initialize()
  {
    super.initialize();
    al();
  }

  protected cCH ak()
  {
    return this.kC;
  }
}