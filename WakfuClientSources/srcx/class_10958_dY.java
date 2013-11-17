import org.apache.log4j.Logger;

public abstract class dY extends dsv
{
  private static final Logger K = Logger.getLogger(dY.class);
  protected static final byte VD = 1;
  protected static final byte VE = 2;
  protected static final byte VF = 3;
  protected static final byte VG = 4;
  protected static final byte VH = 5;
  protected static final byte VI = 6;
  protected static final byte VJ = 7;
  protected static final byte VK = 8;
  protected static final byte VL = 9;
  protected static final byte VM = 10;
  protected static final byte VN = 11;
  protected static final byte VO = 12;

  public static FA a(aYQ paramaYQ, float paramFloat)
  {
    int i = paramaYQ.readByte();
    switch (i) {
    case 1:
      return cSP.kFA.r(paramaYQ, paramFloat);
    case 2:
      return csT.icF.o(paramaYQ, paramFloat);
    case 3:
      return doE.lpd.t(paramaYQ, paramFloat);
    case 4:
      return byc.gjA.j(paramaYQ, paramFloat);
    case 5:
      return aCk.dWH.g(paramaYQ, paramFloat);
    case 6:
      return bYl.hor.l(paramaYQ, paramFloat);
    case 7:
      return cbw.htd.m(paramaYQ, paramFloat);
    case 8:
      return aYb.fdL.h(paramaYQ, paramFloat);
    case 9:
      return Ki.bWB.c(paramaYQ, paramFloat);
    case 10:
      return abq.cPP.e(paramaYQ, paramFloat);
    case 11:
      return cRM.kEf.q(paramaYQ, paramFloat);
    case 12:
      return dVf.mtV.x(paramaYQ, paramFloat);
    }
    K.error("type d'affecteur inconnu " + i);
    return null;
  }
}