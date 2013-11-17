public class dvg
  implements cjq
{
  private static final int REQUIRED = 3;
  private Object lAi;
  private Object lAj;
  private boolean eOD = false;
  private boolean caseSensitive = true;
  private int lAk;
  private boolean lAl = false;

  public void bs(Object paramObject)
  {
    if ((paramObject instanceof String))
      qr((String)paramObject);
    else
      bt(paramObject);
  }

  public void qr(String paramString)
  {
    bt(paramString);
  }

  private void bt(Object paramObject) {
    this.lAi = paramObject;
    this.lAk |= 1;
  }

  public void bu(Object paramObject)
  {
    if ((paramObject instanceof String))
      qs((String)paramObject);
    else
      bv(paramObject);
  }

  public void qs(String paramString)
  {
    bv(paramString);
  }

  private void bv(Object paramObject) {
    this.lAj = paramObject;
    this.lAk |= 2;
  }

  public void kF(boolean paramBoolean)
  {
    this.eOD = paramBoolean;
  }

  public void bu(boolean paramBoolean)
  {
    this.caseSensitive = paramBoolean;
  }

  public void kG(boolean paramBoolean)
  {
    this.lAl = paramBoolean;
  }

  public boolean gh()
  {
    if ((this.lAk & 0x3) != 3) {
      throw new cJ("both arg1 and arg2 are required in equals");
    }
    if ((this.lAi == this.lAj) || ((this.lAi != null) && (this.lAi.equals(this.lAj)))) {
      return true;
    }
    if (this.lAl) {
      this.lAi = ((this.lAi == null) || ((this.lAi instanceof String)) ? this.lAi : this.lAi.toString());
      this.lAj = ((this.lAj == null) || ((this.lAj instanceof String)) ? this.lAj : this.lAj.toString());
    }
    if (((this.lAi instanceof String)) && (this.eOD)) {
      this.lAi = ((String)this.lAi).trim();
    }
    if (((this.lAj instanceof String)) && (this.eOD)) {
      this.lAj = ((String)this.lAj).trim();
    }
    if (((this.lAi instanceof String)) && ((this.lAj instanceof String))) {
      String str1 = (String)this.lAi;
      String str2 = (String)this.lAj;
      return this.caseSensitive ? str1.equals(str2) : str1.equalsIgnoreCase(str2);
    }
    return false;
  }
}