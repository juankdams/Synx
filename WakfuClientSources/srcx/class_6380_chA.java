public class chA extends cFA
{
  private static final chA hFO = new chA();

  public static chA cjx()
  {
    return hFO;
  }

  public long a(byo parambyo, dKm paramdKm) {
    if (paramdKm == dKm.lWU) {
      n(parambyo);
    }
    return super.a(parambyo, paramdKm);
  }

  private static void n(byo parambyo) {
    clD localclD = cqu.cpE().cpF();
    if (localclD == null) {
      return;
    }
    int i = 0; for (int j = localclD.cmZ(); i < j; i++) {
      cRz localcRz = localclD.vK(i);
      if (((localcRz instanceof byo)) && (((byo)localcRz).getId() == parambyo.getId())) {
        cqu.cpE().alK();
        break;
      }
    }
  }
}