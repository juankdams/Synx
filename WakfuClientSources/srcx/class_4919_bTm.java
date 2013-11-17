import org.apache.log4j.Logger;

public class bTm extends amp
{
  private static Logger K = Logger.getLogger(bTm.class);
  public static final String TAG = "BorderLayout";
  public static final String cwM = "bl";
  private int heM = 0;

  private int heN = 0;

  public static final int egL = "hgap".hashCode();
  public static final int egM = "vgap".hashCode();

  public String getTag()
  {
    return "BorderLayout";
  }

  public void setHGap(int paramInt) {
    this.heM = paramInt;
  }

  public void setVGap(int paramInt)
  {
    this.heN = paramInt;
  }

  private dOc getWidgetByConstraint(dRq paramdRq, cFu paramcFu)
  {
    for (dOc localdOc : paramdRq.getWidgetChildren()) {
      if ((localdOc.getVisible()) && ((localdOc.getLayoutData() instanceof cba))) {
        cba localcba = (cba)localdOc.getLayoutData();
        if (localcba.getData().equals(paramcFu)) {
          return localdOc;
        }
      }
    }
    return null;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    Or localOr1 = new Or(0, 0);

    dOc localdOc = getWidgetByConstraint(paramdRq, cFu.izU);
    Or localOr2;
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getMinSize();
      localOr1.width += localOr2.width + this.heM;
      localOr1.height = Math.max(localOr2.height, localOr1.height);
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izV);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getMinSize();
      localOr1.width += localOr2.width + this.heM;
      localOr1.height = Math.max(localOr2.height, localOr1.height);
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izR);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getMinSize();
      localOr1.width += localOr2.width;
      localOr1.height = Math.max(localOr2.height, localOr1.height);
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izS);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getMinSize();
      localOr1.width = Math.max(localOr2.width, localOr1.width);
      localOr1.height += localOr2.height + this.heN;
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izT);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getMinSize();
      localOr1.width = Math.max(localOr2.width, localOr1.width);
      localOr1.height += localOr2.height + this.heN;
    }

    return localOr1;
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    Or localOr1 = new Or(0, 0);

    dOc localdOc = getWidgetByConstraint(paramdRq, cFu.izU);
    Or localOr2;
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getPrefSize();
      localOr1.width += localOr2.width + this.heM;
      localOr1.height = Math.max(localOr2.height, localOr1.height);
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izV);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getPrefSize();
      localOr1.width += localOr2.width + this.heM;
      localOr1.height = Math.max(localOr2.height, localOr1.height);
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izR);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getPrefSize();
      localOr1.width += localOr2.width;
      localOr1.height = Math.max(localOr2.height, localOr1.height);
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izS);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getPrefSize();
      localOr1.width = Math.max(localOr2.width, localOr1.width);
      localOr1.height += localOr2.height + this.heN;
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izT);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr2 = localdOc.getPrefSize();
      localOr1.width = Math.max(localOr2.width, localOr1.width);
      localOr1.height += localOr2.height + this.heN;
    }

    return localOr1;
  }

  public void a(dRq paramdRq)
  {
    int i = paramdRq.getAppearance().getContentHeight();
    int j = 0;
    int k = 0;
    int m = paramdRq.getAppearance().getContentWidth();

    dOc localdOc = getWidgetByConstraint(paramdRq, cFu.izT);
    Or localOr;
    int i1;
    int n;
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr = localdOc.getPrefSize();

      i1 = k;
      if (localdOc.isExpandable()) {
        n = m - k;
      } else {
        n = (int)localOr.getWidth();
        i1 += (m - k - n) / 2;
      }
      localdOc.setSize(n, localOr.height);
      localdOc.setPosition(i1, j);
      j += localOr.height + this.heN;
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izS);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr = localdOc.getPrefSize();

      i1 = k;
      if (localdOc.isExpandable()) {
        n = m - k;
      } else {
        n = (int)localOr.getWidth();
        i1 += (m - k - n) / 2;
      }
      localdOc.setSize(n, localOr.height);
      localdOc.setPosition(i1, i - localOr.height);
      i -= localOr.height + this.heN;
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izU);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr = localdOc.getPrefSize();

      i1 = j;
      if (localdOc.isExpandable()) {
        n = i - j;
      } else {
        n = (int)localOr.getHeight();
        i1 += (i - j - n) / 2;
      }
      localdOc.setSize(localOr.width, n);
      localdOc.setPosition(m - localOr.width, i1);
      m -= localOr.width + this.heM;
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izV);
    if ((localdOc != null) && (localdOc.getVisible())) {
      localOr = localdOc.getPrefSize();

      i1 = j;
      if (localdOc.isExpandable()) {
        n = i - j;
      } else {
        n = localOr.height;
        i1 += (i - j - n) / 2;
      }
      localdOc.setSize(localOr.width, n);
      localdOc.setPosition(k, i1);
      k += localOr.width + this.heM;
    }

    localdOc = getWidgetByConstraint(paramdRq, cFu.izR);
    if ((localdOc != null) && (localdOc.getVisible()))
      if (localdOc.isExpandable()) {
        localdOc.setSize(m - k, i - j);
        localdOc.setPosition(k, j);
      } else {
        localdOc.setSizeToPrefSize();
        localdOc.setPosition(k + (m - k - localdOc.getWidth()) / 2, j + (i - j - localdOc.getHeight()) / 2);
      }
  }

  public void bc()
  {
    super.bc();
  }

  public void aJ()
  {
    super.aJ();
  }

  public void c(bdj parambdj)
  {
    bTm localbTm = (bTm)parambdj;
    super.c(localbTm);
    localbTm.heM = this.heM;
    localbTm.heN = this.heN;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == egL)
      setHGap(bUD.aR(paramString));
    else if (paramInt == egM)
      setVGap(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }

  public bTm bZL() {
    bTm localbTm = new bTm();
    localbTm.aJ();
    c(localbTm);
    return localbTm;
  }
}