class aes
  implements Runnable
{
  aes(aBa paramaBa, bcT parambcT)
  {
  }

  public void run()
  {
    if ((!this.cVB.isConnected()) && (!this.cVB.IX())) {
      byv.bFN().bFR();
    } else if (this.cVB.IX())
    {
      ckU.cmE().ak(true).g(bU.fH().getString("connection.retrying"), this.cVB.Je());
      ckU.cmE().FO().gs(this.cVB.Jd());
    }
  }
}