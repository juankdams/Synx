import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class bvD
{
  private static final Logger K = Logger.getLogger(bvD.class);
  private final cTK eQI;

  protected bvD(cTK paramcTK)
  {
    this.eQI = paramcTK;
  }

  public cTK bDq() {
    return this.eQI;
  }

  public List bDr() {
    dhJ localdhJ = (dhJ)this.eQI;
    aYr localaYr = localdhJ.cQs();
    dqU localdqU = localdhJ.cJf().UI().aMP().jq(localaYr.bP());
    if (localdqU == dqU.ltp)
      return Collections.emptyList();
    return localaYr.bnz().c(this);
  }

  public void bDs() {
    dhJ localdhJ = (dhJ)this.eQI;
    aYr localaYr = localdhJ.cQs();
    if (localaYr == null)
      return;
    dqU localdqU = localdhJ.cJf().UI().aMP().jq(localaYr.bP());
    if (localdqU == dqU.ltp)
      return;
    try {
      localaYr.bnz().b(this);
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  public abstract cge n();
}