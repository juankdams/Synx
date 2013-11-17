import java.nio.ByteBuffer;

public abstract class hk
{
  public static final hk aGx = new fZ();
  private final bRS aGy;

  public hk()
  {
    this.aGy = new bRS(new sY());
  }
  public final boolean a(ceG paramceG) {
    return (!this.aGy.contains(paramceG)) && (this.aGy.aP(paramceG));
  }

  public final void b(ceG paramceG) {
    this.aGy.aQ(paramceG);
  }

  public void pj() {
    this.aGy.notifyListeners();
  }

  public abstract void c(ByteBuffer paramByteBuffer, int paramInt);

  public abstract void b(ByteBuffer paramByteBuffer);

  public abstract int O();
}