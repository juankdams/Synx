class bAk
  implements Runnable
{
  int goV = 0;

  bAk(buI parambuI, ccG paramccG) {  } 
  public void run() { if (this.goW.isUnloading())
      return;
    axU localaxU = this.goW.getRenderableByOffset(this.goV);
    aNL localaNL = localaxU.getInnerElementMap().fi("rewardIcon");
    czv localczv = (czv)localaNL;
    if (!localczv.getVisible()) {
      localczv = (czv)localaxU.getInnerElementMap().fi("rewardIcon2");
    }

    localczv.setModulationColor(bNa.gRx);
    this.goV += 1;
  }
}