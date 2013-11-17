import java.io.BufferedInputStream;
import java.io.InputStream;

class dMh extends BufferedInputStream
{
  public dMh(InputStream paramInputStream)
  {
    super(paramInputStream);
  }

  public dMh(InputStream paramInputStream, int paramInt) {
    super(paramInputStream, paramInt);
  }

  public void l(InputStream paramInputStream) {
    this.in = paramInputStream;
    this.pos = 0;
    this.count = 0;
    this.marklimit = 0;
    this.markpos = -1;

    this.buf = new byte[8192];
  }

  public void close() {
    super.close();
  }
}