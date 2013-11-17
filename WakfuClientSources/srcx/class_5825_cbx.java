public final class cbx extends bnl
{
  btB hte = null;

  public cbx(btB parambtB) {
    this.hte = parambtB;
  }

  private cbx() {
  }

  private cbx(aYQ paramaYQ) {
    d(paramaYQ);
  }

  public btB cft() {
    return this.hte;
  }

  public boolean bsn() {
    return false;
  }

  public void clear() {
    this.hte = null;
  }

  public final void d(aYQ paramaYQ) {
    this.hte = btB.r(paramaYQ);
  }

  public void b(dSw paramdSw)
  {
    btB.a(this.hte, paramdSw);
  }

  protected final void a(bnl parambnl) {
    cbx localcbx = (cbx)parambnl;
    clear();
    if (localcbx.hte != null)
      this.hte = new btB(localcbx.hte);
  }

  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof cbx)) {
      return false;
    }
    cbx localcbx = (cbx)paramObject;

    if (this.hte != null ? !this.hte.a(localcbx.hte) : localcbx.hte != null) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    return this.hte != null ? this.hte.hashCode() : 0;
  }
}