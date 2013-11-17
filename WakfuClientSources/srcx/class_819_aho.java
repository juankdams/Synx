import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

public abstract class aho extends aAn
{
  private final cgg dcL = new cgg();
  private CG ax;
  private static final dSc[] dcM = { eu.aAg, eu.azc };

  protected final aoV dcN = new aoV(dcM);
  private int dcO;
  public static final dJC aCh = new dJC(new ec[] { new axp("Balise destructible", new dou[] { new dou("HP"), new dou("incr par level") }) });

  private dDN dcP = null;

  public dJC mi() {
    return aCh;
  }

  public aho(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public aAn a(agg paramagg)
  {
    aAn localaAn = super.a(paramagg);
    if ((paramagg != null) && (paramagg.E() != null)) {
      localaAn.c(paramagg.E());
    }
    else {
      localaAn.c(CG.bFI);
    }
    return localaAn;
  }

  protected aho()
  {
  }

  public int getType() {
    return xj.bpl.xj();
  }

  public void initialize()
  {
    this.dcN.acY();
    int i = (int)(vy(0) + nU() * vy(1));
    this.dcN.a(eu.aAg).setMax(i);
    this.dcN.a(eu.aAg).cpx();
    this.dcP = new bgJ(this);
    a(cfY.hCs);
  }

  public boolean c(alr paramalr)
  {
    return paramalr == this.fuA;
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
    if (this.dcN != null) {
      return this.dcN.c(paramdSc);
    }
    return false;
  }

  public boolean atL()
  {
    return (super.atL()) || (this.dcN.e(eu.aAg) <= 0);
  }

  public CG E()
  {
    return this.ax;
  }

  public void c(CG paramCG)
  {
    this.ax = paramCG;
  }

  public void g(CG paramCG)
  {
  }

  public CG atM()
  {
    return E();
  }

  public aYx atN()
  {
    this.dcL.a(fa(), fb(), fc(), E());
    return this.dcL;
  }

  public long[] a(alr paramalr)
  {
    return (long[])f(paramalr).Lp();
  }

  public Cs f(alr paramalr) {
    long[] arrayOfLong = { aUG.B(fa(), fb(), fc()) };
    ArrayList localArrayList = new ArrayList();
    return new Cs(localArrayList, arrayOfLong);
  }

  public ArrayList b(alr paramalr)
  {
    return new ArrayList();
  }

  public void ps()
  {
    super.ps();

    ArrayList localArrayList = new ArrayList();
    Iterator localIterator;
    cjK localcjK;
    if (this.ejP != null) {
      for (localIterator = this.ejP.LC().bbj().iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
        if ((localcjK != this) && (localcjK.getType() == xj.bpl.xj()) && (localcjK.fa() == fa()) && (localcjK.fb() == fb()) && (localcjK.fc() == fc()) && (localcjK.axG() == axG()))
        {
          localArrayList.add(localcjK);
        }
      }
      for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
        this.ejP.LC().h(localcjK);
      }
    }
  }

  public dDN atO()
  {
    return this.dcP;
  }

  public byte bY()
  {
    return 6;
  }

  public boolean atP()
  {
    return true;
  }

  public boolean aeH()
  {
    return true;
  }

  public boolean atQ()
  {
    return true;
  }

  public void ig(int paramInt) {
    this.dcO = paramInt;
  }

  public int atR() {
    return this.dcO;
  }

  public void bc()
  {
    super.bc();
    this.dcO = 0;
  }
}