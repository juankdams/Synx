import org.apache.log4j.Logger;

public class Wj extends bVf
{
  private static final Logger K = Logger.getLogger(Wj.class);
  public static final String cGe = "AnimStatique";
  private final dMN cGf;
  private String cGg = "AnimStatique";
  private String cGh;

  private Wj(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, byte paramByte, Vc paramVc)
  {
    super(paramLong, paramFloat1, paramFloat2, paramFloat3);
    c(CG.eu(paramByte));
    this.cGf = paramVc.aby();
  }

  public void initialize() {
    this.cGf.a(this);
  }

  public void clear() {
    this.cGf.b(this);
  }

  public static Wj a(cYL paramcYL, dsc paramdsc) {
    Vc localVc = aRd.bhB().nw(paramdsc.aGs);
    int i = paramcYL.pH(paramdsc.boO);
    int j = paramcYL.pI(paramdsc.boP);
    Wj localWj = a(paramdsc.aw, paramdsc.aSg, i, j, paramdsc.aOl, paramdsc.ip, paramdsc.io, paramdsc.boN, localVc, paramdsc.cGg);
    localWj.dN(paramdsc.cGh);
    return localWj;
  }

  public static Wj a(long paramLong, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean, byte paramByte1, byte paramByte2, Vc paramVc, String paramString)
  {
    Wj localWj = new Wj(paramLong, paramFloat1, paramFloat2, paramFloat3, paramByte2, paramVc);
    String str = String.format(aRd.bhB().bgZ(), new Object[] { Integer.valueOf(paramInt) });
    localWj.em(str);
    localWj.b(str, true);
    localWj.id(dLw.mbk.asR());
    localWj.dM(paramString);
    localWj.ce(paramBoolean);
    localWj.ax((short)paramByte1);
    return localWj;
  }

  private void dM(String paramString) {
    if (dzp.qF(paramString))
      this.cGg = "AnimStatique";
    else
      this.cGg = paramString;
  }

  public String aiU()
  {
    return this.cGg;
  }

  public String aiV() {
    return this.cGh;
  }

  public void dN(String paramString) {
    this.cGh = paramString;
  }

  public dMN aiW() {
    return this.cGf;
  }
}