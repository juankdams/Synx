class cGS
  implements doN
{
  cGS(aWd paramaWd)
  {
  }

  public boolean a(cSx paramcSx)
  {
    if (paramcSx.cIl() != this.cvX) {
      return false;
    }

    cDG localcDG = aWd.a(this.cvX);
    if ((localcDG != null) && (localcDG.czB() == cUE.kHp) && (((aBV)localcDG).aOd() != null) && (((aBV)localcDG).aOd().getId() != null))
    {
      this.cvX.setCursorType(duv.lyt);
    }
    else this.cvX.setCursorType(duv.lyl);

    return false;
  }
}