class dwO
  implements Runnable
{
  dwO(asg paramasg, cew paramcew, ccd paramccd)
  {
  }

  public void run()
  {
    if (this.lCO.isEmpty()) {
      this.bvZ.es(asg.a(this.lCO));
      this.bvZ.eq(asg.a(this.lCO));
      asg.a(this.lCO, null);
      this.bvZ.cgQ();
    } else {
      ccd localccd = (ccd)this.lCO.ayx();
      if (!localccd.a(this.lCN))
        localccd.a(this.bvZ);
    }
  }
}