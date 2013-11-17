class bHW
  implements Runnable
{
  private final int dds;
  private final boolean gGA;

  private bHW(ceb paramceb, int paramInt, boolean paramBoolean)
  {
    this.dds = paramInt;
    this.gGA = paramBoolean;
  }

  public void run() {
    ceb.a(this.bZJ, this.gGA, this.dds);
    if (this.gGA)
      ceb.cgI().put(this.dds, null);
    else
      ceb.cgJ().put(this.dds, null);
  }
}