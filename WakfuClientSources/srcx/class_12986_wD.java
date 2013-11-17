import org.apache.log4j.Logger;

public class wD extends dKf
{
  private static final Logger K = Logger.getLogger(wD.class);
  private short bmv;

  public wD(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString)
  {
    this.bmv = Short.parseShort(paramArrayOfString[0]);
  }

  public boolean f(gA paramgA)
  {
    byz localbyz = byv.bFN().bFO();

    if (localbyz.bGP().iS(paramgA.oj()) == null) {
      K.error("[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
      return false;
    }

    dLB localdLB = bCc.bKN().cm(this.bmv);
    if (localdLB == null) {
      K.warn("[ItemAction] SplitItemSetItemAction : la panoplie est inexistante id=" + this.bmv);
      return false;
    }

    boolean bool = dTX.a(localbyz, localdLB, paramgA);

    if (bool) {
      bZ(paramgA.oj());
    } else {
      aEe localaEe = new aEe(bU.fH().getString("error.itemSetSplit.notEnoughSpaceInInventory"));
      localaEe.mm(3);
      CM.LV().a(localaEe);
    }
    return true;
  }

  public void clear() {
  }

  public short FD() {
    return this.bmv;
  }
}