import java.awt.Insets;
import java.util.Stack;

public class cSu
  implements aTK
{
  private uk W;
  private Stack X = new Stack();

  public void a(cpa paramcpa, uk paramuk, dOc paramdOc)
  {
    this.W = paramuk;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    dOc localdOc1 = paramdOc;
    dOc localdOc2 = paramdOc;
    Jg localJg = localdOc2.getAppearance();
    localJg.setElementMap(localcpa);
    paramdOc.bb(localJg);
    localJg.brn();
    jO localjO = new jO();
    localjO.aJ();
    localjO.setElementMap(localcpa);
    localjO.setColor(new bNa(0.0F, 0.0F, 1.0F, 1.0F));
    localJg.bb(localjO);
    localjO.brn();
    localjO.rV();
    ams localams = new ams();
    localams.aJ();
    localams.setElementMap(localcpa);
    localams.setColor(new bNa(0.0F, 0.0F, 0.0F, 1.0F));
    localams.setInsets(new Insets(0, 1, 0, 0));
    localJg.bb(localams);
    localams.brn();
    localams.rV();
    localJg.rV();
  }
}