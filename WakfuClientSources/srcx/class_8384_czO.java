import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.log4j.Logger;

public class czO extends amp
{
  private static Logger K = Logger.getLogger(czO.class);
  public static final String TAG = "StaticLayout";
  public static final String cwM = "sl";
  private boolean ipN = false;

  private static final HashMap ipO = new HashMap();

  public static final int ipP = "adaptToContentSize".hashCode();

  public String getTag()
  {
    return "StaticLayout";
  }

  public boolean ajO() {
    return this.ipN;
  }

  public boolean getAdaptToContentSize()
  {
    return this.ipN;
  }

  public void setAdaptToContentSize(boolean paramBoolean)
  {
    this.ipN = paramBoolean;
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    if (this.ipN) {
      int i = 0; int j = 0;
      ArrayList localArrayList = paramdRq.getWidgetChildren();
      for (int k = 0; k < localArrayList.size(); k++) {
        dOc localdOc = (dOc)localArrayList.get(k);
        if (localdOc.getVisible())
        {
          cwP localcwP = (cwP)localdOc.getLayoutData();
          int m = 0; int n = 0;
          if (localcwP.isXInit()) {
            m = localcwP.getX();
          }
          if (localcwP.isYInit())
            n = localcwP.getY();
          Or localOr1;
          if (localcwP.getSize() != null) {
            localOr1 = localcwP.getSize();
            Or localOr2 = localdOc.getMinSize();
            int i1;
            if (localOr1.aay() == -1.0F) {
              i1 = (int)localOr1.getWidth();
              i = Math.max(localOr1.width + m, i);
              if (i1 == -1)
                i1 = localdOc.haN.width;
              else if (i1 == -2) {
                i1 = (int)localOr2.getWidth();
              }
              i = Math.max(i1 + m, i);
            } else {
              i = Math.max(Math.round(localOr2.width / localOr1.aay() * 100.0F) + m, i);
            }
            if (localOr1.aaz() == -1.0F) {
              i1 = (int)localOr1.getHeight();
              i = Math.max(localOr1.height + n, i);
              if (i1 == -1)
                i1 = localdOc.haN.height;
              else if (i1 == -2) {
                i1 = (int)localOr2.getHeight();
              }
              i = Math.max(i1 + n, i);
            } else {
              i = Math.max(Math.round(localOr2.height / localOr1.aaz() * 100.0F) + n, i);
            }
          }
          else {
            localOr1 = localdOc.getMinSize();
            i = Math.max(localOr1.width + m, i);
            j = Math.max(localOr1.height + n, j);
          }
        }
      }

      return new Or(i, j);
    }
    return new Or(0, 0);
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    if (this.ipN) {
      int i = 0; int j = 0;
      ArrayList localArrayList = paramdRq.getWidgetChildren();
      for (int k = 0; k < localArrayList.size(); k++) {
        dOc localdOc = (dOc)localArrayList.get(k);
        if ((localdOc.getVisible()) && ((localdOc.getLayoutData() instanceof cwP)))
        {
          cwP localcwP = (cwP)localdOc.getLayoutData();
          if (localcwP != null)
          {
            int m = 0; int n = 0;
            if (localcwP.isXInit()) {
              m = localcwP.getX();
            }
            if (localcwP.isYInit())
              n = localcwP.getY();
            Or localOr1;
            if (localcwP.getSize() != null) {
              localOr1 = localcwP.getSize();
              Or localOr2 = localdOc.getPrefSize();
              int i1;
              if (localOr1.aay() == -1.0F) {
                i1 = (int)localOr1.getWidth();
                i = Math.max(localOr1.width + m, i);
                if (i1 == -1)
                  i1 = localdOc.haN.width;
                else if (i1 == -2) {
                  i1 = (int)localOr2.getWidth();
                }
                i = Math.max(i1 + m, i);
              } else {
                i = Math.max(Math.round(localOr2.width / localOr1.aay() * 100.0F) + m, i);
              }
              if (localOr1.aaz() == -1.0F) {
                i1 = (int)localOr1.getHeight();
                j = Math.max(localOr1.height + n, j);
                if (i1 == -1)
                  i1 = localdOc.haN.height;
                else if (i1 == -2) {
                  i1 = (int)localOr2.getHeight();
                }
                j = Math.max(i1 + n, j);
              } else {
                j = Math.max(Math.round(localOr2.height / localOr1.aaz() * 100.0F) + n, j);
              }
            }
            else {
              localOr1 = localdOc.getPrefSize();
              i = Math.max(localOr1.width + m, i);
              j = Math.max(localOr1.height + n, j);
            }
          }
        }
      }
      return new Or(i, j);
    }
    return new Or(0, 0);
  }

