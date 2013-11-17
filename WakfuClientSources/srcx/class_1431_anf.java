import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class anf extends cGj
{
  private static final Logger K = Logger.getLogger(anf.class);
  public static final String dqu = "victory";
  public static final String dqv = "losers";
  public static final String dqw = "winners";
  public static final String dqx = "spells";
  public static final String dqy = "spellLevelGain";
  public static final String dqz = "summons";
  public static final String dqA = "summonLevelGain";
  public static final String dqB = "containsKamas";
  public static final String dqC = "containsTaxes";
  public static final String[] bF = { "victory", "losers", "winners", "spells", "spellLevelGain", "summons", "summonLevelGain", "containsTaxes", "containsKamas" };
  private bth dqD;
  private boolean dqE;
  private final aoL dqF = new aoL();

  private final aoL dqG = new aoL();
  private final long dqH;
  private List dqI = new ArrayList();
  private List dqJ = new ArrayList();
  private boolean dqK;
  private boolean dqL;

  public anf(Iterable paramIterable, Wr paramWr)
  {
    byz localbyz = byv.bFN().bFO();
    this.dqH = localbyz.getId();
    this.dqK = false;
    this.dqL = false;
    for (pq localpq : paramIterable) {
      if ((localpq.wH() > 0L) && (!this.dqK)) {
        this.dqK = true;
      }
      if (((!localpq.wG().isEmpty()) || (localpq.wJ() > 0L)) && (!this.dqL)) {
        this.dqL = true;
      }

      long l = localpq.eq();

      aKw localaKw = a(paramWr, l);
      Object localObject1;
      Object localObject2;
      if (l == this.dqH) {
        this.dqE = localpq.wD();
        for (localObject1 = localaKw.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Kp)((Iterator)localObject1).next();
          this.dqI.add(new cnP((Kp)localObject2, byv.bFN().bFO()));
        }
        Collections.sort(this.dqI);
        for (localObject1 = localpq.wK().aBa(); ((cHu)localObject1).hasNext(); ) {
          ((cHu)localObject1).fl();
          localObject2 = (bgl)((cHu)localObject1).value();
          this.dqJ.add(new bvJ(((bgl)localObject2).VH(), ((bgl)localObject2).bsW(), ((bgl)localObject2).bsX()));
        }
      }
      if (localpq.wD()) {
        this.dqF.put(l, new bth(localpq, localaKw));
      }
      else
        this.dqG.put(l, new bth(localpq, localaKw));
    }
  }

  private aKw a(Wr paramWr, long paramLong)
  {
    if (paramWr == null) {
      return aKw.eg(paramLong);
    }

    aKw localaKw = paramWr.cd(paramLong);

    if (localaKw == null) {
      return aKw.eg(paramLong);
    }

    return localaKw;
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if ("victory".equals(paramString))
      return Boolean.valueOf(this.dqE);
    Object[] arrayOfObject;
    if ("losers".equals(paramString)) {
      arrayOfObject = this.dqG.getValues();
      return arrayOfObject.length > 0 ? arrayOfObject : null;
    }if ("winners".equals(paramString)) {
      arrayOfObject = this.dqF.getValues();
      return arrayOfObject.length > 0 ? arrayOfObject : null;
    }if ("spells".equals(paramString))
      return this.dqI.size() > 0 ? this.dqI : null;
    if ("spellLevelGain".equals(paramString))
      return Boolean.valueOf(azP());
    if ("summons".equals(paramString))
      return this.dqJ.size() > 0 ? this.dqJ : null;
    if ("summonLevelGain".equals(paramString))
      return Boolean.valueOf(azQ());
    if ("containsKamas".equals(paramString))
      return Boolean.valueOf(this.dqK);
    if ("containsTaxes".equals(paramString)) {
      return Boolean.valueOf(this.dqL);
    }
    return null;
  }

  private boolean azP() {
    for (cnP localcnP : this.dqI) {
      if (localcnP.UW().DO() > 0) {
        return true;
      }
    }
    return false;
  }

  private boolean azQ() {
    for (bvJ localbvJ : this.dqJ) {
      if (localbvJ.bDz() > 0) {
        return true;
      }
    }
    return false;
  }
}