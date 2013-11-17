import java.util.concurrent.Semaphore;

public class Mx extends cOS
  implements bnX
{
  private final Semaphore bZz = new Semaphore(1);
  private final dQA bZA;
  private final dUC bZB;
  private final dkm bZC;
  private final azG bZD;
  private final bXM bZE;
  private final rD bZF;
  private final Pz bZG;
  private dwr bOt;
  private dcj[] bZH;

  public Mx(djj paramdjj, bSW parambSW, String paramString, int paramInt1, int paramInt2, int paramInt3, dUC paramdUC)
  {
    this(paramdjj, parambSW, new Ge(paramString, paramInt1, paramInt2, paramInt3, null), paramdUC);
  }

  public Mx(djj paramdjj, bSW parambSW, dQA paramdQA, dUC paramdUC)
  {
    super(paramdjj, parambSW);
    this.bZA = paramdQA;
    this.bZB = paramdUC;

    this.bZC = new bpC(this, null);
    this.bZD = new ddi(this, null);
    this.bZE = new buy(this, null);
    this.bZF = new VR(this, null);
    this.bZG = new Pk(this, null);

    paramdjj.a(csu(), this.bZC, this.bZD);
    paramdjj.a(csu(), this.bZE, this.bZF, this.bZG, null);
  }

  public final dwr WF()
  {
    return this.bOt;
  }
}