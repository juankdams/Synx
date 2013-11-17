import java.util.ArrayList;

class bmF
  implements aUJ
{
  private final ArrayList aBf = new ArrayList();
  private final long aTz;
  private String m_name;
  private long dYt;

  bmF(long paramLong)
  {
    this.aTz = paramLong;
  }

  public long getId() {
    return this.aTz;
  }

  public String getName() {
    return this.m_name;
  }

  public long bjT() {
    return this.dYt;
  }

  public boolean I(dGy paramdGy) {
    cnm[] arrayOfcnm = cnm.values();
    int i = 0; for (int j = arrayOfcnm.length; i < j; i++) {
      cnm localcnm = arrayOfcnm[i];
      if ((a(localcnm)) && (!paramdGy.d(localcnm))) {
        return false;
      }
    }
    return true;
  }

  public boolean a(cnm paramcnm) {
    int i = 1 << paramcnm.ewr;
    return (this.dYt & i) == i;
  }

  public void setName(String paramString)
  {
    this.m_name = paramString;
    bxq();
  }

  public void fH(long paramLong) {
    this.dYt = paramLong;
    bxq();
  }

  private void bxq()
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((cXh)this.aBf.get(i)).c(this);
  }

  public boolean a(cXh paramcXh) {
    return (!this.aBf.contains(paramcXh)) && (this.aBf.add(paramcXh));
  }

  public boolean b(cXh paramcXh) {
    return this.aBf.remove(paramcXh);
  }

  public String toString()
  {
    return "GuildRankModel{m_id=" + this.aTz + ", m_name='" + this.m_name + '\'' + ", m_authorisations=" + this.dYt + '}';
  }
}