import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cOP extends dRq
{
  private static Logger K = Logger.getLogger(cOP.class);
  public static final String TAG = "LayeredContainer";
  public static final int kxt = -40000;
  public static final int kxu = -39999;
  public static final int kxv = -30000;
  public static final int kxw = -10000;
  public static final int kxx = 25000;
  public static final int kxy = 26000;
  public static final int kxz = 27000;
  public static final int kxA = 30000;
  public static final int kxB = 40000;
  public static final int kxC = -2147483648;
  private cSi kxD;

  public cOP()
  {
    this.kxD = new cSi();
  }

  public void b(dOc paramdOc, int paramInt)
  {
    e(paramdOc, paramInt, 2147483647);
  }

  public void e(dOc paramdOc, int paramInt1, int paramInt2)
  {
    if (!this.fnH) {
      dRq localdRq = getContainerFromLayer(paramInt1);

      if (localdRq == null) {
        localdRq = yL(paramInt1);
      }

      int i = Math.min(localdRq.getWidgetChildren().size(), paramInt2);
      localdRq.c(paramdOc, i);
    }
  }

  private dRq yL(int paramInt) {
    dRq localdRq = dRq.checkOut();

    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setSize(new Or(100.0F, 100.0F));
    localdRq.a(localcwP);

    czO localczO = new czO();
    localczO.setAdaptToContentSize(true);
    localczO.aJ();
    localdRq.a(localczO);

    int i = 0;
    for (int j = this.mmr.size(); (i < j) && 
      (this.kxD.get(i) <= paramInt); i++);
    this.kxD.et(i, paramInt);
    c(localdRq, i);

    return localdRq;
  }

  public void h(aNL paramaNL)
  {
    if ((paramaNL instanceof dRq)) {
      int i = this.mmr.indexOf(paramaNL);

      if (i != -1) {
        this.kxD.wH(i);
      }
    }
    super.h(paramaNL);
  }

  public String getTag()
  {
    return "LayeredContainer";
  }

  public int getLayer(dOc paramdOc)
  {
    int i = 0; for (int j = this.mmr.size(); i < j; i++) {
      dRq localdRq = (dRq)this.mmr.get(i);
      if (localdRq.getWidgetChildren().contains(paramdOc)) {
        return this.kxD.get(i);
      }
    }

    return -2147483648;
  }

  public int getWidgetCountInLayer(int paramInt)
  {
    dRq localdRq = getContainerFromLayer(paramInt);
    if (localdRq != null) {
      return localdRq.getWidgetChildren().size();
    }

    return 0;
  }

  public dRq getContainerFromLayer(int paramInt) {
    int i = this.kxD.indexOf(paramInt);
    if (i != -1) {
      return (dRq)this.mmr.get(i);
    }
    return null;
  }

  public dRq getContainerFromWidget(dOc paramdOc) {
    int i = 0; for (int j = this.mmr.size(); i < j; i++) {
      dRq localdRq = (dRq)this.mmr.get(i);
      if (localdRq.getWidgetChildren().contains(paramdOc)) {
        return localdRq;
      }
    }

    return null;
  }

  public void a(dGy paramdGy, int[] paramArrayOfInt)
  {
    for (int k : paramArrayOfInt)
      paramdGy.d(getContainerFromLayer(k));
  }

  public void b(dGy paramdGy, int[] paramArrayOfInt) {
    if (!this.kxD.isEmpty())
      this.kxD.g(new zW(this, paramArrayOfInt, paramdGy));
  }

  public void w(dOc paramdOc)
  {
    int i = getLayer(paramdOc);

    if (i != -2147483648) {
      dRq localdRq = getContainerFromLayer(i);
      if (localdRq != null) {
        localdRq.getWidgetChildren().remove(paramdOc);
        localdRq.getWidgetChildren().add(paramdOc);
        localdRq.setNeedsToResetMeshes();
      }
    }
  }

  public int getWidgetPositionInLayer(dOc paramdOc) {
    int i = getLayer(paramdOc);

    if (i != -2147483648) {
      dRq localdRq = getContainerFromLayer(i);
      if (localdRq != null) {
        return localdRq.getWidgetChildren().indexOf(paramdOc);
      }
    }

    return -1;
  }

  public void setWidgetPositionInLayer(dOc paramdOc, int paramInt) {
    if (paramInt < 0) {
      K.warn("on essaye de set la position d'un widget dans un layer à une position inférieure à 0");
      return;
    }

    int i = getLayer(paramdOc);

    if (i != -2147483648) {
      dRq localdRq = getContainerFromLayer(i);
      if (localdRq != null) {
        ArrayList localArrayList = localdRq.getWidgetChildren();

        if (paramInt >= localArrayList.size()) {
          K.warn("on essaye de set la position d'un widget dans un layer à une position trop grande");
          return;
        }

        localArrayList.remove(paramdOc);
        localArrayList.add(paramInt, paramdOc);
        localdRq.setNeedsToResetMeshes();
      }
    }
  }

  public Iterator getAllWidgetIterator()
  {
    return new WU(this, null);
  }

  public void aJ()
  {
    super.aJ();

    czO localczO = new czO();
    localczO.aJ();
    localczO.setAdaptToContentSize(true);
    a(localczO);
  }
}