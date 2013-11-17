import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public abstract class dyV extends aAn
{
  private static final dSc[] lci = { eu.aAg, eu.azc, eu.azh };

  protected final aoV dcN = new aoV(lci);

  public static final dJC aCh = new dJC(new ec[] { new axp("Tonneau Panda avec increment des pdv par level", new dou[] { new dou("PdV"), new dou("incr par level"), new dou("Bonus dégats owner recopiés (-1:aucun 0:phys 1:Feu 2:Eau 3:Terre 4:Air") }) });

  private dDN dcP = null;

  private final long[] aGI = new long[1];

  protected dyV()
  {
  }

  public dyV(int paramInt1, bbH parambbH, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, parambbH, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public void initialize()
  {
    this.dcN.acY();
    dcS();
    this.dcP = new bgJ(this);

    if (this.fuA == null) {
      return;
    }

    dcR();
  }

  private void dcR() {
    cqm localcqm = a(eu.azc);
    if (this.fuA.b(eu.azc)) {
      localcqm.gv(this.fuA.e(eu.azc));
    }

    bTI localbTI = bTI.dx((byte)(int)vy(2));
    if (localbTI == null) {
      return;
    }

    eu localeu = localbTI.bZS();
    if (localeu == null) {
      return;
    }

    if (this.fuA.b(localeu)) {
      localcqm.gv(this.fuA.e(localeu));
    }

    if (this.fuA.b(eu.azI))
      localcqm.gv(this.fuA.e(eu.azI));
  }

  private void dcS()
  {
    int i = cPY();

    this.dcN.a(eu.aAg).setMax(i);
    this.dcN.a(eu.aAg).cpx();
  }

  private int cPY() {
    float f1 = vy(0);
    int i = nU();
    float f2 = i * vy(1);
    float f3 = f1 + f2;
    float f4;
    if (this.fuA.b(eu.azW))
      f4 = this.fuA.e(eu.azW);
    else {
      f4 = 0.0F;
    }
    return (int)(f3 + f4);
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
    return xj.bpA.xj();
  }

  public long[] a(alr paramalr)
  {
    if (paramalr != null) {
      this.aGI[0] = aUG.B(paramalr.fa(), paramalr.fb(), paramalr.fc());
      return this.aGI;
    }
    return null;
  }

  public List d(alr paramalr)
  {
    return Collections.singletonList(paramalr);
  }

  public boolean c(alr paramalr)
  {
    if ((paramalr instanceof aTa)) {
      return !((aTa)paramalr).Vj();
    }

    return true;
  }

  public boolean aeH()
  {
    return false;
  }

  public boolean atP()
  {
    return false;
  }

  public boolean atQ()
  {
    return false;
  }

  public boolean atL()
  {
    return (super.atL()) || (this.dcN.e(eu.aAg) <= 0);
  }

  public boolean mj()
  {
    return true;
  }

  public qM aF() {
    return aCh;
  }

  public dDN atO()
  {
    return this.dcP;
  }
}