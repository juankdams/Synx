import java.io.DataOutputStream;
import java.io.OutputStream;

final class dpj extends DataOutputStream
{
  private final bdT lpI;

  dpj()
  {
    super(null);
    this.out = (this.lpI = new bdT(null));
  }

  public final void d(OutputStream paramOutputStream) {
    this.lpI.d(paramOutputStream);
    this.written = 0;
  }

  public void close() {
    this.lpI.close();
  }
}