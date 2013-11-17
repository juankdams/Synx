import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.util.ArrayList;

public class abM extends dOc
{
  public static final String TAG = "graph";
  private bMs cQm;
  private Or cQn;
  private boolean cQo;
  private boolean cQp;
  private dwT cQq;
  public static final int cs = "content".hashCode();
  public static final int cQr = "cellSize".hashCode();

  public abM()
  {
    this.cQn = null;

    this.cQo = false;
    this.cQp = false;

    this.cQq = null;
  }

  protected void rd()
  {
    super.rd();

    this.bqm.d(this.cQm.getEntity());
  }

  public void setContent(dwT paramdwT) {
    this.cQq = paramdwT;

    this.cQm.a(paramdwT);

    this.cQp = true;
    this.cQo = true;

    setNeedsToPreProcess();
    setNeedsToPostProcess();
  }

  public void setCellSize(Or paramOr)
  {
    this.cQn = paramOr;
    this.cQm.setCellWidth(this.cQn.width);
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return true;
  }

  public String getTag()
  {
    return "graph";
  }

  public void clear() {
    this.cQm.clear();
  }

  private boolean rf()
  {
    int i = this.cQq != null ? this.cQq.dcl().size() : 0;

    int j = this.cQn.width * i;
    int k = this.cQn.height;

    Or localOr = getContentMinSize();
    if ((localOr.width == j) || (localOr.height == k)) {
      return false;
    }

    setMinSize(new Or(j, k));
    this.cQo = false;

    return true;
  }

  public void validate() {
    super.validate();
    if (this.cQm != null)
      this.cQm.a(this.haN, this.czl.getMargin(), this.czl.getBorder(), this.czl.getPadding());
  }

  public boolean bb(int paramInt)
  {
    boolean bool1 = super.bb(paramInt);

    if (this.cQo) {
      boolean bool2 = rf();
      if ((bool2) && (this.meE != null)) {
        this.meE.cfM();
        this.cQp = true;
        setNeedsToPostProcess();
      }
    }

    return bool1;
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);

    if (this.cQp) {
      this.cQm.a(this.haN, this.czl.getMargin(), this.czl.getBorder(), this.czl.getPadding());
      this.cQp = false;
    }

    return bool;
  }

  public void bc()
  {
    super.bc();

    this.cQq = null;

    this.cQn = null;
  }

  public void aJ()
  {
    super.aJ();

    Jg localJg = Jg.checkOut();
    localJg.setWidget(this);
    a(localJg);

    this.cQm = new bMs();
    this.cQm.aJ();

    this.cQo = false;
    this.cQp = false;

    this.cQn = new Or(0, 0);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cQr)
      setCellSize(paramaKN.gK(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cs)
      setContent((dwT)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}