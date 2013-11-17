import java.util.ArrayList;
import org.apache.log4j.Logger;

public class buA extends bxE
{
  private static Logger K = Logger.getLogger(buA.class);
  public static final String TAG = "TabItem";
  private aHd gdV = null;
  private dRq gdW = null;

  private aAR gdX = null;

  private String hi = null;

  private Boolean gdY = Boolean.valueOf(true);
  private boolean aYZ = true;
  private final ArrayList gdZ = new ArrayList();

  public static final int fyW = "text".hashCode();

  public static final int czn = "enabled".hashCode();

  public static final int gea = "visible".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof dRq)) {
      this.gdW = ((dRq)paramaNL);

      return;
    }
    if ((paramaNL instanceof aAR)) {
      if (this.gdV != null) {
        this.gdV.setPixmap((aAR)paramaNL);
      }
      this.gdX = ((aAR)paramaNL);
    }
    super.a(paramaNL);
  }

  public void a(djl paramdjl) {
    if (!this.gdZ.contains(paramdjl))
      this.gdZ.add(paramdjl);
  }

  public void b(djl paramdjl) {
    this.gdZ.remove(paramdjl);
  }

  public void fp(boolean paramBoolean) {
    for (int i = this.gdZ.size() - 1; i >= 0; i--)
      ((djl)this.gdZ.get(i)).iU(paramBoolean);
  }

  public String getTag()
  {
    return "TabItem";
  }

  public aHd getButton() {
    return this.gdV;
  }

  public void setButton(aHd paramaHd) {
    this.gdV = paramaHd;
    this.gdV.setEnabled(this.gdY.booleanValue());
    this.gdV.setVisible(this.aYZ);
    fp(this.aYZ);
    if (this.hi != null)
      this.gdV.setText(this.hi);
  }

  public dRq getData()
  {
    return this.gdW;
  }

  public void setData(dRq paramdRq) {
    this.gdW = paramdRq;
  }

  public String getText() {
    return this.hi;
  }

  public void setText(String paramString) {
    this.hi = paramString;
    if (this.gdV != null)
      this.gdV.setText(this.hi);
  }

  private void setEnabled(boolean paramBoolean)
  {
    this.gdY = Boolean.valueOf(paramBoolean);
    if (this.gdV != null)
      this.gdV.setEnabled(this.gdY.booleanValue());
  }

  private void setVisible(boolean paramBoolean) {
    boolean bool = paramBoolean != this.aYZ;
    this.aYZ = paramBoolean;
    if (this.gdV != null) {
      this.gdV.setVisible(this.aYZ);
      if (bool)
        fp(bool);
    }
  }

  public void bCq()
  {
    if ((this.gdV != null) && (this.gdX != null))
      this.gdV.setPixmap(this.gdX);
  }

  public void c(bdj parambdj)
  {
    buA localbuA = (buA)parambdj;
    super.c(localbuA);
    localbuA.hi = this.hi;
    localbuA.gdY = this.gdY;
    localbuA.aYZ = this.aYZ;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == fyW)
      setText(paramaKN.gL(paramString));
    else if (paramInt == czn)
      setEnabled(bUD.getBoolean(paramString));
    else if (paramInt == gea)
      setVisible(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == fyW)
      setText(String.valueOf(paramObject));
    else if (paramInt == czn)
      setEnabled(bUD.getBoolean(paramObject));
    else if (paramInt == gea)
      setVisible(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }

  public void bc()
  {
    super.bc();

    if (this.gdW != null) {
      this.gdW.release();
      this.gdW = null;
    }
    this.gdZ.clear();
  }

  public void aJ()
  {
    super.aJ();
  }

  public boolean isVisible() {
    return this.aYZ;
  }
}