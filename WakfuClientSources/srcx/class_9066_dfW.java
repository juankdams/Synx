import org.apache.log4j.Logger;

final class dfW extends dcW
{
  private static Logger K = Logger.getLogger(dfW.class);

  public boolean a(dIg paramdIg) {
    if (((arl)this.kLP).getId() != paramdIg.a()) {
      K.error("Le message ne concerne pas notre combat");
      return false;
    }

    ((arl)this.kLP).qx(paramdIg.dib());

    return false;
  }
}