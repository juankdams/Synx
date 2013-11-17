public abstract class dGU extends cGF
{
  protected aym lRB;
  protected aQo lRC;

  protected dGU(aym paramaym, aQo paramaQo)
  {
    this.lRB = paramaym;
    this.lRC = paramaQo;
  }

  public abstract int b(aym paramaym);

  public long eq()
  {
    if (this.lRB != null) {
      return this.lRB.eq();
    }
    return -1L;
  }

  public long adv() {
    if (this.lRB != null) {
      return this.lRB.adv();
    }
    return -1L;
  }

  public abstract long aE(byte paramByte);

  public String getName() {
    if (this.lRB != null) {
      return this.lRB.getName();
    }
    return "";
  }

  public byte[] dhJ() {
    return this.lRC.j();
  }

  public abstract void aD(byte paramByte);

  public byte[] j() {
    return a(tn());
  }

  public cCH[] tn() {
    return new cCH[0];
  }

  public abstract void a(byte paramByte, long paramLong);

  public void aM(byte[] paramArrayOfByte) {
    if (this.lRB != null)
      this.lRB.q(paramArrayOfByte);
  }

  public void aN(byte[] paramArrayOfByte)
  {
    this.lRC.q(paramArrayOfByte);
  }

  public aym dhK() {
    return this.lRB;
  }

  public aQo dhL() {
    return this.lRC;
  }
}