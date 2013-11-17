import org.apache.log4j.Logger;

public class cRD
  implements dkU
{
  protected static Logger K = Logger.getLogger(cRD.class);

  private static final cRD kDV = new cRD();
  private final bmE dww = new Gk(0.0F, 0.5F, 0.5F, 1.0F);
  private final bmE dwx = new AM(0.0F, 0.5F, 0.5F, 1.0F);

  public static cRD cHZ() {
    return kDV;
  }

  public int a(bUv parambUv)
  {
    return parambUv.cav().aCn();
  }

  public bmE aBM() {
    return this.dww;
  }

  public bmE aBN() {
    return this.dwx;
  }

  public void d(bUv parambUv)
  {
    parambUv.eq(parambUv.atp());
  }

  public void a(bUv parambUv, CG paramCG) {
  }

  public int aBO() {
    return -1;
  }

  public void a(bUv parambUv, int paramInt, cOo paramcOo) {
    String str = parambUv.ata();

    bfZ.a(parambUv, paramInt, paramcOo, true);
  }

  public void a(bUv parambUv, int paramInt)
  {
    String str = parambUv.ata();
    if (!str.startsWith("AnimMarche"))
      parambUv.eq("AnimMarche");
  }

  public void b(bUv parambUv, CG paramCG)
  {
    parambUv.c(paramCG);
  }

  public boolean e(bUv parambUv) {
    return false;
  }

  public boolean c(bUv parambUv, int paramInt) {
    return Math.abs(paramInt) > 2;
  }

  public String aY() {
    return ZV.cMD;
  }
}