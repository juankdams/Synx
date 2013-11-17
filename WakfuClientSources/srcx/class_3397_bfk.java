import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bfk extends cGj
{
  private static final String[] bF = new String[0];
  public static final String fsx = "gem%sWhite";
  public static final String fsy = "gem%sBrown";
  public static final String fsz = "gemStyle";
  public static final String fsA = "gemStyle2";
  public static final String fsB = "index";
  public static final String fsC = "hasGem";
  public static final String OI = "gemTypeDescription";
  private gA cgd;
  private bVw fsD;
  private final byte cXi;

  public bfk(gA paramgA, int paramInt, byte paramByte)
  {
    this.cgd = paramgA;
    r(paramInt, false);
    this.cXi = paramByte;
  }

  public String[] getFields() {
    return bF;
  }

  public void ph(int paramInt) {
    r(paramInt, true);
  }

  public gA bsG() {
    return this.cgd;
  }

  public byte VH() {
    return this.cXi;
  }

  private void r(int paramInt, boolean paramBoolean) {
    this.fsD = ((bVw)Hh.QM().dh(paramInt));
    if (paramBoolean)
      dLE.doY().a(this, czM.bF);
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("gemStyle"))
      return String.format("gem%sWhite", new Object[] { aly.dmn.name() });
    if (paramString.equals("gemStyle2"))
      return String.format("gem%sBrown", new Object[] { aly.dmn.name() });
    if (paramString.equals("index"))
      return Byte.valueOf(this.cXi);
    if (paramString.equals("hasGem"))
      return Boolean.valueOf(this.fsD != null);
    if (this.fsD != null) {
      if (paramString.equals("caracteristic")) {
        lZ locallZ = new lZ();
        ArrayList localArrayList = czM.b(this.fsD, this.cgd);
        int i = 0; for (int j = localArrayList.size(); i < j; i++) {
          if (i != 0) {
            locallZ.tH();
          }
          locallZ.a((CharSequence)localArrayList.get(i));
        }
        return locallZ.tP();
      }
      return this.fsD.getFieldValue(paramString);
    }
    if (paramString.equals("gemTypeDescription")) {
      return bU.fH().getString("gemType.description." + aly.dmn.bJ());
    }
    return null;
  }

  List bsH() {
    return this.fsD == null ? Collections.emptyList() : czM.b(this.fsD, this.cgd);
  }

  public String toString()
  {
    return "GemSlotDisplayer{m_gemItem=" + this.fsD + ", m_index=" + this.cXi + '}';
  }
}