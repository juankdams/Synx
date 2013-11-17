class kI
  implements dkT
{
  kI(dhC paramdhC, byz parambyz, bKY parambKY)
  {
  }

  public void a(int paramInt, String paramString)
  {
    Object localObject;
    if (paramInt == 8) {
      localObject = new dli();
      int[] arrayOfInt = { 0 };
      this.aOt.lcI.b(new aHE(this, (dli)localObject, arrayOfInt));

      int i = arrayOfInt[0] * 5000;
      Yx localYx = new Yx((dli)localObject, i, this.aOt.chf.getId());
      this.aOx.a(localYx);
      localYx.begin();

      alP localalP = this.aOy.bTe();

      localalP.setValue(0.0F);
      dLE.doY().t("recycleRunning", Boolean.valueOf(true));

      localalP.setTweenDuration(i);
      localalP.setValue(1.0F);
    } else {
      localObject = this.aOy.bTf();
      ((br)localObject).setSelected(false);
    }
  }
}