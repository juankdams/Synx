import java.util.ArrayList;

public class aNF extends amp
{
  public aNF(kd paramkd)
  {
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    return new Or();
  }

  public Or getContentMinSize(dRq paramdRq) {
    return this.aAW.getPrefSize();
  }

  public void a(dRq paramdRq) {
    if ((!kd.e(this.aAW)) && (!kd.f(this.aAW))) {
      return;
    }

    synchronized (kd.g(this.aAW))
    {
      boolean bool = kd.f(this.aAW);
      kd.a(this.aAW, false);
      kd.b(this.aAW, false);

      if (kd.h(this.aAW) == null) {
        return;
      }

      int i = paramdRq.getAppearance().getContentWidth();
      int j = paramdRq.getAppearance().getContentHeight();

      if (kd.b(this.aAW) != null)
      {
        kd.b(this.aAW).setSizeToPrefSize();
        kd.b(this.aAW).setPosition(i - kd.b(this.aAW).getWidth() - 54, 0);
      }

      int[] arrayOfInt1 = new int[(kd.h(this.aAW).size() + 1) * 2];
      int[] arrayOfInt2 = new int[(kd.h(this.aAW).size() + 1) * 2];

      int[] arrayOfInt3 = new int[(kd.h(this.aAW).size() + 1) * 2];
      int[] arrayOfInt4 = new int[(kd.h(this.aAW).size() + 1) * 2];

      int i3 = 5;

      int i4 = 0;

      duj localduj = null;

      int i5 = 0; for (int i6 = kd.h(this.aAW).size() + 1; i5 < i6; i5++)
      {
        int i7 = i5;
        int i8 = i5 == kd.i(this.aAW) + 1 ? 1 : 0;

        if (i5 > kd.i(this.aAW) + 1)
          i7--;
        int i2;
        int k;
        int n;
        int m;
        int i1;
        int i9;
        int i10;
        switch (i5) {
        case 0:
          i2 = 5;
          k = 7;
          n = 59;
          m = 101;
          i1 = 35;
          i9 = 113;
          i10 = 47;
          break;
        case 1:
          i2 = 7;
          k = 7;
          n = 94;
          m = 96;
          i1 = 31;
          i9 = 101;
          i10 = 35;
          break;
        case 2:
          i2 = 7;
          k = 7;
          n = 125;
          m = 91;
          i1 = 26;
          i9 = 96;
          i10 = 31;
          break;
        default:
          i2 = 7;
          k = 7;
          n = 125 + 26 * (i5 - 2);
          m = i9 = 91;
          i1 = i10 = 26;
        }

        if (((i5 == i6 - 2) && (i5 == kd.i(this.aAW))) || ((i5 == i6 - 1) && (i8 == 0)))
        {
          k = 5;
          n = 5;
          m = 113;
          i1 = 47;
        }

        if ((i5 == i6 - 1) && (i8 != 0)) {
          k = 7;
          n = 59;
          m = 101;
          i1 = 35;
        }

        i2 -= i9;
        axU localaxU;
        if (i8 == 0)
          localaxU = ((che)kd.h(this.aAW).get(i7)).getRenderable();
        else {
          localaxU = kd.j(this.aAW).getRenderable();
        }

        arrayOfInt3[(i5 * 2)] = i2;
        arrayOfInt3[(i5 * 2 + 1)] = i3;
        arrayOfInt4[(i5 * 2)] = i9;
        arrayOfInt4[(i5 * 2 + 1)] = i10;

        int i11 = 0;
        if ((!bool) || (localaxU.getWidth() == 0)) {
          arrayOfInt1[(i5 * 2)] = arrayOfInt3[(i5 * 2)];
          arrayOfInt1[(i5 * 2 + 1)] = arrayOfInt3[(i5 * 2 + 1)];
          arrayOfInt2[(i5 * 2)] = arrayOfInt4[(i5 * 2)];
          arrayOfInt2[(i5 * 2 + 1)] = arrayOfInt4[(i5 * 2 + 1)];
          localaxU.setPosition(i + arrayOfInt1[(i5 * 2)], arrayOfInt1[(i5 * 2 + 1)]);
          localaxU.setSize(arrayOfInt2[(i5 * 2)], arrayOfInt2[(i5 * 2 + 1)]);
        } else {
          arrayOfInt1[(i5 * 2)] = (k - m);
          arrayOfInt1[(i5 * 2 + 1)] = n;
          arrayOfInt2[(i5 * 2)] = m;
          arrayOfInt2[(i5 * 2 + 1)] = i1;
          i11 = 1;
          i4 = 1;
        }

        i3 += i10;
        if (i5 == 0) {
          i3 += 7;
        }

        if (i11 != 0)
        {
          if (((i5 == i6 - 2) && (i5 == kd.i(this.aAW))) || ((i5 == i6 - 1) && (i8 == 0)) || ((i5 == i6 - 1) && (i8 != 0)))
          {
            int i12 = -108;

            int i13 = n;
            int i14 = i12 + 100;

            int i15 = i13;

            int i16 = i14;
            int i17 = j - i10;
            int i18 = arrayOfInt3[(i5 * 2)];

            int i19 = i17;
            int i20 = arrayOfInt4[(i5 * 2)];
            int i21 = arrayOfInt4[(i5 * 2 + 1)];

            if (localduj == null) {
              localduj = new duj(this.aAW, ddp.kWG, null);
            }

            if (i8 != 0)
              localduj.b(localaxU, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21);
            else {
              localduj.a(localaxU, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21);
            }

            arrayOfInt1[(i5 * 2)] = i16;
            arrayOfInt1[(i5 * 2 + 1)] = i17;
            arrayOfInt2[(i5 * 2)] = i20;
            arrayOfInt2[(i5 * 2 + 1)] = i21;
          }
        }
      }

      if (i4 == 0) {
        return;
      }

      if ((localduj != null) && (localduj.ais())) {
        if (this.aAW.K(duj.class))
          kd.c(this.aAW).add(localduj);
        else {
          this.aAW.a(localduj);
        }
      }

      ArrayList localArrayList = new ArrayList(kd.h(this.aAW).size() + 1);
      for (i6 = 0; 
        i6 <= kd.i(this.aAW); i6++) {
        localArrayList.add(((che)kd.h(this.aAW).get(i6)).getRenderable());
      }
      localArrayList.add(kd.j(this.aAW).getRenderable());
      for (; i6 < kd.h(this.aAW).size(); i6++) {
        localArrayList.add(((che)kd.h(this.aAW).get(i6)).getRenderable());
      }

      bWv localbWv = new bWv(this.aAW, localArrayList, arrayOfInt1, arrayOfInt3, arrayOfInt2, arrayOfInt4, ddp.kWG, null);
      if (this.aAW.K(bWv.class))
        kd.d(this.aAW).add(localbWv);
      else
        this.aAW.a(localbWv);
    }
  }
}