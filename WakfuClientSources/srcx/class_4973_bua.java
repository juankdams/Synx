class bua extends amp
{
  private bua(bbp parambbp)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq) {
    if (!bbp.g(this.bai)) {
      return new Or(0, 0);
    }

    int i = 0;
    int j = 0;

    Or localOr1 = bbp.h(this.bai).getMinSize();
    Or localOr2 = bbp.i(this.bai).getMinSize();
    Or localOr3 = bbp.c(this.bai).getMinSize();

    if (!bbp.j(this.bai).equals(dOf.mfK)) {
      i += localOr2.height;
      j += localOr2.width;
    }
    else {
      j += localOr3.width;
    }

    if (!bbp.k(this.bai).equals(dOf.mfK)) {
      j += localOr1.width;
      i += localOr1.height;
    }
    else {
      i += localOr3.height;
    }

    return new Or(j, i);
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    if (!bbp.g(this.bai)) {
      return new Or(0, 0);
    }

    int i = 0;
    int j = 0;

    Or localOr1 = bbp.h(this.bai).getPrefSize();
    Or localOr2 = bbp.i(this.bai).getPrefSize();
    Or localOr3 = bbp.c(this.bai).getPrefSize();

    if (!bbp.j(this.bai).equals(dOf.mfK)) {
      if (this.bai.meL != null) {
        if (localOr3.width <= this.bai.meL.width) {
          j += localOr3.width;
          if (bbp.j(this.bai) == dOf.mfJ)
            i += localOr2.height;
        } else {
          j += Math.max(this.bai.meL.width, localOr2.width);
          i += localOr2.height;
        }
      } else {
        i += localOr2.height;
        j += localOr2.width;
      }
    }
    else {
      j += localOr3.width;
    }

    if (!bbp.k(this.bai).equals(dOf.mfK)) {
      if (this.bai.meL != null) {
        if (localOr3.height <= this.bai.meL.height) {
          i += localOr3.height;
          if (bbp.k(this.bai) == dOf.mfJ)
            j += localOr1.width;
        } else {
          i += Math.max(this.bai.meL.height, localOr1.height);
          j += localOr1.width;
        }
      } else {
        j += localOr1.width;
        i += localOr1.height;
      }
    }
    else {
      i += localOr3.height;
    }

    return new Or(j, i);
  }

  public void a(dRq paramdRq) {
    if (bbp.c(this.bai) != null) {
      Jg localJg = this.bai.getAppearance();

      int i = localJg.getContentHeight();
      int j = localJg.getContentWidth();

      if ((bbp.c(this.bai) instanceof duS)) {
        ((duS)bbp.c(this.bai)).setTextWidgetSize(j, i, true);
        ((duS)bbp.c(this.bai)).getTextBuilder().bYB();
      }

      if ((!bbp.g(this.bai)) || ((j >= bbp.c(this.bai).getPrefSize().getWidth()) && (!bbp.j(this.bai).equals(dOf.mfJ))) || (bbp.j(this.bai).equals(dOf.mfK)))
      {
        bbp.b(this.bai, false);
      } else {
        bbp.b(this.bai, true);
        i = (int)(i - bbp.i(this.bai).getPrefSize().getHeight());
      }
      if ((!bbp.g(this.bai)) || ((i >= bbp.c(this.bai).getPrefSize().getHeight()) && (!bbp.k(this.bai).equals(dOf.mfJ))) || (bbp.k(this.bai).equals(dOf.mfK)))
      {
        bbp.c(this.bai, false);
      } else {
        j = (int)(j - bbp.h(this.bai).getPrefSize().getWidth());

        if ((bbp.c(this.bai) instanceof duS)) {
          ((duS)bbp.c(this.bai)).setTextWidgetSize(j, bbp.c(this.bai).getHeight(), true);
          ((duS)bbp.c(this.bai)).getTextBuilder().bYB();
        } else if (!bbp.l(this.bai)) {
          bbp.h(this.bai).setValue(1.0F);
        }

        bbp.c(this.bai, true);
      }

      if ((bbp.l(this.bai)) && (!bbp.m(this.bai)))
        if (((j >= bbp.c(this.bai).getPrefSize().getWidth()) && (!bbp.j(this.bai).equals(dOf.mfJ))) || (bbp.j(this.bai).equals(dOf.mfK)))
        {
          bbp.b(this.bai, false);
        } else {
          bbp.b(this.bai, true);
          i = (int)(i - bbp.i(this.bai).getPrefSize().getHeight());
        }
      int k;
      if ((bbp.n(this.bai) != null) && (bbp.j(this.bai) != dOf.mfK))
        k = bbp.c(this.bai).getPrefSize().width;
      else
        k = (int)Math.max(j, bbp.c(this.bai).getPrefSize().getWidth());
      int m;
      if ((bbp.n(this.bai) != null) && (bbp.k(this.bai) != dOf.mfK))
        m = bbp.c(this.bai).getPrefSize().height;
      else {
        m = (int)Math.max(i, bbp.c(this.bai).getPrefSize().getHeight());
      }

      bbp.c(this.bai).setSize(k, m);
      bbp.o(this.bai);

      if (bbp.m(this.bai)) {
        bbp.i(this.bai).setSize(j, (int)bbp.i(this.bai).getPrefSize().getHeight());
      }
      if (bbp.l(this.bai))
        bbp.h(this.bai).setSize((int)bbp.h(this.bai).getPrefSize().getWidth(), i);
      int n;
      int i1;
      float f;
      if (bbp.m(this.bai)) {
        n = 0; i1 = 0;
        if ((bbp.l(this.bai)) && (bbp.p(this.bai).equals(aFD.ebY))) {
          n += bbp.h(this.bai).getWidth();
        }
        if (bbp.q(this.bai).equals(aFD.ebV)) {
          i1 += i;
        }
        bbp.i(this.bai).setPosition(n, i1);
        bbp.i(this.bai).setSliderSize(j / k);
        f = (k / j - 1.0F) * bbp.r(this.bai);
        bbp.i(this.bai).setButtonJump(1.0F / Math.max(1.0F, f));
      }

      if (bbp.l(this.bai)) {
        n = 0; i1 = 0;
        if ((bbp.m(this.bai)) && (bbp.q(this.bai).equals(aFD.ebW))) {
          i1 += bbp.i(this.bai).getHeight();
        }
        if (bbp.p(this.bai).equals(aFD.ebX)) {
          n += j;
        }
        bbp.h(this.bai).setPosition(n, i1);
        bbp.h(this.bai).setSliderSize(i / m);
        f = 1.0F / Math.max(1.0F, m / i - 1.0F) * bbp.r(this.bai);
        bbp.h(this.bai).setButtonJump(f);
      }
      bbp.i(this.bai).setVisible(bbp.m(this.bai));
      bbp.h(this.bai).setVisible(bbp.l(this.bai));
    }
  }
}