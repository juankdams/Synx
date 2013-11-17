import com.ankamagames.wakfu.client.console.command.debug.HideEntitiesCommand;

public class chi
  implements cjA
{
  public chi(HideEntitiesCommand paramHideEntitiesCommand)
  {
  }

  public boolean aX(Object paramObject)
  {
    if (!(paramObject instanceof cew)) {
      return false;
    }
    Su localSu = ((cew)paramObject).cbD();

    if (((HideEntitiesCommand.ksw & 0x1) == 1) && ((localSu instanceof byo))) {
      return true;
    }
    if (((HideEntitiesCommand.ksw & 0x2) == 2) && ((localSu instanceof bKm)) && (!localSu.aeI()))
      return true;
    if (((HideEntitiesCommand.ksw & 0x4) == 4) && (localSu.aeI())) {
      return true;
    }
    return false;
  }
}