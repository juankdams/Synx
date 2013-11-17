public abstract class FZ
{
  private final cSi bOn = new cSi();
  private final bHu bOo = new bHu();

  private int bOp = -1;
  private short aFe = 0;

  protected abstract void fill();

  protected final void add(int paramInt) {
    int i = this.bOn.indexOf(paramInt);
    if (i == -1) {
      i = this.bOn.size();
      this.bOn.add(paramInt);
      this.bOo.add((short)0);
    }

    this.bOo.x(i, (short)(this.bOo.sV(i) + 1));
  }

  private int Qj() {
    return this.bOp;
  }

  private short nP() {
    return this.aFe;
  }

  private void Qk() {
    this.aFe = 0;
    this.bOp = -1;

    int i = 0; for (int j = this.bOo.size(); i < j; i++) {
      short s = this.bOo.sV(i);
      if (s > this.aFe) {
        this.aFe = s;
        this.bOp = this.bOn.wm(i);
      }
    }
  }

  private void Ql() {
    this.aFe = 0;
    this.bOp = -1;

    int i = 0;
    int j = this.bOo.size();
    for (int k = 0; k < j; k++) {
      i += this.bOo.sV(k);
    }
    k = bCO.sf(i);
    for (int m = 0; m < j; m++) {
      k -= this.bOo.sV(m);
      if (k < 0) {
        this.bOp = this.bOn.wm(m);
        this.aFe = this.bOo.sV(m);
        return;
      }
    }
  }
}