class NX
  implements doN
{
  NX(dex paramdex)
  {
  }

  public boolean a(cSx paramcSx)
  {
    axU localaxU = (axU)paramcSx.cIk();
    if (localaxU.getItemValue() != null) {
      ccG.b(this.ceV.buw, localaxU);
      if (ccG.v(this.ceV.buw) != null) {
        ccG.v(this.ceV.buw).a(ccG.w(this.ceV.buw).getPosition(), ccG.w(this.ceV.buw).getSize(), this.ceV.buw.czl.getTotalInsets());

        this.ceV.buw.setNeedsToResetMeshes();
      }
    }
    return false;
  }
}