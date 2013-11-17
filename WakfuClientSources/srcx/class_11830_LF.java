import java.util.ArrayList;

public class LF extends cGj
{
  public static final String bYv = "figures";
  public static final String NAME = "name";
  private final int bYw;
  private final ArrayList bYx;

  public LF(int paramInt)
  {
    this.bYw = paramInt;
    this.bYx = new ArrayList();
    Wl();
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("figures"))
      return this.bYx;
    if (paramString.equals("name")) {
      return bU.fH().getString("krosmoz.figure.season", new Object[] { Integer.valueOf(this.bYw) });
    }
    return null;
  }

  private void Wl() {
    this.bYx.clear();

    ArrayList localArrayList = wn.bmg.jdMethod_do(this.bYw);
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dED localdED = (dED)localArrayList.get(i);
      auG localauG = dtG.lwJ.BH(localdED.dge());
      this.bYx.add(localauG);
    }
  }
}