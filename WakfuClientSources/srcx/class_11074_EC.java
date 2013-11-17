import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;

class EC extends dkP
{
  private final UG iM;
  private final int bdj;
  private final QZ bJQ;

  EC(arl paramarl)
  {
    this.iM = paramarl.LB();
    this.bdj = paramarl.getId();
    this.bJQ = new QZ(this.iM);
  }

  public void clear()
  {
    super.clear();
    this.bJQ.clear();
  }

  public boolean a(Entity paramEntity, boolean paramBoolean)
  {
    return this.iM.aq(bCO.bC(paramEntity.mnQ), bCO.bC(paramEntity.mnR));
  }

  public boolean c(ahm paramahm)
  {
    return paramahm.aeR() == this.bdj;
  }

  public void a(adG paramadG, ArrayList paramArrayList)
  {
    this.bJQ.p(paramArrayList);
    for (Entity localEntity : this.bJQ.acD())
      paramadG.c(localEntity, true);
  }
}