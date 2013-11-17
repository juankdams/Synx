import org.apache.log4j.Logger;

public class bdz
  implements MW
{
  protected static final Logger K = Logger.getLogger(bdz.class);
  public static final long fpn = 16777216L;
  private static long fpo = 16777216L;

  public long i(aVc paramaVc) {
    if (paramaVc == null) {
      return -1L;
    }
    return brH();
  }

  private long brH() {
    if (fpo < 9223372036854775807L) {
      return fpo++;
    }
    fpo = 16777216L;
    return fpo;
  }
}