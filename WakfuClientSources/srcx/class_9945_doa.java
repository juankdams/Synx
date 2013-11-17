public class doa
{
  protected int RZ;
  protected long ctZ;

  public int gw()
  {
    return this.RZ;
  }
  public long getDuration() {
    return this.ctZ;
  }

  public void a(bUT parambUT) {
    this.RZ = parambUT.getInt();
    this.ctZ = parambUT.getLong();
  }
}