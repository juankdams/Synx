import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public class bJC
  implements bqk
{
  private static final int gKZ = 981;
  public static short aET = 0;
  public static short aEU = 0;
  public static short aEV = 0;
  protected short gLa;
  protected short gLb;
  protected short gLc;
  protected float gLd;
  protected boolean aOD;
  protected boolean aOE;
  protected int gLe;
  protected int gLf;
  protected boolean bKH;
  protected boolean bKF;
  protected boolean gLg;
  protected boolean bKK;
  protected boolean gLh = false;
  protected adz gLi;
  protected bZA gLj;
  private final BitSet gLk = new BitSet();
  private boolean gLl;
  protected boolean bKN;
  protected byte bKO;
  protected bGX gLm;
  protected List gLn = null;
  protected boolean bKM = false;
  protected short cZu;
  protected int gLo;
  protected cjT eqL = new cjT();
  private boolean gLp = false;
  protected boolean gLq = false;

  public static int I(short paramShort1, short paramShort2)
  {
    return (paramShort1 << 16) + (paramShort2 & 0xFFFF);
  }

  public static short td(int paramInt) {
    return (short)(paramInt >> 16);
  }

  public bZA bQT() {
    return this.gLj;
  }

  public static short nb(int paramInt) {
    return (short)(paramInt & 0xFFFF);
  }

  public short nU() {
    return this.cZu;
  }

  public bJC cJ(short paramShort) {
    bJC localbJC = new bJC();
    a(paramShort, localbJC);
    return localbJC;
  }

  protected void a(short paramShort, bJC parambJC)
  {
    parambJC.gLb = this.gLb;
    parambJC.gLa = this.gLa;
    parambJC.gLc = this.gLc;
    parambJC.gLd = this.gLd;
    parambJC.gLe = this.gLe;
    parambJC.aOD = this.aOD;
    parambJC.aOE = this.aOE;
    parambJC.gLf = this.gLf;
    parambJC.eqL = this.eqL;
    parambJC.e(bQY());

    parambJC.cZu = ((short)Math.min(paramShort, this.gLa));
    parambJC.gLo = I(this.gLb, paramShort);
    parambJC.bKH = this.bKH;
    parambJC.bKF = this.bKF;
    parambJC.gLg = this.gLg;
    parambJC.gLi = this.gLi;
    parambJC.bKK = this.bKK;
    parambJC.gLh = this.gLh;
    parambJC.bKM = this.bKM;
    parambJC.bKN = this.bKN;
    parambJC.gLp = this.gLp;
    parambJC.bKO = this.bKO;
    parambJC.gLq = this.gLq;
  }

  public int bdm() {
    return te(this.cZu);
  }

  public cuf bQU() {
    return cK(this.cZu);
  }

  public cuf cK(short paramShort) {
    int i = (short)te(paramShort);
    return cuf.wN(i).hH(this.aOD).hG(this.aOE).dl((short)(this.gLc + 1));
  }

  public int te(int paramInt)
  {
    return this.gLc + (int)Math.floor((paramInt < this.gLa ? paramInt : this.gLa) * this.gLd);
  }

  public int bQV() {
    return this.gLe + (this.cZu < this.gLa ? this.cZu : this.gLa) * this.gLf;
  }

  public short bQW() {
    return this.gLb;
  }

  public int bQX() {
    return this.gLo;
  }

  public void a(dpI paramdpI) {
    this.eqL.add(paramdpI);
  }

  public Iterator iterator() {
    return cd(nU()).iterator();
  }

  public ArrayList cd(short paramShort) {
    int i = this.eqL.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      dpI localdpI = (dpI)this.eqL.get(j);
      if ((paramShort >= localdpI.zB()) && (paramShort <= localdpI.zC())) {
        localArrayList.add(localdpI);
      }
    }
    return localArrayList;
  }

  public BitSet bQY() {
    return this.gLk;
  }

  public void e(BitSet paramBitSet) {
    this.gLk.or(paramBitSet);
  }

  public int nS() {
    return 1;
  }

  public long nT() {
    return this.gLo;
  }

  public boolean NT() {
    return (this.bKH) && (!this.gLl);
  }

  public Iterator bQZ() {
    return this.gLn != null ? this.gLn.iterator() : new btA();
  }

  public boolean NS() {
    return this.gLg;
  }

  public short nY() {
    return aET;
  }

  public short nZ() {
    return aEU;
  }

  public short oa() {
    return aEV;
  }

  public boolean bRa() {
    return this.gLl;
  }

  public void gi(boolean paramBoolean) {
    this.gLl = paramBoolean;
  }

  public boolean zI() {
    return this.bKN;
  }

  public boolean aI(int paramInt) {
    return false;
  }

  public BitSet ob() {
    return null;
  }

  public adz bRb() {
    return this.gLi;
  }

  public boolean bRc() {
    return (bQV() < 0) && (bdm() < 0);
  }

  public boolean NW() {
    return this.bKK;
  }

  public boolean bRd() {
    return this.gLh;
  }

  public short bRe() {
    return this.gLa;
  }

  public boolean NY() {
    return this.bKM;
  }

  public String getName() {
    return "state-" + bQW();
  }

  public void gj(boolean paramBoolean) {
    this.gLp = paramBoolean;
  }

  public boolean bRf() {
    return this.gLp;
  }

  public boolean bRg() {
    return this.gLb == 981;
  }

  public bGX bRh() {
    return this.gLm;
  }

  public ZY bRi() {
    return ZY.aC(this.bKO);
  }

  public boolean bRj() {
    return this.gLq;
  }
}