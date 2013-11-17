import java.util.ArrayList;

class cGA extends amp
{
  private cGA(dBz paramdBz)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  private avN isRadiusValid(int paramInt, boolean paramBoolean, ArrayList paramArrayList) {
    int i = paramArrayList.size();

    if (i == 1) {
      Or localOr1 = ((biy)paramArrayList.get(0)).getPrefSize();
      return avN.m(0, 0, localOr1.width, localOr1.height);
    }

    if ((!bB) && (i <= 1)) throw new AssertionError("Le nombre de boutons est inférieur à 2");

    float f1 = dBz.Co(i);
    float f2;
    if (i == 8)
      f2 = 4.712389F;
    else {
      f2 = 1.570796F + (i - 1) * f1 / 2.0F;
    }

    avN localavN1 = avN.aHC();
    avN localavN2 = avN.aHC();
    avN localavN3 = avN.aHC();
    avN localavN4 = null;

    for (int j = 0; j < i; j++) {
      dOc localdOc = (dOc)paramArrayList.get(j);

      Or localOr2 = paramBoolean ? localdOc.getMinSize() : localdOc.getPrefSize();

      localavN2.setWidth(localOr2.width);
      localavN2.setHeight(localOr2.height);
      localavN2.setX((int)(paramInt * bCO.bI(f2)) + paramInt);
      localavN2.setY((int)(paramInt * bCO.bH(f2)) + paramInt);

      localavN3.b(localavN2);

      if (localavN4 != null) {
        if (localavN2.d(localavN4)) {
          localavN3.release();
          localavN2.release();
          localavN1.release();
          localavN4.release();
          return null;
        }
      }
      else localavN4 = avN.aHC();

      localavN4.e(localavN2);

      if (j == 0) {
        localavN1.e(localavN2);
      }

      f2 -= f1;
    }

    if (localavN2.d(localavN1)) {
      localavN3.release();
      localavN2.release();
      localavN1.release();
      if (localavN4 != null) {
        localavN4.release();
      }
      return null;
    }

    localavN2.release();
    localavN1.release();
    if (localavN4 != null) {
      localavN4.release();
    }

    return localavN3;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    dBz localdBz = (dBz)paramdRq;
    Or localOr;
    if (dBz.b(localdBz).size() == 0) {
      localOr = new Or(0, 0);
    } else {
      ArrayList localArrayList = ((dos)dBz.b(localdBz).get(dBz.c(localdBz))).fcK;

      int i = 40;
      avN localavN = isRadiusValid(i, true, localArrayList);
      while (localavN == null) {
        i += 5;
        localavN = isRadiusValid(i, true, localArrayList);
      }
      dBz.a(this.dLX, i);

      localOr = new Or(dBz.d(this.dLX) * 2, dBz.d(this.dLX) * 2);

      if (dBz.b(this.dLX).size() > 1) {
        if (localArrayList.size() > 3) {
          localOr.width += dBz.e(this.dLX).getMinSize().width + dBz.f(this.dLX).getMinSize().width;
          localOr.height += dBz.e(this.dLX).getMinSize().height + dBz.f(this.dLX).getMinSize().height;
        }
        localOr.width = Math.max(dBz.e(this.dLX).getMinSize().width + dBz.f(this.dLX).getMinSize().width, localOr.width);
        localOr.height = Math.max(dBz.e(this.dLX).getMinSize().height + dBz.f(this.dLX).getMinSize().height, localOr.height);
      }

    }

    return localOr;
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    dBz localdBz = (dBz)paramdRq;
    Or localOr1;
    if (dBz.b(localdBz).size() == 0) {
      localOr1 = new Or(0, 0);
    } else {
      Or localOr2 = ((biy)((dos)dBz.b(localdBz).get(0)).fcK.get(0)).getPrefSize();
      int i = localOr2.width; int j = localOr2.height;

      dBz.a(this.dLX, 40);
      int k = 0; for (int m = dBz.b(localdBz).size(); k < m; k++) {
        dos localdos = (dos)dBz.b(localdBz).get(k);
        ArrayList localArrayList = localdos.fcK;

        localdos.cAK = 40;
        avN localavN = isRadiusValid(localdos.cAK, false, localArrayList);
        while (localavN == null) {
          localdos.cAK += 5;
          localavN = isRadiusValid(localdos.cAK, false, localArrayList);
        }
        localdos.cAK = Math.max(localdos.cAK, Math.max(localavN.getHeight(), localavN.getWidth()) / 2);
        localavN.release();

        dBz.a(this.dLX, Math.max(dBz.d(this.dLX), localdos.cAK));
      }

      localOr1 = new Or(i + dBz.d(this.dLX) * 2, j + dBz.d(this.dLX) * 2);
    }

    return localOr1;
  }

