import com.ankamagames.wakfu.client.WakfuClientInstance;

class bgk
  implements dRY
{
  bgk(aVQ paramaVQ, bXb parambXb, ccG paramccG)
  {
  }

  public void ci()
  {
    if (!aVQ.a(this.fub))
      return;
    if (this.fuc.cck() == null) {
      String str = WakfuClientInstance.awy().awB().f(bmz.fER);
      if (str != null) {
        localObject = this.fuc.kB(str);
        if (localObject != null)
          this.fuc.aM((Su)localObject);
      }
    }
    int i = this.fud.getSelectedOffsetByValue(this.fuc.cck());
    Object localObject = this.fud.getRenderableByOffset(i);
    if (localObject == null) {
      this.fud.b(this);
      return;
    }
    czv localczv = (czv)((axU)localObject).getInnerElementMap().fi("illustration");
    localczv.setVisible(true);
    bYW.setImage(localczv);
    this.fud.b(this);
  }
}