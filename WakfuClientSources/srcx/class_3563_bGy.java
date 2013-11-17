public class bGy extends bAF
{
  private final bAF gDc;

  public bGy()
  {
    super(dsE.cYX());
    this.gDc = null;
  }

  public bGy(bAF parambAF) {
    super(dsE.cYX());
    this.gDc = parambAF;
  }

  public void a(bNz parambNz)
  {
  }

  public int fd() {
    return -1;
  }

  public String fe()
  {
    return "";
  }

  public boolean isVisible()
  {
    return (super.isVisible()) && (this.gDc != null) && (this.gDc.isVisible()) && (this.gDc.aeR() <= 0);
  }

  protected cuB a(dwN paramdwN, cuB paramcuB)
  {
    return paramdwN.a(this.gDc.getId(), paramcuB);
  }

  public boolean apP()
  {
    return false;
  }

  public String toString()
  {
    return "PetActor{m_playerActor=" + this.gDc + '}';
  }

  public void a(dSe paramdSe)
  {
    paramdSe.e(new pp(this));

    asZ();
  }
}