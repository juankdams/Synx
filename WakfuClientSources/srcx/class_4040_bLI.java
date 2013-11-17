import org.apache.log4j.Logger;

public abstract class bLI
  implements aLb
{
  private static final Logger K = Logger.getLogger(bLI.class);
  protected final cyS bgA;

  protected bLI(cyS paramcyS)
  {
    this.bgA = paramcyS;
  }

  protected void p(double paramDouble) {
    this.bgA.aNv().p(paramDouble);
  }

  protected void ti(int paramInt) {
    this.bgA.aNv().qf(paramInt);
  }

  public void c(bqd parambqd) {
    cig localcig = qY.aYI.cw(parambqd.ajL());
    switch (cfq.cGB[localcig.cjZ().Rf().ordinal()]) {
    case 1:
      ti(dQN.mlr.drO());
      return;
    case 2:
      a((ckY)localcig.cjZ());
      return;
    case 3:
      a((cql)localcig.cjZ());
      return;
    case 4:
      p(dQN.mlr.drP());
      return;
    case 5:
      a((ags)localcig.cjZ());
      return;
    case 6:
      a((bbs)localcig.cjZ());
      return;
    case 7:
      break;
    case 8:
      break;
    default:
      K.warn("type d'effet non traité " + localcig.cjZ().Rf());
    }
  }

  public void bN(int paramInt)
  {
  }

  public void bO(int paramInt) {
  }

  private void a(bbs parambbs) {
    this.bgA.aNv().q(parambbs.bpZ());
  }

  private void a(ags paramags) {
    aGO localaGO = new aGO(this.bgA);
    localaGO.lD(paramags.arP());
  }

  protected void a(ckY paramckY)
  {
  }

  protected void a(cql paramcql)
  {
  }

  public void a(bqd parambqd) {
    cig localcig = qY.aYI.cw(parambqd.ajL());
    switch (cfq.cGB[localcig.cjZ().Rf().ordinal()]) {
    case 1:
      ti(dQN.mlr.drN());
      return;
    case 4:
      p(1.0D);
      return;
    case 5:
      bTz();
      return;
    case 6:
      bTy();
      return;
    case 2:
    case 3:
    }K.warn("type d'effet non traité " + localcig.cjZ().Rf());
  }

  private void bTy()
  {
    this.bgA.aNv().q(1.0D);
  }

  private void bTz() {
    aGO localaGO = new aGO(this.bgA);
    localaGO.lD(7500);
  }

  public void ut() {
  }

  public void uu() {
  }

  public void uv() {
  }

  public void uw() {
  }

  public void r(short paramShort) {
  }

  public void bL(int paramInt) {
  }

  public void bM(int paramInt) {
  }

  public void a(aUJ paramaUJ) {
  }

  public void b(aUJ paramaUJ) {
  }

  public void a(aCl paramaCl) {
  }

  public void b(aCl paramaCl) {
  }

  public void b(bqd parambqd) {
    if ((parambqd.bza() != null) && (!parambqd.bza().avJ()) && (parambqd.bza().R(dDE.dft().bcF())))
      c(parambqd);
  }

  public void c(aUJ paramaUJ)
  {
  }

  public void c(aCl paramaCl)
  {
  }
}