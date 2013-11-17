import java.util.ArrayList;
import java.util.BitSet;

public abstract class bbx extends aAn
{
  private static final BitSet fkE = new BitSet();

  public static final dJC aCh = new dJC(new ec[] { new axp("Piège standard", new dou[0]), new axp("Piège pouvant être déclenché par son proprio", new dou[] { new dou("peut être déclenché par le proprio (1=oui, 0= non (defaut))") }), new axp("Piege visible pour tout le monde", new dou[] { new dou("peut être déclenché par le proprio (1=oui, 0= non (defaut))"), new dou("visible pour tout le monde (1=oui, 0= non (defaut))") }) });

  private static final dSc[] fkF = { eu.azc, eu.aza };

  protected final aoV dcN = new aoV(fkF);
  private BitSet fkG;
  private boolean fkH = false;
  private boolean fkI;
  private final long[] aGI = new long[1];

  public dJC mi()
  {
    return aCh;
  }

  protected bbx()
  {
  }

  public void initialize() {
    this.dcN.acY();

    this.fkH = false;
    this.fkI = true;
    if (this.baW == null) {
      return;
    }
    if (this.baW.length > 0) {
      this.fkH = (vy(0) == 1.0F);
    }
    if (this.baW.length > 1)
      this.fkI = (vy(1) == 0.0F);
  }

  public cqm a(dSc paramdSc)
  {
    return this.dcN.a(paramdSc);
  }

  public aoV atK()
  {
    return this.dcN;
  }

  public boolean b(dSc paramdSc)
  {
    return this.dcN.c(paramdSc);
  }

  public bbx(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public int getType()
  {
    return xj.bpm.xj();
  }

  public long[] a(alr paramalr)
  {
    this.aGI[0] = aUG.y(this.cGk);
    return this.aGI;
  }

  public ArrayList b(alr paramalr)
  {
    return null;
  }

  public boolean c(alr paramalr)
  {
    if (this.fkH) {
      return true;
    }
    if (paramalr != this.fuA) {
      return true;
    }
    if (!(this.fuA instanceof dhJ)) {
      return true;
    }
    if ((this.fkG != null) && (!this.fkG.intersects(fkE))) {
      return true;
    }

    dHW localdHW = (dHW)this.fuA;
    aPH localaPH = localdHW.afv();
    return (localaPH == null) || (!localaPH.LH().ae(localdHW.getId()));
  }

  public boolean a(BitSet paramBitSet, alr paramalr)
  {
    this.fkG = paramBitSet;
    boolean bool = (c(paramalr)) && (super.a(paramBitSet, paramalr));
    this.fkG = null;
    return bool;
  }

  public boolean bnX() {
    return this.fkI;
  }

  static
  {
    fkE.set(10001);
    fkE.set(10008);
    fkE.set(10002);
  }
}