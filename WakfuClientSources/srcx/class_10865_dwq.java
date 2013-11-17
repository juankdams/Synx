import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class dwq
  implements bBz
{
  protected static final Logger K = Logger.getLogger(dwq.class);
  private final ArrayList aBf = new ArrayList();
  protected final aoL VB = new aoL();
  protected final aTA lBG;

  protected dwq(aTA paramaTA)
  {
    this.lBG = paramaTA;
  }

  protected boolean a(azY paramazY) {
    return (!this.aBf.contains(paramazY)) && (this.aBf.add(paramazY));
  }

  protected boolean b(azY paramazY) {
    return this.aBf.remove(paramazY);
  }

  public void aJ() {
    this.VB.clear();
    this.lBG.clear();
  }

  public void bc() {
    cYg.cLD().jp(getId());
    this.aBf.clear();
    this.VB.clear();
    this.lBG.clear();
  }

  public void release()
  {
  }

  public void c(dGU paramdGU)
  {
    long l = this.lBG.getId();
    paramdGU.a(bhg.fy(l), l);
    this.VB.put(paramdGU.eq(), paramdGU);
    d(paramdGU);
    dbF();
  }

  private void d(dGU paramdGU) {
    for (int i = 0; i < this.aBf.size(); i++)
      ((azY)this.aBf.get(i)).a(this, paramdGU);
  }

  private void e(dGU paramdGU) {
    for (int i = 0; i < this.aBf.size(); i++)
      ((azY)this.aBf.get(i)).b(this, paramdGU);
  }

  public abstract int a(aym paramaym);

  public boolean N(long paramLong)
  {
    return this.VB.N(paramLong);
  }

  public boolean contains(String paramString) {
    cHu localcHu = dbC();
    while (localcHu.hasNext()) {
      localcHu.fl();
      dGU localdGU = (dGU)localcHu.value();
      if (localdGU.getName().equals(paramString))
        return true;
    }
    return false;
  }

  public cHu dbC() {
    return this.VB.aBa();
  }

  public abstract byte Pg();

  public dGU kp(long paramLong)
  {
    return (dGU)this.VB.get(paramLong);
  }

  public int dbD() {
    return this.VB.size();
  }

  public byte[] dbE() {
    return this.lBG.j();
  }

  protected void dbF()
  {
  }

  public abstract void q(long paramLong);

  public boolean b(dGU paramdGU)
  {
    return a(paramdGU, false);
  }

  public boolean bx(long paramLong)
  {
    dGU localdGU = (dGU)this.VB.get(paramLong);
    return (localdGU != null) && (a(localdGU, false));
  }

  public boolean a(dGU paramdGU, boolean paramBoolean)
  {
    try
    {
      boolean bool;
      if (paramBoolean) {
        this.VB.remove(paramdGU.eq());
        e(paramdGU);
        paramdGU.aD(bhg.fy(getId()));
        dbF();
        return true;
      }if ((a(paramdGU)) && (this.VB.remove(paramdGU.eq()) != null)) {
        e(paramdGU);
        paramdGU.aD(bhg.fy(getId()));
        dbF();
        return true;
      }
      return false;
    } finally {
      if (this.VB.isEmpty())
        release();
    }
  }

  public abstract boolean a(dGU paramdGU);

  public long getId()
  {
    return this.lBG.getId();
  }

  public void a(long paramLong) {
    this.lBG.a(paramLong);
  }

  public void aH(byte[] paramArrayOfByte) {
    this.lBG.q(paramArrayOfByte);
  }

  public aTA dbG()
  {
    return this.lBG;
  }

  public aoL dbH() {
    return this.VB;
  }
}