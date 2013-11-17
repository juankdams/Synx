import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class cLX extends cGj
{
  private static final Logger K = Logger.getLogger(cLX.class);
  public static final String ddG = "element0";
  public static final String ddH = "element1";
  public static final String ddI = "element2";
  public static final String ddJ = "elementSupport";
  public static final String ddK = "element0Spells";
  public static final String ddL = "element1Spells";
  public static final String ddM = "element2Spells";
  public static final String ddN = "elementSupportSpells";
  public static final String ddO = "globalLevel";
  public static final String iLI = "globalRestat";
  public static final String iLJ = "globalXpValue";
  public static final String iLK = "globalXpText";
  public static final String iLL = "canValid";
  public static final String aQJ = "isDirty";
  public static final String[] bF = { "element0", "element1", "element2", "elementSupport", "element0Spells", "element1Spells", "element2Spells", "elementSupportSpells", "globalLevel", "globalRestat", "globalXpValue", "globalXpValue", "canValid", "isDirty" };

  public static final String[] aOb = new String[cay.bF.length + bF.length];
  protected bIf[] ddQ;
  protected Su ddR;
  protected cjE iLM;
  private dPx cKN;
  private static final Comparator iLN = new Uf();

  public cLX(Su paramSu, cjE paramcjE)
  {
    this.iLM = paramcjE;
    this.ddR = paramSu;
  }

  public void initialize() {
    Zp localZp = this.ddR.aet();
    this.cKN = new dPx();
    cES();
    bIf[] arrayOfbIf = bIf.c(localZp.aii());
    this.ddQ = new bIf[arrayOfbIf.length];
    for (int i = 0; i < this.ddQ.length; i++) {
      bIf localbIf = arrayOfbIf[i];
      if (this.iLM.i(localbIf.cpW))
        this.ddQ[i] = new cNq(localbIf.cpW);
      else {
        this.ddQ[i] = localbIf;
      }
    }

    dLE.doY().t("spellsRestatManager", this);
  }

  private void cES()
  {
    apX localapX1 = (apX)dLE.doY().br("editableDescribedSpell", "spellsRestatDialog");
    this.cKN.clear();
    Zp localZp = this.ddR.aet();
    for (aJp localaJp = localZp.akz(); localaJp.hasNext(); ) {
      localaJp.fl();
      byte b = localaJp.rC();
      ArrayList localArrayList = new ArrayList();
      for (cHu localcHu = ((aoL)localaJp.value()).aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        fg localfg = (fg)localcHu.value();
        apX localapX2 = (apX)byv.bFN().bFO().auK().hh(localfg.mf().getId());
        bTI localbTI = bTI.dx(b);
        if (this.iLM.i(localbTI)) {
          boI localboI = new boI(localfg.mf());
          localArrayList.add(localboI);
          this.cKN.c(b, localArrayList);
          if ((localapX1 != null) && (((dSR)localapX1.bsL()).getId() == ((dSR)localboI.bsL()).getId())) {
            dLE.doY().a("editableDescribedSpell", localboI.byq().k(false, true), "spellsRestatDialog");
          }
        }
        else if (localapX2 != null) {
          localArrayList.add(localapX2);
        } else {
          localArrayList.add(localfg.mf());
        }

      }

      Collections.sort(localArrayList, iLN);
      this.cKN.c(b, localArrayList);
    }
  }

  public Object getFieldValue(String paramString) {
    if (paramString == null) {
      return null;
    }

    if (paramString.equals("element0"))
      return this.ddQ[0];
    if (paramString.equals("element1"))
      return this.ddQ[1];
    if (paramString.equals("element2"))
      return this.ddQ[2];
    if (paramString.equals("elementSupport")) {
      return this.ddQ[3];
    }

    if (paramString.equals("element0Spells"))
      return this.cKN.bf(this.ddQ[0].bJ());
    if (paramString.equals("element1Spells"))
      return this.cKN.bf(this.ddQ[1].bJ());
    if (paramString.equals("element2Spells"))
      return this.cKN.bf(this.ddQ[2].bJ());
    if (paramString.equals("elementSupportSpells")) {
      return this.cKN.bf(this.ddQ[3].bJ());
    }

    if (paramString.equals("globalRestat")) {
      return Boolean.valueOf(this.iLM.aII() == aIt.eha);
    }

    if (paramString.equals("globalXpValue")) {
      return Float.valueOf((float)this.iLM.aIM() / (float)this.iLM.aIJ());
    }

    if (paramString.equals("globalXpText")) {
      return bU.fH().getString("xp.remaining", new Object[] { Long.valueOf(this.iLM.aIM()) });
    }

    if (paramString.equals("canValid")) {
      return Boolean.valueOf(this.iLM.aIL());
    }

    if (paramString.equals("isDirty")) {
      return Boolean.valueOf(this.iLM.aIN() > 0L);
    }

    return null;
  }

  public Iterable m(bTI parambTI) {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = (ArrayList)this.cKN.bf(parambTI.bJ());
    for (Iterator localIterator = localArrayList2.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
      if ((localObject instanceof boI))
        localArrayList1.add(((boI)localObject).byq());
      else if ((localObject instanceof apX))
        localArrayList1.add((apX)localObject);
    }
    return localArrayList1;
  }

  public String[] getFields() {
    return bF;
  }

  public cjE cET() {
    return this.iLM;
  }

  public void refresh()
  {
    cES();
    for (bIf localbIf : this.ddQ) {
      dLE.doY().a(localbIf, localbIf.getFields());
    }
    dLE.doY().a(this, bF);
  }

  static
  {
    System.arraycopy(bF, 0, aOb, 0, bF.length);
    System.arraycopy(cay.bF, 0, aOb, bF.length, cay.bF.length);
  }
}