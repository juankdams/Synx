class dPI
  implements Runnable
{
  private bbp miF;
  private Boolean miG;
  private boolean aKV;

  public void t(bbp parambbp)
  {
    this.miF = parambbp;
  }

  public void c(Boolean paramBoolean) {
    this.miG = paramBoolean;
  }

  public void run() {
    dRR localdRR = this.miF.getVerticalScrollBar();
    float f1 = localdRR.getValue();
    float f2 = localdRR.getButtonJump();
    if (this.miG.booleanValue()) {
      if (f1 == 1.0F) {
        adU.apT();
        return;
      }
      f1 += f2;
      if (f1 > 1.0F)
        f1 = 1.0F;
    } else {
      if (f1 == 0.0F) {
        adU.apT();
        return;
      }
      f1 -= f2;
      if (f1 < 0.0F)
        f1 = 0.0F;
    }
    this.miF.setVerticalScrollBarPosition(f1);
    dLE.doY().a("chat.scrollOffset", Float.valueOf(localdRR.getValue()), this.miF.getElementMap().getId());
  }

  public boolean isRunning() {
    return this.aKV;
  }

  public void av(boolean paramBoolean) {
    this.aKV = paramBoolean;
  }
}