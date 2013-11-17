class cBb
  implements dqO
{
  public dUV mB(String paramString)
  {
    return dUV.valueOf(paramString);
  }

  public dUV xj(int paramInt) {
    for (dUV localdUV : dUV.values()) {
      if (localdUV.xj() == paramInt)
        return localdUV;
    }
    return null;
  }

  public String xk(int paramInt) {
    dUV localdUV = xj(paramInt);
    return localdUV == null ? "<unknow " + paramInt + ">" : localdUV.name();
  }

  public agQ a(dUV paramdUV) {
    int i = paramdUV.xj();
    switch (cMG.ipY[paramdUV.ordinal()]) {
    case 1:
      return new aCB(i, byR.gmA);
    case 2:
      return new aCB(i, byR.gmC);
    case 3:
      return new aCE(i, byQ.gmt);
    case 4:
      return new aCE(i, byQ.gmu);
    case 5:
      return new aCE(i, byQ.gmv);
    case 6:
      return new aCE(i, byQ.gmw);
    case 7:
      return new aCE(i, byQ.gmx);
    case 8:
      return new aCE(i, byQ.gmy);
    case 9:
      return new hs(i);
    case 10:
      return new aCE(i, byQ.gmr);
    case 11:
      return new aCE(i, byQ.gmq);
    case 12:
      return new aCE(i, byQ.gmp);
    case 13:
      return new aCE(i, byQ.gmo);
    case 14:
      return new aCE(i, byQ.gms);
    case 15:
      return new aCB(i, byR.gmB);
    case 16:
      return new bbt(i);
    case 17:
      return null;
    case 18:
      return new bNQ(i);
    case 19:
      return null;
    case 20:
      return null;
    case 21:
      return null;
    case 22:
      return null;
    case 23:
      return null;
    case 24:
      return new cBs(i);
    case 25:
      return new Yn(i);
    case 26:
      return new ajj(i);
    case 27:
      return null;
    case 28:
      return new dza(i);
    case 29:
      return new aJl(i);
    case 30:
      return new vA(i);
    case 31:
      return new bAZ(i);
    case 32:
      return new cer(i);
    case 33:
      return new qm(i);
    }
    return null;
  }
}