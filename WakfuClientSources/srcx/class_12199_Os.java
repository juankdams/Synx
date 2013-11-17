import java.util.ArrayList;
import java.util.Arrays;

public class Os extends amp
{
  public Os(cbk paramcbk)
  {
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    return getContentPreferedSize(paramdRq);
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    Or localOr = cbk.j(this.cfA);
    localOr.setHeight(localOr.height + cbk.k(this.cfA).size() * 40);
    return localOr;
  }

  public void a(dRq paramdRq) {
    if (cbk.l(this.cfA)) {
      return;
    }

    Or localOr = cbk.j(this.cfA);
    int i = paramdRq.getAppearance().getContentHeight() - localOr.height;
    int j = paramdRq.getAppearance().getContentWidth();

    if ((cbk.m(this.cfA) != null) && (cbk.m(this.cfA).length != 0)) {
      int k = cbk.m(this.cfA).length;
      int[] arrayOfInt1 = new int[k];

      bvR localbvR = cbk.c(this.cfA).getMesh();

      int m = (int)Math.floor(i / cbk.k(this.cfA).size());

      int n = localbvR.bDB().getHeight();
      for (int i1 = 0; i1 < cbk.m(this.cfA).length; i1++) {
        n += localbvR.bDE().getHeight();
        if (i1 != 0) {
          n += cbk.n(this.cfA)[(i1 - 1)] * m;
        }
        arrayOfInt1[i1] = n;
      }

      int[] arrayOfInt2 = cbk.c(this.cfA).getPixelSeparations();
      int[] arrayOfInt3 = new int[arrayOfInt2.length];
      cSi localcSi1 = new cSi();
      cSi localcSi2 = new cSi();
      cSi localcSi3 = new cSi();
      jY localjY1 = new jY();
      jY localjY2 = new jY();

      float[] arrayOfFloat1 = new float[arrayOfInt2.length];

      float[] arrayOfFloat2 = new float[arrayOfInt2.length];
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      int i5 = this.cfA.getAppearance().getContentHeight() + localbvR.bDE().getHeight();
      while ((i3 < cbk.o(this.cfA).length) || (i2 < cbk.m(this.cfA).length)) {
        i6 = (cbk.o(this.cfA).length > i3) && (i3 >= 0) ? cbk.o(this.cfA)[i3] : 0;
        i7 = (cbk.m(this.cfA).length > i2) && (i2 >= 0) ? cbk.m(this.cfA)[i2] : 0;
        if ((i2 >= cbk.m(this.cfA).length) || ((i3 < cbk.o(this.cfA).length) && (i6 < i7)))
        {
          if (arrayOfInt2.length <= i3)
          {
            i3++;
          }
          else {
            localcSi1.add(i6);
            localcSi2.add(arrayOfInt2[i3]);
            localcSi3.add(i4);
            localjY1.add(1.0F);
            localjY2.add(0.0F);
            i3++;
          } } else if ((i3 >= cbk.o(this.cfA).length) || ((i2 < cbk.m(this.cfA).length) && (i6 > i7)))
        {
          if (arrayOfInt1.length <= i2)
          {
            i2++;
          }
          else {
            i4 = arrayOfInt1[i2];
            localcSi1.add(i7);
            localcSi2.add(arrayOfInt1[i2]);
            localcSi3.add(arrayOfInt1[i2]);
            localjY1.add(0.0F);
            localjY2.add(1.0F);
            i2++;
          }
        }
        else if ((arrayOfInt2.length <= i3) || (arrayOfInt1.length <= i2))
        {
          i2++;
          i3++;
        }
        else {
          localcSi1.add(i7);
          localcSi2.add(arrayOfInt2[i3]);
          localcSi3.add(arrayOfInt1[i2]);
          localjY1.add(1.0F);
          localjY2.add(1.0F);

          i4 = arrayOfInt1[i2];
          i3++;
          i2++;
        }
      }

      arrayOfInt2 = localcSi2.cIf();
      arrayOfInt3 = localcSi3.cIf();
      arrayOfFloat1 = localjY1.rI();
      arrayOfFloat2 = localjY2.rI();

      int i6 = 0;
      axU localaxU;
      for (int i7 = cbk.e(this.cfA).size(); i6 < i7; i6++) {
        localaxU = (axU)cbk.e(this.cfA).get(i6);
        localaxU.setSizeToPrefSize();
      }
      i6 = 0; for (i7 = cbk.g(this.cfA).size(); i6 < i7; i6++) {
        localaxU = (axU)cbk.g(this.cfA).get(i6);
        localaxU.setSizeToPrefSize();
      }

      for (i6 = 0; i6 < cbk.m(this.cfA).length; i6++) {
        localObject = (caF)cbk.d(this.cfA).get(i6);
        ((caF)localObject).setText(String.valueOf(cbk.m(this.cfA)[i6] + 1));
        ((caF)localObject).setSizeToPrefSize();
      }

      cbk.h(this.cfA).setSizeToPrefSize();

      float[] arrayOfFloat3 = new float[arrayOfInt1.length];
      Arrays.fill(arrayOfFloat3, 1.0F);

      this.cfA.J(bxr.class);

      Object localObject = new bxr(this.cfA, arrayOfInt2, arrayOfInt3, arrayOfInt1, arrayOfFloat1, arrayOfFloat2, arrayOfFloat3, cbk.m(this.cfA), localcSi1.cIf(), this.cfA, 0, 300, 1, ddp.kWG);
      this.cfA.a((cKq)localObject);
    }
  }
}