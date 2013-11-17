public final class btI
  implements QS
{
  public void a(EI paramEI)
  {
    if ((!bB) && (paramEI == null)) throw new AssertionError("Event null at BubbleText.onAdviserEvent");

    if (paramEI.ND() != xI.bqp) {
      return;
    }

    int i = paramEI.NC().getId();
    cbM localcbM = Kd.UN().fz(i);

    if (localcbM == null) {
      return;
    }
    localcbM.pA();

    Kd.UN().fy(i);
  }
}