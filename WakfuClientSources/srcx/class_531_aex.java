class aex
  implements Runnable
{
  aex(aBa paramaBa)
  {
  }

  public void run()
  {
    ckU.cmE().done();
    aig.dej.o("loginLock", true);

    byte[] arrayOfByte = byv.bFN().ayC();
    if (arrayOfByte != null) {
      aAh localaAh = new aAh(arrayOfByte);
      byv.bFN().aJK().d(localaAh);
    }
    else {
      byv.bFN().aJK().closeConnection();
    }
  }
}