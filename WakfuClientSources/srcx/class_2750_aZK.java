import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

public abstract class aZK extends cGF
  implements DO
{
  private static final Logger K = Logger.getLogger(aZK.class);
  public static final byte fgD = 0;
  protected long aTz;
  private short bgp;
  protected final cYk cGk = new cYk();
  protected short fgE;
  protected short aTn;
  private boolean aYZ;
  protected boolean dgA;
  protected short fgF;
  protected final HashSet fgG = new HashSet();
  private CG ax;
  protected String fgH;
  protected boolean fgI;
  protected boolean fgJ;
  protected byte fgK = 0;
  private boolean fgL;
  private final HashSet fgM = new HashSet();
  protected bOO bf;
  private ArrayList fgN;

  public final short boz()
  {
    return this.fgF;
  }

  public CG E() {
    return this.ax;
  }

  public abstract int fa();

  public abstract int fb();

  public abstract short fc();

  public void c(CG paramCG) {
    this.ax = paramCG;
  }

  public long getId()
  {
    return this.aTz;
  }

  public void a(long paramLong) {
    this.aTz = paramLong;
  }

  public void a(bYj parambYj) {
    this.fgM.add(parambYj);
  }

  public void h(Collection paramCollection) {
    this.fgM.addAll(paramCollection);
  }

  public final void i(Collection paramCollection) {
    this.fgM.clear();
    if (paramCollection != null)
      this.fgM.addAll(paramCollection);
  }

  public void b(bYj parambYj)
  {
    this.fgM.remove(parambYj);
  }

  public void j(Collection paramCollection) {
    this.fgM.removeAll(paramCollection);
  }

  public boolean c(bYj parambYj) {
    return this.fgM.contains(parambYj);
  }

  public Iterator boA() {
    return this.fgM.iterator();
  }

  public int boB() {
    return this.fgM.size();
  }

  public final short getState()
  {
    return this.aTn;
  }

  public void x(short paramShort)
  {
    this.aTn = paramShort;
  }

  public final short boC()
  {
    return this.fgE;
  }

  public void bC(short paramShort) {
    this.fgE = paramShort;
  }

  public final cYk ML() {
    return this.cGk;
  }

  public final boolean boD() {
    return this.fgJ;
  }

  public void eu(boolean paramBoolean) {
    this.fgJ = paramBoolean;
  }

  public boolean boE() {
    return false;
  }

  public boolean sO() {
    return (this.fgI) && (this.aYZ);
  }

  public boolean isUsable() {
    return this.dgA;
  }

  public void setUsable(boolean paramBoolean) {
    this.dgA = paramBoolean;
  }

  public boolean isVisible() {
    return this.aYZ;
  }

  public void setVisible(boolean paramBoolean) {
    this.aYZ = paramBoolean;

    if (!paramBoolean)
      ev(false);
  }

  public void hI(String paramString)
  {
    this.fgH = paramString.intern();
  }

  protected void a(bOO parambOO)
  {
    this.bf = parambOO;
  }

  public cCH[] adw()
  {
    return new cCH[] { yI(), ak() };
  }

  public void aJ() {
    this.aTz = 0L;
    this.bgp = 0;
    this.cGk.reset();
    this.fgE = 0;
    this.aTn = 32767;
    this.aYZ = false;
    this.dgA = false;
    this.fgF = 0;
    this.ax = CG.bFM;
    this.fgH = null;
    this.fgI = false;
    this.fgJ = false;
    this.fgK = 0;
    this.fgL = false;
  }

  public void bc()
  {
    this.aTz = 9223372036854775807L;
    this.fgG.clear();
    this.fgM.clear();
    if (this.fgN != null) {
      this.fgN.clear();
      this.fgN = null;
    }
  }

  public final void release()
  {
    if (this.bf != null) {
      try {
        this.bf.y(this);
      } catch (Exception localException) {
        K.error("Erreur lors du retour au pool", localException);
      }
      this.bf = null;
    } else {
      K.error("Double release de " + getClass(), new Exception());
      bc();
    }
  }

  public final void a(dTm paramdTm)
  {
    if (this.fgN == null) {
      this.fgN = new ArrayList(1);
    }
    if (this.fgN.contains(paramdTm)) {
      return;
    }
    this.fgN.add(paramdTm);
  }

  public final void boF()
  {
    this.fgN.clear();
    this.fgN = null;
  }

  public boolean o(cYk paramcYk)
  {
    return (!this.fgG.isEmpty()) && (this.fgG.contains(paramcYk));
  }

  public HashSet boG() {
    return this.fgG;
  }

  public final void JZ()
  {
    if (this.fgN != null)
      for (dTm localdTm : this.fgN)
        localdTm.b(this);
  }

  public cCH[] tn()
  {
    return new cCH[] { boH(), boI(), yI(), ak(), boJ(), boK() };
  }

  protected abstract cCH boH();

  protected abstract cCH boI();

  protected abstract cCH yI();

  protected abstract cCH ak();

  protected abstract cCH boJ();

  protected abstract cCH boK();

  public final void b(dTm paramdTm)
  {
    if (this.fgN != null)
      this.fgN.remove(paramdTm);
  }

  public void ev(boolean paramBoolean)
  {
    this.fgI = paramBoolean;
  }

  public String toString()
  {
    return '[' + getClass().getSimpleName() + " id=" + this.aTz + ']' + ML();
  }

  protected abstract tF boL();

  public void cA(byte paramByte) {
    this.fgK = paramByte;
  }

  public byte boM() {
    return this.fgK;
  }

  public void bD(short paramShort) {
    this.bgp = paramShort;
  }

  public short boN() {
    return this.bgp;
  }

  public boolean om() {
    return false;
  }

  public void boO()
  {
    this.fgL = true;
  }

  public void boP() {
    this.fgL = false;
  }

  public boolean isDummy() {
    return this.fgL;
  }

  public void boQ()
  {
  }
}