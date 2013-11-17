import com.ankamagames.wakfu.client.WakfuClientInstance;

class aeu
  implements Runnable
{
  aeu(aBa paramaBa, byte paramByte, String paramString)
  {
  }

  public void run()
  {
    if (byv.bFN().brt())
    {
      WakfuClientInstance.awy().cleanUp();

      WakfuClientInstance.awy().start();
    }

    if (this.cVQ != 0) {
      cBQ.cxL().a(this.cVR, Cn.et(1), 1026L, 1, 1);
    }

    ckU.cmE().done();
    aig.dej.o("loginLock", true);
  }
}