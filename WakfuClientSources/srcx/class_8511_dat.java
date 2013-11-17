import org.apache.log4j.Logger;

public class dat
{
  private static final Logger K = Logger.getLogger(dat.class);

  public static String a(bvy parambvy) {
    bU localbU = bU.fH();
    int i = parambvy.nc();

    if ((parambvy instanceof bOB)) {
      return localbU.b(122, i, new Object[0]);
    }
    if ((parambvy instanceof cDs)) {
      return localbU.b(124, i, new Object[0]);
    }
    if ((parambvy instanceof bAb)) {
      return localbU.getString("haven.world.partition");
    }
    K.error("Type de catalog entry inconnu " + parambvy.getClass());
    return "<unknow>";
  }

  public static String k(bNi parambNi) {
    return a(parambNi.bqR());
  }
}