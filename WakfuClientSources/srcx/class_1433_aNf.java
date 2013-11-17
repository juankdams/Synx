public class aNf extends cGj
{
  public static final String NAME = "name";
  public static final String etb = "isMonster";
  public static final String etc = "items";
  public static final String etd = "hasItems";
  private boolean ete;
  private final Xg etf = new Xg();

  public aNf(aid paramaid, boolean paramBoolean) {
    this.ete = paramBoolean;

    lU locallU = dqJ.ltl.Bg(paramaid.getId());
    int k;
    if (this.ete)
      for (k : locallU.tx())
        this.etf.put(k, new Jb(k, locallU.bo(k), locallU.bp(k)));
    else
      for (k : locallU.ty())
        this.etf.put(k, new bV(k, locallU.bs(k), locallU.bt(k)));
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return this.ete ? bU.fH().getString("protector.ecosystem.monster.category") : bU.fH().getString("protector.ecosystem.resource.category");
    }

    if (paramString.equals("isMonster"))
      return Boolean.valueOf(this.ete);
    if (paramString.equals("items"))
      return this.etf;
    if (paramString.equals("hasItems")) {
      return Boolean.valueOf(this.etf.size() != 0);
    }
    return null;
  }

  public btY nj(int paramInt) {
    return (btY)this.etf.get(paramInt);
  }
}