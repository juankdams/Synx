import java.util.ArrayList;

public final class dEE
  implements CS
{
  private final int aw;
  private final bXs kyV;
  private final boolean bG;
  private final boolean lNp;
  private final String m_name;
  private final String aLm;
  private final int aKS;
  private final long lNq;
  private final boolean lNr;
  private final boolean lNs;
  private final boolean lNt;
  private final boolean lNu;
  private final boolean lNv;
  private final int aSg;
  private final int lNw;
  private final ArrayList lNx = new ArrayList();
  private final ArrayList cLh = new ArrayList();
  private boolean aFc;
  private boolean dgH;
  private long lNy;
  private long bYL;
  private final int lNz;
  private final int lNA;
  private final bZA lNB;
  private dxL lNC;
  private cds lND;

  dEE(dEE paramdEE)
  {
    this.aw = paramdEE.aw;
    this.aFc = paramdEE.aFc;
    this.kyV = paramdEE.kyV;
    this.bG = paramdEE.bG;
    this.lNp = paramdEE.lNp;
    this.m_name = paramdEE.m_name;
    this.aLm = paramdEE.aLm;
    this.lNB = paramdEE.lNB;
    this.aKS = paramdEE.aKS;
    this.lNq = paramdEE.lNq;
    this.lNr = paramdEE.lNr;
    this.lNs = paramdEE.lNs;
    this.lNt = paramdEE.lNt;
    this.lNz = paramdEE.lNz;
    this.lNA = paramdEE.lNA;
    this.lNu = paramdEE.lNu;
    this.lNw = paramdEE.lNw;
    this.lNC = paramdEE.lNC;
    this.lND = paramdEE.lND;
    this.lNv = paramdEE.lNv;
    this.aSg = paramdEE.aSg;
  }

  dEE(int paramInt1, bXs parambXs, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, bZA parambZA, int paramInt2, long paramLong, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt3, int paramInt4, boolean paramBoolean6, int paramInt5, dxL paramdxL, cds paramcds, boolean paramBoolean7, int paramInt6)
  {
    this.aw = paramInt1;
    this.kyV = parambXs;
    this.bG = paramBoolean1;
    this.lNp = paramBoolean2;
    this.m_name = (paramString1 != null ? paramString1.intern() : null);
    this.aLm = (paramString2 != null ? paramString2.intern() : null);
    this.lNB = parambZA;
    this.aKS = paramInt2;
    this.lNq = paramLong;
    this.lNr = paramBoolean3;
    this.lNs = paramBoolean4;
    this.lNt = paramBoolean5;
    this.lNz = paramInt3;
    this.lNA = paramInt4;
    this.lNu = paramBoolean6;
    this.lNw = paramInt5;
    this.lNC = paramdxL;
    this.lND = paramcds;
    this.lNv = paramBoolean7;
    this.aSg = paramInt6;
  }

  void c(aiJ paramaiJ) {
    if (!this.lNx.contains(paramaiJ))
      this.lNx.add(paramaiJ);
  }

  void a(acg paramacg)
  {
    if (!this.cLh.contains(paramacg))
      this.cLh.add(paramacg);
  }

  public boolean isVisible()
  {
    return this.bG;
  }

  public boolean a(bEg parambEg) {
    return (this.bG) && ((this.lNB == null) || (this.lNB.i(parambEg, null, null, parambEg.bHs())));
  }

  public boolean isActive()
  {
    return this.aFc;
  }

  void g(bCP parambCP) {
    this.aFc = true;

    if ((this.lNC != null) || (this.aKS != 0)) {
      dxL localdxL = aat.cOE.VN();
      this.bYL = localdxL.rP();
    }
  }

  public void setActive(boolean paramBoolean) {
    this.aFc = paramBoolean;
  }

  public boolean isComplete() {
    return this.dgH;
  }

  void h(bCP parambCP) {
    this.dgH = true;

    dxL localdxL = aat.cOE.VN();

    if (this.lNq != 0L)
      this.lNy = localdxL.rP();
  }

  void cm(boolean paramBoolean)
  {
    this.dgH = paramBoolean;
  }

  public void bn(long paramLong) {
    this.lNy = paramLong;
  }

  public int getId() {
    return this.aw;
  }

  public bXs dgg() {
    return this.kyV;
  }

  public String getName() {
    return this.m_name;
  }

  public String getDescription() {
    return this.aLm;
  }

  public ArrayList dgh() {
    return this.lNx;
  }

  public ArrayList cfd() {
    return this.cLh;
  }

  public int getDuration() {
    return this.aKS;
  }

  public long bnb() {
    return this.lNq;
  }

  public boolean dgi() {
    return this.lNp;
  }

  public boolean dgj() {
    return this.lNu;
  }

  public boolean dgk() {
    return this.lNr;
  }

  public boolean bnc() {
    return this.lNs;
  }

  public long LZ() {
    return this.lNy;
  }

  public boolean dgl() {
    return this.lNt;
  }

  public long getStartTime() {
    return this.bYL;
  }

  public void Z(long paramLong) {
    this.bYL = paramLong;
  }

  public int dgm() {
    return this.lNz;
  }

  public int dgn() {
    return this.lNA;
  }

  public int dgo() {
    return this.lNw;
  }

  public void reset() {
    this.dgH = false;
    for (int i = 0; i < this.lNx.size(); i++)
      ((aiJ)this.lNx.get(i)).reset();
  }

  public void ab(dxL paramdxL)
  {
    this.lNC = paramdxL;
  }

  public void p(cds paramcds) {
    this.lND = paramcds;
  }

  public dxL bnd() {
    return this.lNC;
  }

  public cds bne() {
    return this.lND;
  }

  public boolean bnf() {
    return true;
  }

  public boolean dgp() {
    return this.lNv;
  }

  public int oc() {
    return this.aSg;
  }
}