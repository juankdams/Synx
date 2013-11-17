import java.util.ArrayList;

class avh
{
  private final ArrayList bYE = new ArrayList();
  private int hY;
  private int hZ;
  private int ia;
  private int ib;
  private float dJR;
  private float dJS;

  public void f(bpn parambpn)
  {
    this.bYE.add(parambpn);
  }

  public void g(bpn parambpn) {
    this.bYE.remove(parambpn);
  }

  public boolean isEmpty() {
    return this.bYE.isEmpty();
  }

  public bpn aHi() {
    if (this.bYE.isEmpty()) {
      return null;
    }

    return (bpn)this.bYE.get(0);
  }

  public ArrayList aHj() {
    return this.bYE;
  }

  public void setPosition(int paramInt1, int paramInt2) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
  }

  public void aHk() {
    if (this.bYE.size() == 0) {
      return;
    }

    int i = 0;

    int j = 0; int k = 0; int m = 0; int n = 0;

    dRq localdRq = null;

    for (int i1 = this.bYE.size() - 1; i1 >= 0; i1--) {
      bpn localbpn = (bpn)this.bYE.get(i1);
      if (localdRq == null) {
        localdRq = localbpn.getContainer();
      }
      if (i == 0) {
        i = 1;
        j = localbpn.getX();
        k = localbpn.getX() + localbpn.getWidth();
        m = localbpn.getY();
        n = localbpn.getY() + localbpn.getHeight();
      } else {
        j = Math.min(j, localbpn.getX());
        k = Math.max(k, localbpn.getX() + localbpn.getWidth());
        m = Math.min(m, localbpn.getY());
        n = Math.max(n, localbpn.getY() + localbpn.getHeight());
      }
    }

    if (localdRq == null) {
      return;
    }

    this.hY = j;
    this.hZ = m;
    this.ia = (k - j);
    this.ib = (n - m);
    this.dJR = (this.hY / (localdRq.getWidth() - this.ia));
    this.dJS = (this.hZ / (localdRq.getHeight() - this.ib));
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public int getWidth() {
    return this.ia;
  }

  public int getHeight() {
    return this.ib;
  }

  public float aHl() {
    return this.dJR;
  }

  public float aHm() {
    return this.dJS;
  }
}