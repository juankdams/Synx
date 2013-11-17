public class cDj
{
  private final bPu iwx = new bPu();

  public static final cDj iwy = new cDj();

  public bij dv(short paramShort)
  {
    bij localbij = (bij)this.iwx.cx(paramShort);
    if (localbij == null) {
      localbij = dx(paramShort);
    }
    return localbij;
  }

  public bij dw(short paramShort) {
    return dx(paramShort);
  }

  private bij dx(short paramShort)
  {
    bij localbij;
    this.iwx.c(paramShort, localbij = new bij());
    return localbij;
  }
}