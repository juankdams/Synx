import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class crl extends amp
{
  private static Logger K = Logger.getLogger(crl.class);
  public static final String TAG = "GlidingLayout";
  public static final String cwM = "gl";
  private boolean bY = true;

  private short egJ = 0;

  private short egK = 0;

  public static final int egL = "hgap".hashCode();
  public static final int egM = "vgap".hashCode();
  public static final int ct = "horizontal".hashCode();

  public String getTag()
  {
    return "GlidingLayout";
  }

  public Or getContentMinSize(dRq paramdRq)
  {
    int i = 0; int j = 0;
    int k = 1;
    Iterator localIterator;
    dOc localdOc;
    if (this.bY) {
      for (localIterator = paramdRq.getWidgetChildren().iterator(); localIterator.hasNext(); ) { localdOc = (dOc)localIterator.next();
        if (localdOc.getVisible()) {
          if (k != 0)
            k = 0;
          else {
            i += this.egJ;
          }
          i += localdOc.getMinSize().width;
          j = Math.max(j, localdOc.getMinSize().height);
        }
      }
      i += 2 * this.egJ;
      j += 2 * this.egK;
    } else {
      for (localIterator = paramdRq.getWidgetChildren().iterator(); localIterator.hasNext(); ) { localdOc = (dOc)localIterator.next();
        if (localdOc.getVisible()) {
          if (k != 0)
            k = 0;
          else {
            j += this.egK;
          }
          j += localdOc.getMinSize().height;
          i = Math.max(i, localdOc.getMinSize().width);
        }
      }
      i += 2 * this.egJ;
      j += 2 * this.egK;
    }

    return new Or(i, j);
  }

  public Or getContentPreferedSize(dRq paramdRq)
  {
    int i = 0; int j = 0;
    int k = 1;
    int m;
    dOc localdOc;
    if (this.bY) {
      for (m = paramdRq.getWidgetChildren().size() - 1; m >= 0; m--) {
        localdOc = paramdRq.getWidget(m);
        if (localdOc.getVisible()) {
          if (k != 0)
            k = 0;
          else {
            i += this.egJ;
          }
          i += localdOc.getPrefSize().width;
          j = Math.max(j, localdOc.getPrefSize().height);
        }
      }
      i += 2 * this.egJ;
      j += 2 * this.egK;
    } else {
      for (m = paramdRq.getWidgetChildren().size() - 1; m >= 0; m--) {
        localdOc = paramdRq.getWidget(m);
        if (localdOc.getVisible()) {
          if (k != 0)
            k = 0;
          else {
            j += this.egK;
          }
          j += localdOc.getPrefSize().height;
          i = Math.max(i, localdOc.getPrefSize().width);
        }
      }
      i += 2 * this.egJ;
      j += 2 * this.egK;
    }

    return new Or(i, j);
  }

  public short getHgap()
  {
    return this.egJ;
  }

  public void setHgap(short paramShort)
  {
    this.egJ = paramShort;
  }

  public boolean isHorizontal()
  {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean)
  {
    this.bY = paramBoolean;
  }

  public short getVgap()
  {
    return this.egK;
  }

  public void setVgap(short paramShort)
  {
    this.egK = paramShort;
  }

  public void a(dRq paramdRq)
  {
    int i = 0; int j = 0;

    ArrayList localArrayList = paramdRq.getWidgetChildren();
    int k;
    int m;
    int n;
    dOc localdOc;
    cYf localcYf;
    int i1;
    int i3;
    int i4;
    int i2;
    aFG localaFG;
    if (this.bY) {
      k = paramdRq.getAppearance().getContentHeight();
      m = paramdRq.getAppearance().getContentWidth();

      for (n = 0; n < localArrayList.size(); n++) {
        localdOc = (dOc)localArrayList.get(n);
        localcYf = null;
        if ((localdOc.getLayoutData() instanceof cYf)) {
          localcYf = (cYf)localdOc.getLayoutData();
        }
        if (localdOc.getVisible()) {
          i1 = localdOc.getPrefSize().width;

          i3 = j;
          i4 = localdOc.getX();

          if (localcYf != null)
            i2 = localdOc.getPrefSize().height;
          else {
            i2 = k;
          }

          if (localcYf != null) {
            localaFG = localcYf.getInitAlign();
            if (((!localcYf.isInitValue()) || (!localdOc.isPositionInitByUserDefinition()) || (bsP.getInstance().isResized())) && 
              (localcYf.isUsable()) && (localaFG != null)) {
              i4 = localaFG.ba(i1, m);
              localcYf.setUsable(false);
            }

            i3 += localcYf.getAlign().bb(i2, k);
          }

          localdOc.setSize(i1, i2);
          localdOc.setPosition(i4, i3);
        }
      }
    } else {
      k = paramdRq.getAppearance().getContentWidth();
      m = paramdRq.getAppearance().getContentHeight();

      for (n = 0; n < localArrayList.size(); n++) {
        localdOc = (dOc)localArrayList.get(n);
        localcYf = null;
        if ((localdOc.getLayoutData() instanceof cYf)) {
          localcYf = (cYf)localdOc.getLayoutData();
        }
        if (localdOc.getVisible()) {
          i1 = localdOc.getPrefSize().height;

          i3 = i;
          i4 = localdOc.getY();

          if (localcYf != null)
            i2 = localdOc.getPrefSize().width;
          else {
            i2 = k;
          }
          if (localcYf != null) {
            localaFG = localcYf.getInitAlign();
            if (((!localcYf.isInitValue()) || (!localdOc.isPositionInitByUserDefinition()) || (bsP.getInstance().isResized())) && 
              (localcYf.isUsable()) && (localaFG != null)) {
              i4 = localaFG.bb(i1, m);
              localcYf.setUsable(false);
            }

            i3 += localcYf.getAlign().ba(i2, k);
          }

          localdOc.setSize(i2, i1);
          localdOc.setPosition(i3, localdOc.getY());
        }
      }
    }
  }

  public void c(bdj parambdj)
  {
    crl localcrl = (crl)parambdj;
    super.c(localcrl);
    localcrl.egJ = this.egJ;
    localcrl.egK = this.egK;
    localcrl.bY = this.bY;
  }

  public crl cpS() {
    crl localcrl = new crl();
    localcrl.aJ();
    c(localcrl);
    return localcrl;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == egL)
      setHgap(bUD.getShort(paramString));
    else if (paramInt == egM)
      setVgap(bUD.getShort(paramString));
    else if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}