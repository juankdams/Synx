import org.apache.log4j.Logger;

public class ahL
{
  private static final Logger K = Logger.getLogger(ahL.class);

  private static final ahL ddA = new ahL();

  private final int ddB = 11;
  private final int ddC = 59;
  private final int ddD = 12;
  private final int ddE = 60;

  private static final aeq ddF = new aeq(true);

  public static ahL auH()
  {
    return ddA;
  }

  private String iq(int paramInt) {
    paramInt = bCO.J(paramInt, 0, 11);
    try {
      return String.format(ay.bd().getString("guildBlazonBackgroundPartPath"), new Object[] { Integer.valueOf(paramInt) });
    } catch (bdh localbdh) {
      K.warn("Impossible de trouver la propriété guildBlazonBackgroundPartPath");
    }

    return null;
  }

  private String ir(int paramInt) {
    paramInt = bCO.J(paramInt, 0, 59);
    try {
      return String.format(ay.bd().getString("guildBlazonForegroundPartPath"), new Object[] { Integer.valueOf(paramInt) });
    } catch (bdh localbdh) {
      K.warn("Impossible de trouver la propriété guildBlazonForegroundPartPath");
    }

    return null;
  }

  public uz a(dTN paramdTN)
  {
    long l = paramdTN.dtJ();
    uz localuz = tq.Bg().aw(l);
    if (localuz != null) {
      return localuz;
    }

    String[] arrayOfString = new String[2];
    arrayOfString[0] = iq(paramdTN.dtE());
    arrayOfString[1] = ir(paramdTN.dtF());

    crX localcrX = new crX();
    localcrX.A(arrayOfString);

    ddF.b(paramdTN.dtH().bUL(), paramdTN.dtH().bUM(), paramdTN.dtH().bUN(), paramdTN.dtH().bUK());

    localcrX.a(0, ddF);
    ddF.b(paramdTN.dtG().bUL(), paramdTN.dtG().bUM(), paramdTN.dtG().bUN(), paramdTN.dtG().bUK());

    localcrX.a(1, ddF);
    localcrX.cqz();

    localuz = tq.Bg().b(dHL.lSB.dhZ(), l, localcrX, true);
    localcrX.axl();
    return localuz;
  }

  public dTN auI() {
    int i = bCO.cL(0, 12);
    int j = bCO.cL(0, 60);

    int k = boJ.byr().DK();
    bNa localbNa1 = boJ.byr().db(bCO.sf(k));
    bNa localbNa2 = boJ.byr().db(bCO.sf(k));

    return new dTN((byte)i, (byte)j, localbNa1, localbNa2);
  }

  public void b(dTN paramdTN) {
    byte b = paramdTN.dtE();
    b = (byte)((b + 1) % 12);
    paramdTN.fX(b);
  }

  public void c(dTN paramdTN) {
    byte b = paramdTN.dtE();
    b = (byte)((12 + b - 1) % 12);
    paramdTN.fX(b);
  }

  public void d(dTN paramdTN) {
    byte b = paramdTN.dtF();
    b = (byte)((b + 1) % 60);
    paramdTN.fY(b);
  }

  public void e(dTN paramdTN) {
    byte b = paramdTN.dtF();
    b = (byte)((60 + b - 1) % 60);
    paramdTN.fY(b);
  }
}