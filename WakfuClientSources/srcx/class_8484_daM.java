public class daM extends oG
{
  public static final daM kSz = new daM();

  protected void wc()
  {
  }

  public void wf()
  {
  }

  protected void a(cYk paramcYk) {
    this.aUi.Q(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  protected void C(int paramInt1, int paramInt2)
  {
    ((aIZ)this.aUe.oi().bKr()).a(this.aUe, paramInt1, paramInt2);
  }

  protected String wj()
  {
    return null;
  }

  protected int h(cYk paramcYk)
  {
    if (this.aUe == null) {
      return -1;
    }

    if (cwO.Z(paramcYk.getX(), paramcYk.getY(), paramcYk.IB())) {
      return -1;
    }
    if (cwO.W(paramcYk.getX(), paramcYk.getY(), paramcYk.IB())) {
      return -1;
    }
    byz localbyz = byv.bFN().bFO();

    dwN localdwN = localbyz.bHa();
    if ((localdwN != null) && (!localdwN.a(localbyz, paramcYk.getX(), paramcYk.getY()))) {
      return -1;
    }

    return 100;
  }

  protected void wk()
  {
  }
}