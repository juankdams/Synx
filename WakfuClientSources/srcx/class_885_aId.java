import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aId extends amp
  implements bBz
{
  private static Logger K = Logger.getLogger(aId.class);
  public static final String TAG = "RowLayout";
  public static final String cwM = "rl";
  private static final aee aOr = new bOO(new aXC(), 2000);

  private boolean bY = true;

  private short egJ = 0;

  private short egK = 0;

  private aFG aWn = aFG.eck;

  public static final int egL = "hgap".hashCode();
  public static final int egM = "vgap".hashCode();
  public static final int ct = "horizontal".hashCode();
  public static final int drs = "align".hashCode();

  public static aId checkOut()
  {
    aId localaId;
    try
    {
      localaId = (aId)aOr.Mm();
      localaId.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localaId = new aId();
      localaId.aJ();
    }
    return localaId;
  }

  public String getTag() {
    return "RowLayout";
  }

  public aFG getAlign() {
    return this.aWn;
  }

  public void setAlign(aFG paramaFG) {
    this.aWn = paramaFG;
  }

  public Or getContentMinSize(dRq paramdRq) {
    int i = 0; int j = 0;
    int k = 1;
    Iterator localIterator;
    dOc localdOc;
    Or localOr;
    if (this.bY) {
      for (localIterator = paramdRq.getWidgetChildren().iterator(); localIterator.hasNext(); ) { localdOc = (dOc)localIterator.next();
        if (localdOc.getVisible()) {
          if (k != 0)
            k = 0;
          else {
            i += this.egJ;
          }
          localOr = localdOc.getMinSize();
          i += localOr.width;
          j = Math.max(j, localOr.height);
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
          localOr = localdOc.getMinSize();
          j += localOr.height;
          i = Math.max(i, localOr.width);
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
    Or localOr;
    if (this.bY) {
      for (m = paramdRq.getWidgetChildren().size() - 1; m >= 0; m--) {
        localdOc = paramdRq.getWidget(m);
        if (localdOc.getVisible()) {
          if (k != 0)
            k = 0;
          else {
            i += this.egJ;
          }
          localOr = localdOc.getPrefSize();
          i += localOr.width;
          j = Math.max(j, localOr.height);
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
          localOr = localdOc.getPrefSize();
          j += localOr.height;
          i = Math.max(i, localOr.width);
        }
      }
      i += 2 * this.egJ;
      j += 2 * this.egK;
    }

    return new Or(i, j);
  }

  public Or getContentGreedySize(dRq paramdRq, dOc paramdOc, Or paramOr)
  {
    int i = paramOr.width; int j = paramOr.height;
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
            i -= this.egJ;
          }
          if (localdOc != paramdOc)
          {
            i -= localdOc.getPrefSize().width;
          }
        }
      }
      i -= 2 * this.egJ;
    } else {
      for (m = paramdRq.getWidgetChildren().size() - 1; m >= 0; m--) {
        localdOc = paramdRq.getWidget(m);
        if (localdOc.getVisible()) {
          if (k != 0)
            k = 0;
          else {
            j -= this.egK;
          }
          if (localdOc != paramdOc)
          {
            j -= localdOc.getPrefSize().height;
          }
        }
      }
      j -= 2 * this.egK;
    }

    return new Or(i, j);
  }

  public void setHgap(short paramShort) {
    this.egJ = paramShort;
  }

  public boolean isHorizontal() {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean) {
    this.bY = paramBoolean;
  }

  public void setVgap(short paramShort)
  {
    this.egK = paramShort;
  }

  private ArrayList c(ArrayList paramArrayList, int paramInt)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();

    if (paramArrayList != null)
      for (localIterator1 = paramArrayList.iterator(); localIterator1.hasNext(); ) { localdOc = (dOc)localIterator1.next();
        if (localdOc.isShrinkable())
          localArrayList2.add(localdOc);
      }
    dOc localdOc;
    if ((localArrayList2 == null) || (localArrayList2.size() == 0)) {
      return localArrayList1;
    }

    for (Iterator localIterator1 = localArrayList2.iterator(); localIterator1.hasNext(); ) { localdOc = (dOc)localIterator1.next();
      Or localOr = localdOc.getPrefSize();
      m = this.bY ? localOr.width : localOr.height;
      for (int n = localArrayList1.size() - 1; 
        n >= 0; n--) {
        localCs = (Cs)localArrayList1.get(n);
        if (((Integer)localCs.Lp()).intValue() > m) {
          break;
        }
      }
      localArrayList1.add(n + 1, new Cs(localdOc, Integer.valueOf(m)));
    }
    int m;
    Cs localCs;
    int i = paramInt;

    while (i > 0) {
      int j = ((Integer)((Cs)localArrayList1.get(0)).Lp()).intValue();
      int k = 0;
      m = 0;

      for (Iterator localIterator2 = localArrayList1.iterator(); localIterator2.hasNext(); ) { localCs = (Cs)localIterator2.next();
        if (((Integer)localCs.Lp()).intValue() == j) {
          k++;
        } else {
          m = ((Integer)localCs.Lp()).intValue();
          break;
        }

      }

      if (i < k) {
        for (i1 = 0; (i1 < k) && 
          (i > 0); i1++)
        {
          ((Cs)localArrayList1.get(i1)).x(Integer.valueOf(((Integer)((Cs)localArrayList1.get(i1)).Lp()).intValue() - 1));
          i--;
        }

        break;
      }

      int i1 = j - m;

      if ((i1 * k > i) || (i1 <= 0)) {
        i1 = (int)Math.floor(i / k);
      }
      i -= i1 * k;

      for (int i2 = 0; i2 < k; i2++) {
        ((Cs)localArrayList1.get(i2)).x(Integer.valueOf(j - i1));
      }
    }

    return localArrayList1;
  }

  public void a(dRq paramdRq) {
    int i = 0; int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;

    int i2 = 0;
    int i3 = 0;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = paramdRq.getWidgetChildren();
    int i4;
    int i1;
    int i5;
    int i6;
    dOc localdOc3;
    Or localOr;
    int i9;
    int i11;
    Iterator localIterator;
    Cs localCs;
    int i10;
    if (this.bY) {
      i4 = paramdRq.getAppearance().getContentHeight() - 2 * this.egK;
      i1 = paramdRq.getAppearance().getContentWidth() - 2 * this.egJ;
      i5 = 0; for (i6 = localArrayList2.size(); i5 < i6; i5++) {
        dOc localdOc1 = (dOc)localArrayList2.get(i5);
        if (localdOc1.getVisible()) {
          i1 -= localdOc1.getPrefSize().width;
          k++;
          if (localdOc1.isExpandable()) {
            m++;
          }
          if (localdOc1.isShrinkable()) {
            n++;
          }
        }
      }
      i1 -= (k - 1) * this.egJ;

      if (i1 < 0) {
        i3 = 1;
        i2 = -i1;
        i1 = 0;
        localArrayList1 = c(localArrayList2, i2);
      }

      i5 = 0;
      if (m > 0) {
        i5 = (int)Math.floor(i1 / m);
      }

      i6 = 0;
      if (m > 0) {
        i6 = i1 - i5 * m;
      }

      i = this.egJ + (m == 0 ? this.aWn.iO(i1) : 0);
      j = this.egK;
      for (int i7 = 0; i7 < localArrayList2.size(); i7++) {
        localdOc3 = (dOc)localArrayList2.get(i7);
        if (localdOc3.getVisible()) {
          localOr = localdOc3.getPrefSize();
          i9 = localOr.width;

          i11 = j;
          if ((i3 != 0) && (localdOc3.isShrinkable()) && (localArrayList1 != null)) {
            for (localIterator = localArrayList1.iterator(); localIterator.hasNext(); ) { localCs = (Cs)localIterator.next();
              if (localCs.getFirst() == localdOc3) {
                i9 = ((Integer)localCs.Lp()).intValue();
                break;
              }
            }
          }
          if (localdOc3.isExpandable()) {
            i9 += i5;
            if (i6 > 0) {
              i9++;
              i6--;
            }
          }
          if ((localdOc3.getLayoutData() instanceof dpm)) {
            i10 = localOr.height;
            i11 += ((dpm)localdOc3.getLayoutData()).getAlign().bb(i10, i4);
          } else {
            i10 = i4;
          }

          localdOc3.setSize(i9, i10);
          localdOc3.setPosition(i, i11);
          i += i9 + this.egJ;
        }
      }
    } else {
      i4 = paramdRq.getAppearance().getContentWidth() - 2 * this.egJ;
      i1 = paramdRq.getAppearance().getContentHeight() - 2 * this.egK;
      i5 = 0; for (i6 = localArrayList2.size(); i5 < i6; i5++) {
        dOc localdOc2 = (dOc)localArrayList2.get(i5);
        if (localdOc2.getVisible()) {
          i1 -= localdOc2.getPrefSize().height;
          k++;
          if (localdOc2.isExpandable()) {
            m++;
          }
          if (localdOc2.isShrinkable()) {
            n++;
          }
        }
      }
      i1 -= (k - 1) * this.egK;

      if (i1 < 0) {
        i3 = 1;
        i2 = -i1;
        i1 = 0;
        localArrayList1 = c(localArrayList2, i2);
      }

      i5 = 0;
      if (m > 0) {
        i5 = (int)Math.floor(i1 / m);
      }

      i6 = 0;
      if (m > 0) {
        i6 = i1 - i5 * m;
      }

      i = this.egJ;
      j = paramdRq.getAppearance().getContentHeight() - (m == 0 ? i1 - this.aWn.iP(i1) : 0);

      for (int i8 = 0; i8 < localArrayList2.size(); i8++) {
        localdOc3 = (dOc)localArrayList2.get(i8);
        if (localdOc3.getVisible()) {
          localOr = localdOc3.getPrefSize();
          i9 = localOr.height;

          i11 = i;
          if ((i3 != 0) && (localdOc3.isShrinkable()) && (localArrayList1 != null)) {
            for (localIterator = localArrayList1.iterator(); localIterator.hasNext(); ) { localCs = (Cs)localIterator.next();
              if (localCs.getFirst() == localdOc3) {
                i9 = ((Integer)localCs.Lp()).intValue();
                break;
              }
            }
          }
          if (localdOc3.isExpandable()) {
            i9 += i5;
            if (i6 > 0) {
              i9++;
              i6--;
            }
          }
          if ((localdOc3.getLayoutData() instanceof dpm)) {
            i10 = localOr.width;
            i11 += ((dpm)localdOc3.getLayoutData()).getAlign().ba(i10, i4);
          } else {
            i10 = i4;
          }

          localdOc3.setSize(i10, i9);
          j -= i9 + this.egK;
          localdOc3.setPosition(i11, j);
        }
      }
    }
  }

  public void c(bdj parambdj)
  {
    aId localaId = (aId)parambdj;
    super.c(localaId);
    localaId.egJ = this.egJ;
    localaId.egK = this.egK;
    localaId.bY = this.bY;
    localaId.aWn = this.aWn;
  }

  public aId aUk()
  {
    aId localaId = checkOut();
    c(localaId);
    return localaId;
  }

  public void aJ() {
    super.aJ();
    this.bY = true;
    this.egJ = 0;
    this.egK = 0;
    this.aWn = aFG.eck;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == egL)
      setHgap(bUD.getShort(paramString));
    else if (paramInt == egM)
      setVgap(bUD.getShort(paramString));
    else if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}