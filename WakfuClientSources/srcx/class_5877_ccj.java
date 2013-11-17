import org.apache.log4j.Logger;

public class ccj extends cWV
{
  private static final Logger K = Logger.getLogger(ccj.class);
  private static final int htD = 100;
  public static final int htE = 237;
  private final int htF;
  private final boolean htG;
  private final String[] htH;
  private boolean ehC;

  public ccj(ge paramge, int paramInt)
  {
    if ((!bB) && (paramge == null)) throw new AssertionError();
    if ((!bB) && (paramge.nh() == null)) throw new AssertionError("pas d'arme => utiliser plutôt BareHandAttack.getInstance()");

    if ((!bB) && (paramge.nh()[0] != azO.dRM)) throw new AssertionError("pas utilisation d'une arme");

    this.kJG = paramInt;
    this.htF = k(paramge);
    this.htG = false;
    if ((!bB) && (this.htF == 237)) throw new AssertionError();
    if ((!bB) && (this.htG) && (paramge.nj()[0] != azO.dRN)) throw new AssertionError();

    String str = bVt();
    this.htH = new String[] { "AnimStatique03-Fun" + str };
  }

  public int getType()
  {
    return 1;
  }

  public void f(cew paramcew) {
    super.f(paramcew);
    this.ehC = false;
    paramcew.eq(bts());
    paramcew.et("AnimHit");
  }

  public void g(cew paramcew) {
    if (this.ehC)
      return;
    this.ehC = true;
    String str = bVt();

    paramcew.eq(btt());
    paramcew.es("AnimStatique03-Boucle" + str);

    if (this.htF == 219)
      paramcew.et("AnimHit");
    else {
      paramcew.et("AnimHit" + str);
    }

    h(paramcew);
  }

  public void h(cew paramcew) {
    String str = bVt();
    Object localObject;
    if (this.htF == 219) {
      localObject = bBb.bJL();
    } else {
      paramcew.et("AnimHit" + str);
      localObject = new aUL((short)this.htF);
    }
    paramcew.a(new bQA(dFc.dgE(), (dkU)localObject, bBb.bJL()));
  }

  private String bVt()
  {
    return "-" + this.htF + (this.htG ? "-2" : "");
  }

  public boolean a(cWV paramcWV) {
    if (!super.a(paramcWV))
      return false;
    ccj localccj = (ccj)paramcWV;
    return (this.htF == localccj.htF) && (this.htG == localccj.htG);
  }

  public static int k(ge paramge)
  {
    ge localge = paramge;

    while (!localge.ni()) {
      localge = localge.ne();
      if (localge == null) {
        K.error("Arme pas dans la bonne catégorie " + paramge.nc());
        return 0;
      }
    }
    return localge.nc();
  }

  protected String bts() {
    return "AnimStatique03-Fin" + bVt();
  }

  protected String btt() {
    return "AnimStatique03-Debut" + bVt();
  }

  public String cfE()
  {
    return "AnimHit" + bVt();
  }

  public String[] cfF()
  {
    return this.htH;
  }
}