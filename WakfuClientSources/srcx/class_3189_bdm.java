import java.util.ArrayList;

public class bdm extends beJ
{
  public static final String foa = "governorName";
  public static final String fob = "allies";
  public static final String foc = "neutrals";
  public static final String fod = "ennemies";
  public static final String foe = "isLocalAlly";
  public static final String fof = "isLocalEnemy";
  public static final String fog = "isWaitingForAllianceResult";
  public static final String foh = "isWaitingForTruceResult";
  public static final String foi = "isWaitingForAllianceAnswer";
  public static final String foj = "isWaitingForTruceAnswer";
  public static final String[] bF = { "governorName", "allies", "neutrals", "ennemies", "isLocalAlly", "isLocalEnemy", "isWaitingForAllianceResult", "isWaitingForAllianceAnswer", "isWaitingForTruceAnswer", "isWaitingForTruceResult" };

  private ArrayList fok = new ArrayList();
  private ArrayList fol = new ArrayList();
  private ArrayList fom = new ArrayList();
  private boolean fon;
  private boolean foo;
  private boolean fop;
  private boolean foq;

  public bdm(int paramInt)
  {
    super(paramInt);
    initialize();
  }

  private void initialize() {
    aYr localaYr1 = dsh.luB.BA(this.ie);
    for (Object localObject = dsh.luB.cgk(); ((dmn)localObject).hasNext(); ) {
      ((dmn)localObject).fl();
      int i = ((dmn)localObject).zY();
      if ((i != 0) && (i != this.ie))
      {
        switch (Op.bDD[localaYr1.aMP().jq(i).ordinal()]) {
        case 1:
          this.fok.add(new beJ(i));
          break;
        case 2:
          this.fom.add(new beJ(i));
          break;
        case 3:
          this.fol.add(new beJ(i));
        }
      }
    }

    localObject = byv.bFN().bFO();
    if (localObject == null)
      return;
    aYr localaYr2 = ((byz)localObject).cJf().UI();
    dqU localdqU1 = localaYr2.aMP().jp(this.ie);
    this.fon = (localdqU1 == dqU.ltr);
    this.foo = (localdqU1 == dqU.ltq);
    dqU localdqU2 = localaYr1.aMP().jp(localaYr2.bP());
    this.fop = (localdqU2 == dqU.ltr);
    this.foq = (localdqU2 == dqU.ltq);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("governorName")) {
      dpE localdpE = dsh.luB.BA(this.ie).aNd().clp();
      return localdpE == null ? bU.fH().getString("nation.noGovernorDesc") : localdpE.getName();
    }if (paramString.equals("allies"))
      return this.fok;
    if (paramString.equals("neutrals"))
      return this.fol;
    if (paramString.equals("ennemies"))
      return this.fom;
    if (paramString.equals("isLocalAlly"))
      return Boolean.valueOf(brq() == dqU.ltr);
    if (paramString.equals("isLocalEnemy"))
      return Boolean.valueOf(brq() == dqU.ltp);
    if (paramString.equals("isWaitingForAllianceResult"))
      return Boolean.valueOf(this.fon);
    if (paramString.equals("isWaitingForAllianceAnswer"))
      return Boolean.valueOf(this.fop);
    if (paramString.equals("isWaitingForTruceAnswer"))
      return Boolean.valueOf(this.foq);
    if (paramString.equals("isWaitingForTruceResult")) {
      return Boolean.valueOf(this.foo);
    }
    return super.getFieldValue(paramString);
  }

  public boolean bro() {
    return this.fop;
  }

  public boolean brp() {
    return this.foq;
  }

  public void ez(boolean paramBoolean) {
    this.fon = paramBoolean;
  }

  public void eA(boolean paramBoolean) {
    this.foo = paramBoolean;
  }

  public dqU brq() {
    byz localbyz = byv.bFN().bFO();
    return localbyz == null ? dqU.ltq : localbyz.cJf().UI().aMP().jq(this.ie);
  }
}