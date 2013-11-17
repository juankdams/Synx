import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class cSt extends amp
{
  private cSt(dad paramdad)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  private int s(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    Iterator localIterator;
    aHd localaHd;
    if (paramBoolean2)
      for (localIterator = dad.c(this.bgw).iterator(); localIterator.hasNext(); ) { localaHd = (aHd)localIterator.next();
        i = Math.max(paramBoolean1 ? localaHd.getMinSize().width : localaHd.getMinSize().height, i);
      }
    else {
      for (localIterator = dad.c(this.bgw).iterator(); localIterator.hasNext(); ) { localaHd = (aHd)localIterator.next();
        i = Math.max(paramBoolean1 ? localaHd.getPrefSize().width : localaHd.getPrefSize().height, i);
      }
    }
    return i;
  }

  private int a(ArrayList paramArrayList, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    Iterator localIterator;
    aHd localaHd;
    if (paramBoolean2)
      for (localIterator = paramArrayList.iterator(); localIterator.hasNext(); ) { localaHd = (aHd)localIterator.next();
        i += (paramBoolean1 ? localaHd.getMinSize().width : localaHd.getMinSize().height);
      }
    else {
      for (localIterator = paramArrayList.iterator(); localIterator.hasNext(); ) { localaHd = (aHd)localIterator.next();
        i += (paramBoolean1 ? localaHd.getPrefSize().width : localaHd.getPrefSize().height);
      }
    }
    return i;
  }

  private boolean a(ArrayList paramArrayList, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    dad.d(this.bgw).cfM();

    Object localObject = null;

    int i = 0;
    int j = 0;
    for (aHd localaHd : paramArrayList) {
      int k = paramBoolean ? localaHd.getPrefSize().width : localaHd.getPrefSize().height;
      buA localbuA = (buA)dad.e(this.bgw).get(localaHd);
      if ((i < paramInt1) || (j > paramInt2)) {
        localaHd.setVisible(false);
      } else {
        localaHd.setVisible(localbuA.isVisible());
        j += k;
        if (j > paramInt2) {
          localObject = localaHd;
        }
      }
      i++;
    }
    if (dad.f(this.bgw) != null) {
      if ((localObject != null) && (localObject == dad.f(this.bgw)))
      {
        dad.a(this.bgw, Math.min(dad.c(this.bgw).size() - 1, dad.b(this.bgw) + 1));
        return a(paramArrayList, dad.b(this.bgw), paramInt2, paramBoolean);
      }

      dad.a(this.bgw, null);
    }

    return j <= paramInt2;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    Or localOr = new Or();
    ArrayList localArrayList = dad.c(this.bgw);

    switch (tX.bgx[dad.g(this.bgw).ordinal()]) {
    case 1:
    case 2:
      if (localArrayList.size() > 0) {
        localOr.setHeight(((aHd)localArrayList.get(0)).getMinSize().height);
      }
      localOr.setWidth(Math.min(s(true, true), a(localArrayList, true, true)));
      break;
    case 3:
    case 4:
      if (localArrayList.size() > 0) {
        localOr.setWidth(((aHd)localArrayList.get(0)).getMinSize().width);
      }
      localOr.setHeight(Math.min(s(false, true), a(localArrayList, false, true)));
    }

    return localOr;
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    Or localOr = new Or();
    ArrayList localArrayList = dad.c(this.bgw);

    switch (tX.bgx[dad.g(this.bgw).ordinal()]) {
    case 1:
    case 2:
      if (localArrayList.size() > 0) {
        localOr.setHeight(((aHd)localArrayList.get(0)).getPrefSize().height);
      }
      localOr.setWidth(Math.min(s(true, false), a(localArrayList, true, false)));
      break;
    case 3:
    case 4:
      if (localArrayList.size() > 0) {
        localOr.setWidth(((aHd)localArrayList.get(0)).getPrefSize().width);
      }
      localOr.setHeight(Math.min(s(false, false), a(localArrayList, false, false)));
    }

    return localOr;
  }

  public void a(dRq paramdRq)
  {
    dad.a(this.bgw, 0.0D);

    int i = this.bgw.czl.getContentWidth();
    int j = this.bgw.czl.getContentHeight();

    ArrayList localArrayList = dad.h(this.bgw);

    dad.i(this.bgw).setSize(dad.i(this.bgw).getPrefSize());
    dad.j(this.bgw).setSize(dad.j(this.bgw).getPrefSize());

    switch (tX.bgx[dad.g(this.bgw).ordinal()]) {
    case 1:
    case 2:
      dad.b(this.bgw, i < a(localArrayList, true, false));
      break;
    case 3:
    case 4:
      dad.b(this.bgw, j < a(localArrayList, false, false));
    }
    if (dad.k(this.bgw)) {
      dad.i(this.bgw).setVisible(true);
      dad.j(this.bgw).setVisible(true);
    } else {
      dad.i(this.bgw).setVisible(false);
      dad.j(this.bgw).setVisible(false);
    }

    boolean bool = true;
    Iterator localIterator;
    aHd localaHd;
    buA localbuA;
    switch (tX.bgx[dad.g(this.bgw).ordinal()])
    {
    case 1:
    case 2:
      if (dad.k(this.bgw)) {
        bool = a(dad.h(this.bgw), dad.b(this.bgw), i - dad.i(this.bgw).getWidth() - dad.j(this.bgw).getHeight(), true);
      }
      else {
        for (localIterator = dad.c(this.bgw).iterator(); localIterator.hasNext(); ) { localaHd = (aHd)localIterator.next();
          localbuA = (buA)dad.e(this.bgw).get(localaHd);
          localaHd.setVisible(localbuA.isVisible());
        }
      }
      dad.d(this.bgw).setSize((int)dad.d(this.bgw).getPrefSize().getWidth(), (int)dad.d(this.bgw).getPrefSize().getHeight());

      dad.l(this.bgw).setSize(i - (dad.k(this.bgw) ? dad.i(this.bgw).getWidth() + dad.j(this.bgw).getHeight() : 0), (int)dad.d(this.bgw).getPrefSize().getHeight());

      dad.m(this.bgw).setSize(i, dad.d(this.bgw).getHeight());
      dad.n(this.bgw).setSize(i, (int)dad.n(this.bgw).getPrefSize().getHeight());
      if (dad.o(this.bgw) != null)
        dad.o(this.bgw).setSize(i, j - dad.d(this.bgw).getHeight() - dad.n(this.bgw).getHeight()); break;
    case 3:
    case 4:
      if (dad.k(this.bgw)) {
        bool = a(dad.c(this.bgw), dad.b(this.bgw), j - dad.i(this.bgw).getHeight() - dad.j(this.bgw).getHeight(), false);
      }
      else {
        for (localIterator = dad.c(this.bgw).iterator(); localIterator.hasNext(); ) { localaHd = (aHd)localIterator.next();
          localbuA = (buA)dad.e(this.bgw).get(localaHd);
          localaHd.setVisible(localbuA.isVisible());
        }
      }

      dad.d(this.bgw).setSize((int)dad.d(this.bgw).getPrefSize().getWidth(), (int)dad.d(this.bgw).getPrefSize().getHeight());

      dad.l(this.bgw).setSize((int)dad.d(this.bgw).getPrefSize().getWidth(), j - (dad.k(this.bgw) ? dad.i(this.bgw).getHeight() + dad.j(this.bgw).getHeight() : 0));

      dad.m(this.bgw).setSize(dad.d(this.bgw).getWidth(), j);
      dad.n(this.bgw).setSize((int)dad.n(this.bgw).getPrefSize().getWidth(), j);
      if (dad.o(this.bgw) != null) {
        dad.o(this.bgw).setSize(i - dad.d(this.bgw).getWidth() - dad.n(this.bgw).getWidth(), j);
      }
      break;
    }
    dad.i(this.bgw).setEnabled(!bool);
    dad.j(this.bgw).setEnabled(dad.b(this.bgw) != 0);

    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    switch (tX.bgx[dad.g(this.bgw).ordinal()]) {
    case 1:
      i2 = n = k = dad.p(this.bgw);
      i7 = i9 = i1 = m = this.bgw.czl.getContentHeight() - dad.d(this.bgw).getHeight() + dad.q(this.bgw);

      i3 = m - dad.n(this.bgw).getHeight();
      if (dad.k(this.bgw))
      {
        if (dad.r(this.bgw)) {
          if (dad.s(this.bgw)) {
            i8 = k;
            i6 = i8 + dad.j(this.bgw).getWidth();

            k += dad.j(this.bgw).getWidth() + dad.i(this.bgw).getWidth();
          } else {
            i6 = this.bgw.czl.getContentWidth() - dad.i(this.bgw).getWidth();
            i8 = i6 - dad.j(this.bgw).getWidth();
          }
        }
        else {
          i8 = k;

          k += dad.j(this.bgw).getWidth();
          i6 = this.bgw.czl.getContentWidth() - dad.i(this.bgw).getWidth();
        }

      }
      else if (dad.t(this.bgw).equals(aFE.ece))
        k += (i - dad.d(this.bgw).getWidth()) / 2;
      else if (!dad.t(this.bgw).equals(aFE.ecd)) {
        k += i - dad.d(this.bgw).getWidth();
      }

      i4 = 0;
      i5 = 0;
      break;
    case 2:
      i2 = n = k = dad.p(this.bgw);
      i7 = i9 = i1 = m = dad.q(this.bgw);

      i3 = m + dad.d(this.bgw).getHeight();
      if (dad.k(this.bgw))
      {
        if (dad.r(this.bgw)) {
          if (dad.s(this.bgw)) {
            i8 = k;
            i6 = i8 + dad.j(this.bgw).getWidth();

            k += dad.j(this.bgw).getWidth() + dad.i(this.bgw).getWidth();
          } else {
            i6 = this.bgw.czl.getContentWidth() - dad.i(this.bgw).getWidth();
            i8 = i6 - dad.j(this.bgw).getWidth();
          }
        }
        else {
          i8 = k;

          k += dad.j(this.bgw).getWidth();
          i6 = this.bgw.czl.getContentWidth() - dad.i(this.bgw).getWidth();
        }
      }
      else if (dad.t(this.bgw).equals(aFE.ece))
        k += (i - dad.d(this.bgw).getWidth()) / 2;
      else if (!dad.t(this.bgw).equals(aFE.ecd)) {
        k += i - dad.d(this.bgw).getWidth();
      }

      i4 = 0;
      i5 = i3 + dad.n(this.bgw).getHeight();
      break;
    case 4:
      i6 = i8 = n = k = this.bgw.czl.getContentWidth() - dad.d(this.bgw).getWidth() + dad.p(this.bgw);

      i3 = i1 = m = dad.q(this.bgw);
      i2 = k - dad.n(this.bgw).getWidth();
      if (dad.k(this.bgw))
      {
        if (dad.r(this.bgw)) {
          if (dad.s(this.bgw)) {
            i9 = this.bgw.czl.getContentHeight() - dad.j(this.bgw).getHeight();
            i7 = i9 - dad.i(this.bgw).getHeight();
          } else {
            i7 = m;
            i9 = dad.i(this.bgw).getWidth();

            m += dad.j(this.bgw).getHeight() + dad.i(this.bgw).getHeight();
          }
        }
        else {
          i7 = m;

          m += dad.i(this.bgw).getHeight();
          i9 = this.bgw.czl.getContentHeight() - dad.j(this.bgw).getWidth();
        }

        dad.l(this.bgw).setLocation(k, m);
        dad.a(this.bgw, dad.d(this.bgw).getHeight() - dad.l(this.bgw).getHeight());
        m = (int)(m - dad.u(this.bgw));
      }
      else if (dad.t(this.bgw).equals(aFE.ece)) {
        m += (j - dad.d(this.bgw).getHeight()) / 2;
      } else if (!dad.t(this.bgw).equals(aFE.ecb)) {
        m += j - dad.d(this.bgw).getHeight();
      }

      i4 = 0;
      i5 = 0;
      break;
    case 3:
      i6 = i8 = n = k = dad.p(this.bgw);

      i3 = i1 = m = dad.q(this.bgw);
      i2 = k + dad.d(this.bgw).getWidth();
      if (dad.k(this.bgw))
      {
        if (dad.r(this.bgw)) {
          if (dad.s(this.bgw)) {
            i9 = this.bgw.czl.getContentHeight() - dad.j(this.bgw).getHeight();
            i7 = i9 - dad.i(this.bgw).getHeight();
          } else {
            i7 = m;
            i9 = dad.i(this.bgw).getWidth();

            m += dad.j(this.bgw).getHeight() + dad.i(this.bgw).getHeight();
          }
        }
        else {
          i7 = m;

          m += dad.i(this.bgw).getHeight();
          i9 = this.bgw.czl.getContentHeight() - dad.j(this.bgw).getWidth();
        }

        dad.l(this.bgw).setLocation(k, m);
        dad.a(this.bgw, dad.d(this.bgw).getHeight() - dad.l(this.bgw).getHeight());
        m = (int)(m - dad.u(this.bgw));
      }
      else if (dad.t(this.bgw).equals(aFE.ece)) {
        m += (j - dad.d(this.bgw).getHeight()) / 2;
      } else if (!dad.t(this.bgw).equals(aFE.ecb)) {
        m += j - dad.d(this.bgw).getHeight();
      }

      i4 = i2 + dad.n(this.bgw).getWidth();
      i5 = 0;
    }

    dad.d(this.bgw).setPosition(k, m);
    dad.m(this.bgw).setPosition(n, i1);
    dad.n(this.bgw).setPosition(i2, i3);
    dad.i(this.bgw).setPosition(i6, i7);
    dad.j(this.bgw).setPosition(i8, i9);
    if (dad.o(this.bgw) != null)
      dad.o(this.bgw).setPosition(i4, i5);
  }
}