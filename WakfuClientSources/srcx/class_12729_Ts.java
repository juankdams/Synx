import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Ts
{
  private static Ts cwi = new Ts();

  public static short cwj = 1;
  public static short cwk = 10000;
  public static short cwl = 20000;
  public static short cwm = 30000;

  private ArrayList cwn = new ArrayList();
  private short cwo = 0;

  private static Comparator cwp = new diT();
  private dRq cwq;

  public static Ts agx()
  {
    return cwi;
  }

  public void d(aNL paramaNL)
  {
    if (paramaNL.getModalLevel() > this.cwo) {
      this.cwo = paramaNL.getModalLevel();
      zC.Ip().Ir();
    }
    this.cwn.add(paramaNL);
    Collections.sort(this.cwn, cwp);
  }

  public void e(aNL paramaNL)
  {
    if (this.cwo + 1 < cwl)
      this.cwo = cwl;
    else {
      this.cwo = ((short)(this.cwo + 1));
    }

    paramaNL.setModalLevel(this.cwo);

    zC.Ip().Ir();

    this.cwn.add(paramaNL);

    Collections.sort(this.cwn, cwp);
    bsP localbsP = bsP.getInstance();
    cOP localcOP = localbsP.getLayeredContainer();
    int i = localcOP.getWidgetPositionInLayer((dOc)paramaNL);
    if (this.cwn.size() == 1) {
      this.cwq = new dRq();
      this.cwq.aJ();
      cwP localcwP = new cwP();
      localcwP.aJ();
      localcwP.setAlign(ajb.dhZ);
      localcwP.setSize(localbsP.getSize());
      this.cwq.setLayoutData(localcwP);
      jO localjO = new jO();
      localjO.aJ();
      localjO.setColor(cBQ.cxL().cxO());
      this.cwq.getAppearance().bb(localjO);
      this.cwq.setSize(localbsP.getSize());
      localcOP.e(this.cwq, 26000, i);
    } else {
      localcOP.setWidgetPositionInLayer(this.cwq, i - 1);
    }
  }

  public void f(aNL paramaNL)
  {
    Iterator localIterator;
    if (paramaNL.getModalLevel() == this.cwo) {
      this.cwo = 0;
      for (localIterator = this.cwn.iterator(); localIterator.hasNext(); ) { localObject = (aNL)localIterator.next();
        if (((aNL)localObject).getModalLevel() > this.cwo)
          this.cwo = ((aNL)localObject).getModalLevel();
      }
    }
    Object localObject;
    boolean bool = this.cwn.remove(paramaNL);
    if (bool)
      if (this.cwn.isEmpty()) {
        this.cwq.beH();
      } else {
        localObject = bsP.getInstance();
        cOP localcOP = ((bsP)localObject).getLayeredContainer();
        aNL localaNL = (aNL)this.cwn.get(this.cwn.size() - 1);
        int i = localcOP.getWidgetPositionInLayer((dOc)localaNL);
        int j = localcOP.getWidgetPositionInLayer(this.cwq);
        localcOP.setWidgetPositionInLayer(this.cwq, i - (j < i ? 1 : 0));
      }
  }

  public void removeAllElements()
  {
    this.cwn.clear();
  }

  public short agy()
  {
    return this.cwo;
  }

  public boolean ao(int paramInt1, int paramInt2)
  {
    if (!this.cwn.isEmpty()) {
      dOc localdOc = bsP.getInstance().getWidget(paramInt1, paramInt2);
      while ((localdOc != null) && (localdOc.getModalLevel() == -1) && (localdOc != bsP.getInstance())) {
        localdOc = (dOc)localdOc.getParentOfType(dOc.class);
      }

      if (localdOc != null) {
        return localdOc.getModalLevel() >= ((aNL)this.cwn.get(0)).getModalLevel();
      }
    }
    return true;
  }

  public boolean isEmpty()
  {
    return this.cwn.isEmpty();
  }
}