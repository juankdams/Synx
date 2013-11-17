public class dKM
{
  private final int aw;
  private final il lZl = new il();
  private final agT lZm = new agT();

  public dKM(int paramInt) {
    this.aw = paramInt;
  }

  public int getId() {
    return this.aw;
  }

  public void b(il paramil) {
    this.lZl.clear();
    this.lZl.a(paramil);
  }

  public void c(agT paramagT) {
    this.lZm.clear();
    this.lZm.a(paramagT);
  }

  public short K(int paramInt, short paramShort)
  {
    short s1 = this.lZl.get(paramInt);
    if ((s1 != 0) || (this.lZl.contains(paramInt))) {
      return s1;
    }
    short s2 = this.lZm.au(paramShort);
    if ((s2 != 0) || (this.lZm.contains(paramShort))) {
      return s2;
    }

    return 0;
  }

  public int[] djB() {
    return this.lZl.qe();
  }

  public short[] djC() {
    return this.lZm.Vq();
  }
}