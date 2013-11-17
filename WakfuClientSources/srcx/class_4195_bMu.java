public abstract class bMu
{
  public int hY;
  public int hZ;
  public short aOl;
  public byte io;
  public boolean gPY;

  public int bTQ()
  {
    return this.aOl - this.io;
  }

  public boolean b(bMu parambMu) {
    return (parambMu.bTQ() <= this.aOl) && (parambMu.aOl >= this.aOl);
  }

  public static boolean a(bMu parambMu1, bMu parambMu2) {
    return (parambMu1.b(parambMu2)) || (parambMu2.b(parambMu1));
  }

  public abstract bMu a(bMu parambMu);

  protected static void a(bMu parambMu1, bMu parambMu2, bMu parambMu3) {
    if ((!bB) && ((parambMu1.hY != parambMu2.hY) || (parambMu1.hZ != parambMu2.hZ))) throw new AssertionError();
    parambMu3.hY = parambMu1.hY;
    parambMu3.hZ = parambMu1.hZ;
    parambMu3.aOl = ((short)Math.max(parambMu1.aOl, parambMu2.aOl));
    int i = Math.min(parambMu1.bTQ(), parambMu2.bTQ());
    parambMu3.io = bCO.gn(parambMu3.aOl - i);
    parambMu3.gPY = ((parambMu1.gPY) && (parambMu2.gPY));
  }
}