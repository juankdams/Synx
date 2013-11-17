import java.util.Stack;

public class dOm
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    localdRq.setNonBlocking(false);
    localdRq.setPrefSize(new Or(200, 200));
    localdRq.brn();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setSize(new Or(200, 200));
    localdRq.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    czO localczO = new czO();
    localczO.aJ();
    localdRq.bb(localczO);
    localczO.brn();
    auC localauC = new auC();
    localauC.aJ();
    localauC.setElementMap(localcpa);
    localauC.setOffsetY(-80.0F);
    localauC.setNonBlocking(true);
    localauC.setPrefSize(new Or(200, 200));
    localauC.setScale(2.5F);
    localczO.bb(localauC);
    localauC.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setSize(new Or(200, 200));
    localauC.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    NK localNK1 = NK.checkOut();
    localNK1.setElementMap(localcpa);
    localNK1.setLocal(true);
    localNK1.setName("filePath");
    localNK1.setAttribute("filePath");
    localauC.bb(localNK1);
    localNK1.brn();
    localNK1.rV();
    NK localNK2 = NK.checkOut();
    localNK2.setElementMap(localcpa);
    localNK2.setLocal(true);
    localNK2.setName("animName");
    localNK2.setAttribute("animName");
    localauC.bb(localNK2);
    localNK2.brn();
    localNK2.rV();
    NK localNK3 = NK.checkOut();
    localNK3.setElementMap(localcpa);
    localNK3.setLocal(true);
    localNK3.setName("direction");
    localNK3.setAttribute("direction");
    localauC.bb(localNK3);
    localNK3.brn();
    localNK3.rV();
    localauC.rV();
    localczO.rV();
    localdRq.rV();
    return localdRq;
  }
}