import java.awt.Insets;
import java.util.Stack;

public class Ta
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
    ams localams = new ams();
    localams.aJ();
    localams.setElementMap(localcpa);
    localams.setInsets(new Insets(2, 2, 2, 2));
    localJg.bb(localams);
    localams.brn();
    String str = "defaultLightColor";
    cAf localcAf = cAf.checkOut();
    localcAf.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localcAf);
    localcAf.setColor(new bNa(1.0F, 1.0F, 1.0F, 1.0F));
    localams.bb(localcAf);
    localcAf.brn();
    localcAf.rV();
    localams.rV();
    localJg.rV();
  }
}