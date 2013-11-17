import org.apache.log4j.Logger;

public class xW
{
  private static final Logger K = Logger.getLogger(xW.class);

  public static dKf a(int paramInt, dmX paramdmX) {
    if (paramdmX == null)
    {
      K.error("Impossible de créer une action d'item à partir d'une constante 'null'", new IllegalArgumentException());
      return null;
    }
    switch (chl.hFC[paramdmX.ordinal()]) {
    case 1:
      return new bqI(paramInt);
    case 2:
      return new alo(paramInt);
    case 3:
      return new IO(paramInt);
    case 4:
      return new aoq(paramInt);
    case 5:
      return new cvR(paramInt);
    case 6:
      return new xx(paramInt);
    case 7:
      return new Xs(paramInt);
    case 8:
      return new MY(paramInt);
    case 9:
      return new axd(paramInt);
    case 10:
      return new dCv(paramInt);
    case 11:
      return new dDX(paramInt);
    case 12:
      return new cVy(paramInt);
    case 13:
      return new bAa(paramInt);
    case 14:
      return new ccJ(paramInt);
    case 15:
      return new cGW(paramInt);
    case 16:
      return new GK(paramInt);
    case 17:
      return new bgh(paramInt);
    case 18:
      return new cin(paramInt);
    case 19:
      return new cux(paramInt);
    case 20:
      return new ciI(paramInt);
    case 21:
      return new dHe(paramInt);
    case 22:
      return new bsg(paramInt);
    case 23:
      return new bxK(paramInt);
    case 24:
      return new Bo(paramInt);
    case 25:
      return new wD(paramInt);
    case 26:
      return new qz(paramInt);
    case 27:
      return new dpu(paramInt);
    case 28:
      return new duP(paramInt);
    case 29:
      return new anP(paramInt);
    case 30:
      return new aSR(paramInt);
    case 31:
      return new amG(paramInt);
    case 32:
      return new dbn(paramInt);
    case 33:
      return new aIZ(paramInt);
    case 34:
      return new Fu(paramInt);
    case 35:
      return new cEj(paramInt);
    case 36:
      return new dxf(paramInt);
    case 37:
      return new are(paramInt);
    }
    return null;
  }
}