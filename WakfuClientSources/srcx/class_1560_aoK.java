import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aoK
{
  protected static final Logger K = Logger.getLogger(aoK.class);
  protected final aYr bwL;
  protected bda dub;
  private final cSR duc = new cSR();
  private final cSR dud = new cSR();

  public aoK(aYr paramaYr) {
    this.bwL = paramaYr;
  }

  public void a(bda parambda)
  {
    this.dub = parambda;
  }

  protected void a(int paramInt, dqU paramdqU) {
    this.dud.put(paramInt, paramdqU);
  }

  protected void jo(int paramInt) {
    this.dud.remove(paramInt);
  }

  public dqU jp(int paramInt) {
    return (dqU)this.dud.get(paramInt);
  }

  public dqU jq(int paramInt) {
    return jr(paramInt).hhO;
  }

  protected void b(int paramInt, dqU paramdqU) {
    jr(paramInt).hhO = paramdqU;
  }

  private bVJ jr(int paramInt) {
    aYr localaYr = dsh.luB.BA(paramInt);

    bVJ localbVJ = (bVJ)this.duc.get(paramInt);
    if (localbVJ != null) {
      return localbVJ;
    }

    if (localaYr != null)
      this.duc.put(paramInt, localbVJ = (bVJ)localaYr.aMP().duc.get(this.bwL.bP()));
    if (localbVJ != null) {
      return localbVJ;
    }

    this.duc.put(paramInt, localbVJ = new bVJ((this.bwL.bP() != paramInt) && (paramInt != 0) && (this.bwL.bP() != 0) ? dqU.ltq : dqU.ltr, null));

    return localbVJ;
  }

  public void clear() {
    this.duc.clear();
    this.dud.clear();
  }

  private void aAY()
  {
    if (this.dub != null)
      this.dub.brh();
  }

  public void a(aLU paramaLU)
  {
    for (dmn localdmn = this.duc.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      localObject = new aAs();
      ((aAs)localObject).bL = localdmn.zY();
      ((aAs)localObject).dSU = ((bVJ)localdmn.value()).hhO.bJ();
      paramaLU.eqN.add(localObject);
    }
    Object localObject;
    for (localdmn = this.dud.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      localObject = new dfL();
      ((dfL)localObject).bL = localdmn.zY();
      ((dfL)localObject).dSU = ((dqU)localdmn.value()).bJ();
      paramaLU.eqO.add(localObject);
    }
  }

  public void b(aLU paramaLU) {
    int i = 0;
    Object localObject;
    for (int j = paramaLU.eqN.size(); i < j; i++) {
      localObject = (aAs)paramaLU.eqN.get(i);
      b(((aAs)localObject).bL, dqU.fx(((aAs)localObject).dSU));
    }
    i = 0; for (j = paramaLU.eqO.size(); i < j; i++) {
      localObject = (dfL)paramaLU.eqO.get(i);
      this.dud.put(((dfL)localObject).bL, dqU.fx(((dfL)localObject).dSU));
    }
    aAY();
  }
}