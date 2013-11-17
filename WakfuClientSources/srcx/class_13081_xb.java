public class xb
  implements doN
{
  private final bXf boY;
  private final String boZ;
  private bFB[] bpa;

  public xb(bXf parambXf, String paramString, bFB[] paramArrayOfbFB)
  {
    this.boY = parambXf;
    this.boZ = paramString;
    this.bpa = paramArrayOfbFB;
  }

  xb(bXf parambXf, String paramString) {
    this.boY = parambXf;
    this.boZ = paramString;
    this.bpa = null;
  }

  public boolean a(cSx paramcSx)
  {
    this.boY.a(this.boZ, this.bpa, new cIG[] { d(paramcSx) });
    return false;
  }

  public boolean Gg()
  {
    this.boY.a(this.boZ, this.bpa, new cIG[0]);
    return false;
  }

  public void a(bFB[] paramArrayOfbFB)
  {
    this.bpa = paramArrayOfbFB;
  }

  private cIG d(cSx paramcSx)
  {
    cIG localcIG;
    Object localObject;
    switch (doQ.cab[paramcSx.mp().ordinal()]) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
      localcIG = new cIG("event");
      localObject = (dMr)paramcSx;
      localcIG.v("button", Integer.valueOf(((dMr)localObject).getButton()));
      localcIG.v("x", Integer.valueOf(((dMr)localObject).getScreenX()));
      localcIG.v("y", Integer.valueOf(((dMr)localObject).getScreenY()));
      localcIG.v("rotation", Integer.valueOf(((dMr)localObject).dpj()));
      return localcIG;
    case 9:
      localcIG = new cIG("event");
      localObject = (awf)paramcSx;
      return localcIG;
    case 10:
      localcIG = new cIG("event");
      localObject = (cTn)paramcSx;
      bNa localbNa = ((cTn)localObject).cIX().getColor();
      localcIG.v("r", Float.valueOf(localbNa.QC()));
      localcIG.v("g", Float.valueOf(localbNa.QD()));
      localcIG.v("b", Float.valueOf(localbNa.QE()));
      localcIG.v("a", Float.valueOf(localbNa.getAlpha()));
      return localcIG;
    case 11:
      localcIG = new cIG("event");
      localObject = (bXo)paramcSx;
      localcIG.v("value", Float.valueOf(((bXo)localObject).getValue()));
      return localcIG;
    case 12:
    case 13:
    case 14:
      localcIG = new cIG("event");
      localObject = (ctH)paramcSx;
      localcIG.v("keyChar", Character.valueOf(((ctH)localObject).getKeyChar()));
      localcIG.v("keyCode", Integer.valueOf(((ctH)localObject).getKeyCode()));
      localcIG.v("modifiers", Integer.valueOf(((ctH)localObject).getModifiers()));
      return localcIG;
    }

    return null;
  }
}