class aKF
  implements caY
{
  private int eoh;
  private final Rx eoi;

  private aKF(cyn paramcyn, Rx paramRx)
  {
    this.eoi = paramRx;
  }

  public void a(cqm paramcqm) {
    this.eoi.gw(this.eoh);
    int i = paramcqm.value() * cyn.b(this.eoj) / 100;
    this.eoi.gv(i);
    this.eoh = i;
  }
}