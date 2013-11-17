import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

final class aBc
  implements YQ, bZF, cXh, cyS
{
  private static final Logger K = Logger.getLogger(aBc.class);

  private final ArrayList aBf = new ArrayList();
  private long aTz;
  private String m_name;
  private long dUK;
  private String aLm;
  private String Tl;
  private short cZu;
  private final bqh dUL = new bqh();

  private final aoL dUM = new aoL();
  private final aoL VB = new aoL();
  private final cSR aYJ = new cSR();

  private final blR dUN = new blR();

  public long getId() {
    return this.aTz;
  }

  public long CE() {
    long[] arrayOfLong = this.dUM.aBb();
    Arrays.sort(arrayOfLong);
    return arrayOfLong.length > 0 ? arrayOfLong[0] : 0L;
  }

  public long aNq() {
    long[] arrayOfLong = this.dUM.aBb();
    Arrays.sort(arrayOfLong);
    return arrayOfLong.length > 1 ? arrayOfLong[1] : 0L;
  }

  public String getName() {
    return this.m_name;
  }

  public long CH() {
    return this.dUK;
  }

  public String getDescription() {
    return this.aLm;
  }

  public String getMessage() {
    return this.Tl;
  }

  public short nU() {
    return this.cZu;
  }

  public int CI() {
    return this.dUL.CI();
  }

  public int aNr() {
    return this.dUL.aNr();
  }

  public aCl ay(long paramLong) {
    return (aCl)this.VB.get(paramLong);
  }

  public aUJ az(long paramLong) {
    return (aUJ)this.dUM.get(paramLong);
  }

  public bqd lA(int paramInt) {
    return (bqd)this.aYJ.get(paramInt);
  }

  public int aNs() {
    return this.VB.size();
  }

  public boolean A(dGy paramdGy) {
    return this.VB.s(paramdGy);
  }

  public int aNt() {
    return this.dUM.size();
  }

  public boolean B(dGy paramdGy) {
    return this.dUM.s(paramdGy);
  }

  public int aNu() {
    return this.aYJ.size();
  }

  public boolean C(dGy paramdGy) {
    return this.aYJ.s(paramdGy);
  }

  public blR aNv() {
    return this.dUN;
  }

  public int aNw() {
    return this.dUL.aNw();
  }

  public int aNx() {
    return this.dUL.aNx();
  }

  public int aNy() {
    return this.dUL.aNy();
  }

  void a(long paramLong)
  {
    this.aTz = paramLong;
  }

  void setName(String paramString) {
    this.m_name = paramString;
    aNz();
  }

  void dI(long paramLong) {
    this.dUK = paramLong;
    aNA();
  }

  void setDescription(String paramString) {
    this.aLm = paramString;
    aNB();
  }

  void setMessage(String paramString) {
    this.Tl = paramString;
    aNC();
  }

  void aQ(short paramShort) {
    this.cZu = paramShort;
    aX(this.cZu);
  }

  void lB(int paramInt) {
    int i = this.dUL.aNr();
    this.dUL.lB(paramInt);
    lH(this.dUL.aNr() - i);
  }

  void lC(int paramInt) {
    int i = this.dUL.CI();
    this.dUL.lC(paramInt);
    lI(this.dUL.CI() - i);
  }

  void lD(int paramInt) {
    this.dUL.lD(paramInt);
  }

  public void lE(int paramInt) {
    this.dUL.lE(paramInt);
    lJ(paramInt);
  }

  public void lF(int paramInt) {
    this.dUL.lF(paramInt);
    lK(paramInt);
  }

  void d(aUJ paramaUJ) {
    this.dUM.put(paramaUJ.getId(), paramaUJ);
    paramaUJ.a(this);
    e(paramaUJ);
  }

  void dJ(long paramLong) {
    aUJ localaUJ = (aUJ)this.dUM.remove(paramLong);
    localaUJ.b(this);
    f(localaUJ);
  }

  void d(aCl paramaCl) {
    this.VB.put(paramaCl.getId(), paramaCl);
    paramaCl.a(this);
    e(paramaCl);
  }

  void dK(long paramLong) {
    aCl localaCl = (aCl)this.VB.remove(paramLong);
    localaCl.b(this);
    f(localaCl);
  }

  void f(bqd parambqd) {
    this.aYJ.put(parambqd.ajL(), parambqd);
    parambqd.a(this);
    g(parambqd);
  }

  void lG(int paramInt) {
    bqd localbqd = (bqd)this.aYJ.remove(paramInt);
    localbqd.b(this);
    h(localbqd);
  }

  private void aNz()
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).ut();
  }

  private void aNA()
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).uu();
  }

  private void aNB()
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).uv();
  }

  private void aX(short paramShort)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).r(paramShort);
  }

  private void lH(int paramInt)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).bM(paramInt);
  }

  private void lI(int paramInt)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).bL(paramInt);
  }

  private void aNC()
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).uw();
  }

  private void e(aUJ paramaUJ)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).a(paramaUJ);
  }

  private void f(aUJ paramaUJ)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).b(paramaUJ);
  }

  private void e(aCl paramaCl)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).a(paramaCl);
  }

  private void f(aCl paramaCl)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      try {
        ((aLb)this.aBf.get(i)).b(paramaCl);
      } catch (Exception localException) {
        K.error("Exception while firing 'memberRemoved' in guild : ", localException);
      }
  }

  private void g(bqd parambqd)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).b(parambqd);
  }

  private void h(bqd parambqd)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).a(parambqd);
  }

  private void lJ(int paramInt)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).bN(paramInt);
  }

  private void lK(int paramInt)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).bO(paramInt);
  }

  public void c(aUJ paramaUJ)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).c(paramaUJ);
  }

  public void c(aCl paramaCl)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).c(paramaCl);
  }

  public void c(bqd parambqd)
  {
    int i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((aLb)this.aBf.get(i)).c(parambqd);
  }

  public boolean a(aLb paramaLb)
  {
    return (!this.aBf.contains(paramaLb)) && (this.aBf.add(paramaLb));
  }

  public boolean b(aLb paramaLb) {
    return this.aBf.remove(paramaLb);
  }

  public String toString()
  {
    return "GuildModel{m_id=" + this.aTz + ", m_name='" + this.m_name + '\'' + ", m_members=" + this.VB.size() + '}';
  }
}