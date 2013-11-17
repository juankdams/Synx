public class ws
{
  private final bKu bmo;

  public ws(bKu parambKu)
  {
    this.bmo = parambKu;
  }

  public void aM(long paramLong)
  {
    if (!this.bmo.nK()) {
      throw new aAe("pas d'xp sur l'item");
    }
    cxH localcxH = (cxH)this.bmo.nL();
    localcxH.aM(paramLong);
  }

  public bKu Fz() {
    return this.bmo;
  }

  public String toString()
  {
    return "ItemXpController{m_xpHolder=" + this.bmo + '}';
  }
}