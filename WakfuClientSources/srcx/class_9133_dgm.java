import org.apache.log4j.Logger;

public class dgm extends VE
{
  private static final Logger K = Logger.getLogger(dgm.class);

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    K.info("Action performed on interactive element : " + paramdJO.toString());

    switch (bVZ.av[paramdJO.ordinal()]) {
    case 1:
      if (this.aTn != 1) {
        return true;
      }
      if ((parambhL instanceof bKm)) {
        ((bKm)parambhL).aeL().bIS();
      }

      d(paramdJO);
      a(paramdJO);

      return true;
    }

    return false;
  }
}