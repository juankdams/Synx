import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class cuk extends cGj
{
  public static final String gWY = "laws";
  public static final String ieE = "rights";
  public static final String ieF = "currentLawPoints";
  public static final String ieG = "nation";
  public final String[] bF = { "laws", "rights", "currentLawPoints", "nation" };
  private ArrayList ieH;
  private ArrayList ieI;
  private aYr ieJ;

  public cuk(bPE parambPE, aYr paramaYr)
  {
    this.ieJ = paramaYr;
  }

  private ArrayList csH() {
    if (this.ieH == null) {
      this.ieH = new ArrayList();
      cWY localcWY = this.ieJ.bnz();
      for (cHu localcHu = localcWY.cKQ(); localcHu.hasNext(); ) {
        localcHu.fl();
        dWf localdWf = (dWf)localcHu.value();
        boolean bool = localcWY.jm(localdWf.getId());
        if ((localdWf.TL() < 0) && ((((dWf)localcHu.value()).isLocked()) || (bool) || ((bPE.b(this.esd)) && (this.ieJ == bPE.bWu().UI()))))
        {
          this.ieH.add(new apD(localdWf));
        }
      }
      Collections.sort(this.ieH);
    }
    return this.ieH;
  }

  private ArrayList csI() {
    if (this.ieI == null) {
      this.ieI = new ArrayList();
      cWY localcWY = this.ieJ.bnz();
      for (cHu localcHu = localcWY.cKQ(); localcHu.hasNext(); ) {
        localcHu.fl();
        boolean bool = localcWY.jm(((dWf)localcHu.value()).getId());
        if ((((dWf)localcHu.value()).TL() > 0) && ((((dWf)localcHu.value()).isLocked()) || (bool) || ((bPE.b(this.esd)) && (this.ieJ == bPE.bWu().UI()))))
        {
          this.ieI.add(new apD((dWf)localcHu.value()));
        }
      }
      Collections.sort(this.ieI);
      Collections.reverse(this.ieI);
    }
    return this.ieI;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("laws"))
      return csH();
    if (paramString.equals("rights"))
      return csI();
    if (paramString.equals("currentLawPoints"))
      return Integer.valueOf(50 - bWC());
    if (paramString.equals("nation")) {
      return new beJ(this.ieJ.bP());
    }
    return null;
  }

  private int bWC() {
    int i = 0;
    if (bPE.c(this.esd) == null) {
      return i;
    }
    for (Iterator localIterator = bPE.c(this.esd).ieH.iterator(); localIterator.hasNext(); ) { localapD = (apD)localIterator.next();
      if (localapD.aBz())
        i += localapD.aBy().TN();
    }
    apD localapD;
    for (localIterator = bPE.c(this.esd).ieI.iterator(); localIterator.hasNext(); ) { localapD = (apD)localIterator.next();
      if (localapD.aBz()) {
        i += localapD.aBy().TN();
      }
    }
    return i;
  }

  public aYr csJ() {
    return this.ieJ;
  }
}