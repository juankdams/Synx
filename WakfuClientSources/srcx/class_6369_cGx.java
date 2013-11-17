import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cGx
{
  private static final Logger K = Logger.getLogger(cGx.class);
  private static final double iBA = 10.0D;
  public static final byte iBB = 0;
  private final int aw;
  private final int aHf;
  private final short iBC;
  private final long iBD;
  private final int iBE;
  private final bZA aB;
  private final EnumSet flT;
  protected final il iBF = new il();
  private final ArrayList iBG = new ArrayList();
  private final int[] iBH;

  public cGx(int paramInt1, int paramInt2, short paramShort, long paramLong, int paramInt3, bZA parambZA, EnumSet paramEnumSet, int[] paramArrayOfInt)
  {
    this.aw = paramInt1;
    this.aHf = paramInt2;
    this.iBC = paramShort;
    this.iBD = paramLong;
    this.iBE = paramInt3;
    this.aB = parambZA;
    this.flT = (paramEnumSet != null ? paramEnumSet : EnumSet.noneOf(yK.class));
    this.iBH = paramArrayOfInt;
  }

  public boolean aQ(dhJ paramdhJ)
  {
    return (this.aB == null) || (this.aB.i(paramdhJ, paramdhJ, this, paramdhJ.ayL()));
  }

  public byte getType() {
    return 0;
  }

  public void a(yK paramyK) {
    this.flT.add(paramyK);
  }

  public void h(Collection paramCollection) {
    this.flT.addAll(paramCollection);
  }

  public void b(yK paramyK) {
    this.flT.remove(paramyK);
  }

  public void j(Collection paramCollection) {
    this.flT.removeAll(paramCollection);
  }

  public boolean c(yK paramyK) {
    return this.flT.contains(paramyK);
  }

  public Iterator boA() {
    return this.flT.iterator();
  }

  public int[] cBt() {
    return this.iBH;
  }

  public int getId() {
    return this.aw;
  }

  public short cig() {
    return this.iBC;
  }

  public int cBu() {
    return this.iBG.size();
  }

  public long cBv() {
    return this.iBD;
  }

  public int cBw() {
    return this.iBE;
  }

  public long aR(dhJ paramdhJ) {
    int i = paramdhJ.JL().a(bG.kG, this.aHf) + paramdhJ.e(eu.azM);

    double d1 = 1.0D / this.iBD;
    double d2 = 1.0D + i / 100.0D;
    double d3 = d1 * d2;
    return Math.round(1.0D / d3);
  }

  public bmj dD(short paramShort) {
    if (this.iBG.isEmpty()) {
      return bmj.fDN;
    }

    double d = bGD.a(paramShort, this);
    return (bmj)this.iBG.get((int)Math.round(d));
  }

  public double dE(short paramShort) {
    double d1 = bCO.f(this.iBC - paramShort, 0.0D, 10.0D);
    double d2 = d1 / 10.0D;
    return 1.0D - d2;
  }

  public long a(short paramShort, aGH paramaGH) {
    return Et.a(paramShort, this.iBC, DA.bIr.eD(this.aHf), this.iBE, paramaGH);
  }

  public bmj[] cBx() {
    return (bmj[])this.iBG.toArray(new bmj[this.iBG.size()]);
  }

  public bmj dF(short paramShort) {
    bGD localbGD = new bGD(paramShort, this);
    return (bmj)this.iBG.get((int)Math.round(localbGD.nextDouble()));
  }

  public BZ cBy() {
    return this.iBF.qd();
  }

  public bZA F() {
    return this.aB;
  }

  public boolean xL(int paramInt) {
    return this.iBF.containsKey(paramInt);
  }

  public void A(int paramInt, short paramShort) {
    this.iBF.a(paramInt, paramShort);
  }

  public String toString()
  {
    return "CraftRecipe{m_id=" + this.aw + ", m_craftId=" + this.aHf + ", m_requiredLevel=" + this.iBC + ", m_craftDuration=" + this.iBD + '}';
  }

  public boolean xM(int paramInt)
  {
    int i = 0; for (int j = this.iBG.size(); i < j; i++) {
      if (((bmj)this.iBG.get(i)).gw() == paramInt) {
        return true;
      }
    }
    return false;
  }

  public void B(int paramInt, short paramShort) {
    bmj localbmj = new bmj(paramInt, paramShort);

    if (this.iBG.contains(localbmj)) {
      K.warn("Duplication d'item résultant " + paramInt + " sur la recette " + getId());
      return;
    }

    this.iBG.add(localbmj);
  }
}