public class dzR extends ciH
{
  public dzR()
  {
    this(new dqd(0L));
  }

  public dzR(dqd paramdqd) {
    super(2);
    a(paramdqd);
  }

  public void a(dqd paramdqd) {
    sF().setShort(0L, paramdqd.shortValue());
  }

  public dqd ddf() {
    return new dqd(sF().getShort(0L));
  }
}