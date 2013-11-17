import java.io.File;
import java.util.Comparator;

class cgb
  implements Comparator
{
  cgb(cnX paramcnX)
  {
  }

  public int compare(File paramFile1, File paramFile2)
  {
    return paramFile2 == null ? 1 : paramFile1 == null ? -1 : paramFile2 == null ? 0 : cnX.a(this.hCX, paramFile1).compareTo(cnX.a(this.hCX, paramFile2));
  }
}