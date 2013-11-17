import com.ankamagames.wakfu.client.WakfuClientInstance;

public class aur extends ais
{
  private dEw dGE;

  public aur(aid paramaid)
  {
    super(paramaid);
  }

  public void kq(int paramInt) {
    a(aWQ.fcb, paramInt);
  }

  public void kr(int paramInt) {
    a(aWQ.fcc, paramInt);
  }

  public void ks(int paramInt) {
    a(aWQ.fcd, paramInt);
  }

  public void kt(int paramInt) {
    a(aWQ.fce, paramInt);
  }

  public void ku(int paramInt) {
    a(aWQ.fcf, paramInt);
  }

  public void kv(int paramInt) {
    a(aWQ.fcg, paramInt);
  }

  public boolean a(dhJ paramdhJ, int paramInt) {
    return true;
  }

  public boolean b(dhJ paramdhJ, int paramInt) {
    return true;
  }

  public boolean iG(int paramInt) {
    return false;
  }

  public boolean iH(int paramInt) {
    return false;
  }

  private void a(aWQ paramaWQ, int paramInt) {
    bZy localbZy = new bZy();
    localbZy.aM(this.deu.getId());
    localbZy.dB(paramaWQ.bJ());
    localbZy.aG(paramInt);
    WakfuClientInstance.awy().awz().aJK().d(localbZy);
  }

  public dEw aGA() {
    if (this.dGE == null) {
      this.dGE = new dEw(this.deu);
    }

    return this.dGE;
  }
}