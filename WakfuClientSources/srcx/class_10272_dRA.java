import com.ankamagames.wakfu.client.WakfuClientInstance;

public class dRA
{
  public static final String PACKAGE = "wakfu.emotesInventory";

  public static void onClick(cEv paramcEv)
  {
    if ((paramcEv.mp() != CH.bGd) || (paramcEv.getButton() != 1)) {
      return;
    }
    cC localcC = (cC)paramcEv.getItemValue();
    if (!localcC.gq())
      return;
    Object localObject;
    if (paramcEv.ey())
    {
      localObject = new cMa();
      ((cMa)localObject).setItem(paramcEv.getItemValue());
      ((cMa)localObject).yx(-1);
      ((cMa)localObject).setPosition(-1);
      ((cMa)localObject).c(true);
      ((cMa)localObject).d(16700);
      cjO.clE().j((cWG)localObject);
    }
    else {
      if (!WakfuClientInstance.awy().awB().a(bmz.fEM)) {
        return;
      }
      localObject = new cQb();
      ((cQb)localObject).setMessage(localcC.gp());
      cjO.clE().j((cWG)localObject);
    }
  }

  public static void overSmiley(cEv paramcEv) {
    dLE.doY().t("overSmiley", paramcEv.getItemValue());
  }
}