class dRV extends Thread
{
  private boolean moc = true;

  public dRV(dE paramdE) {
    super("ProcessDestroyer Shutdown Hook");
  }
  public void run() {
    if (this.moc)
      this.mod.run();
  }

  public void ls(boolean paramBoolean)
  {
    this.moc = paramBoolean;
  }
}