public class ql extends cih
{
  private final cSR aXj;
  private final jn aXk;

  public ql(int paramInt1, int paramInt2, aPb paramaPb, int paramInt3, byte paramByte, int paramInt4)
  {
    super(paramInt1, paramInt2, paramaPb, paramInt3);
    this.aXk = jn.r(paramByte);
    this.aXj = new cSR(paramInt4, 1.0F);
  }

  public void b(aYt paramaYt) {
    int i = paramaYt.getId();
    if (this.aXj.contains(i))
      throw new IllegalArgumentException("La définition de l'échange " + paramaYt + " est déjà enregistrée");
    this.aXj.put(i, paramaYt);
  }

  public aYt ci(int paramInt) {
    return (aYt)this.aXj.get(paramInt);
  }

  public boolean c(dGy paramdGy) {
    return this.aXj.s(paramdGy);
  }

  public jn xu() {
    return this.aXk;
  }

  public String toString()
  {
    return "IEExchangeParameter{m_id=" + getId() + '}';
  }
}