import java.util.HashSet;
import org.apache.log4j.Logger;

public class Uh extends cMb
{
  private static final Logger K = Logger.getLogger(Uh.class);

  public void aJ()
  {
    super.aJ();
    x((short)1);
    eu(false);
    ev(false);
  }

  public void n(cYk paramcYk) {
    super.n(paramcYk);

    boG().add(paramcYk);
  }

  public boolean o(cYk paramcYk) {
    return paramcYk.bg(ML());
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    K.info("Action performed on interactive element : " + paramdJO.toString());

    switch (Gd.av[paramdJO.ordinal()]) {
    case 1:
      if (this.aTn == 1) {
        d(paramdJO);
        sM();
        a(paramdJO);
        return true;
      }

      break;
    }

    return false;
  }

  public dJO eR()
  {
    return dJO.lVA;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVA };
  }

  public byte bY()
  {
    return 0;
  }
}