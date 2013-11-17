import java.util.Iterator;

public class bQS extends Yi
{
  public static final int gZq = 2107;

  public bQS(Rx paramRx, cdz paramcdz)
  {
    super(paramRx, paramcdz, (byte)10);
  }

  public String Cp() {
    float f1 = 0.0F;
    apX localapX = (apX)byv.bFN().bFO().auK().hh(2107);
    if (localapX == null)
      return "";
    for (Iterator localIterator = localapX.iterator(); localIterator.hasNext(); ) { localObject = (dpI)localIterator.next();
      if (((dpI)localObject).eo() == bsj.fXk.getId()) {
        f1 = ((dpI)localObject).o(0, localapX.nU());
        break;
      }
    }
    float f2 = this.beP.value() * f1;
    Object localObject = aPf.e(bU(f1), new String[0]);
    String str = aPf.e(bU(f2), new String[0]);
    return bU.fH().getString("sacrierChrageDescription", new Object[] { localObject, str });
  }

  private String bU(float paramFloat) {
    if (paramFloat == 0.0F)
      return "0";
    String str = String.format("%.2f", new Object[] { Float.valueOf(paramFloat) });
    if (str.indexOf('.') != -1) {
      int i = str.length();
      for (int j = str.length() - 1; (j >= 0) && ((str.charAt(j) == '0') || (str.charAt(j) == '.')); j--) {
        i = j;
        if (str.charAt(j) == '.')
          break;
      }
      return str.substring(0, i);
    }
    return str;
  }
}