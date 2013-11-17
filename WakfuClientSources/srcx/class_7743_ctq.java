public class ctq
  implements dBV
{
  private String idh = null;
  private cfr idi = null;
  private int index = -1;

  public String toString()
  {
    return "[IgnoreTagValue:" + this.idi.getTagName() + "]" + this.idh;
  }

  void a(cfr paramcfr) {
    this.idi = paramcfr;
  }

  public cfr crc() {
    return this.idi;
  }

  void setValue(String paramString) {
    this.idh = paramString;
  }

  public String getValue() {
    return this.idh;
  }

  public int DG()
  {
    return 0;
  }

  void setIndex(int paramInt) {
    this.index = paramInt;
  }

  public int getIndex()
  {
    return this.index;
  }

  public EJ DH()
  {
    return null;
  }

  public int DI()
  {
    return 0;
  }

  public String DJ()
  {
    return null;
  }
}