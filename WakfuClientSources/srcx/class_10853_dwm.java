import org.apache.log4j.Logger;

public class dwm extends bQf
  implements bWU
{
  protected static final Logger K = Logger.getLogger(dwm.class);
  protected dxK lBs;
  protected dsj lBt;
  protected short lBu;
  private static final aee bx = new bOO(new id());

  public static dwm a(bHF parambHF, dxK paramdxK, long paramLong, dsj paramdsj, short paramShort)
  {
    dwm localdwm;
    try
    {
      localdwm = (dwm)bx.Mm();
      localdwm.aOr = bx;
    } catch (Exception localException) {
      K.error("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + localException.getMessage());
      localdwm = new dwm();
    }
    localdwm.b(parambHF, paramdxK, paramLong, paramdsj, paramShort);
    return localdwm;
  }

  private void b(bHF parambHF, dxK paramdxK, long paramLong, dsj paramdsj, short paramShort) {
    b(parambHF, bzG.goh);
    this.lBs = paramdxK;
    this.dES = paramLong;
    this.lBt = paramdsj;
    this.lBu = paramShort;
  }

  public dxK dbo() {
    return this.lBs;
  }

  public dsj dbp() {
    return this.lBt;
  }

  public short dbq() {
    return this.lBu;
  }
}