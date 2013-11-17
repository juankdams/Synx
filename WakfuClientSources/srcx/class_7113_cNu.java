import java.io.DataInputStream;
import java.io.InputStream;

final class cNu extends DataInputStream
{
  private final dMh ksU;

  public cNu()
  {
    super(null);
    this.in = (this.ksU = new dMh(null));
  }

  public final void l(InputStream paramInputStream) {
    this.ksU.l(paramInputStream);
  }

  public void close() {
    this.ksU.close();
  }
}