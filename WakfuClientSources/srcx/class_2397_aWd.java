import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public abstract class aWd extends duS
  implements ClipboardOwner
{
  private static final int fbe = 50;
  protected doN cGQ;
  private long fbf = 0L;
  protected boolean fbg = false;
  private boolean fbh = false;
  private cDG fbi = null;

  private boolean fbj = false;

  public static final int fbk = "selectable".hashCode();
  public static final int fbl = "selectOnFocus".hashCode();
  public static final int fbm = "enableOnlySelectablePartInteraction".hashCode();

  public boolean getSelectable()
  {
    return getTextBuilder().bYk();
  }

  public void setSelectable(boolean paramBoolean)
  {
    getTextBuilder().setSelectable(paramBoolean);
    setFocusable(paramBoolean);

    if (paramBoolean)
      setCursorType(duv.lyo);
    else
      setCursorType(duv.lyl);
  }

  public boolean isSelectOnFocus()
  {
    return this.fbj;
  }

  public void setSelectOnFocus(boolean paramBoolean)
  {
    this.fbj = paramBoolean;
  }

  public boolean isEnableOnlySelectablePartInteraction() {
    return this.fbh;
  }

  public void setEnableOnlySelectablePartInteraction(boolean paramBoolean) {
    this.fbh = paramBoolean;
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    this.fbi = null;

    if (this.fnH) {
      return null;
    }

    if ((!this.aYZ) || (this.meQ) || (!getAppearance().bQ(paramInt1, paramInt2)) || (bsP.getInstance().isMovePointMode())) {
      return null;
    }

    this.fbi = getContentBlockUnderMouse(paramInt1, -paramInt2);
    if ((this.fbh) && ((this.fbi == null) || (this.fbi.czB() != cUE.kHp) || (((aBV)this.fbi).aOd() == null) || (((aBV)this.fbi).aOd().getId() == null)))
    {
      return null;
    }

    return this;
  }

  public cDG getBlockUnderMouse() {
    return this.fbi;
  }

  public void bc()
  {
    super.bc();

    this.fbi = null;

    bsP.getInstance().b(CH.bGv, this.cGQ, false);
  }

  public void aJ()
  {
    super.aJ();
    this.fbh = false;
    aji();
  }

  public void selectAll()
  {
    if (getSelectable())
    {
      atq localatq = getTextBuilder().bYe();
      if (localatq.isEmpty())
      {
        getTextBuilder().aFi();
      }

      getTextBuilder().c(localatq.aFo(), 0);

      ddB localddB = localatq.aFp();
      getTextBuilder().d(localddB, localddB.cms());
    }
  }

  private Point getOrientedMouseCoodinates(dMr paramdMr)
  {
    int i = 0;
    int j = 0;

    switch (Tm.cwd[getTextBuilder().getOrientation().ordinal()])
    {
    case 1:
      i = paramdMr.z(this) - this.czl.getBottomInset();
      j = this.haN.width - paramdMr.y(this) - this.czl.getLeftInset() - this.czl.getRightInset();
      break;
    case 2:
      i = paramdMr.y(this) - this.czl.getLeftInset();
      j = paramdMr.z(this) - this.czl.getBottomInset();
      break;
    case 3:
      i = this.haN.height - paramdMr.z(this) - this.czl.getBottomInset() - this.czl.getTopInset();
      j = paramdMr.y(this) - this.czl.getLeftInset();
      break;
    case 4:
      i = this.haN.width - paramdMr.y(this) - this.czl.getLeftInset() - this.czl.getRightInset();
      j = this.haN.height - paramdMr.z(this) - this.czl.getBottomInset() - this.czl.getTopInset();
    }

    return new Point(i, j);
  }

  protected void aji()
  {
    a(CH.bGc, new cGH(this), false);

    this.cGQ = new cGG(this);

    bsP.getInstance().a(CH.bGv, this.cGQ, false);

    a(CH.bGu, new cGK(this), false);

    a(CH.bGq, new cGJ(this), false);

    a(CH.bGs, new cGS(this), false);

    a(CH.bGo, new cGR(this), false);

    a(CH.bGt, new cGU(this), false);

    a(CH.bGi, new cGT(this), true);

    a(CH.bGh, new cGO(this), true);

    a(CH.bGj, new Tk(this), true);
  }

  public cDG getContentBlockUnderMouse(dMr paramdMr)
  {
    if (paramdMr.cIl() != this) {
      return null;
    }

    Point localPoint = getOrientedMouseCoodinates(paramdMr);
    return getContentBlockUnderMouse(localPoint.x, -localPoint.y);
  }

  private cDG getContentBlockUnderMouse(int paramInt1, int paramInt2) {
    Cs localCs = getTextBuilder().df(paramInt1, paramInt2);
    return localCs == null ? null : (cDG)localCs.getFirst();
  }

  protected void a(Gy paramGy)
  {
    this.fbf = (paramGy.getFocused() ? System.currentTimeMillis() : 0L);
    if (!paramGy.getFocused())
    {
      getTextBuilder().bYw();
    }
  }

  protected void a(cDG paramcDG, int paramInt)
  {
    if (this.fbg) {
      selectAll();
      this.fbf = 0L;
      this.fbg = false;
    }
  }

  protected void b(cDG paramcDG, int paramInt)
  {
    this.fbg = ((System.currentTimeMillis() - this.fbf < 50L) && (this.fbj));

    if ((!this.fbg) && (getSelectable()))
    {
      getTextBuilder().c(paramcDG.aOi(), paramcDG.getStartIndex() + paramInt);
      getTextBuilder().d(paramcDG.aOi(), paramcDG.getStartIndex() + paramInt);
    }
  }

  protected void c(cDG paramcDG, int paramInt)
  {
    this.fbf = 0L;
    this.fbg = false;

    if (getSelectable())
    {
      getTextBuilder().d(paramcDG.aOi(), paramcDG.getStartIndex() + paramInt);
    }
  }

  protected boolean a(ctH paramctH) {
    return false;
  }

  protected boolean b(ctH paramctH)
  {
    switch (paramctH.getKeyCode()) {
    case 37:
      if ((paramctH.ey()) || (paramctH.ez()) || (paramctH.eB()))
      {
        return true;
      }
      if (paramctH.ex()) {
        m(true, paramctH.eA());
        return false;
      }
      getTextBuilder().bYy();
      if (!paramctH.eA()) {
        getTextBuilder().bYg();
      }
      bsP.getInstance().setKeyEventConsumed(true);
      return false;
    case 39:
      if ((paramctH.ey()) || (paramctH.ez()) || (paramctH.eB()))
      {
        return true;
      }
      if (paramctH.ex()) {
        m(false, paramctH.eA());
        return false;
      }
      getTextBuilder().bYx();
      if (!paramctH.eA()) {
        getTextBuilder().bYg();
      }
      bsP.getInstance().setKeyEventConsumed(true);
      return false;
    case 36:
      getTextBuilder().bYz();
      if (!paramctH.eA()) {
        getTextBuilder().bYg();
      }
      bsP.getInstance().setKeyEventConsumed(true);
      return false;
    case 35:
      getTextBuilder().bYA();
      if (!paramctH.eA()) {
        getTextBuilder().bYg();
      }
      bsP.getInstance().setKeyEventConsumed(true);
      return false;
    case 67:
      if (paramctH.ex())
      {
        if (!getTextBuilder().bYe().aFm()) {
          blY();
        }
        bsP.getInstance().setKeyEventConsumed(true);
        return false;
      }
      break;
    }

    return true;
  }

  private void m(boolean paramBoolean1, boolean paramBoolean2)
  {
    atq localatq = getTextBuilder().bYe();
    int i = paramBoolean1 ? localatq.aFs() : localatq.aFw();
    int j = localatq.aFv();
    int k = i;
    for (int m = j; paramBoolean1 ? m >= 0 : m < localatq.aFH(); m += (paramBoolean1 ? -1 : 1)) {
      ddB localddB = localatq.kg(j);
      if (localddB.cOJ() == bY.QQ) {
        localatq.a(localddB, 0);
        localatq.b(localddB, 0);
      } else if (localddB.cOJ() == bY.QP) {
        String str = ((ckA)localddB).getText();
        int n = 0;
        int i1 = 1;
        int i2 = k >= str.length() ? ' ' : str.charAt(k);
        while (n == 0) {
          k += (paramBoolean1 ? -1 : 1);
          if ((k < 0) || (k > str.length() - 1))
            break;
          int i3 = str.charAt(k);
          n = (i2 == 32) && (i3 != 32) ? 1 : paramBoolean1 ? 0 : (i2 != 32) && (i3 == 32) && (i1 == 0) ? 1 : 0;
          i1 = 0;
          i2 = i3;
        }
        if (k < 0)
          k = paramBoolean1 ? 0 : str.length();
        else if (k > str.length())
          k = str.length();
        else {
          k += (paramBoolean1 ? 1 : 0);
        }
        if (!paramBoolean2)
          getTextBuilder().c(localddB, k);
        getTextBuilder().d(localddB, k);

        break;
      }
    }
  }

  protected boolean c(ctH paramctH)
  {
    if (paramctH.ex()) {
      bsP.getInstance().setKeyEventConsumed(true);
      bsP.getInstance().setMovePointMode(false);
      return false;
    }
    return true;
  }

  public void lostOwnership(Clipboard paramClipboard, Transferable paramTransferable)
  {
  }

  protected void blY()
  {
    String str = getTextBuilder().bYe().getSelectedText();
    if ((str != null) && (str.length() != 0))
    {
      Clipboard localClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      StringSelection localStringSelection = new StringSelection(str);
      localClipboard.setContents(localStringSelection, this);
    }
  }

  public void c(bdj parambdj)
  {
    aWd localaWd = (aWd)parambdj;
    super.c(localaWd);
    localaWd.fbj = this.fbj;
    localaWd.setSelectable(getTextBuilder().bYk());
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fbk)
      setSelectable(bUD.getBoolean(paramString));
    else if (paramInt == fbl)
      setSelectOnFocus(bUD.getBoolean(paramString));
    else if (paramInt == fbm)
      setEnableOnlySelectablePartInteraction(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == fbk)
      setSelectable(bUD.getBoolean(paramObject));
    else if (paramInt == fbl)
      setSelectOnFocus(bUD.getBoolean(paramObject));
    else if (paramInt == fbm)
      setEnableOnlySelectablePartInteraction(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}