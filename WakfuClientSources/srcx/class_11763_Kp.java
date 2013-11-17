import java.nio.ByteBuffer;

public class Kp
{
  private final dSv bWL;
  private final uP bWM;
  static final int aL = 15;

  Kp(dSv paramdSv, uP paramuP)
  {
    this.bWL = paramdSv;
    this.bWM = paramuP;
  }

  public dSv UV() {
    return this.bWL;
  }

  public uP UW() {
    return this.bWM;
  }

  void write(ByteBuffer paramByteBuffer) {
    a(this.bWL, paramByteBuffer);
    Wr.a(this.bWM, paramByteBuffer);
  }

  static Kp P(ByteBuffer paramByteBuffer) {
    dSv localdSv = Q(paramByteBuffer);
    uP localuP = Wr.X(paramByteBuffer);
    return new Kp(localdSv, localuP);
  }

  private static void a(dSv paramdSv, ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(paramdSv.dsU() ? 1 : 0));
    paramByteBuffer.putInt(paramdSv.tc());
  }

  private static dSv Q(ByteBuffer paramByteBuffer) {
    boolean bool = paramByteBuffer.get() == 1;
    int i = paramByteBuffer.getInt();
    return new dSv(bool, i);
  }
}