import java.util.ArrayList;

public class dOj
{
  private final aYr bwL;
  private aBC mgb;
  private final PX mgc = new PX();

  private final PX mgd = new PX();

  private int aMH = 0;

  dOj(aYr paramaYr) {
    this.bwL = paramaYr;
  }

  public void a(aBC paramaBC) {
    this.mgb = paramaBC;
  }

  void Dd(int paramInt) {
    this.aMH += paramInt;
  }

  void a(cQn paramcQn, int paramInt) {
    this.mgc.b(paramcQn.xH(), paramInt, paramInt);
    if (this.mgb != null)
      this.mgb.a(this.bwL, paramcQn.xH(), paramInt);
  }

  void b(cVE paramcVE, int paramInt) {
    this.mgd.b(paramcVE.ewr, paramInt, paramInt);
    if (this.mgb != null)
      this.mgb.a(this.bwL, paramcVE, paramInt);
  }

  public void clear() {
    this.mgc.clear();
    this.mgd.clear();
    this.aMH = 0;
  }

  public void a(VK paramVK, Boolean paramBoolean) {
    this.mgc.a(new bYK(paramVK));
    this.mgd.a(new cxf(paramVK));

    if (paramBoolean.booleanValue()) {
      paramVK.cAS = new dRm();
      paramVK.cAS.bYg = this.aMH;
    }
  }

  public void b(VK paramVK) {
    int i = 0;
    Object localObject;
    for (int j = paramVK.cAQ.size(); i < j; i++) {
      localObject = (aft)paramVK.cAQ.get(i);
      this.mgc.c(((aft)localObject).cYp, ((aft)localObject).crP);
    }
    i = 0; for (j = paramVK.cAR.size(); i < j; i++) {
      localObject = (dAu)paramVK.cAR.get(i);
      this.mgd.c(((dAu)localObject).lHB, ((dAu)localObject).crP);
    }

    if (paramVK.cAS != null)
      this.aMH = paramVK.cAS.bYg;
  }

  public PX dqm() {
    return this.mgc;
  }

  public PX dqn() {
    return this.mgd;
  }

  public int rD() {
    return this.aMH;
  }
}