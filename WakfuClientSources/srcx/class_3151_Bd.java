public class Bd
{
  public static final Bd bwT = new Bd();
  public static final int bwU = 10;
  public static final short bwV = 200;
  public static final cxg bwW = cxg.ijV;

  private dFu bwX = new dFu();

  public static short y(short paramShort)
  {
    return (short)(paramShort - paramShort % 10 + 10);
  }

  public static short z(short paramShort) {
    return (short)(paramShort + 10);
  }

  private static int a(aRQ paramaRQ, cxg paramcxg, short paramShort) {
    return bCO.G(bCO.l(paramaRQ.bJ(), (byte)paramcxg.getId()), paramShort);
  }

  private static void A(short paramShort) {
    if (paramShort % 10 != 0)
      throw new IllegalArgumentException("le niveau de gemme demandé n'est pas multiple de 10");
  }

  public void a(aRQ paramaRQ, cxg paramcxg, short paramShort, int paramInt)
  {
    A(paramShort);
    int i = a(paramaRQ, paramcxg, paramShort);
    this.bwX.fg(i, paramInt);
  }

  public bBn b(aRQ paramaRQ, cxg paramcxg, short paramShort) {
    A(paramShort);
    return Hh.QM().dh(this.bwX.get(a(paramaRQ, paramcxg, paramShort)));
  }
}