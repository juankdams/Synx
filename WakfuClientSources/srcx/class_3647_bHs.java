import java.awt.Insets;
import java.util.Stack;

public class bHs
  implements cEa
{
  private Stack X = new Stack();
  private cDA Y;

  public bdj a(cDA paramcDA, cpa paramcpa)
  {
    this.Y = paramcDA;
    this.X.push(paramcpa);
    cpa localcpa = (cpa)this.X.peek();
    String str1 = "splitExchangeCashContainer";
    dRq localdRq1 = dRq.checkOut();
    localdRq1.setElementMap(localcpa);
    if ((localcpa != null) && (str1 != null))
      localcpa.a(str1, localdRq1);
    localdRq1.setStyle("spellInventory");
    localdRq1.setPack(true);
    localdRq1.brn();
    bTm localbTm1 = new bTm();
    localbTm1.aJ();
    localdRq1.bb(localbTm1);
    localbTm1.brn();
    dRq localdRq2 = dRq.checkOut();
    localdRq2.setElementMap(localcpa);
    localbTm1.bb(localdRq2);
    localdRq2.brn();
    dRq localdRq3 = localdRq2;
    Jg localJg1 = localdRq3.getAppearance();
    localJg1.setElementMap(localcpa);
    localdRq2.bb(localJg1);
    localJg1.brn();
    bmv localbmv1 = bmv.checkOut();
    localbmv1.setElementMap(localcpa);
    localbmv1.setInsets(new Insets(0, 5, 0, 0));
    localJg1.bb(localbmv1);
    localbmv1.brn();
    localbmv1.rV();
    localJg1.rV();
    cba localcba1 = cba.checkOut();
    localcba1.setElementMap(localcpa);
    localcba1.setData(cFu.izR);
    localdRq2.bb(localcba1);
    localcba1.brn();
    localcba1.rV();
    bTm localbTm2 = new bTm();
    localbTm2.aJ();
    localdRq2.bb(localbTm2);
    localbTm2.brn();
    String str2 = "quantityTextEditor";
    aTp localaTp1 = new aTp();
    localaTp1.aJ();
    localaTp1.setElementMap(localcpa);
    if ((localcpa != null) && (str2 != null))
      localcpa.a(str2, localaTp1);
    localaTp1.setStyle("dark");
    localaTp1.setPrefSize(new Or(80, 0));
    localaTp1.setMaxChars(10);
    localaTp1.setRestrict("[0-9]+");
    localaTp1.setSelectOnFocus(true);
    localaTp1.setFocused(true);
    dbp localdbp = new dbp();
    localdbp.hg("wakfu.exchange:keyType(quantityTextEditor)");
    localaTp1.setOnKeyType(localdbp);
    localbTm2.bb(localaTp1);
    localaTp1.brn();
    NK localNK = NK.checkOut();
    localNK.setElementMap(localcpa);
    localNK.setName("exchange.amountOfCash");
    localNK.setAttribute("text");
    localaTp1.bb(localNK);
    localNK.brn();
    localNK.rV();
    cba localcba2 = cba.checkOut();
    localcba2.setElementMap(localcpa);
    localcba2.setData(cFu.izR);
    localaTp1.bb(localcba2);
    localcba2.brn();
    localcba2.rV();
    aTp localaTp2 = localaTp1;
    Jg localJg2 = localaTp2.getAppearance();
    localJg2.setElementMap(localcpa);
    ((cwJ)localJg2).setAlign(aFG.ecl);
    localaTp1.bb(localJg2);
    localJg2.brn();
    bmv localbmv2 = bmv.checkOut();
    localbmv2.setElementMap(localcpa);
    localbmv2.setInsets(new Insets(8, 0, 5, 0));
    localJg2.bb(localbmv2);
    localbmv2.brn();
    localbmv2.rV();
    localJg2.rV();
    localaTp1.rV();
    localbTm2.rV();
    localdRq2.rV();
    biy localbiy1 = new biy();
    localbiy1.aJ();
    localbiy1.setElementMap(localcpa);
    localbiy1.setStyle("smallValid");
    csA localcsA = new csA();
    localcsA.hg("wakfu.exchange:applyQuantity");
    localbiy1.setOnClick(localcsA);
    localbTm1.bb(localbiy1);
    localbiy1.brn();
    cba localcba3 = cba.checkOut();
    localcba3.setElementMap(localcpa);
    localcba3.setData(cFu.izU);
    localbiy1.bb(localcba3);
    localcba3.brn();
    localcba3.rV();
    biy localbiy2 = localbiy1;
    Jg localJg3 = localbiy2.getAppearance();
    localJg3.setElementMap(localcpa);
    localbiy1.bb(localJg3);
    localJg3.brn();
    bmv localbmv3 = bmv.checkOut();
    localbmv3.setElementMap(localcpa);
    localbmv3.setInsets(new Insets(3, 5, 0, 5));
    localJg3.bb(localbmv3);
    localbmv3.brn();
    localbmv3.rV();
    localJg3.rV();
    localbiy1.rV();
    localbTm1.rV();
    localdRq1.rV();
    return localdRq1;
  }
}