import java.util.Stack;

public class czb
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
    Jg localJg1 = localdOc1.getAppearance();
    localJg1.setElementMap(localcpa);
    localJg1.setState("default");
    paramdOc.bb(localJg1);
    localJg1.brn();
    String str1 = "rightTurnArrowDefault";
    aAR localaAR1 = aAR.checkOut();
    localaAR1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localaAR1);
    localaAR1.setFlipHorizontaly(true);
    localaAR1.setPosition(ajb.dhZ);
    localaAR1.setX(776);
    localaAR1.setY(29);
    localaAR1.setWidth(30);
    localaAR1.setHeight(23);
    localaAR1.setTexture(this.W.aH("default_0.tga"));
    localJg1.bb(localaAR1);
    localaAR1.brn();
    localaAR1.rV();
    localJg1.rV();
    dOc localdOc2 = paramdOc;
    Jg localJg2 = localdOc2.getAppearance();
    localJg2.setElementMap(localcpa);
    localJg2.setState("mouseHover");
    paramdOc.bb(localJg2);
    localJg2.brn();
    String str2 = "rightTurnArrowOver";
    aAR localaAR2 = aAR.checkOut();
    localaAR2.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaAR2);
    localaAR2.setFlipHorizontaly(true);
    localaAR2.setPosition(ajb.dhZ);
    localaAR2.setX(668);
    localaAR2.setY(29);
    localaAR2.setWidth(30);
    localaAR2.setHeight(23);
    localaAR2.setTexture(this.W.aH("default_0.tga"));
    localJg2.bb(localaAR2);
    localaAR2.brn();
    localaAR2.rV();
    localJg2.rV();
    dOc localdOc3 = paramdOc;
    Jg localJg3 = localdOc3.getAppearance();
    localJg3.setElementMap(localcpa);
    localJg3.setState("pressed");
    paramdOc.bb(localJg3);
    localJg3.brn();
    String str3 = "rightTurnArrowPressed";
    aAR localaAR3 = aAR.checkOut();
    localaAR3.setElementMap(localcpa);
    if ((localcpa != null) && (str3 != null))
      localcpa.a(str3, localaAR3);
    localaAR3.setFlipHorizontaly(true);
    localaAR3.setPosition(ajb.dhZ);
    localaAR3.setX(722);
    localaAR3.setY(29);
    localaAR3.setWidth(30);
    localaAR3.setHeight(23);
    localaAR3.setTexture(this.W.aH("default_0.tga"));
    localJg3.bb(localaAR3);
    localaAR3.brn();
    localaAR3.rV();
    localJg3.rV();
  }
}