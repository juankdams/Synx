import java.util.ArrayList;
import java.util.List;

class ago
  implements cKg
{
  private final brW cZK;
  private bpu cAp;
  private int cZL;
  private final aoL bEs = new aoL();
  private final cSR cZM = new cSR();

  private final List aEZ = new ArrayList();

  ago(brW parambrW) {
    this.cZK = parambrW;
  }

  public short arI() {
    return this.cZK.arI();
  }

  public brW arJ() {
    return this.cZK;
  }

  public bpu aiJ() {
    return this.cAp;
  }

  public cuF cI(long paramLong) {
    return (cuF)this.bEs.get(paramLong);
  }

  public boolean o(dGy paramdGy) {
    return this.bEs.s(paramdGy);
  }

  public int arK() {
    aHb localaHb = new aHb(this);
    o(localaHb);
    return localaHb.aSX();
  }

  public int arL() {
    aHb localaHb = new aHb(this);
    o(localaHb);
    return localaHb.aSW();
  }

  public int at(short paramShort) {
    bHE localbHE = new bHE(paramShort);
    o(localbHE);
    return localbHE.getCount();
  }

  public int hY(int paramInt) {
    dsx localdsx = new dsx(paramInt);
    o(localdsx);
    return localdsx.getCount();
  }

  public int arM() {
    return this.cZL;
  }

  public bnt l(short paramShort1, short paramShort2) {
    return (bnt)this.cZM.get(bCO.G(paramShort1, paramShort2));
  }

  public boolean p(dGy paramdGy) {
    return this.cZM.s(paramdGy);
  }

  public int La() {
    return 250000;
  }

  void b(bpu parambpu)
  {
    this.cAp = parambpu;
    arN();
  }

  void hZ(int paramInt) {
    this.cZL = paramInt;
    arO();
  }

  void g(cuF paramcuF) {
    this.bEs.put(paramcuF.EN(), paramcuF);
    h(paramcuF);
  }

  void cJ(long paramLong) {
    cuF localcuF = (cuF)this.bEs.remove(paramLong);
    i(localcuF);
  }

  void d(bnt parambnt) {
    int i = bCO.G(parambnt.nx(), parambnt.ny());
    this.cZM.put(i, parambnt);
    f(parambnt);
  }

  void e(bnt parambnt) {
    f(parambnt);
  }

  private void arN()
  {
    for (int i = 0; i < this.aEZ.size(); i++)
      ((cfM)this.aEZ.get(i)).a(this.cAp);
  }

  private void arO()
  {
    for (int i = 0; i < this.aEZ.size(); i++)
      ((cfM)this.aEZ.get(i)).bG(this.cZL);
  }

  private void h(cuF paramcuF)
  {
    for (int i = 0; i < this.aEZ.size(); i++)
      ((cfM)this.aEZ.get(i)).a(paramcuF);
  }

  private void i(cuF paramcuF)
  {
    for (int i = 0; i < this.aEZ.size(); i++)
      ((cfM)this.aEZ.get(i)).b(paramcuF);
  }

  private void f(bnt parambnt)
  {
    for (int i = 0; i < this.aEZ.size(); i++)
      ((cfM)this.aEZ.get(i)).a(parambnt);
  }

  public boolean a(cfM paramcfM)
  {
    return (!this.aEZ.contains(paramcfM)) && (this.aEZ.add(paramcfM));
  }

  public boolean b(cfM paramcfM) {
    return this.aEZ.remove(paramcfM);
  }

  public String toString()
  {
    return "HavenWorldModel{m_definition=" + this.cZK + ", m_guildInfo=" + this.cAp + ", m_buildings=" + this.bEs + ", m_partitions=" + this.cZM + ", m_listeners=" + this.aEZ + '}';
  }
}