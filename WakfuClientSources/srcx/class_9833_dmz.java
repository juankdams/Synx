public class dmz
{
  private final int aw;
  private final cSi lkt = new cSi();

  public dmz(int paramInt) {
    this.aw = paramInt;
  }

  public void Z(int[] paramArrayOfInt) {
    this.lkt.add(paramArrayOfInt);
  }

  public int getId() {
    return this.aw;
  }

  public int AK(int paramInt) {
    return this.lkt.get(paramInt);
  }

  public int size() {
    return this.lkt.size();
  }
}