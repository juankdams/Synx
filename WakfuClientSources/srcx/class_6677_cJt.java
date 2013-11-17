import java.util.ArrayList;
import java.util.List;

public class cJt
  implements cfr
{
  private List iHw = null;
  private StringBuffer iHx = null; private StringBuffer iHy = null;
  private boolean isClosed = false; private boolean iHz = false;
  private EJ iHA = null;
  private int startIndex = -1; private int endIndex = -1;
  private int tokenIndex = -1;

  void cDA()
  {
    if (this.iHw == null)
      this.iHw = new ArrayList();
    this.iHw.clear();
    this.iHx = new StringBuffer("");
    this.iHy = new StringBuffer("");
    this.isClosed = false;
    this.iHz = false;
    this.iHA = null;
    this.startIndex = -1;
    this.endIndex = -1;
  }

  public List cio() {
    return this.iHw;
  }

  void K(List paramList) {
    this.iHw = paramList;
  }

  void a(bYz parambYz) {
    if (this.iHw == null)
      this.iHw = new ArrayList();
    this.iHw.add(parambYz);
  }

  void addAttribute(String paramString1, String paramString2) {
    if (this.iHw == null)
      this.iHw = new ArrayList();
    this.iHw.add(new bYz(paramString1, paramString2));
  }

  public String getTagName() {
    return this.iHx.toString();
  }

  void nw(String paramString) {
    this.iHx = new StringBuffer(paramString);
  }

  void T(char paramChar) {
    this.iHx.append(paramChar);
  }

  public boolean cin() {
    return this.isClosed;
  }

  void ik(boolean paramBoolean) {
    this.isClosed = paramBoolean;
  }

  public boolean cim() {
    return this.iHz;
  }

  void il(boolean paramBoolean) {
    this.iHz = paramBoolean;
  }

  public int DG() {
    return this.endIndex;
  }

  void xY(int paramInt) {
    this.endIndex = paramInt;
  }

  public EJ DH() {
    return this.iHA;
  }

  void a(EJ paramEJ) {
    this.iHA = paramEJ;
  }

  public int DI() {
    return this.startIndex;
  }

  void setStartPosition(int paramInt) {
    this.endIndex = paramInt;
  }

  public String DJ()
  {
    String str = "<";
    if (this.isClosed) str = str + "/";
    str = str + this.iHx;

    if ((this.iHw != null) && (this.iHw.size() > 0)) {
      for (bYz localbYz : this.iHw) {
        str = str + " " + localbYz.getAttrName() + "=\"" + localbYz.cds() + "\"";
      }
    }

    if (this.iHz) str = str + "/";

    return str + ">";
  }

  void nx(String paramString) {
    this.iHy = new StringBuffer(paramString);
  }

  public String toString() {
    String str = "[TAG]";
    if (this.isClosed) str = str + "/";
    str = str + this.iHx + "(";
    if (this.iHw != null) {
      for (bYz localbYz : this.iHw)
        str = str + localbYz.getAttrName() + ":" + localbYz.cds() + " ";
    }
    str = str.trim();
    str = str + ")";
    return str;
  }

  void setIndex(int paramInt) {
    this.tokenIndex = paramInt;
  }

  public int getIndex() {
    return this.tokenIndex;
  }
}