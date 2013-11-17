import java.util.ArrayList;

public abstract class azx extends cGj
{
  public static final int YU = 1;
  public static final int dQP = 2;
  public static final String NAME = "name";
  public static final String ciu = "iconUrl";
  public static final String dCP = "style";
  public static final String TYPE = "type";
  public static final String dQQ = "remainingTime";
  public static final String dQR = "goals";
  public static final String dQS = "ranking";
  public static final String OPENED = "isOpened";
  public static final String dQT = "backgroundText";

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("iconUrl"))
      return fJ();
    if (paramString.equals("style"))
      return getStyle();
    if (paramString.equals("type"))
      return Integer.valueOf(getType());
    if (paramString.equals("remainingTime"))
      return aLi();
    if (paramString.equals("goals"))
      return aLj();
    if (paramString.equals("ranking"))
      return aLk();
    if (paramString.equals("isOpened"))
      return Boolean.valueOf(axS());
    if (paramString.equals("backgroundText")) {
      return aLh();
    }
    return null;
  }

  protected abstract String aLh();

  protected abstract String getName();

  protected abstract String fJ();

  public abstract int getType();

  public abstract int getId();

  protected abstract String aLi();

  protected abstract ArrayList aLj();

  protected abstract String aLk();

  protected abstract String getStyle();

  public boolean axS() {
    return aiM.dgK.iJ(getId());
  }

  public void cq(boolean paramBoolean) {
    aiM.dgK.k(getId(), paramBoolean);
    dLE.doY().a(this, new String[] { "isOpened" });
  }

  public void aLl() {
    dLE.doY().a(this, new String[] { "remainingTime" });
  }

  public void aLm() {
    dLE.doY().a(this, new String[] { "goals" });
  }

  public void aLn() {
    dLE.doY().a(this, new String[] { "ranking" });
  }
}