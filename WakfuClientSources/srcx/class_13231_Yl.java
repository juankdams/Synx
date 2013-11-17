import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Yl extends amp
{
  public static final String TAG = "SpringLayout";
  public static final String cwM = "SPL";
  private HashMap cIN = new HashMap();

  public String getTag() {
    return "SpringLayout";
  }

  public TI getConstraint(dOc paramdOc) {
    ArrayList localArrayList = (ArrayList)this.cIN.get(paramdOc);
    return (localArrayList != null) && (localArrayList.size() != 0) ? (TI)localArrayList.get(0) : null;
  }

  private dOc getWidgetByConstraint(dRq paramdRq, TI paramTI)
  {
    for (dOc localdOc : paramdRq.getWidgetChildren()) {
      if ((localdOc.getLayoutData() instanceof TI)) {
        TI localTI = (TI)localdOc.getLayoutData();
        if (localTI.equals(paramTI)) {
          return localdOc;
        }
      }
    }
    return null;
  }

  private void r(ArrayList paramArrayList) {
    Set localSet = this.cIN.keySet();
    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      dOc localdOc = (dOc)paramArrayList.get(i);
      if (!localSet.contains(localdOc))
        this.cIN.remove(localdOc);
    }
  }

  private void g(dOc paramdOc)
  {
    if ((paramdOc.getLayoutData() instanceof TI)) {
      return;
    }

    ArrayList localArrayList = (ArrayList)this.cIN.get(paramdOc);
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      this.cIN.put(paramdOc, localArrayList);
    }

    if (localArrayList.size() == 0) {
      TI localTI = TI.a(this, paramdOc);
      localArrayList.add(localTI);
    }
  }

  public boolean ajO() {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq) {
    r(paramdRq.getWidgetChildren());

    Rectangle localRectangle = new Rectangle();

    for (dOc localdOc : paramdRq.getWidgetChildren()) {
      TI localTI = null;
      g(localdOc);

      localTI = (TI)((ArrayList)this.cIN.get(localdOc)).get(0);
      localRectangle.union(new Rectangle(localTI.getX().getValue(), localTI.getY().getValue(), localTI.getWidth().getValue(), localTI.getHeight().getValue()));
    }

    return new Or((int)localRectangle.getWidth(), (int)localRectangle.getHeight());
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    ArrayList localArrayList = paramdRq.getWidgetChildren();

    r(localArrayList);

    Rectangle localRectangle = new Rectangle();

    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      dOc localdOc = (dOc)localArrayList.get(i);
      TI localTI = null;
      g(localdOc);

      localTI = (TI)((ArrayList)this.cIN.get(localdOc)).get(0);
      localRectangle.union(new Rectangle(localTI.getX().getValue(), localTI.getY().getValue(), localTI.getWidth().getValue(), localTI.getHeight().getValue()));
    }

    return new Or((int)localRectangle.getWidth(), (int)localRectangle.getHeight());
  }

  public static void a(dRq paramdRq, List paramList)
  {
  }

  public void a(dRq paramdRq) {
    ArrayList localArrayList = paramdRq.getWidgetChildren();

    if (localArrayList == null)
      return;
    dOc localdOc;
    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      localdOc = (dOc)localArrayList.get(i);
      czO.b(paramdRq, localdOc);
      g(localdOc);
    }

    for (i = localArrayList.size() - 1; i >= 0; i--) {
      localdOc = (dOc)localArrayList.get(i);
      if ((localdOc.getLayoutData() instanceof TI))
      {
        TI localTI = (TI)((ArrayList)this.cIN.get(localdOc)).get(0);
        if (localTI != null) {
          int j = localTI.getX().getValue();
          int k = localTI.getY().getValue();
          int m = localTI.getWidth().getValue();
          int n = localTI.getHeight().getValue();
          localdOc.setPosition(j, k);
          localdOc.setSize(new Or(m, n));
        }
      }
    }
  }

  public void bc()
  {
    super.bc();
    this.cIN.clear();
  }

  public Yl ajP() {
    Yl localYl = new Yl();
    localYl.aJ();
    c(localYl);
    return localYl;
  }

  private boolean isFullyDisplayed(dRq paramdRq, TI paramTI) {
    return (paramTI.getX().getValue() >= 0) && (paramTI.getY().getValue() >= 0) && (paramTI.getX().getValue() + paramTI.getWidth().getValue() <= paramdRq.getWidth()) && (paramTI.getY().getValue() + paramTI.getHeight().getValue() <= paramdRq.getHeight());
  }

  public void a(dOc paramdOc, TI paramTI)
  {
    if (paramTI == null) {
      return;
    }
    ArrayList localArrayList = (ArrayList)this.cIN.get(paramdOc);
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      this.cIN.put(paramdOc, localArrayList);
    }
    else
    {
      localArrayList.clear();
    }
    localArrayList.add(paramTI);
  }

  public void h(dOc paramdOc) {
    this.cIN.remove(paramdOc);
  }
}