  public void a(dRq paramdRq)
  {
    if (dBz.b(this.dLX).size() == 0) {
      return;
    }
    dos localdos = (dos)dBz.b(this.dLX).get(dBz.c(this.dLX));
    ArrayList localArrayList = localdos.fcK;

    int i = localArrayList.size();

    float f1 = dBz.Co(i);
    float f2;
    if (i == 8)
      f2 = 4.712389F;
    else {
      f2 = 1.570796F + (i - 1) * f1 / 2.0F;
    }

    for (int j = 0; j < i; j++) {
      ((biy)localArrayList.get(j)).setSizeToPrefSize();
    }

    j = dBz.d(this.dLX) - localdos.cAK;

    if (dBz.b(this.dLX).size() > 1) {
      dBz.f(this.dLX).setVisible(true);
      dBz.f(this.dLX).setSizeToPrefSize();
      k = aFE.ece.ba(dBz.f(this.dLX).getWidth(), paramdRq.getAppearance().getContentWidth()) - dBz.f(this.dLX).getWidth();
      int m = aFE.ece.bb(dBz.f(this.dLX).getHeight(), paramdRq.getAppearance().getContentHeight());

      dBz.f(this.dLX).setPosition(dBz.d(this.dLX), dBz.d(this.dLX));
      dBz.f(this.dLX).setUsePositionTween(true);
      dBz.f(this.dLX).setPosition(k, m);
      dBz.f(this.dLX).setUsePositionTween(false);

      dBz.e(this.dLX).setVisible(true);
      dBz.e(this.dLX).setSizeToPrefSize();
      k = aFE.ece.ba(dBz.e(this.dLX).getWidth(), paramdRq.getAppearance().getContentWidth()) + dBz.e(this.dLX).getWidth();
      m = aFE.ece.bb(dBz.e(this.dLX).getHeight(), paramdRq.getAppearance().getContentHeight());

      dBz.e(this.dLX).setPosition(dBz.d(this.dLX), dBz.d(this.dLX));
      dBz.e(this.dLX).setUsePositionTween(true);
      dBz.e(this.dLX).setPosition(k, m);
      dBz.e(this.dLX).setUsePositionTween(false);
    }
    else {
      dBz.f(this.dLX).setVisible(false);
      dBz.e(this.dLX).setVisible(false);
    }

    for (int k = 0; k < i; k++) {
      dOc localdOc = (dOc)localArrayList.get(k);
      localdOc.setVisible(true);

      int n = (int)Math.round(Math.toDegrees(f2)) % 360;

      switch (n) {
      case 0:
        localdOc.setStyle("MRU" + this.dLX.getStyle() + "$buttonEast", true);
        break;
      case -315:
      case -300:
      case 45:
      case 60:
        localdOc.setStyle("MRU" + this.dLX.getStyle() + "$buttonNorthEast", true);
        break;
      case -270:
      case 90:
        localdOc.setStyle("MRU" + this.dLX.getStyle() + "$buttonNorth", true);
        break;
      case -240:
      case -225:
      case 120:
      case 135:
        localdOc.setStyle("MRU" + this.dLX.getStyle() + "$buttonNorthWest", true);
        break;
      case -180:
      case 180:
        localdOc.setStyle("MRU" + this.dLX.getStyle() + "$buttonWest", true);
        break;
      case -135:
      case -120:
      case 225:
      case 240:
        localdOc.setStyle("MRU" + this.dLX.getStyle() + "$buttonSouthWest", true);
        break;
      case -90:
      case 270:
        localdOc.setStyle("MRU" + this.dLX.getStyle() + "$buttonSouth", true);
        break;
      case -60:
      case -45:
      case 300:
      case 315:
        localdOc.setStyle("MRU" + this.dLX.getStyle() + "$buttonSouthEast", true);
      }

      if (!localdOc.K(aTc.class)) {
        localdOc.setPosition(localdos.cAK + j, localdos.cAK + j);

        aTc localaTc = new aTc(1.570796F, f2, 0, localdos.cAK, localdos.cAK + j, localdos.cAK + j, localdOc, 0, 300, ddp.kWG);

        localdOc.a(localaTc);
      }

      f2 -= f1;
    }
  }
}