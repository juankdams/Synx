class czU
  implements dUd
{
  private czU(dRR paramdRR)
  {
  }

  public boolean a(cWG paramcWG)
  {
    dKQ localdKQ = (dKQ)paramcWG;
    if (localdKQ.czj() == 1)
      this.dtZ.setValue(this.dtZ.getValue() + this.dtZ.getButtonJump());
    else if (localdKQ.czj() == 2) {
      this.dtZ.setValue(this.dtZ.getValue() - this.dtZ.getButtonJump());
    }
    dRR.a(this.dtZ);
    return false;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }
}