import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class bBn
  implements anX
{
  private int aw;
  private short gtH;
  private int aSg;
  private int gtI;
  private int gtJ;
  private final cjT eqL;
  private short cZu;
  private final EnumMap gtK = new EnumMap(Aq.class);
  private ge gtL;
  protected short gtM;
  private boolean gtN;
  private boolean gtO;
  private byte gtP;
  private byte gtQ;
  private byte gtR;
  private int gtS;
  private int gtT;
  private boolean gtU;
  private boolean gtV;
  private boolean gtW;
  private boolean gtX;
  private cxg gtY;
  private bXe gtZ;
  private final EnumSet gua = EnumSet.noneOf(bGS.class);
  private boolean gng;
  protected adx gub;
  private aly guc;
  private aRQ gud;
  private byte gue;
  private int guf;

  protected bBn()
  {
    this.eqL = new cjT();
  }

  void d(int paramInt) {
    this.aw = paramInt;
  }

  void ck(short paramShort) {
    this.gtH = paramShort;
  }

  void iT(int paramInt) {
    this.aSg = paramInt;
  }

  void rY(int paramInt) {
    this.gtI = paramInt;
  }

  void rZ(int paramInt) {
    this.gtJ = paramInt;
  }

  void aQ(short paramShort) {
    this.cZu = paramShort;
  }

  void i(ge paramge) {
    j(paramge);
    this.gtL = paramge;
  }

  void j(Map paramMap) {
    this.gtK.putAll(paramMap);
  }

  void cl(short paramShort) {
    this.gtM = ((short)Math.max(1, paramShort));
  }

  void di(byte paramByte) {
    this.gtP = paramByte;
  }

  void dj(byte paramByte) {
    this.gtQ = paramByte;
  }

  void dk(byte paramByte) {
    this.gtR = paramByte;
  }

  void sa(int paramInt) {
    this.gtS = paramInt;
  }

  void sb(int paramInt) {
    this.gtT = paramInt;
  }

  void fP(boolean paramBoolean) {
    this.gtU = paramBoolean;
  }

  void fQ(boolean paramBoolean) {
    this.gtV = paramBoolean;
  }

  void fR(boolean paramBoolean) {
    this.gtW = paramBoolean;
  }

  void fS(boolean paramBoolean) {
    this.gtX = paramBoolean;
  }

  void b(cxg paramcxg) {
    this.gtY = paramcxg;
  }

  void a(bXe parambXe) {
    this.gtZ = parambXe;
  }

  void a(aly paramaly) {
    this.guc = paramaly;
  }

  void dl(byte paramByte) {
    this.gue = paramByte;
  }

  void a(aRQ paramaRQ) {
    this.gud = paramaRQ;
  }

  public final void j(ge paramge) {
    if (paramge == null)
      throw new IllegalArgumentException("m_itemType ne peut être null pour l'objet " + this.aw);
  }

  public cjT bKe()
  {
    return this.eqL;
  }

  public Iterator bKf() {
    return this.gtK.entrySet().iterator();
  }

  public abstract cqG acu();

  public void a(bGS parambGS) {
    this.gua.add(parambGS);
  }

  public boolean b(bGS parambGS) {
    return this.gua.contains(parambGS);
  }

  public void a(dpI paramdpI) {
    this.eqL.add(paramdpI);
    if (paramdpI.om()) {
      this.gtN = true;
    }
    if (paramdpI.on()) {
      this.gtO = true;
    }
    if (paramdpI.cL(1L))
      this.gng = true;
  }

  public boolean bHM()
  {
    return this.gng;
  }

  public byte bKg() {
    return this.gtP;
  }

  public bZA a(Aq paramAq) {
    return (bZA)this.gtK.get(paramAq);
  }

  public boolean a(Aq paramAq, dhJ paramdhJ, cGx paramcGx) {
    bZA localbZA = a(paramAq);
    return (localbZA == null) || (localbZA.i(paramdhJ, paramdhJ, paramcGx, paramdhJ.ayL()));
  }

  public String getDescription() {
    throw new UnsupportedOperationException("Méthode non codée dans le refactor");
  }

  public String getName() {
    throw new UnsupportedOperationException("Méthode non codée dans le refactor");
  }

  public Iterator bKh() {
    return this.eqL.iterator();
  }

  public byte bKi() {
    return this.gtR;
  }

  public byte bKj() {
    return this.gtQ;
  }

  public short bKk() {
    return this.gtH;
  }

  public boolean bHR() {
    return this.gtU;
  }

  public boolean bKl() {
    return this.gtW;
  }

  public boolean bHS() {
    return this.gtV;
  }

  public boolean a(azO paramazO) {
    return this.gtL.a(paramazO);
  }

  public boolean bKm()
  {
    azO[] arrayOfazO1 = this.gtL.nj();
    if (arrayOfazO1 == null) {
      return false;
    }

    azO[] arrayOfazO2 = this.gtL.nh();
    return (aUP.c(arrayOfazO2, azO.dRM)) && (aUP.c(arrayOfazO1, azO.dRN));
  }

  public int oc() {
    return this.aSg;
  }

  public int od() {
    return this.gtI;
  }

  public int oe() {
    return this.gtJ;
  }

  public int getId() {
    return this.aw;
  }

  public ge bKn() {
    return this.gtL;
  }

  public short nU() {
    return this.cZu;
  }

  public int bKo() {
    return this.gtT;
  }

  public int bKp() {
    return this.gtS;
  }

  public boolean om() {
    return this.gtN;
  }

  public boolean on() {
    return this.gtO;
  }

  public boolean bKq() {
    return this.gtX;
  }

  public short nR() {
    return this.gtM;
  }

  public void fT(boolean paramBoolean) {
    this.gtO = paramBoolean;
  }

  public void a(adx paramadx) {
    this.gub = paramadx;
  }

  public adx bKr() {
    return this.gub;
  }

  public cxg bKs() {
    return this.gtY;
  }

  public bXe bKt() {
    return this.gtZ;
  }

  public boolean bKu() {
    return b(bGS.gDE);
  }

  public boolean bKv() {
    return b(bGS.gDF);
  }

  public boolean bKw() {
    return (this.gtL.nh().length > 0) || (this.gtL.nc() == 218) || (this.gtL.nc() == 399);
  }

  public boolean bKx()
  {
    return false;
  }

  public int bKy() {
    return UQ.contains(this.aw) ? 1 : 0;
  }

  public boolean bKz() {
    return byM.gml.contains(bKy());
  }

  public boolean nI() {
    return cBF.isG.xn(this.aw) != null;
  }

  public static boolean a(boolean paramBoolean1, boolean paramBoolean2, int paramInt) {
    return (paramBoolean1) && (!paramBoolean2) && (paramInt == bsj.fOA.getId());
  }

  public short nV() {
    bkH localbkH = byM.gml.rF(bKy());
    if (localbkH == null) {
      return this.cZu;
    }

    dHJ localdHJ = bPC.b(localbkH);
    return localdHJ.nV();
  }

  public boolean bKA() {
    return this.gue > 0;
  }

  public aly bKB() {
    return this.guc;
  }

  public byte bKC() {
    return this.gue;
  }

  public aRQ bKD() {
    return this.gud;
  }

  public int bKE() {
    return this.guf;
  }

  public void sc(int paramInt) {
    this.guf = paramInt;
  }

  public boolean bKF() {
    Iterator localIterator = bKh();
    while (localIterator.hasNext()) {
      dpI localdpI = (dpI)localIterator.next();
      if (localdpI.eo() == bsj.fOS.getId()) {
        return true;
      }
    }
    return false;
  }
}