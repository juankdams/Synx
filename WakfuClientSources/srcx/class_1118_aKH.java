import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

class aKH extends InflaterInputStream
{
  aKH(dKB paramdKB, InputStream paramInputStream, Inflater paramInflater1, Inflater paramInflater2)
  {
    super(paramInputStream, paramInflater1);
  }
  public void close() {
    super.close();
    this.eom.end();
  }
}