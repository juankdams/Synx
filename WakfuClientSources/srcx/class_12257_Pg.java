import org.apache.log4j.Logger;

public class Pg extends csi
{
  private static Pg cgW;
  private static final Logger K = Logger.getLogger(Pg.class);

  protected air cgX = new air();
  protected byte aHn;
  protected int aSg;

  public static Pg abf()
  {
    return cgW;
  }

  public static void a(Pg paramPg) {
    if (cgW == null)
      cgW = paramPg;
  }

  public Pg b(short paramShort1, String paramString, int paramInt, short paramShort2, dhJ paramdhJ, dCi paramdCi) {
    return new Pg(paramShort1, paramString, paramInt, paramShort2, paramdhJ, paramdCi);
  }

  public Pg Sm() {
    return new Pg();
  }

  public Pg a(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return new Pg(paramShort, paramadL, parambPr, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  public Pg()
  {
  }

  protected Pg(short paramShort, adL paramadL, bPr parambPr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
  }

  protected Pg(short paramShort1, String paramString, int paramInt, short paramShort2, dhJ paramdhJ, dCi paramdCi)
  {
    super(paramShort1, paramString, paramInt, paramShort2, paramdhJ.nU());
    setName(paramdhJ.getName());

    azp localazp = paramdhJ.cQY();
    for (eu localeu : eu.values())
      if (localazp.c(localeu))
      {
        if (this.cgX.c(localeu))
        {
          this.cgX.d(localeu).a((Rx)localazp.a(localeu));
        }
      }
  }

  public void b(dhJ paramdhJ1, dhJ paramdhJ2)
  {
    super.b(paramdhJ1, paramdhJ2);

    m(paramdhJ1);
    n(paramdhJ1);
    paramdhJ1.a(dKm.lXl);
  }

  private void m(dhJ paramdhJ) {
    paramdhJ.cQY().a(this.cgX);
  }

  private void n(dhJ paramdhJ) {
  }

  public byte xK() {
    return this.aHn;
  }

  public boolean a(aof paramaof) {
    paramaof.clear();
    super.a(paramaof);
    paramaof.dsL = new OY();
    paramaof.dsL.cgo.bUn = this.aHn;
    paramaof.dsL.cgo.bUm = this.aSg;

    this.cgX.a(paramaof.dsL.cgo.bUo);
    return true;
  }

  public boolean b(aof paramaof) {
    boolean bool = super.b(paramaof);
    this.aHn = paramaof.dsL.cgo.bUn;
    this.aSg = paramaof.dsL.cgo.bUm;

    this.cgX.b(paramaof.dsL.cgo.bUo);
    return bool;
  }
}