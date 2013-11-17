import org.apache.log4j.Logger;

public class awa extends UG
{
  private static final Logger K = Logger.getLogger(awa.class);

  protected int b(cdO paramcdO) {
    if (paramcdO == null) {
      return -1;
    }
    byte b = paramcdO.cgE();
    if (!this.cyz.contains(b)) {
      K.warn("On ne retrouve pas l'index de la cellule ou est situé l'obstacle " + b);
      return -1;
    }

    return this.cyz.J(b);
  }
}