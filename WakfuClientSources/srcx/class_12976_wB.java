public class wB extends bxG
{
  public wB(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public long mC()
  {
    if (LC() != null) {
      cjK localcjK = LC().ec(bwv());

      if ((localcjK != null) && 
        ((localcjK instanceof dhy))) {
        dhy localdhy = (dhy)localcjK;
        cCq localcCq = localdhy.Uc();
        if ((localdhy.cz("AnimMort")) && (localcCq.cyI())) {
          return localcCq.na("AnimMort");
        }
        return 0L;
      }

    }

    return 0L;
  }

  protected void kO()
  {
    if (LC() != null) {
      cjK localcjK = LC().ec(bwv());
      if (localcjK != null) {
        dhy localdhy = (dhy)localcjK;
        daO.cML().a(localdhy.Uc().cyG());
        bEY().LC().h(localcjK);
      }
    }
    super.kO();
  }
}