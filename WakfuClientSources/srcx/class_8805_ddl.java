import java.io.FilterInputStream;
import java.io.InputStream;

public class ddl extends FilterInputStream
{
  public ddl(InputStream paramInputStream)
  {
    super(paramInputStream);
  }

  public void close()
  {
  }

  public static InputStream cOu()
  {
    return new ddl(System.in);
  }
}