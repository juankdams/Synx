final class bQg extends dbJ
{
  int bmM = 0;

  bQg(String paramString1, String paramString2, cgR paramcgR1, cgR paramcgR2)
  {
    super(paramString1, paramString2, paramcgR1);
  }

  public void update(int paramInt)
  {
    this.bmM += paramInt;

    super.update(paramInt);
    float f1 = bCO.bI(0.01745329F * this.bmM / 271.0F);
    float f2 = bCO.bH(0.01745329F * this.bmM / 233.0F);

    float f3 = 2.0F * bCO.bI(0.01745329F * this.bmM / 2503.0F);
    float f4 = 2.0F * bCO.bH(0.01745329F * this.bmM / 3373.0F);
    this.gYq.a("gDistordLow", f1, f2);
    this.gYq.a("gDistordHigh", f3, f4);
  }
}