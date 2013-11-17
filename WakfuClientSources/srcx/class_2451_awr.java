import java.util.BitSet;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class awr extends cWy
{
  private static final dSc[] dLC = { eu.azR, eu.azc, eu.azd, eu.azg, eu.aze, eu.azf, eu.azC };

  protected final aoV dcN = new aoV(dLC);
  private CG dLD = null;

  public static final dJC aCh = new dJC(new ec[] { new axp("Bombe roublard", new dou[] { new dou("BOMB_COOLDOWN") }), new axp("Bombe roublard avec increment des pdv par level", new dou[] { new dou("BOMB_COOLDOWN"), new dou("incr par level") }) });

  private dDN dcP = null;
  protected aEm dLE;
  private final long[] aGI = new long[1];

  protected awr()
  {
  }

  public awr(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public void initialize()
  {
    this.dcN.acY();
    float f = this.baW.length > 1 ? nU() * vy(1) : 0.0F;
    int i = (int)(vy(0) + f);
    this.dcN.a(eu.azR).setMax(i);
    this.dcN.a(eu.azR).cpx();
    this.dcP = new bgJ(this);
  }

  public cqm atJ()
  {
    return a(eu.azR);
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
    return xj.bps.xj();
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
    if (paramalr == null) {
      return true;
    }
    if (this.fuA == paramalr) {
      return true;
    }
    if ((paramalr instanceof awr)) {
      return ((cBn)paramalr).axG() == this.fuA;
    }
    if ((paramalr instanceof dhJ)) {
      return ((cYl)paramalr).afw() == this.fuA;
    }
    return false;
  }

  public boolean a(cYl paramcYl)
  {
    if (e(eu.azR) <= 0) {
      return false;
    }
    return super.a(paramcYl);
  }

  public boolean aeH()
  {
    return false;
  }

  public boolean atP()
  {
    return false;
  }

  public boolean mj()
  {
    return false;
  }

  public int fa()
  {
    cYl localcYl = Vl();
    if (localcYl != null) {
      localcYl.fa();
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

  public void aIp() {
  }

  public void a(aEm paramaEm) {
    this.dLE = paramaEm;
  }

  public void atl()
  {
    super.atl();
    if (this.dLE != null)
      try {
        this.dLE.f(this);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }
}