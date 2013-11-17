public class avW
{
  private static final avW dKY = new avW();

  public static avW aIb() {
    return dKY;
  }

  public void a(int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    String str = a(paramInt1, paramArrayOfObject);
    if (str == null) {
      return;
    }
    CM.LV().f(str, paramInt2);
  }

  public String a(int paramInt, Object[] paramArrayOfObject) {
    return bU.fH().getString(cOb.a(kB(paramInt)), paramArrayOfObject);
  }

  private cOb kB(int paramInt) {
    for (cOb localcOb : cOb.values()) {
      if (cOb.b(localcOb) == paramInt)
        return localcOb;
    }
    return cOb.kue;
  }
}