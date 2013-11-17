import java.awt.event.MouseEvent;

public class cTo extends dMr
{
  bXx ggq;
  Object aOo;
  Object aOd;
  private static final aee aOr = new bOO(new bqm());

  public cTo()
  {
  }

  public cTo(bXx parambXx, Object paramObject)
  {
    setDragNDropable(parambXx);
    this.kET = parambXx;
    this.aOd = paramObject;
  }

  public static cTo a(MouseEvent paramMouseEvent, bXx parambXx, Object paramObject)
  {
    cTo localcTo;
    try
    {
      localcTo = (cTo)aOr.Mm();
      localcTo.fnG = aOr;
    } catch (Exception localException) {
      localcTo = new cTo();
      localcTo.aJ();
    }
    localcTo.nS(paramMouseEvent.getButton());
    localcTo.CW(paramMouseEvent.getClickCount());
    localcTo.setModifiers(paramMouseEvent.getModifiersEx());
    localcTo.setScreenX(cyb.cvg().getX());
    localcTo.setScreenY(cyb.cvg().getY());
    localcTo.q(parambXx);
    localcTo.b(CH.bGb);
    localcTo.setDragNDropable(parambXx);
    localcTo.aOd = paramObject;
    return localcTo;
  }

  public static cTo a(dMr paramdMr, bXx parambXx, Object paramObject)
  {
    cTo localcTo;
    try
    {
      localcTo = (cTo)aOr.Mm();
      localcTo.fnG = aOr;
    } catch (Exception localException) {
      localcTo = new cTo();
      localcTo.aJ();
    }
    localcTo.nS(paramdMr.bPg);
    localcTo.CW(paramdMr.bPh);
    localcTo.setModifiers(paramdMr.kr);
    localcTo.setScreenX(paramdMr.kO);
    localcTo.setScreenY(paramdMr.kP);
    localcTo.q(parambXx);
    localcTo.b(CH.bGb);
    localcTo.setDragNDropable(parambXx);
    localcTo.aOd = paramObject;
    return localcTo;
  }

  public bXx getDragNDropable()
  {
    return this.ggq;
  }

  public void setDragNDropable(bXx parambXx)
  {
    if ((parambXx instanceof aNL)) {
      this.ggq = parambXx;
    }

    if (parambXx != null) {
      axU localaxU = parambXx.getRenderableParent();
      if (localaxU != null)
        this.aOo = localaxU.getItemValue();
    }
  }

  public Object sq()
  {
    return this.aOo;
  }

  public void M(Object paramObject)
  {
    this.aOo = paramObject;
  }

  public Object getValue()
  {
    return this.aOd;
  }

  public void setValue(Object paramObject)
  {
    this.aOd = paramObject;
  }

  public CH mp()
  {
    return CH.bGb;
  }
}