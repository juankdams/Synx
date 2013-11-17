import java.io.FilterReader;
import java.io.Reader;
import java.util.ArrayList;

class dKu extends FilterReader
{
  dKu(bYe parambYe, Reader paramReader, ArrayList paramArrayList)
  {
    super(paramReader);
  }
  public void close() { wh.e(this.in);
    bYe.C(this.lYe); }

  protected void finalize() {
    try {
      close();
    } finally {
      super.finalize();
    }
  }
}