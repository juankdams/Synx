import org.apache.log4j.Logger;

public abstract class aOm
  implements bBz, bXd, dsj, eo
{
  protected static final Logger K = Logger.getLogger(aOm.class);
  protected gA aUe;
  protected int bsY;
  protected bCe bsX;

  public gA getItem()
  {
    return this.aUe;
  }

  public void setItem(gA paramgA) {
    this.aUe = paramgA;
  }

  public int Hv() {
    return this.bsY;
  }

  public void ed(int paramInt) {
    this.bsY = paramInt;
  }

  public bCe Hy() {
    return this.bsX;
  }

  public void b(bCe parambCe) {
    if (parambCe == null) {
      K.error("set de packtype invalide sur merchantitem=" + this, new Exception());
      this.bsX = bCe.gwo;
      return;
    }

    this.bsX = parambCe;
  }

  public void release()
  {
  }

  public long oj()
  {
    if (this.aUe == null)
      return -1L;
    return this.aUe.oj();
  }

  public int ok()
  {
    return this.aUe.ok();
  }

  public short nP() {
    return this.aUe.nP();
  }

  public void l(short paramShort) {
    this.aUe.l(paramShort);
  }

  public void a(short paramShort) {
    this.aUe.a(paramShort);
  }

  public boolean b(dsj paramdsj) {
    return this.aUe.b(paramdsj);
  }

  public short nR() {
    return this.aUe.nR();
  }

  public dsj r(boolean paramBoolean)
  {
    return null;
  }

  public dsj ow()
  {
    return null;
  }

  public void aJ()
  {
    this.bsX = bCe.gwo;
  }

  public void bc()
  {
    if (this.aUe != null) {
      this.aUe.release();
      this.aUe = null;
    }
    this.bsY = 0;
    this.bsX = null;
  }

  public String ov()
  {
    return this.aUe.ov() + "p" + this.bsX.goO + "k" + this.bsY;
  }

  public String beY()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AbstractMerchantInventoryItem");
    localStringBuilder.append("{m_item=").append((this.aUe == null) || (this.aUe.oi() == null) ? "null" : this.aUe.oi().getName());
    localStringBuilder.append(", m_price=").append(this.bsY);
    localStringBuilder.append(", m_packType=").append(this.bsX);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }

  public String toString()
  {
    return ov();
  }
}