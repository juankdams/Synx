import org.apache.log4j.Logger;

final class dbn extends dKf
{
  private static final Logger K = Logger.getLogger(dbn.class);

  dbn(int paramInt) {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString)
  {
  }

  public boolean f(gA paramgA)
  {
    cKX localcKX = cBQ.cxL().a(String.format(bU.fH().getString("question.activate.restat"), new Object[0]), Cn.et(0), 2073L, 102, 1);

    localcKX.a(new byG(this, paramgA));

    return true;
  }

  private void aQ(gA paramgA) {
    byz localbyz = byv.bFN().bFO();

    if (localbyz.bGP().iS(paramgA.oj()) == null) {
      K.error("[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
      return;
    }

    bZ(paramgA.oj());
  }

  public void clear()
  {
  }
}