class tc
  implements Runnable
{
  tc(cvR paramcvR, TM paramTM, cMb paramcMb)
  {
  }

  public void run()
  {
    BW localBW = this.bcS.aaR();
    if ((localBW != null) && (localBW.KR())) {
      CM.LV().f(bU.fH().getString(localBW.KS()), 3);
    }
    for (abc localabc : this.bcT.sL()) {
      if ((localabc instanceof ob)) {
        ob localob = (ob)localabc;
        bVl.caZ().c(localob);
      }
    }
    this.bcT.release();
  }
}