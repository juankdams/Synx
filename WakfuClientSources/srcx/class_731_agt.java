import org.apache.log4j.Logger;

public class agt
{
  private static final Logger K = Logger.getLogger(agt.class);
  public static final float cZZ = 0.03F;
  public static final byte daa = -4;
  public static final byte dab = 4;
  public static final byte dac = 9;
  private final Xg dad = new Xg();
  private final Xg dae = new Xg();
  private final Xg daf = new Xg();

  private static final agt dag = new agt();

  public static agt arQ()
  {
    return dag;
  }

  public void aZ(int paramInt1, int paramInt2) {
    this.dad.put(paramInt1, paramInt2 + ".xps");
  }

  public String ia(int paramInt)
  {
    return (String)this.dad.get(paramInt);
  }

  public void a(int paramInt, byte paramByte, bXw parambXw) {
    aQ(paramByte).put(paramInt, parambXw);
  }

  private Xg aQ(byte paramByte) {
    return paramByte == 0 ? this.dae : this.daf;
  }

  bXw d(int paramInt, byte paramByte)
  {
    return (bXw)aQ(paramByte).get(paramInt);
  }

  public aKG a(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    bXw localbXw = d(paramInt1, paramByte2);
    return localbXw == null ? null : a((byte)paramInt2, localbXw.dy((byte)paramInt2), paramByte1);
  }

  public final aKG b(bKm parambKm)
  {
    return a(parambKm.uO(), parambKm.bRJ(), parambKm.bRK(), parambKm.xK());
  }

  public aKG b(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    bXw localbXw = d(paramInt1, paramByte2);
    return localbXw == null ? null : a((byte)paramInt2, localbXw.dz((byte)paramInt2), paramByte1);
  }

  public final aKG c(bKm parambKm)
  {
    return b(parambKm.uO(), parambKm.bRO(), parambKm.bRP(), parambKm.xK());
  }

  public aKG a(int paramInt1, int paramInt2, byte paramByte)
  {
    bXw localbXw = d(paramInt1, paramByte);
    return localbXw == null ? null : a((byte)paramInt2, localbXw.dA((byte)paramInt2), (byte)0);
  }

  public final aKG d(bKm parambKm)
  {
    return a(parambKm.uO(), parambKm.bRM(), parambKm.xK());
  }

  public aKG[] e(int paramInt, byte paramByte)
  {
    bXw localbXw = d(paramInt, paramByte);
    return localbXw == null ? null : localbXw.aey();
  }

  public aKG[] f(int paramInt, byte paramByte)
  {
    bXw localbXw = d(paramInt, paramByte);
    return localbXw != null ? localbXw.aev() : null;
  }

  public aKG[] g(int paramInt, byte paramByte)
  {
    bXw localbXw = d(paramInt, paramByte);
    return localbXw == null ? null : localbXw.aew();
  }

  public aKG[] a(int paramInt, byte paramByte1, byte paramByte2)
  {
    return a(e(paramInt, paramByte2), paramByte1);
  }

  public aKG[] b(int paramInt, byte paramByte1, byte paramByte2)
  {
    return a(f(paramInt, paramByte2), paramByte1);
  }

  public Cs h(int paramInt, byte paramByte)
  {
    Cs localCs = new Cs();
    bXw localbXw = d(paramInt, paramByte);
    if (localbXw == null)
      return null;
    localCs.w(Byte.valueOf(localbXw.ccL()));
    localCs.x(Byte.valueOf(localbXw.ccM()));
    return localCs;
  }

  public Cs i(int paramInt, byte paramByte)
  {
    Cs localCs = new Cs();
    bXw localbXw = d(paramInt, paramByte);
    if (localbXw == null)
      return null;
    localCs.w(Byte.valueOf(localbXw.ccN()));
    localCs.x(Byte.valueOf(localbXw.ccO()));
    return localCs;
  }

  public byte j(int paramInt, byte paramByte)
  {
    bXw localbXw = d(paramInt, paramByte);
    return localbXw == null ? 0 : localbXw.ccP();
  }

  public String a(int paramInt1, boolean paramBoolean, int paramInt2) {
    if ((!bB) && (paramInt1 < 0)) throw new AssertionError();
    int i = paramInt2;
    int j = c((short)paramInt1, paramBoolean) - 1;
    if (i > j)
      i = j;
    else if (i < 0) {
      i = 0;
    }
    return a("20", paramInt1, paramBoolean, i);
  }

  public String b(int paramInt1, boolean paramBoolean, int paramInt2) {
    if ((!bB) && (paramInt1 < 0)) throw new AssertionError();
    int i = paramInt2;
    int j = b((short)paramInt1, paramBoolean) - 1;
    if (i > j)
      i = j;
    else if (i < 0) {
      i = 0;
    }
    return a("21", paramInt1, paramBoolean, i);
  }

  public int a(short paramShort, byte paramByte) {
    bXw localbXw = d(paramShort, paramByte);
    return localbXw.aey().length;
  }

  public int b(short paramShort, byte paramByte) {
    bXw localbXw = d(paramShort, paramByte);
    return localbXw.aev().length;
  }

  public int c(short paramShort, byte paramByte) {
    bXw localbXw = d(paramShort, paramByte);
    return localbXw.aew().length;
  }

  public int b(short paramShort, boolean paramBoolean) {
    if ((paramShort == SB.ctD.uO()) && (paramBoolean))
      return 1;
    if (paramShort == SB.ctP.uO())
      return 1;
    if (paramShort == SB.ctQ.uO())
      return 3;
    return 5;
  }

  public int c(short paramShort, boolean paramBoolean) {
    return 3;
  }

  private static String a(String paramString, int paramInt1, boolean paramBoolean, int paramInt2) {
    StringBuilder localStringBuilder = new StringBuilder(9);
    localStringBuilder.append(paramString);
    if (paramInt1 < 10)
      localStringBuilder.append('0');
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(paramBoolean ? '0' : '1');
    localStringBuilder.append("000");
    localStringBuilder.append(paramInt2 + 1);
    return localStringBuilder.toString();
  }

  private aKG[] a(aKG[] paramArrayOfaKG, byte paramByte)
  {
    try {
      return a(paramArrayOfaKG[paramByte]); } catch (Exception localException) {
    }
    return null;
  }

  private static aKG[] a(aKG paramaKG)
  {
    aKG[] arrayOfaKG = new aKG[9];
    int i = 0;
    for (int j = -4; j <= 4; j++) {
      arrayOfaKG[i] = a((byte)paramaKG.getIndex(), paramaKG, (byte)j);
      i++;
    }
    return arrayOfaKG;
  }

  private static aKG a(byte paramByte1, aKG paramaKG, byte paramByte2)
  {
    if (paramaKG == null)
      return null;
    aKG localaKG = new aKG(paramByte1, bCO.t(paramaKG.QC() + 0.03F * paramByte2, 0.0F, 1.0F), bCO.t(paramaKG.QD() + 0.03F * paramByte2, 0.0F, 1.0F), bCO.t(paramaKG.QE() + 0.03F * paramByte2, 0.0F, 1.0F));

    localaKG.mT(paramByte2);
    return localaKG;
  }
}