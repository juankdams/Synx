import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;

class HU extends FilterOutputStream
{
  private final ByteArrayOutputStream bQj;

  public HU(bDb parambDb)
  {
    super(new ByteArrayOutputStream());
    this.bQj = ((ByteArrayOutputStream)this.out);
  }

  public void close() {
    super.close();
    String str = bDb.a(this.bQk) == null ? this.bQj.toString() : this.bQj.toString(bDb.a(this.bQk));

    bDb.a(this.bQk, str);
  }
}