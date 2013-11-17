public class dGu
{
  public static dxL a(short paramShort, dAi paramdAi, long paramLong)
  {
    if (paramdAi.ddz()) {
      return null;
    }

    bij localbij = cDj.iwy.dv(paramShort);
    int i = localbij.btY();
    float f = (100 + i) / 100.0F;
    kb localkb = new kb(paramdAi.ddy());
    localkb.v(f);

    return cYq.jq(paramLong).n(localkb);
  }

  public static boolean a(short paramShort, cuF paramcuF) {
    dAi localdAi = ars.dzL.aN(paramcuF.adj().nc());
    if (localdAi == null) {
      return false;
    }

    dxL localdxL = a(paramShort, localdAi, paramcuF.rb());
    return (localdxL == null) || (!localdxL.S(dDE.dft().VN()));
  }

  public static int a(cUh paramcUh, short paramShort) {
    int i = paramcUh.cJu();
    bij localbij = cDj.iwy.dv(paramShort);
    if (localbij == null) {
      return i;
    }

    return bCO.gq(()(i * (100.0D + localbij.bua()) / 100.0D));
  }

  public static int b(cUh paramcUh, short paramShort) {
    int i = paramcUh.cJw();
    bij localbij = cDj.iwy.dv(paramShort);
    if (localbij == null) {
      return i;
    }

    return bCO.gq(()(i * (100.0D + localbij.bub()) / 100.0D));
  }

  public static long a(aXL paramaXL, bBg parambBg) {
    return Math.max(0L, a(paramaXL.adj(), parambBg.D()) - parambBg.bJT());
  }

  public static int b(aXL paramaXL, bBg parambBg) {
    return Math.max(0, b(paramaXL.adj(), parambBg.D()) - parambBg.arM());
  }

  public static int c(aXL paramaXL, bBg parambBg) {
    return Math.max(0, paramaXL.adj().cJv() - parambBg.bJW());
  }

  public static boolean a(aXL paramaXL, bBg parambBg, boolean paramBoolean) {
    cUh localcUh = paramaXL.adj();
    bOB localbOB = paramaXL.bna();
    if (localbOB.aTB() <= 0) {
      return true;
    }

    aPA localaPA = new aPA(localcUh.nc());
    parambBg.o(localaPA);
    int i = localaPA.getCount();
    if (paramBoolean) {
      i--;
    }

    int j = localbOB.aTB() - i;
    return j > 0;
  }

  public static ajZ d(aXL paramaXL, bBg parambBg) {
    ajZ localajZ = new ajZ(parambBg, paramaXL.adj().nc());
    return localajZ;
  }
}