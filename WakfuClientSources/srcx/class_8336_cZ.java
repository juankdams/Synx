final class cZ extends dcW
{
  public boolean a(bOs parambOs)
  {
    Su localSu = CA.Lv().bj(parambOs.bix());

    if (localSu == null) {
      return false;
    }

    if (!((arl)this.kLP).ac(localSu)) {
      return true;
    }
    abV localabV = new abV(localSu.getId(), new cYk(parambOs.getX(), parambOs.getY(), parambOs.IB()), CG.eu(parambOs.FW()));

    bnc.bxw().a((arl)this.kLP, localabV);
    bnc.bxw().d(this.kLP);

    return false;
  }
}