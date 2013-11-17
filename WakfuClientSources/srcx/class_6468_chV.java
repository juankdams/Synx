import java.util.Stack;

public class chV
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    bpn localbpn = new bpn();
    localbpn.aJ();
    localbpn.setElementMap(localcpa);
    localbpn.brn();
    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setElementMap(localcpa);
    localcwP.setAlign(ajb.dhZ);
    localcwP.setSize(new Or(100.0F, 100.0F));
    localbpn.bb(localcwP);
    localcwP.brn();
    localcwP.rV();
    dRq localdRq = dRq.checkOut();
    localdRq.setElementMap(localcpa);
    localbpn.bb(localdRq);
    localdRq.brn();
    czv localczv = new czv();
    localczv.aJ();
    localczv.setElementMap(localcpa);
    csA localcsA = new csA();
    localcsA.hg("unloadDialog");
    localczv.setOnClick(localcsA);
    localdRq.bb(localczv);
    localczv.brn();
    aAR localaAR = aAR.checkOut();
    localaAR.setElementMap(localcpa);
    localczv.bb(localaAR);
    localaAR.brn();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setAttribute("texture");
    localNK.setName("splashScreenIconUrl");
    localaAR.bb(localNK);
    localNK.brn();
    localNK.rV();
    localaAR.rV();
    localczv.rV();
    localdRq.rV();
    localbpn.rV();
    return localbpn;
  }
}