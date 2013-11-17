import org.apache.log4j.Logger;

final class cIL extends dcW
{
  private static final Logger K = Logger.getLogger(cIL.class);

  public boolean a(bpy parambpy) {
    ckT localckT = cjS.clP().vz(parambpy.a());

    if (!(localckT instanceof czN)) {
      K.error(String.format("Un message %s concernant le %s id=%d a été adressé à la %s", new Object[] { parambpy.getClass().getSimpleName(), localckT.getClass().getSimpleName(), Integer.valueOf(localckT.getId()), getClass().getSimpleName() }));

      return false;
    }

    cve localcve = new cve(dqt.cXz(), parambpy.ep().bJ(), parambpy.eo(), parambpy.a());
    localcve.X(parambpy.AD());
    bnc.bxw().a(parambpy.a(), localcve);
    bnc.bxw().qj(parambpy.a());

    return false;
  }
}