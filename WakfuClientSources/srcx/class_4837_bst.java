class bst
  implements doN
{
  bst(bFT parambFT, Or paramOr)
  {
  }

  public boolean a(cSx paramcSx)
  {
    dMr localdMr = (dMr)paramcSx;
    int i = localdMr.y(bFT.a(this.fZh));
    int j = (int)this.fZn.getHeight() - localdMr.z(bFT.a(this.fZh));
    for (bXn localbXn : bFT.b(this.fZh)) {
      if (localbXn.contains(i, j))
        localbXn.activate();
      else
        localbXn.ccD();
    }
    return false;
  }
}