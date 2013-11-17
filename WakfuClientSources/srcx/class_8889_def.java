import org.apache.log4j.Logger;

final class def extends Mo
{
  private final Kk kYe;

  public def(dhJ paramdhJ, Kk paramKk)
  {
    this.kYe = paramKk;
    this.kYe.ao().a(this);
  }

  public void aS() {
    if (this.bO.iIO == SB.ctz) {
      dhJ.K.warn("Serialisation d'une breed NONE ! probablement pas normal");
    }
    this.kYe.bWC = this.bO.iIO.uO();
  }

  public void aT() {
    short s = this.kYe.bWC;
    if ((this.bO.iIO == null) || (s != this.bO.iIO.uO())) {
      bhh localbhh = this.bO.adx().dQ(s);
      if ((!bB) && (localbhh == null)) throw new AssertionError("breed == null. Invalid BreedId : " + s + " ?");
      this.bO.c(localbhh);

      if ((this.bO.m_name == null) || (this.bO.m_name.length() == 0)) {
        this.bO.setName("");
      }
      for (azg localazg : this.bO.lcU)
        localazg.B(this.bO);
    }
  }
}