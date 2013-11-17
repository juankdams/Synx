import org.apache.log4j.Logger;

public class ahV
{
  private static final Logger K = Logger.getLogger(ahV.class);

  private static ahV ddT = new ahV();

  private final cSR ddU = new cSR();

  public static ahV auP()
  {
    return ddT;
  }

  private ahV()
  {
    a(dzg.dcV());
    a(ef.kL());
    a(bdH.brN());
    a(aPc.bfS());
    a(aar.anu());
    a(cHp.cBR());
    a(bIw.bPD());
    a(cfw.cip());
    a(aVy.blb());
    a(duw.daf());
    a(aut.aGB());
    a(Ko.UU());
  }

  void a(cFp paramcFp) {
    if (this.ddU.containsKey(paramcFp.yR())) {
      throw new IllegalArgumentException("On ne peut pas ajouter un defaultEffect alors qu'un autre est deja enregistré avec le meme id");
    }

    this.ddU.put(paramcFp.yR(), paramcFp);
  }

  public boolean is(int paramInt) {
    return this.ddU.containsKey(paramInt);
  }

  public cFp it(int paramInt) {
    return (cFp)this.ddU.get(paramInt);
  }
}