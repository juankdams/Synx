import org.apache.log4j.Logger;

public class cXA extends bxG
{
  private final int kKP;
  private final boolean aCl;

  public cXA(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.kKP = paramInt5;
    this.aCl = paramBoolean;
  }

  protected long mC()
  {
    if (mD() == null) {
      K.error("[SPEAK] On déclenche une action de combat alors qu'il n'y a plus de combat");
      return 0L;
    }

    long l = bwv();
    Su localSu = mD().dg(l);
    String str1 = localSu.getName();
    String str2 = bU.fH().b(47, this.kKP, new Object[0]);

    aEe localaEe = new aEe(str1, l, str2);
    localaEe.mm(1);
    CM.LV().a(localaEe);

    return this.aCl ? 750L : 0L;
  }
}