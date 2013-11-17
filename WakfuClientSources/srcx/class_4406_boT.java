public final class boT
{
  private boolean fIv;
  private agG fIw;
  private bpG fIx;
  private aaj fIy;

  public void a(agG paramagG, boolean paramBoolean, bpG parambpG, aaj paramaaj)
  {
    if ((!bB) && (this.fIw != null)) throw new AssertionError("ItemComposer already initialized. Can't be initialized twice.");
    this.fIw = paramagG;
    this.fIv = paramBoolean;
    this.fIx = parambpG;
    this.fIy = paramaaj;
  }

  public agG byv() {
    return this.fIw;
  }

  public boolean byw() {
    return this.fIv;
  }

  public bpG byx()
  {
    return this.fIx;
  }

  public aaj byy()
  {
    return this.fIy;
  }

  public String toString()
  {
    return "ItemComposer{m_pooledByDefault=" + this.fIv + ", m_uidGenerator=" + this.fIw + ", m_fieldProvider=" + this.fIx + ", m_quantityChangeListener=" + this.fIy + '}';
  }
}