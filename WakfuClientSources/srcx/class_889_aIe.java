import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aIe extends amp
{
  public aIe(aXE paramaXE)
  {
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    int i = 0; int j = 0;
    int k = aXE.a(this.egN) == null ? 0 : aXE.a(this.egN).size();

    int m = 1;

    if ((aXE.b(this.egN) >= 0) || (aXE.c(this.egN) >= 0)) {
      m = bCO.J(k, aXE.c(this.egN), aXE.b(this.egN));
    }

    for (int n = aXE.d(this.egN).size() - 1; n >= 0; n--) {
      j += ((bSJ)aXE.d(this.egN).get(n)).getCellWidth();

      biy localbiy = (biy)aXE.e(this.egN).get(n);
      if (localbiy != null)
        i = Math.max(i, localbiy.getPrefSize().height);
      else {
        aXE.aiN().warn("Un bouton de colonne n'a pas été initialisé correctement");
      }
    }

    Or localOr = aXE.f(this.egN).getPrefSize();

    switch (bnG.fGA[aXE.g(this.egN).ordinal()]) {
    case 1:
      break;
    case 2:
      j += localOr.width;
      break;
    case 3:
      if (m < k) {
        j += localOr.width;
      }

      break;
    }

    i += aXE.h(this.egN) * m;

    return new Or(j, i);
  }

  public Or getContentMinSize(dRq paramdRq) {
    return getContentPreferedSize(paramdRq);
  }

  public void a(dRq paramdRq) {
    aXE.a(this.egN, true);

    int i = paramdRq.getAppearance().getContentHeight();

    int j = aXE.d(this.egN).size();
    if (j == 0) {
      return;
    }

    int k = i / aXE.h(this.egN);
    int m = aXE.i(this.egN).size() / j;
    bSJ localbSJ;
    Object localObject;
    if (k > m) {
      aXE.i(this.egN).ensureCapacity(j * k);
      aXE.j(this.egN).ensureCapacity(k);
      for (n = m; n < k; n++)
      {
        cKm localcKm = new cKm();
        localcKm.aJ();
        aXE.j(this.egN).add(localcKm);

        for (int i2 = 0; i2 < j; i2++)
        {
          localbSJ = (bSJ)aXE.d(this.egN).get(i2);
          axU localaxU1 = new axU();
          localaxU1.aJ();
          localaxU1.setCollection(this.egN);
          localaxU1.setNonBlocking(this.egN.meQ);
          localaxU1.setRendererManager(localbSJ.getRendererManager());
          localaxU1.setEnableDND(aXE.k(this.egN));
          localaxU1.setEnabled(this.egN.bur);
          localaxU1.setNetEnabled(this.egN.meS);
          localaxU1.setCanBeCloned(false);

          localaxU1.a(CH.bGw, new cXd(this), false);

          localaxU1.a(CH.bGs, new cXg(this), false);

          localaxU1.a(CH.bGt, new cXe(this), false);

          aXE.i(this.egN).add(localaxU1);
          a(localaxU1);
        }
      }
    }
    else if (k < m)
    {
      n = j * (m - k);
      for (i1 = n - 1; i1 >= 0; i1--) {
        localObject = (axU)aXE.i(this.egN).remove(aXE.i(this.egN).size() - 1);
        this.egN.i((aNL)localObject);
      }

      for (i1 = m - k - 1; i1 >= 0; i1--) {
        localObject = (cKm)aXE.j(this.egN).remove(aXE.j(this.egN).size() - 1);
        ((cKm)localObject).bc();
      }

    }

    int n = 0;
    for (int i1 = aXE.d(this.egN).size() - 1; i1 >= 0; i1--)
    {
      localObject = (biy)aXE.e(this.egN).get(i1);
      if (localObject != null)
        n = Math.max(n, ((biy)localObject).getPrefSize().height);
      else {
        aXE.aUd().warn("Un bouton de colonne n'a pas été initialisé correctement");
      }

    }

    i1 = 0;
    for (int i3 = 0; i3 < j; i3++) {
      localbSJ = (bSJ)aXE.d(this.egN).get(i3);
      i5 = localbSJ.getCellWidth();
      int i6 = i - n;

      biy localbiy = (biy)aXE.e(this.egN).get(i3);
      localbiy.setSize(i5, n);
      localbiy.setPosition(i1, i6);
      i6 -= aXE.h(this.egN);

      for (int i7 = 0; i7 < k; i7++) {
        axU localaxU2 = aXE.a(this.egN, i7, i3);
        if (localaxU2 == null) {
          aXE.bmS().warn("Impossible de trouver un renderableContainer à la ligne " + i7 + " et à la colonne " + i3);
        }
        else
        {
          localaxU2.setSize(i5, aXE.h(this.egN));
          localaxU2.setPosition(i1, i6);

          i6 -= aXE.h(this.egN);
        }
      }
      i1 += i5;
    }

    i3 = i - n - aXE.h(this.egN);
    for (int i4 = 0; i4 < k; i4++)
    {
      ((cKm)aXE.j(this.egN).get(i4)).f(0, i3, i1, aXE.h(this.egN), 0, 0, 0, 0);
      i3 -= aXE.h(this.egN);
    }

    switch (bnG.fGA[aXE.g(this.egN).ordinal()]) {
    case 1:
      aXE.b(this.egN, false);
      break;
    case 2:
      aXE.b(this.egN, true);
      break;
    case 3:
      aXE.b(this.egN, aXE.a(this.egN).size() > aXE.i(this.egN).size() / aXE.d(this.egN).size());
    }

    if (aXE.r(this.egN)) {
      aXE.f(this.egN).setVisible(true);

      i4 = aXE.f(this.egN).getPrefSize().width;
      aXE.f(this.egN).setSize(i4, i);
      aXE.f(this.egN).setPosition(i1, 0);
    } else {
      aXE.f(this.egN).setVisible(false);
    }

    Hp();

    i4 = aXE.a(this.egN).size() - k;
    int i5 = i4 < 0 ? 0 : bCO.J(aXE.s(this.egN), 0, i4);
    if (i5 != aXE.s(this.egN)) {
      this.egN.setOffset(i5);
    }

    if (k != m) {
      aXE.t(this.egN);
    }

    aXE.a(this.egN, false);
  }

  private void Hp() {
    if (aXE.r(this.egN)) {
      int i = aXE.a(this.egN).size() - aXE.i(this.egN).size() / aXE.d(this.egN).size();
      if (i > 0) {
        aXE.f(this.egN).setEnabled(true);
        aXE.f(this.egN).setButtonJump(1.0F / i);
        aXE.f(this.egN).setSliderSize(aXE.i(this.egN).size() / aXE.d(this.egN).size() / aXE.a(this.egN).size());
      } else {
        aXE.f(this.egN).setButtonJump(0.0F);
        aXE.f(this.egN).setEnabled(false);
      }
    }
  }
}