import java.util.ArrayList;
import java.util.BitSet;

public abstract class aYV extends aAn
{
  public static final dJC aCh = new dJC(new ec[] { new axp("Aura de tour de bulle de combat", new dou[0]), new axp("Bordure bloquante", new dou[] { new dou("Bloquante (1 = oui, 0 = non (defaut))") }), new axp("Bordure invisible", new dou[] { new dou("Bloquante (1 = oui, 0 = non (defaut))"), new dou("Invisible (1 = oui, 0 = non (defaut))") }) });

  protected boolean fft = false;
  protected boolean ffu = false;

  private final long[] aCi = new long[1];

  public dJC mi()
  {
    return aCh;
  }

  protected aYV() {
  }

  public aYV(int paramInt1, BitSet paramBitSet1, BitSet paramBitSet2, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramInt1, null, paramBitSet1, paramBitSet2, paramInt2, paramInt3, paramArrayOfFloat1, paramArrayOfFloat2, paramBoolean1, paramBoolean2);
  }

  public int getType()
  {
    return xj.bpo.xj();
  }

  public void initialize()
  {
    if (getParamCount() >= 1)
      this.fft = ((int)vy(0) == 1);
    if (getParamCount() >= 2)
      this.ffu = ((int)vy(0) == 1);
  }

  public boolean aeH()
  {
    return this.fft;
  }

  public boolean bnX() {
    return this.ffu;
  }

  public void g(UG paramUG) {
    this.dcQ = new bWh(paramUG);
    if (this.fft)
      paramUG.ahY();
  }

  public void mk()
  {
    if ((this.dcQ instanceof bWh))
      this.hJs = ((bWh)this.dcQ).cbv();
    else
      super.mk();
  }

  public long[] a(alr paramalr)
  {
    if (paramalr != null) {
      this.aCi[0] = aUG.B(paramalr.fa(), paramalr.fb(), paramalr.fc());
      return this.aCi;
    }
    return null;
  }

  public ArrayList b(alr paramalr)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramalr);
    return localArrayList;
  }

  public boolean c(alr paramalr)
  {
    return true;
  }
}