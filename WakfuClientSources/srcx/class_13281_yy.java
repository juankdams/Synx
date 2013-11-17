import java.util.ArrayList;
import org.apache.log4j.Logger;

public class yy extends amp
{
  public yy(bKO parambKO)
  {
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    int i = 0; int j = 0;
    int k = bKO.a(this.bsb);

    int m = 1;

    if ((bKO.b(this.bsb) >= 0) || (bKO.c(this.bsb) >= 0)) {
      m = Math.min(Math.max(bKO.b(this.bsb), bKO.c(this.bsb)), k);
    }

    if (m < k) {
      Or localOr = bKO.d(this.bsb).getPrefSize();
      j += localOr.width;
    }

    i += bKO.e(this.bsb) * m;

    return new Or(j, i);
  }

  public Or getContentMinSize(dRq paramdRq) {
    return getContentPreferedSize(paramdRq);
  }

  public void a(dRq paramdRq) {
    bKO.a(this.bsb, true);

    int i = paramdRq.getAppearance().getContentHeight();
    int j = paramdRq.getAppearance().getContentWidth();

    int k = Math.min(bKO.f(this.bsb).size(), i / bKO.e(this.bsb));
    int m = bKO.g(this.bsb).size();
    Object localObject1;
    Object localObject2;
    if (k > m) {
      bKO.g(this.bsb).ensureCapacity(k);
      bKO.h(this.bsb).ensureCapacity(k);
      for (n = m; n < k; n++) {
        cKm localcKm = new cKm();
        localcKm.aJ();
        bKO.h(this.bsb).add(localcKm);

        axU localaxU = new axU();
        localaxU.aJ();
        localaxU.setNonBlocking(this.bsb.meQ);
        localaxU.setRendererManager(bKO.i(this.bsb));
        localaxU.setEnableDND(bKO.j(this.bsb));
        localaxU.setEnabled(this.bsb.bur);
        localaxU.setNetEnabled(this.bsb.meS);
        localaxU.a(CH.bGw, new boh(this, localaxU), false);

        bKO.g(this.bsb).add(localaxU);
        a(localaxU);

        localaxU.setChildrenAdded(true);

        localObject1 = this.bsb.getStyle();
        localObject2 = new StringBuilder("tree");
        if (localObject1 != null) {
          ((StringBuilder)localObject2).append((String)localObject1);
        }
        ((StringBuilder)localObject2).append("$").append("cell");
        localaxU.setStyle(((StringBuilder)localObject2).toString(), true);
      }
    }
    else if (k < m)
    {
      n = m - k;
      for (i1 = n - 1; i1 >= 0; i1--) {
        i2 = bKO.g(this.bsb).size() - 1;
        localObject1 = (axU)bKO.g(this.bsb).remove(i2);
        this.bsb.i((aNL)localObject1);
        localObject2 = (cKm)bKO.h(this.bsb).remove(i2);
        ((cKm)localObject2).bc();
      }

    }

    int n = bKO.a(this.bsb);
    bKO.b(this.bsb, n > bKO.g(this.bsb).size());

    if (bKO.s(this.bsb))
    {
      bKO.d(this.bsb).setVisible(true);
      i1 = bKO.d(this.bsb).getPrefSize().width;
      j -= i1;
      bKO.d(this.bsb).setSize(i1, i);
      bKO.d(this.bsb).setPosition(j, 0);
    } else {
      bKO.d(this.bsb).setVisible(false);
    }

    int i1 = 0;
    int i2 = i - bKO.e(this.bsb);

    for (int i3 = 0; i3 < k; i3++) {
      localObject2 = (axU)bKO.g(this.bsb).get(i3);
      if (localObject2 == null) {
        bKO.aUd().warn("Impossible de trouver un renderableContainer à la ligne " + i3);
      }
      else
      {
        ((axU)localObject2).setSize(j, bKO.e(this.bsb));
        ((axU)localObject2).setPosition(i1, i2);
        ((cKm)bKO.h(this.bsb).get(i3)).f(0, i2, i1, bKO.e(this.bsb), 0, 0, 0, 0);

        i2 -= bKO.e(this.bsb);
      }
    }
    Hp();

    bKO.a(this.bsb, false);
  }

  private void Hp() {
    if (bKO.s(this.bsb)) {
      int i = bKO.a(this.bsb);
      int j = i - bKO.g(this.bsb).size();
      if (j > 0) {
        bKO.d(this.bsb).setEnabled(true);
        bKO.d(this.bsb).setButtonJump(1.0F / j);
        bKO.d(this.bsb).setSliderSize(bKO.g(this.bsb).size() / i);
      } else {
        bKO.d(this.bsb).setButtonJump(0.0F);
        bKO.d(this.bsb).setEnabled(false);
      }
    }
  }
}