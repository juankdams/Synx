import java.util.ArrayList;
import java.util.HashMap;

public class bpn extends dhh
{
  public static final String TAG = "Window";
  public static final String fIY = "MessageBox";
  public static final String fIZ = "titleBar";
  public static final String fJa = "label";
  public static final String fJb = "content";
  public static final String fJc = "closeButton";
  public static final String fJd = "minButton";
  public static final String fJe = "maxButton";
  private boolean bPK;
  private boolean fJf = true;
  private boolean fJg = false;
  private clA fJh;
  private boolean fJi = true;

  private boolean fJj = true;

  private ArrayList fJk = new ArrayList();
  private String fJl;
  private String fJm;
  private final ArrayList fJn = new ArrayList();

  public static final int fJo = "canBePushedToTop".hashCode();
  public static final int fJp = "movable".hashCode();
  public static final int fJq = "stickWithinDisplayBounds".hashCode();
  public static final int fJr = "stickWithinRootContainer".hashCode();
  public static final int fJs = "stickFullyWithinRootContainer".hashCode();
  public static final int fJt = "horizontalDialog".hashCode();
  public static final int fJu = "verticalDialog".hashCode();

  public void b(aNL paramaNL)
  {
    if ((paramaNL instanceof dgQ))
      a(paramaNL);
    else if ((paramaNL instanceof Jg))
      a(paramaNL);
    else if ((paramaNL instanceof NK))
      a(paramaNL);
    else if ((paramaNL instanceof aaE))
      a(paramaNL);
    else
      super.b(paramaNL);
  }

  void a(dqa paramdqa)
  {
    this.fJk.add(paramdqa);
  }

  public String getTag()
  {
    return "Window";
  }

  public ArrayList getMovePoints() {
    return this.fJk;
  }

  public boolean isMovable() {
    return this.fJj;
  }

  public void setMovable(boolean paramBoolean) {
    this.fJj = paramBoolean;
  }

  public dOc getWidgetByThemeElementName(String paramString, boolean paramBoolean)
  {
    return null;
  }

  public boolean isStickWithinDisplayBounds()
  {
    return this.fJf;
  }

  public void setStickWithinDisplayBounds(boolean paramBoolean)
  {
    this.fJf = paramBoolean;
  }

  public boolean isStickWithinRootContainer()
  {
    return this.fJf;
  }

  public void setStickWithinRootContainer(boolean paramBoolean)
  {
    this.fJf = paramBoolean;
  }

  public boolean getStickFullyWithinRootContainer() {
    return this.fJg;
  }

  public void setStickFullyWithinRootContainer(boolean paramBoolean) {
    this.fJg = paramBoolean;
  }

  public void setStickData(clA paramclA) {
    this.fJh = paramclA;
  }

  public clA getStickData() {
    return this.fJh;
  }

  public void setStyle(String paramString, boolean paramBoolean)
  {
    super.setStyle(paramString, paramBoolean);

    if (this.meX != null)
      for (dOc localdOc : this.meX.values())
      {
        localdOc.setStyle(getTag() + getStyle() + "$" + localdOc.getThemeElementName(), paramBoolean);
      }
  }

  public boolean getCanBePushedToTop()
  {
    return this.fJi;
  }

  public void setCanBePushedToTop(boolean paramBoolean)
  {
    this.fJi = paramBoolean;
  }

  public void a(dCS paramdCS)
  {
    if ((paramdCS != null) && (!this.fJn.contains(paramdCS)))
      this.fJn.add(paramdCS);
  }

  public void b(dCS paramdCS)
  {
    this.fJn.remove(paramdCS);
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);
    for (int i = this.fJn.size() - 1; i >= 0; i--) {
      ((dCS)this.fJn.get(i)).pL();
    }
    return bool;
  }

  public String getHorizontalDialog() {
    return this.fJl;
  }

  public void setHorizontalDialog(String paramString) {
    this.fJl = paramString;
  }

  public String getVerticalDialog() {
    return this.fJm;
  }

  public void setVerticalDialog(String paramString) {
    this.fJm = paramString;
  }

  public void byJ()
  {
    if (this.fJi) {
      cOP localcOP = (cOP)getParentOfType(cOP.class);
      if (localcOP != null) {
        localcOP.w(this);
        cBQ.cxL().cxQ().y(this.cUY.getId(), true);
      }
    }
  }

  private void aji() {
    a(CH.bGu, new dJx(this), true);
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    bpn localbpn = (bpn)parambdj;
    localbpn.setMovable(this.fJj);
    localbpn.fJi = this.fJi;
    localbpn.bPK = this.bPK;
    localbpn.fJf = this.fJf;
    localbpn.fJg = this.fJg;
  }

  public void bc()
  {
    super.bc();

    this.fJn.clear();

    if (this.fJh != null) {
      LJ.Wo().a(this);
      this.fJh = null;
    }

    this.fJk.clear();
  }

  public void aJ()
  {
    super.aJ();

    aId localaId = aId.checkOut();
    a(localaId);

    this.fJj = true;
    this.meQ = false;
    this.mfl = true;
    this.fJf = true;
    this.fJg = false;

    aji();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fJo)
      setCanBePushedToTop(bUD.getBoolean(paramString));
    else if (paramInt == fJp)
      setMovable(bUD.getBoolean(paramString));
    else if ((paramInt == fJq) || (paramInt == fJr))
      setStickWithinRootContainer(bUD.getBoolean(paramString));
    else if (paramInt == fJs)
      setStickFullyWithinRootContainer(bUD.getBoolean(paramString));
    else if (paramInt == fJt)
      setHorizontalDialog(paramaKN.gL(paramString));
    else if (paramInt == fJu)
      setVerticalDialog(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == fJo)
      setCanBePushedToTop(bUD.getBoolean(paramObject));
    else if (paramInt == fJp)
      setMovable(bUD.getBoolean(paramObject));
    else if ((paramInt == fJq) || (paramInt == fJr))
      setStickWithinRootContainer(bUD.getBoolean(paramObject));
    else if (paramInt == fJs)
      setStickFullyWithinRootContainer(bUD.getBoolean(paramObject));
    else if (paramInt == fJt)
      setHorizontalDialog((String)paramObject);
    else if (paramInt == fJu)
      setVerticalDialog((String)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}