public class oX extends bxd
{
  private static final String[] aUE = { "file", "dir" };

  public String[] wp()
  {
    return aUE;
  }

  public boolean wq()
  {
    return "dir".equalsIgnoreCase(getValue());
  }

  public boolean isFile()
  {
    return "file".equalsIgnoreCase(getValue());
  }
}