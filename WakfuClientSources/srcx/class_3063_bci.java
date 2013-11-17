import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

public class bci
{
  private final int aw;
  protected short aKJ;
  private final float flR;
  private final float flS;
  private final short bdM;
  private final short bdN;
  protected boolean bdO;
  private final EnumSet flT = EnumSet.noneOf(aDc.class);

  private final alz flU = new alz();
  public static final byte flV = 16;
  public static final byte flW = 0;

  public bci(int paramInt, short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, boolean paramBoolean)
  {
    this.aw = paramInt;
    this.aKJ = paramShort1;
    this.bdO = paramBoolean;
    this.bdM = paramShort2;
    this.bdN = paramShort3;
    this.flR = (paramShort4 / 100.0F);
    this.flS = (paramShort5 / 100.0F);
  }

  public int getId() {
    return this.aw;
  }

  public void a(aDc paramaDc) {
    this.flT.add(paramaDc);
  }

  public void h(Collection paramCollection) {
    this.flT.addAll(paramCollection);
  }

  public void b(aDc paramaDc) {
    this.flT.remove(paramaDc);
  }

  public void j(Collection paramCollection) {
    this.flT.removeAll(paramCollection);
  }

  public boolean c(aDc paramaDc) {
    return this.flT.contains(paramaDc);
  }

  public Iterator boA() {
    return this.flT.iterator();
  }

  public short bqt() {
    return this.aKJ;
  }

  public boolean aeH() {
    return this.bdO;
  }

  public void a(cnS paramcnS) {
    this.flU.a(paramcnS.cof(), paramcnS);
  }

  public final cnS oP(int paramInt) {
    return (cnS)this.flU.hc(paramInt);
  }

  public final int bqu() {
    return this.flU.size();
  }

  public void oQ(int paramInt) {
    this.flU.aV(paramInt);
  }

  public final cnS cE(byte paramByte) {
    if (this.flU.size() == 0) {
      return null;
    }

    return (cnS)this.flU.bf(paramByte);
  }

  public float bqv() {
    return this.flR;
  }

  public float bqw() {
    return this.flS;
  }

  public short Bu() {
    return this.bdM;
  }

  public short Bv() {
    return this.bdN;
  }

  public short bqx() {
    return (short)(this.bdM - (this.bdN - this.bdM) / 2);
  }

  public short bqy() {
    return (short)(this.bdN + (this.bdN - this.bdM) / 2);
  }
}