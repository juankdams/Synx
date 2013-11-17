import org.apache.log4j.Logger;

public class ccJ extends dKf
{
  private static final Logger K = Logger.getLogger(ccJ.class);
  private long hvx;
  private short TD;

  public ccJ(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString) {
    try {
      aUG localaUG = aVj.hm(paramArrayOfString[0]);
      this.hvx = localaUG.b(null, null, null, null);
    } catch (Exception localException) {
      K.error("Impossible de parser la position : " + paramArrayOfString[0]);
    }
    this.TD = Short.parseShort(paramArrayOfString[1]);
  }

  public boolean f(gA paramgA) {
    byz localbyz = byv.bFN().bFO();

    if (localbyz.bGP().iS(paramgA.oj()) == null) {
      K.error("[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
      return false;
    }

    if (localbyz.Lk() != this.TD)
    {
      localObject = bU.fH().b(77, this.TD, new Object[0]);
      CM.LV().f(bU.fH().getString("error.mustBeOnInstanceToUse", new Object[] { localObject }), 3);
      return false;
    }

    Object localObject = aUG.eF(this.hvx);

    cCZ.cyZ().bLW();
    bSH.bZs().bLW();

    cCZ.cyZ().a(((cYk)localObject).getX(), ((cYk)localObject).getY(), ((cYk)localObject).IB(), paramgA);

    bZ(paramgA.oj());
    return true;
  }

  public void clear()
  {
  }
}