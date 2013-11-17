import org.apache.log4j.Logger;

public class bQA
  implements chO
{
  private static final Logger K = Logger.getLogger(bQA.class);
  protected final chO gYS;
  private final dkU gYT;
  private final dkU gYU;

  public bQA(chO paramchO, dkU paramdkU1, dkU paramdkU2)
  {
    this.gYS = paramchO;
    this.gYT = paramdkU1;
    this.gYU = paramdkU2;
  }

  public dkU b(bUv parambUv, int paramInt) {
    return paramInt < parambUv.afE() ? this.gYT : this.gYU;
  }

  public void b(bUv parambUv) {
  }

  public void c(bUv parambUv) {
    parambUv.a(this.gYS);
  }

  public static chO a(boolean paramBoolean, dMM paramdMM, dkU paramdkU1, dkU paramdkU2)
  {
    if ((paramdkU1 == null) && (paramdkU2 == null))
      return dFc.dgE();
    if (paramdkU1 == null) {
      K.warn("style inconnu pour la marche");
      paramdkU1 = paramdkU2;
    }
    if (paramdkU2 == null) {
      K.warn("style inconnu pour la course");
      paramdkU2 = paramdkU1;
    }
    if (paramBoolean)
      return new Qm(paramdMM.caw(), paramdkU1, paramdkU2);
    return new bQA(paramdMM.caw(), paramdkU1, paramdkU2);
  }
}