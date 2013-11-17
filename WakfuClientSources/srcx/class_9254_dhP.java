class dhP
  implements doN
{
  dhP(zE paramzE)
  {
  }

  public boolean a(cSx paramcSx)
  {
    axU localaxU = (axU)paramcSx.cIk();
    if (localaxU.getItemValue() != null) {
      ccG.b(this.kXh.buw, localaxU);
      if (ccG.v(this.kXh.buw) != null) {
        ccG.v(this.kXh.buw).a(ccG.w(this.kXh.buw).getPosition(), ccG.w(this.kXh.buw).getSize(), this.kXh.buw.czl.getTotalInsets());

        this.kXh.buw.setNeedsToResetMeshes();
      }
    }
    return false;
  }
}