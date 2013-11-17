import org.apache.log4j.Logger;

public class coC
  implements cvW
{
  private static final Logger K = Logger.getLogger(coC.class);

  public static final coC hWd = new coC();

  public static coC coE() {
    return hWd;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (paramcWG.getId())
    {
    case 17600:
      localObject1 = (dk)paramcWG;

      localObject2 = "";
      localObject3 = Cn.et(7);
      switch (dnF.cGn[localObject1.hd().ordinal()]) {
      case 1:
        localObject2 = bU.fH().getString("group.party.invitation", new Object[] { ((dk)localObject1).he() });
        localObject3 = Cn.et(3);

        localObject4 = byv.bFN().bFO();
        if (localObject4 != null) {
          dUx localdUx = bDk.bLI().cr(((byz)localObject4).Lk());
          if ((localdUx != null) && (localdUx.duy() == go.aEq))
            localObject2 = (String)localObject2 + "\n" + bU.fH().getString("group.party.leave.warn.dungeon");
        }
        break;
      }

      Object localObject4 = cBQ.cxL().a((String)localObject2, (String)localObject3, 2073L, 102, 1);

      ((cKX)localObject4).a(new dlP(this, (dk)localObject1));

      return false;
    case 17601:
      localObject1 = (djK)paramcWG;

      localObject2 = byv.bFN().bFO();
      switch (dnF.cGn[localObject1.hd().ordinal()]) {
      case 1:
        if (((byz)localObject2).bHj().Td()) {
          localObject3 = ((byz)localObject2).bHj().Ta();
          if (((Fs)localObject3).Ph() != ((byz)localObject2).getId()) {
            return false;
          }

        }

        ((byz)localObject2).bHj().ch(((djK)localObject1).getName());
      }

      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}