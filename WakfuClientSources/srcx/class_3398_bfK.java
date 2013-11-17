import org.apache.log4j.Logger;

public final class bfK extends cps
{
  private static final Logger K = Logger.getLogger(bfK.class);

  private static final bfK ftk = new bfK();

  public static bfK bsS() {
    return ftk;
  }

  private bfK() {
    super("data.bdat", "indexes.bdat", true);
    setName("SimpleBinaryStorage");
  }

  public bfK(String paramString) {
    super("data.bdat", "indexes.bdat", true);
    setName(paramString);
  }
}