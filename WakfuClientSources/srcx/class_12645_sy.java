import org.apache.log4j.Logger;

public class sy extends dDO
{
  private static final Logger K = Logger.getLogger(sy.class);
  private final ie[] bbG;

  public sy(bRc parambRc, ie[] paramArrayOfie)
  {
    super(parambRc);
    this.bbG = paramArrayOfie;
  }

  public dtv pI()
  {
    return dtv.lwh;
  }

  public void a(aIJ paramaIJ)
  {
    for (ie localie : this.bbG)
      localie.a(paramaIJ);
  }

  public void a(aLD paramaLD)
  {
    for (Object localObject2 : this.bbG) {
      if ((!cO(((bcQ)localObject2.Qw()).bqQ())) || (!cO(localObject2.pQ()))) {
        localObject2.a(paramaLD);
      }
    }

    ??? = wr();
    a(paramaLD, ((MD)???).getX(), ((MD)???).getY());
    paramaLD.refresh();
  }

  private static boolean cO(int paramInt) {
    return bnp.qn(paramInt).getX() == 1;
  }

  private static void a(aLD paramaLD, int paramInt1, int paramInt2) {
    aIJ localaIJ = paramaLD.getWorkingHavenWorld();
    short[][] arrayOfShort = localaIJ.aUI();

    for (int i = paramInt2 - 1; i <= paramInt2 + 2; i++)
      for (int j = paramInt1 - 1; j <= paramInt1 + 2; j++) {
        short s = localaIJ.a(arrayOfShort, j, i);
        if (s != 0)
        {
          new ie(new bcQ(null, j, i), s).a(paramaLD);
        }
      }
  }

  public void c(aLD paramaLD)
  {
    for (ie localie : this.bbG) {
      localie.g(paramaLD);
    }
    paramaLD.refresh();
    a(paramaLD);
  }

  public void b(aLD paramaLD)
  {
  }
}