  public Or getContentGreedySize(dRq paramdRq, dOc paramdOc, Or paramOr)
  {
    if ((!this.ipN) || (paramdRq == null) || (paramdOc == null)) {
      return new Or(0, 0);
    }

    if (!(paramdOc.getLayoutData() instanceof cwP)) {
      return new Or(0, 0);
    }

    int i = paramOr.width;
    int j = paramOr.height;
    cwP localcwP = (cwP)paramdOc.getLayoutData();

    int n = 0; int i1 = 0;
    if (localcwP.isXInit()) {
      n = localcwP.getX();
    }
    if (localcwP.isYInit()) {
      i1 = localcwP.getY();
    }

    Or localOr = localcwP.getSize();
    int k;
    int m;
    if (localOr != null) {
      if (localOr.aay() == -1.0F)
        k = i - n;
      else {
        k = (int)(i * localOr.aay() / 100.0F) - n;
      }
      if (localOr.aaz() == -1.0F)
        m = j - i1;
      else
        m = (int)(j * localOr.aaz() / 100.0F) - i1;
    }
    else {
      k = i - n;
      m = j - i1;
    }

    return new Or(k, m);
  }

  public static boolean b(dRq paramdRq, dOc paramdOc)
  {
    if ((paramdRq == null) || (paramdOc == null)) {
      return false;
    }

    if ((paramdOc == null) || (paramdOc.getLayoutData() == null) || (!paramdOc.getVisible()) || (!(paramdOc.getLayoutData() instanceof cwP))) {
      return false;
    }
    cwP localcwP = (cwP)paramdOc.getLayoutData();

    if (localcwP.isUsable())
      localcwP.setUsable(false);
    else
      return false;
    Object localObject;
    int j;
    if ((!localcwP.isInitValue()) || (!paramdOc.isSizeInitByUserDefinition())) {
      if (localcwP.getSize() != null) {
        localObject = localcwP.getSize();
        Or localOr = paramdOc.getPrefSize();

        if (((Or)localObject).aay() != -1.0F)
          j = (int)Math.round(paramdRq.getAppearance().getContentWidth() * ((Or)localObject).aay() / 100.0D);
        else
          j = ((Or)localObject).width;
        int k;
        if (((Or)localObject).aaz() != -1.0F)
          k = (int)Math.round(paramdRq.getAppearance().getContentHeight() * ((Or)localObject).aaz() / 100.0D);
        else {
          k = ((Or)localObject).height;
        }
        if (k == -1)
          k = paramdOc.haN.height;
        else if (k == -2) {
          k = (int)localOr.getHeight();
        }
        if (j == -1)
          j = paramdOc.haN.width;
        else if (j == -2) {
          j = (int)localOr.getWidth();
        }
        paramdOc.setSize(j, k);
      } else {
        paramdOc.setSizeToPrefSize();
      }
    }

    if ((!localcwP.isInitValue()) || (!paramdOc.isPositionInitByUserDefinition())) {
      if (localcwP.isXInit()) {
        paramdOc.setX(localcwP.getX());
      }
      if (localcwP.isYInit()) {
        paramdOc.setY(localcwP.getY());
      }

      if (localcwP.getAlignment() != null) {
        localObject = localcwP.getAlignment();
        int i = localcwP.isXOffsetInit() ? localcwP.getXOffset() : 0;
        j = localcwP.isYOffsetInit() ? localcwP.getYOffset() : 0;
        paramdOc.setX(((ajb)localObject).ba(paramdOc.getSize().width, paramdRq.getAppearance().getContentWidth()) + i);
        paramdOc.setY(((ajb)localObject).bb(paramdOc.getSize().height, paramdRq.getAppearance().getContentHeight()) + j);
      }

      if (localcwP.getXPerc() != null) {
        paramdOc.setX((int)(localcwP.getXPerc().getValue() / 100.0D * (paramdRq.getAppearance().getContentWidth() - paramdOc.getSize().width)));
      }

      if (localcwP.getYPerc() != null) {
        paramdOc.setY((int)(localcwP.getYPerc().getValue() / 100.0D * (paramdRq.getAppearance().getContentHeight() - paramdOc.getSize().height)));
      }

      if (localcwP.isAutoPositionable()) {
        localObject = localcwP.getReferentWidget();
        dhh localdhh = (dhh)((dOc)localObject).getWidgetParentOfType(dhh.class);
        localdhh.getWindowManager().c(localcwP.getControlGroup(), (dOc)localObject);

        localcwP.setControlGroup(null);
        localcwP.setReferentWidget(null);
        localcwP.setCascadeMethodEnabled(false);
      }

    }

    if ((localcwP.isInitValue()) && (paramdOc.isPositionInitByUserDefinition())) {
      localObject = (dhh)paramdOc.getWidgetParentOfType(dhh.class);
      paramdOc.setX(Math.max(0, Math.min(paramdOc.getX((dRq)localObject), ((dhh)localObject).getWidth() - paramdOc.getWidth())));
      paramdOc.setY(Math.max(0, Math.min(paramdOc.getY((dRq)localObject), ((dhh)localObject).getHeight() - paramdOc.getHeight())));
    }

    return true;
  }

