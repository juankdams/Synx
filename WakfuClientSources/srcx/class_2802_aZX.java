import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

class aZX extends dmP
{
  private final Deflater fhs = new Deflater(1);
  private final Inflater fht = new Inflater();

  aZX(deo paramdeo)
  {
    super(null);
  }

  public DataOutputStream c(OutputStream paramOutputStream)
  {
    this.fhs.reset();
    this.lls.d(new DeflaterOutputStream(paramOutputStream, this.fhs));
    return this.lls;
  }

  public DataInputStream a(FileInputStream paramFileInputStream) {
    this.fht.reset();
    this.llt.l(new InflaterInputStream(paramFileInputStream, this.fht));
    return this.llt;
  }

  public void aJ()
  {
  }

  public void bc()
  {
  }
}