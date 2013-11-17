final class PZ extends dcW
{
  public boolean a(EM paramEM)
  {
    Su localSu = (Su)((arl)this.kLP).eu(paramEM.AD());
    if ((localSu == null) || (((arl)this.kLP).aEu() != dzm.lFJ)) {
      return false;
    }

    cew localcew = localSu.aeL();
    if (paramEM.gI()) {
      if ((localSu instanceof bKm)) {
        localcew.cha();
      }
      ((arl)this.kLP).Y(localSu);
    } else {
      if ((localSu instanceof bKm)) {
        localcew.chb();
      }
      ((arl)this.kLP).Z(localSu);
    }
    return false;
  }
}