  public static void a(dRq paramdRq, ArrayList paramArrayList)
  {
    if ((paramdRq == null) || (paramArrayList == null)) {
      return;
    }

    ipO.clear();

    int i = paramdRq.getAppearance().getContentWidth();
    int j = paramdRq.getAppearance().getContentHeight();
    int k = 0;
    Object localObject;
    for (int m = paramArrayList.size(); k < m; k++) {
      localObject = (dOc)paramArrayList.get(k);
      if (localObject != null)
      {
        dgQ localdgQ = ((dOc)localObject).getLayoutData();
        if ((localdgQ != null) && (((dOc)localObject).getVisible()) && ((localdgQ instanceof cwP)))
        {
          cwP localcwP = (cwP)localdgQ;

          if (localcwP.isUsable())
          {
            localcwP.setUsable(false);
            int i2;
            int i3;
            if ((!localcwP.isInitValue()) || (!((dOc)localObject).isSizeInitByUserDefinition())) {
              Or localOr1 = localcwP.getSize();
              if (localOr1 != null) {
                Or localOr2 = ((dOc)localObject).getPrefSize();

                if (localOr1.aay() != -1.0F)
                  i2 = bCO.bC(i * localOr1.aay() / 100.0F);
                else {
                  i2 = localOr1.width;
                }
                if (localOr1.aaz() != -1.0F)
                  i3 = bCO.bC(j * localOr1.aaz() / 100.0F);
                else {
                  i3 = localOr1.height;
                }
                if (i3 == -1)
                  i3 = ((dOc)localObject).haN.height;
                else if (i3 == -2) {
                  i3 = (int)localOr2.getHeight();
                }
                if (i2 == -1)
                  i2 = ((dOc)localObject).haN.width;
                else if (i2 == -2) {
                  i2 = (int)localOr2.getWidth();
                }
                ((dOc)localObject).setSize(i2, i3);
              } else {
                ((dOc)localObject).setSizeToPrefSize();
              }
            }

            int n = ((dOc)localObject).getX();
            int i1 = ((dOc)localObject).getY();
            if ((!localcwP.isInitValue()) || (!((dOc)localObject).isPositionInitByUserDefinition())) {
              if (localcwP.isXInit()) {
                n = localcwP.getX();
              }
              if (localcwP.isYInit()) {
                i1 = localcwP.getY();
              }

              i2 = ((dOc)localObject).getSize().width;
              i3 = ((dOc)localObject).getSize().height;
              if (localcwP.getAlignment() != null) {
                ajb localajb = localcwP.getAlignment();
                int i5 = localcwP.isXOffsetInit() ? localcwP.getXOffset() : 0;
                int i6 = localcwP.isYOffsetInit() ? localcwP.getYOffset() : 0;
                n = localajb.ba(i2, i) + i5;
                i1 = localajb.bb(i3, j) + i6;
              }
              int i4;
              if (localcwP.getXPerc() != null) {
                i4 = localcwP.isXOffsetInit() ? localcwP.getXOffset() : 0;
                n = (int)bCO.w(localcwP.getXPerc().getValue() / 100.0D * (i - i2)) + i4;
              }

              if (localcwP.getYPerc() != null) {
                i4 = localcwP.isYOffsetInit() ? localcwP.getYOffset() : 0;
                i1 = (int)bCO.w(localcwP.getYPerc().getValue() / 100.0D * (j - i3)) + i4;
              }

              if (localcwP.isAutoPositionable()) {
                ipO.put(localcwP.getControlGroup(), localcwP.getReferentWidget());
                localcwP.setReferentWidget(null);
              }
            }
            else {
              dhh localdhh = (dhh)((dOc)localObject).getWidgetParentOfType(dhh.class);
              n = Math.max(0, Math.min(((dOc)localObject).getX(localdhh), localdhh.getWidth() - ((dOc)localObject).getWidth()));
              i1 = Math.max(0, Math.min(((dOc)localObject).getY(localdhh), localdhh.getHeight() - ((dOc)localObject).getHeight()));
            }
            ((dOc)localObject).setPosition(n, i1);
          }
        }
      }
    }
    if (ipO.size() != 0) {
      Iterator localIterator = ipO.entrySet().iterator();

      while (localIterator.hasNext()) {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localObject = (dhh)((dOc)localEntry.getValue()).getWidgetParentOfType(dhh.class);
        ((dhh)localObject).getWindowManager().c((String)localEntry.getKey(), (dOc)localEntry.getValue());
      }
    }
  }

  public void a(dRq paramdRq)
  {
    a(paramdRq, paramdRq.getWidgetChildren());
  }

  public void a(dRq paramdRq, dOc paramdOc)
  {
    b(paramdRq, paramdOc);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    ((czO)parambdj).setAdaptToContentSize(this.ipN);
  }

  public czO cwO() {
    czO localczO = new czO();
    localczO.aJ();
    c(localczO);
    return localczO;
  }

  public void bc()
  {
    super.bc();
  }

  public void aJ()
  {
    super.aJ();

    this.doS = true;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ipP)
      setAdaptToContentSize(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}