class beQ
{
  private final dSC fsd = new dSC();

  public void a(String paramString, Runnable paramRunnable) {
    if (!this.fsd.contains(paramString))
      this.fsd.put(paramString, paramRunnable);
  }

  void execute()
  {
    int i = 0; for (int j = this.fsd.size(); i < j; i++)
      ((Runnable)this.fsd.hc(i)).run();
  }
}