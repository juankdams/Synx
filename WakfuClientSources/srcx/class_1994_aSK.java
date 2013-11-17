import java.awt.Insets;
import java.util.ArrayList;

public class aSK extends bxE
{
  protected Insets ePX;
  protected Insets ePY;
  protected Insets ePZ;
  protected bGn eQa;
  protected Or eQb = null;

  protected boolean aQS = false;
  protected boolean eQc = false;
  protected dOc aPS;
  public static final int eQd = "margin".hashCode();
  public static final int eQe = "border".hashCode();
  public static final int eQf = "padding".hashCode();
  public static final int eQg = "shape".hashCode();

  public aSK()
  {
  }

  public aSK(dOc paramdOc)
  {
    this.aPS = paramdOc;
  }

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof dKl)) {
      paramaNL.a(CH.bGD, new aVO(this), false);

      setSpacing((dKl)paramaNL);
    }
    super.a(paramaNL);
  }

  public void setSpacing(dKl paramdKl)
  {
    if ((paramdKl instanceof bmv))
      setMargin(paramdKl.getInsets());
    else if ((paramdKl instanceof cuR))
      setPadding(paramdKl.getInsets());
    else if ((paramdKl instanceof cLv))
      setBorder(paramdKl.getInsets());
  }

  public Insets getBorder()
  {
    return this.ePY;
  }

  public void setBorder(Insets paramInsets)
  {
    this.ePY.bottom = paramInsets.bottom;
    this.ePY.top = paramInsets.top;
    this.ePY.left = paramInsets.left;
    this.ePY.right = paramInsets.right;
    this.aQS = true;
    setNeedsToPreProcess();
  }

  public Insets getMargin()
  {
    return this.ePX;
  }

  public void setMargin(Insets paramInsets)
  {
    this.ePX.bottom = paramInsets.bottom;
    this.ePX.top = paramInsets.top;
    this.ePX.left = paramInsets.left;
    this.ePX.right = paramInsets.right;
    this.aQS = true;
    setNeedsToPreProcess();
  }

  public Insets getPadding()
  {
    return this.ePZ;
  }

  public void setPadding(Insets paramInsets)
  {
    this.ePZ.bottom = paramInsets.bottom;
    this.ePZ.top = paramInsets.top;
    this.ePZ.left = paramInsets.left;
    this.ePZ.right = paramInsets.right;
    this.aQS = true;
    setNeedsToPreProcess();
  }

  public dOc getWidget()
  {
    return this.aPS;
  }

  public void setWidget(dOc paramdOc)
  {
    this.aPS = paramdOc;
    this.eQc = true;
    setNeedsToPreProcess();
    setNeedsToPostProcess();
    this.aQS = true;
  }

  public void setShape(bGn parambGn)
  {
    this.eQa = parambGn;
  }

  public bGn getShape()
  {
    return this.eQa;
  }

  public Insets getTotalInsets()
  {
    return new Insets(this.ePZ.top + this.ePY.top + this.ePX.top, this.ePZ.left + this.ePY.left + this.ePX.left, this.ePZ.bottom + this.ePY.bottom + this.ePX.bottom, this.ePZ.right + this.ePY.right + this.ePX.right);
  }

  public int getTopInset()
  {
    return this.ePZ.top + this.ePY.top + this.ePX.top;
  }

  public int getBottomInset() {
    return this.ePZ.bottom + this.ePY.bottom + this.ePX.bottom;
  }

  public int getLeftInset() {
    return this.ePZ.left + this.ePY.left + this.ePX.left;
  }

  public int getRightInset() {
    return this.ePZ.right + this.ePY.right + this.ePX.right;
  }

  private void bio()
  {
    this.eQb = new Or(this.aPS.haN.width - this.ePX.left - this.ePX.right - this.ePZ.left - this.ePZ.right - this.ePY.left - this.ePY.right, this.aPS.haN.height - this.ePX.top - this.ePX.bottom - this.ePZ.top - this.ePZ.bottom - this.ePY.top - this.ePY.bottom);
  }

  public Or getContentSize()
  {
    if (this.eQb == null) {
      bio();
    }
    return this.eQb;
  }

  public int getContentWidth()
  {
    if (this.eQb == null) {
      bio();
    }
    return this.eQb.width;
  }

  public int getContentHeight()
  {
    if (this.eQb == null) {
      bio();
    }
    return this.eQb.height;
  }

  public void invalidate()
  {
    super.invalidate();

    this.eQb = null;
  }

  public boolean bQ(int paramInt1, int paramInt2)
  {
    return this.eQa.r(paramInt1 - this.ePX.left, paramInt2 - this.ePX.bottom, this.aPS.haN.width - this.ePX.left - this.ePX.right, this.aPS.haN.height - this.ePX.bottom - this.ePX.top);
  }

  public int getOnScreenX(int paramInt1, int paramInt2)
  {
    return this.eQa.s(paramInt1, paramInt2, this.aPS.haN.width - this.ePX.left - this.ePX.right, this.aPS.haN.height - this.ePX.bottom - this.ePX.top);
  }

  public int getOnScreenY(int paramInt1, int paramInt2)
  {
    return this.eQa.t(paramInt1, paramInt2, this.aPS.haN.width - this.ePX.left - this.ePX.right, this.aPS.haN.height - this.ePX.bottom - this.ePX.top);
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);
    if (this.aQS) {
      this.aQS = false;
      invalidate();
      if ((this.aPS != null) && ((this.aPS instanceof dRq)))
      {
        ArrayList localArrayList = ((dRq)this.aPS).getWidgetChildren();
        for (int i = localArrayList.size() - 1; i >= 0; i--) {
          ((dOc)localArrayList.get(i)).setNeedsToPostProcess();
        }
      }
    }
    return bool;
  }

  public boolean r(int paramInt) {
    this.eQc = false;
    return super.r(paramInt);
  }

  public void bc()
  {
    super.bc();

    this.ePX = null;
    this.ePY = null;
    this.ePZ = null;

    this.eQa = null;

    this.aPS = null;

    this.eQb = null;
  }

  public void aJ()
  {
    super.aJ();

    this.ePX = new Insets(0, 0, 0, 0);
    this.ePY = new Insets(0, 0, 0, 0);
    this.ePZ = new Insets(0, 0, 0, 0);

    this.eQa = bGn.gCA;

    this.aQS = false;
    this.eQc = false;
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    ((aSK)parambdj).setShape(this.eQa);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == eQg)
      setShape(bGn.jJ(paramString));
    else if (paramInt == eQe)
      setBorder(paramaKN.gM(paramString));
    else if (paramInt == eQd)
      setMargin(paramaKN.gM(paramString));
    else if (paramInt == eQf)
      setPadding(paramaKN.gM(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == eQg)
      setShape((bGn)paramObject);
    else if (paramInt == eQe)
      setBorder((Insets)paramObject);
    else if (paramInt == eQd)
      setMargin((Insets)paramObject);
    else if (paramInt == eQf)
      setPadding((Insets)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}