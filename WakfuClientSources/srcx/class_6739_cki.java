import java.util.Stack;

public class cki
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    cBx localcBx = new cBx();
    localcBx.aJ();
    localcBx.setElementMap(localcpa);
    localcBx.setNonBlocking(true);
    localcBx.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setSize(new Or(32, 32));
    localcBx.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    String str = "animatedElementViewer";
    auC localauC = new auC();
    localauC.aJ();
    localauC.setElementMap(localcpa);
    if ((localcpa != null) && (str != null))
      localcpa.a(str, localauC);
    localauC.setScale(1.5F);
    localauC.setPrefSize(new Or(32, 32));
    localauC.setNonBlocking(true);
    localauC.setDirection(2);
    localcBx.bb(localauC);
    localauC.brn();
    localauC.rV();
    localcBx.rV();
    return localcBx;
  }
}