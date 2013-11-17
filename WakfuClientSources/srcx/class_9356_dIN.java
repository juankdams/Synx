import java.nio.ByteBuffer;

public abstract class dIN
  implements ag
{
  private cCm lUm;

  public abstract long bwA();

  public boolean isValid()
  {
    return true;
  }

  public void a(caT paramcaT) {
    if (!isValid())
      return;
    b(paramcaT);
  }

  protected abstract void b(caT paramcaT);

  protected abstract int bwy();

  protected abstract void at(ByteBuffer paramByteBuffer);

  protected abstract void b(ahy paramahy, ByteBuffer paramByteBuffer);

  public int O()
  {
    return adb.A(getClass()).a(this);
  }

  public void b(ByteBuffer paramByteBuffer) {
    adb.A(getClass()).a(this, paramByteBuffer);
  }

  public static dIN f(ahy paramahy, ByteBuffer paramByteBuffer) {
    dIN localdIN = adb.Y(paramByteBuffer);
    localdIN.b(paramahy, paramByteBuffer);
    return localdIN;
  }

  public boolean isPersistent() {
    return false;
  }

  public void clean() {
  }

  public void a(cCm paramcCm) {
    this.lUm = paramcCm;
  }

  public void diA() {
    if (this.lUm != null)
      this.lUm.b(this);
  }
}