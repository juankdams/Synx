public class aFu
{
  public static final aFu eby = new aFu("PRESERVE");

  public static final aFu ebz = new aFu("TRIM");

  public static final aFu ebA = new aFu("NORMALIZE");

  public static final aFu ebB = new aFu("TRIM_FULL_WHITE");
  private final String name;

  private aFu(String paramString)
  {
    this.name = paramString;
  }

  public String toString() {
    return this.name;
  }
}