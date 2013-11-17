import java.util.ArrayList;
import java.util.List;

class dAg
  implements cUb
{
  public static final int lGS = 3;
  private final List aEZ = new ArrayList();
  private dlp lGT;
  private String m_name;
  private int bgt;
  private int bvH;
  private int bvk;
  private final cYq lGU = new cYq(null);
  private byte czf;
  private int lGV;
  private final cYq lGW = new cYq(null);
  private final cYq lGX = new cYq(null);
  private int dbv;
  private final cYq lGY = new cYq(null);

  void c(dlp paramdlp) {
    this.lGT = paramdlp;
    this.bgt = paramdlp.cTh();
    this.bvH = paramdlp.aGa();

    dxL localdxL = dDE.dft().VN();
    this.lGU.P(localdxL);
    this.lGW.P(localdxL);
    this.lGX.P(localdxL);
  }

  public dlp cJh() {
    return this.lGT;
  }

  public String getName()
  {
    return this.m_name;
  }

  public int aGa() {
    return this.bvH;
  }

  public int cJi() {
    return this.bgt;
  }

  public dSe cJj() {
    return this.lGT.Az(this.bgt);
  }

  public int cJk() {
    return this.lGV;
  }

  public int IT() {
    return this.bvk;
  }

  public short nU() {
    return bCO.go(this.bvk / this.lGT.aGh());
  }

  public short nV() {
    return this.lGT.nV();
  }

  public dxL cJl() {
    return this.lGW;
  }

  public cYq ddk() {
    return this.lGX;
  }

  public byte cJn() {
    return this.czf;
  }

  public cYq ddl() {
    return this.lGU;
  }

  public byte cJp() {
    return bCO.gn(this.lGT.aGf() - this.czf);
  }

  public int cJq() {
    return this.dbv;
  }

  public dxL cJr() {
    return this.lGY;
  }

  public boolean cJs() {
    return (!this.lGY.avJ()) && (this.dbv > 0);
  }

  public boolean isActive() {
    return (this.bvH > 0) && (!cJs());
  }

  void setName(String paramString)
  {
    this.m_name = paramString;
    aNz();
  }

  void lS(int paramInt) {
    this.bvH = bCO.J(paramInt, 0, this.lGT.aGa());
    ddo();
  }

  void Cd(int paramInt) {
    this.bgt = paramInt;
    ddm();
  }

  void Ce(int paramInt) {
    this.lGV = paramInt;
    ddn();
  }

  void hk(int paramInt) {
    this.bvk = Math.min(Math.max(0, paramInt), this.lGT.aGh() * this.lGT.nV());
    ddp();
  }

  void u(dxL paramdxL) {
    this.lGW.P(paramdxL);
    ddq();
  }

  void v(dxL paramdxL) {
    this.lGX.P(paramdxL);
    ddr();
  }

  void by(byte paramByte) {
    this.czf = bCO.j(paramByte, this.lGT.aGf());
    dds();
  }

  void t(dxL paramdxL) {
    this.lGU.P(paramdxL);
    ddt();
  }

  void w(dxL paramdxL) {
    this.lGY.P(paramdxL);
    ddu();
  }

  void lU(int paramInt) {
    this.dbv = paramInt;
    ddv();
  }

  private void aNz()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).eu(this.m_name);
  }

  private void ddm()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).ih(this.bgt);
  }

  private void ddn()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).ii(this.lGV);
  }

  private void ddo()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).ij(this.bvH);
  }

  private void ddp()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).ik(this.bvk);
  }

  private void ddq()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).o(this.lGW);
  }

  private void ddr()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).p(this.lGX);
  }

  private void dds()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).aT(this.czf);
  }

  private void ddt()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).n(this.lGU);
  }

  private void ddu()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).q(this.lGY);
  }

  private void ddv()
  {
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((cfI)this.aEZ.get(i)).il(this.dbv);
  }

  public final boolean c(cfI paramcfI)
  {
    return (!this.aEZ.contains(paramcfI)) && (this.aEZ.add(paramcfI));
  }

  public final boolean d(cfI paramcfI) {
    return this.aEZ.remove(paramcfI);
  }

  public boolean b(aTz paramaTz)
  {
    paramaTz.aGg = this.lGT.getId();
    paramaTz.eRD = this.bgt;
    paramaTz.eRE = this.lGV;
    paramaTz.eRH = this.czf;
    paramaTz.eRI = this.lGU.rP();
    paramaTz.eRF = this.bvH;
    paramaTz.eRJ = this.lGW.rP();
    paramaTz.eRK = this.lGX.rP();
    paramaTz.eRL = this.dbv;
    paramaTz.eRM = this.lGY.rP();
    paramaTz.name = this.m_name;
    paramaTz.eRG = this.bvk;
    return true;
  }

  public boolean c(aTz paramaTz) {
    this.lGT = cBF.isG.xm(paramaTz.aGg);
    Cd(paramaTz.eRD);
    Ce(paramaTz.eRE);
    by(paramaTz.eRH);
    t(cYq.jq(paramaTz.eRI));
    lS(paramaTz.eRF);
    u(cYq.jq(paramaTz.eRJ));
    v(cYq.jq(paramaTz.eRK));
    lU(paramaTz.eRL);
    w(cYq.jq(paramaTz.eRM));
    setName(paramaTz.name);
    hk(paramaTz.eRG);
    return true;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();

    localStringBuilder.append("pet(");

    localStringBuilder.append("m_listeners=").append(this.aEZ.size());
    localStringBuilder.append(", m_definition=").append(this.lGT);
    localStringBuilder.append(", m_name='").append(this.m_name).append('\'');
    localStringBuilder.append(", m_colorItemRefId=").append(this.bgt);
    localStringBuilder.append(", m_health=").append(this.bvH);
    localStringBuilder.append(", m_xp=").append(this.bvk);
    localStringBuilder.append(", m_fightCounterStartDate=").append(this.lGU);
    localStringBuilder.append(", m_fightCounter=").append(this.czf);
    localStringBuilder.append(", m_equippedRefItemId=").append(this.lGV);
    localStringBuilder.append(", m_lastMealDate=").append(this.lGW);
    localStringBuilder.append(", m_lastHungryDate=").append(this.lGX);
    localStringBuilder.append(", m_sleepRefItemId=").append(this.dbv);
    localStringBuilder.append(", m_sleepDate=").append(this.lGY);

    localStringBuilder.append(')');

    return localStringBuilder.toString();
  }

  public String ov() {
    StringBuilder localStringBuilder = new StringBuilder();

    localStringBuilder.append("pet(");
    localStringBuilder.append("m_name='").append(this.m_name).append('\'');
    localStringBuilder.append(", m_colorItemRefId=").append(this.bgt);
    localStringBuilder.append(", m_health=").append(this.bvH);
    localStringBuilder.append(", m_xp=").append(this.bvk);
    localStringBuilder.append(", m_equippedRefItemId=").append(this.lGV);

    localStringBuilder.append(')');

    return localStringBuilder.toString();
  }
}