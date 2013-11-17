import org.apache.log4j.Logger;

public class bBb
  implements dkU
{
  protected static Logger K = Logger.getLogger(bBb.class);

  private static final bBb grS = new bBb();
  private final bmE dww = new Gk(0.0F, 0.5F, 0.5F, 1.0F);
  private final bmE dwx = new AM(0.0F, 0.5F, 0.5F, 1.0F);

  public static bBb bJL()
  {
    return grS;
  }

  public final int a(bUv parambUv)
  {
    return parambUv.cau().aCn();
  }

  public bmE aBM() {
    return this.dww;
  }

  public bmE aBN() {
    return this.dwx;
  }

  public void d(bUv parambUv) {
    String str = parambUv.ata();

    if (str.equals("AnimSaut"))
    {
      parambUv.eq(parambUv.atp());
    }
    else
    {
      parambUv.eq(parambUv.cas());
    }
  }

  public void a(bUv parambUv, CG paramCG) {
  }

  public int aBO() {
    return -1;
  }

  public void a(bUv parambUv, int paramInt, cOo paramcOo) {
    String str = parambUv.ata();

    bfZ.a(parambUv, paramInt, paramcOo, false);
  }

  public void a(bUv parambUv, int paramInt)
  {
    String str = parambUv.ata();

    if ((str.equals("AnimCourse-Fin")) || (!str.startsWith("AnimCourse")))
    {
      parambUv.eq("AnimCourse");
    }
  }

  public void b(bUv parambUv, CG paramCG) { parambUv.c(paramCG); }

  public boolean e(bUv parambUv)
  {
    return false;
  }

  public boolean c(bUv parambUv, int paramInt) {
    return Math.abs(paramInt) > 2;
  }

  public String aY() {
    return ZV.cME;
  }
}