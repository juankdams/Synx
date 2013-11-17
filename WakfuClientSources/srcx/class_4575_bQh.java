final class bQh extends dbJ
{
  bQh(String paramString1, String paramString2, cgR paramcgR1, cgR paramcgR2)
  {
    super(paramString1, paramString2, paramcgR1);
  }
  public void update(int paramInt) {
    super.update(paramInt);
    byz localbyz = byv.bFN().bFO();
    this.gYq.a("position", localbyz.getWorldX(), localbyz.getWorldY());
  }
}