import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class aKS extends GregorianCalendar
  implements bmr, Runnable
{
  private static final Logger K = Logger.getLogger(aKS.class);
  private static final boolean DEBUG = false;
  protected final cBl eoO = new cBl();
  private final List eoP = new ArrayList();
  private final List eoQ = new ArrayList();
  private final List eoR = new ArrayList();
  private final int eoS;
  private final int eoT;
  private cYq aHo;
  private clK ciJ;
  private long eoU;
  private long eoV;
  protected boolean eoW = false;

  protected aKS(int paramInt1, int paramInt2)
  {
    super(cYq.iDd);
    this.eoS = paramInt1;
    this.eoT = paramInt2;
  }

  public abstract float bcv();

  public void run() {
    if (this.eoW)
    {
      ei(bcy());

      bcD();

      this.eoP.removeAll(this.eoQ);
      this.eoQ.clear();

      int i = 0; for (int j = this.eoP.size(); i < j; i++)
        ((aqg)this.eoP.get(i)).a(aQm.eMX, this);
    }
  }

  public void a(aqg paramaqg)
  {
    if ((!this.eoQ.remove(paramaqg)) || (!this.eoP.contains(paramaqg)))
      this.eoP.add(paramaqg);
  }

  public void a(cvE paramcvE)
  {
    if (!this.eoR.contains(paramcvE))
      this.eoR.add(paramcvE);
  }

  public Ej bcw()
  {
    return this.eoO.bcw();
  }

  public bHV bcx() {
    return this.eoO.bcx();
  }

  public long bcy()
  {
    return (bcz() + this.eoU) * this.eoT;
  }

  long bcz()
  {
    return (System.nanoTime() - this.eoV) / 1000000L;
  }

  public byte bcA() {
    int i = 0; for (int j = this.eoO.bcw().size(); i < j; i++) {
      bHV localbHV = (bHV)this.eoO.bcw().get(i);
      if ((localbHV instanceof bxk)) {
        return ((bxk)localbHV).abK().VH();
      }
    }
    return -1;
  }

  public long bcB()
  {
    return bcz() + this.eoU;
  }

  public void a(bHV parambHV) {
    this.eoO.a(parambHV);
    int i = 0; for (int j = this.eoP.size(); i < j; i++)
      ((aqg)this.eoP.get(i)).a(aQm.eNa, this);
  }

  public void b(aqg paramaqg)
  {
    if (!this.eoQ.contains(paramaqg))
      this.eoQ.add(paramaqg);
  }

  public void eh(long paramLong)
  {
    this.eoV = System.nanoTime();
    this.eoU = paramLong;

    ei(paramLong);

    this.eoW = true;

    int i = 0; for (int j = this.eoP.size(); i < j; i++)
      ((aqg)this.eoP.get(i)).a(aQm.eMY, this);
  }

  private void ei(long paramLong)
  {
    setTimeInMillis(paramLong);
    int i = this.eoS + get(1) - 1970;
    this.aHo = new cYq(get(13), get(12), get(11), get(5), get(2) + 1, i);
  }

  public void start(long paramLong)
  {
    bcC();

    dka.cSF().j(this);
    dka.cSF().a(this, paramLong);
  }

  protected void bcC() {
    bcD();
  }

  public void b(bHV parambHV) {
    this.eoO.b(parambHV);
    int i = 0; for (int j = this.eoP.size(); i < j; i++)
      ((aqg)this.eoP.get(i)).a(aQm.eMZ, this);
  }

  protected void bcD()
  {
    if (!this.eoW) {
      return;
    }

    for (bHV localbHV = this.eoO.bcx(); (localbHV != null) && (localbHV.VN().U(this.aHo) < 0); localbHV = this.eoO.bcx()) {
      c(localbHV);
      d(localbHV);
      e(localbHV);
      bcE();
    }
  }

  private void c(bHV parambHV) {
    try {
      parambHV.a(this);
    } catch (Exception localException) {
      K.error("Exception levee lors de l'execution d'un evenement", localException);
    }
  }

  private void d(bHV parambHV) {
    int i = 0; for (int j = this.eoR.size(); i < j; i++)
      try {
        ((cvE)this.eoR.get(i)).f(parambHV);
      } catch (Exception localException) {
        K.error("Exception levee lors de la notification d'un evenement aux observers", localException);
      }
  }

  private void e(bHV parambHV)
  {
    this.eoO.a(parambHV);
    if ((parambHV instanceof Qp)) {
      Qp localQp = (Qp)parambHV;
      if ((localQp.acd() != null) && ((localQp.ES().avJ()) || (localQp.ES().U(this.aHo) > 0)))
        this.eoO.b(parambHV.a(localQp.acd()));
    }
  }

  private void bcE()
  {
    int i = 0; for (int j = this.eoP.size(); i < j; i++)
      try {
        ((aqg)this.eoP.get(i)).a(aQm.eNb, this);
      } catch (Exception localException) {
        K.error("Exception levee lors de la notification d'un evenement aux observers", localException);
      }
  }

  public dxL VN()
  {
    return this.aHo;
  }

  public cYq bcF() {
    return new cYq(this.aHo);
  }

  public boolean x(dxL paramdxL) {
    return this.aHo.equals(paramdxL);
  }

  public boolean y(dxL paramdxL) {
    return this.aHo.Q(paramdxL);
  }

  public boolean z(dxL paramdxL) {
    return this.aHo.R(paramdxL);
  }

  public boolean A(dxL paramdxL) {
    return this.aHo.S(paramdxL);
  }

  public boolean B(dxL paramdxL) {
    return this.aHo.T(paramdxL);
  }

  public clK abK() {
    return this.ciJ;
  }

  public void a(clK paramclK) {
    this.ciJ = paramclK;
  }

  public boolean isSynchronized() {
    return this.eoW;
  }

  public boolean bcG()
  {
    return true;
  }
}