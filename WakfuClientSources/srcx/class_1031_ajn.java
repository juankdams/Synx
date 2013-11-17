import java.util.ArrayList;
import java.util.Collection;

class ajn extends adV
{
  ajn(bqI parambqI, gA paramgA)
  {
  }

  public boolean a(cSx paramcSx)
  {
    if (paramcSx == null)
      return false;
    if (((paramcSx instanceof dMr)) && (((dMr)paramcSx).getButton() == 3)) {
      bsP.getInstance().b(CH.bGv, this, true);
      dGx.dhr().unlock();
      Rl.acN().b(this);
    } else if (((paramcSx instanceof dMr)) && (((dMr)paramcSx).getButton() == 1)) {
      dOc localdOc = bsP.getInstance().getMouseOver();
      axU localaxU = (axU)localdOc.getParentOfType(axU.class);
      if (localaxU == null)
        return false;
      Object localObject = localaxU.getItemValue();
      if (!(localObject instanceof gA)) {
        return false;
      }
      gA localgA = (gA)localObject;

      byz localbyz = byv.bFN().bFO();
      ArrayList localArrayList = localbyz.bGP().a(new dmi(localbyz));
      if (!localArrayList.contains(localgA)) {
        return false;
      }

      bqI.a(this.diC, localgA.oj());
      if (this.bcY.nP() == 1) {
        bsP.getInstance().b(CH.bGv, this, true);
        dGx.dhr().unlock();
        Rl.acN().b(this);
      }

      bqI.a(this.diC, this.bcY, localbyz);
    }
    return false;
  }
}