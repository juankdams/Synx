import java.util.BitSet;
import java.util.List;

public abstract class dha extends cWy
{
  private static final dSc[] lci = { eu.aAg, eu.azc, eu.azh };

  protected final aoV dcN = new aoV(lci);
  private CG dLD = null;

  public static final dJC aCh = new dJC(new ec[] { new axp("Tonneau Panda avec increment des pdv par level", new dou[] { new dou("PdV"), new dou("incr par level"), new dou("Bonus de PdV en % de PdV du caster"), new dou("incr du Bonus de PdV en % de PdV du caster") }) });

  private dDN dcP = null;

  private final long[] aGI = new long[1];

  protected dha()
  {
  }

  public dha(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public void initialize()
  {
    this.dcN.acY();
    int i = cPY();
    this.dcN.a(eu.aAg).setMax(i);
    this.dcN.a(eu.aAg).cpx();
    this.dcP = new bgJ(this);
  }

  private int cPY() {
    float f1 = vy(0);
    int i = nU();
    float f2 = i * vy(1);
    float f3 = vy(2) + vy(3) * i;
    float f4 = f1 + f2;
    float f5 = f3 * this.fuA.a(eu.ayM).max() / 100.0F;
    return (int)(f4 + f5);
  }

  public cqm atJ()
  {
    return a(eu.aAg);
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

  public int getType()
  {
    return xj.bpz.xj();
  }

  public long[] a(alr paramalr)
  {
    this.aGI[0] = aUG.y(this.cGk);
    return this.aGI;
  }

  public List d(alr paramalr)
  {
    return null;
  }

  public boolean c(alr paramalr)
  {
    return false;
  }

  public boolean aeH()
  {
    return true;
  }

  public boolean atP()
  {
    return true;
  }

  public boolean atQ()
  {
    return true;
  }

  public boolean atL()
  {
    return (super.atL()) || (this.dcN.e(eu.aAg) <= 0);
  }

  public boolean mj()
  {
    return false;
  }

  public int fa()
  {
    if (Vl() != null) {
      Vl().fa();
    }
    return super.fa();
  }

  public int fb()
  {
    cYl localcYl = Vl();
    if (localcYl != null) {
      localcYl.fb();
    }
    return super.fb();
  }

  public short fc()
  {
    cYl localcYl = Vl();
    if (localcYl != null) {
      localcYl.fc();
    }
    return super.fc();
  }

  public qM aF() {
    return aCh;
  }

  public void g(CG paramCG)
  {
    this.dLD = paramCG;
  }

  public CG atM()
  {
    if (this.dLD == null) {
      return E();
    }
    return this.dLD;
  }

  public dDN atO()
  {
    return this.dcP;
  }

  protected byte aIo()
  {
    return 3;
  }
}