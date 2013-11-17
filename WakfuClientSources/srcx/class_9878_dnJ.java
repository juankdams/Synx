class dnJ extends Thread
{
  protected boolean aKV = false;

  public boolean isRunning() {
    return this.aKV;
  }

  public void av(boolean paramBoolean) {
    this.aKV = paramBoolean;
  }
}