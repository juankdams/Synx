import java.util.List;

public class bmy extends aSt
{
  private bXx aOn;
  private bXx coR;
  private Object aOo;
  private Object coS;
  private Object aOd;

  public void b(String paramString, cpa paramcpa)
  {
    a(paramString, paramcpa);
  }

  public void a(bXx parambXx1, bXx parambXx2, Object paramObject) {
    this.aOd = paramObject;
    this.aOn = parambXx1;
    this.coR = parambXx2;
    axU localaxU;
    if (this.aOn != null) {
      localaxU = this.aOn.getRenderableParent();
      if (localaxU != null) {
        this.aOo = localaxU.getItemValue();
      }
    }
    if (this.coR != null) {
      localaxU = this.coR.getRenderableParent();
      if (localaxU != null)
        this.coS = localaxU.getItemValue();
    }
  }

  protected void a(String[] paramArrayOfString, List paramList1, List paramList2)
  {
    paramList1.add(bXx.class);
    paramList1.add(Object.class);
    paramList1.add(bXx.class);
    paramList1.add(Object.class);
    paramList1.add(Object.class);
    paramList2.add(this.aOn);
    paramList2.add(this.aOo);
    paramList2.add(this.coR);
    paramList2.add(this.coS);
    paramList2.add(this.aOd);
    super.a(paramArrayOfString, paramList1, paramList2);
  }

  public void a(bmy parambmy)
  {
    parambmy.b(this.brS, this.cUY);
  }

  public bmy bxk()
  {
    bmy localbmy = new bmy();
    a(localbmy);
    return localbmy;
  }

  public Object b(bXx parambXx1, bXx parambXx2, Object paramObject)
  {
    this.aOd = paramObject;
    this.aOn = parambXx1;
    this.coR = parambXx2;
    axU localaxU;
    if (this.aOn != null) {
      localaxU = this.aOn.getRenderableParent();
      if (localaxU != null) {
        this.aOo = localaxU.getItemValue();
      }
    }
    if (this.coR != null) {
      localaxU = this.coR.getRenderableParent();
      if (localaxU != null) {
        this.coS = localaxU.getItemValue();
      }
    }

    return super.bif();
  }
}