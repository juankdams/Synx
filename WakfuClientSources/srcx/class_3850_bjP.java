class bjP
  implements doN
{
  bjP(bIr parambIr)
  {
  }

  public boolean a(cSx paramcSx)
  {
    axU localaxU = (axU)paramcSx.cIk();
    if (localaxU.getItemValue() != null) {
      ccG.b(this.fAl.buw, localaxU);
      if (ccG.v(this.fAl.buw) != null) {
        ccG.v(this.fAl.buw).a(ccG.w(this.fAl.buw).getPosition(), ccG.w(this.fAl.buw).getSize(), this.fAl.buw.czl.getTotalInsets());

        this.fAl.buw.setNeedsToResetMeshes();
      }
    }
    return false;
  }
}