import java.io.BufferedOutputStream;
import java.io.OutputStream;

class bdT extends BufferedOutputStream
{
  bdT(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }

  public void d(OutputStream paramOutputStream) {
    this.out = paramOutputStream;
    this.count = 0;
  }
}