import java.util.Stack;

public class Jx
  implements aTK
{
  private uk W;
  private Stack X = new Stack();

  public void a(cpa paramcpa, uk paramuk, dOc paramdOc)
  {
    this.W = paramuk;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    dOc localdOc = paramdOc;
    Jg localJg = localdOc.getAppearance();
    localJg.setElementMap(localcpa);
    paramdOc.bb(localJg);
    localJg.brn();
    cag localcag = new cag();
    localcag.aJ();
    localcag.setElementMap(localcpa);
    localcag.setAlignment(aFG.eck);
    localcag.setFile("6001010.xps");
    localcag.setLevel(1);
    localJg.bb(localcag);
    localcag.brn();
    localcag.rV();
    localJg.rV();
  }
}