class cXg
  implements doN
{
  cXg(aIe paramaIe)
  {
  }

  public boolean a(cSx paramcSx)
  {
    axU localaxU = (axU)paramcSx.cIk();
    if (localaxU.getItemValue() != null) {
      aXE.b(this.kKc.egN, localaxU);
      if (aXE.o(this.kKc.egN) != null) {
        aXE.o(this.kKc.egN).f(0, aXE.p(this.kKc.egN).getY(), this.kKc.egN.czl.getContentWidth() - aXE.f(this.kKc.egN).getWidth(), aXE.p(this.kKc.egN).getHeight(), this.kKc.egN.czl.getTopInset(), this.kKc.egN.czl.getBottomInset(), this.kKc.egN.czl.getLeftInset(), this.kKc.egN.czl.getRightInset());

        this.kKc.egN.setNeedsToResetMeshes();
      }
      if (aXE.q(this.kKc.egN) != null) {
        aXE.q(this.kKc.egN).a(aXE.p(this.kKc.egN).getPosition(), aXE.p(this.kKc.egN).getSize(), this.kKc.egN.czl.getTotalInsets());
      }

    }

    return false;
  }
}