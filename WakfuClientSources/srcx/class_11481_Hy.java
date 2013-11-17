import java.util.Stack;

public class Hy
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    csA localcsA = new csA();
    localcsA.hg("wakfu.videoLoading:onClick");
    localdRq1.setOnClick(localcsA);
    localdRq1.setNonBlocking(false);
    localdRq1.brn();
    czO localczO = new czO();
    localczO.aJ();
    localdRq1.bb(localczO);
    localczO.brn();
    localczO.rV();
    cwP localcwP1 = new cwP();
    localcwP1.aJ();
    localcwP1.setElementMap(localcpa);
    localcwP1.setAlign(ajb.dhZ);
    localcwP1.setSize(new Or(100.0F, 100.0F));
    localdRq1.bb(localcwP1);
    localcwP1.brn();
    localcwP1.rV();
    dRq localdRq2 = localdRq1;
    Jg localJg = localdRq2.getAppearance();
    localJg.setElementMap(localcpa);
    localdRq1.bb(localJg);
    localJg.brn();
    jO localjO = new jO();
    localjO.aJ();
    localjO.setElementMap(localcpa);
    localjO.setColor(new bNa(0.0F, 0.0F, 0.0F, 1.0F));
    localJg.bb(localjO);
    localjO.brn();
    localjO.rV();
    localJg.rV();
    String str1 = "video";
    dRq localdRq3 = dRq.checkOut();
    localdRq3.setElementMap(localcpa);
    localdRq1.bb(localdRq3);
    localdRq3.brn();
    cwP localcwP2 = new cwP();
    localcwP2.aJ();
    localcwP2.setElementMap(localcpa);
    localcwP2.setAlign(ajb.dih);
    localcwP2.setSize(new Or(110, 110));
    localdRq3.bb(localcwP2);
    localcwP2.brn();
    localcwP2.rV();
    String str2 = "animatedElementViewer";
    auC localauC = new auC();
    localauC.aJ();
    localauC.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localauC);
    localauC.setFilePath("animVideoLoading.anm");
    localauC.setAnimName("AnimVideoLoading");
    localauC.setOffsetX(0.0F);
    localauC.setOffsetY(0.0F);
    localauC.setScale(1.0F);
    localdRq3.bb(localauC);
    localauC.brn();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setAttribute("animName");
    localNK.setName("isNewWorldReady");
    localauC.bb(localNK);
    localNK.brn();
    anQ localanQ = new anQ();
    localanQ.aJ();
    localanQ.setElementMap(localcpa);
    localanQ.setValue("AnimVideoLoaded");
    localanQ.setElseValue("AnimVideoLoading");
    localNK.bb(localanQ);
    localanQ.brn();
    cOk localcOk = new cOk();
    localcOk.aJ();
    localcOk.setElementMap(localcpa);
    localanQ.bb(localcOk);
    localcOk.brn();
    localcOk.rV();
    localanQ.rV();
    localNK.rV();
    localauC.rV();
    localdRq3.rV();
    localdRq1.rV();
    return localdRq1;
  }
}