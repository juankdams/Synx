public class bSJ extends aNL
{
  public static final String TAG = "tableColumn";
  private String m_name;
  private String cer;
  private String hdR;
  private int gPW;
  private int hdS;
  private boolean hdT;
  private azz bZ = new azz();
  private boolean aYZ = true;
  private bYf hdU;
  public static final int cex = "name".hashCode();
  public static final int cez = "field".hashCode();
  public static final int hdV = "sortable".hashCode();
  public static final int hdW = "columnIndex".hashCode();
  public static final int hdX = "columnId".hashCode();
  public static final int hdY = "cellWidth".hashCode();
  public static final int gea = "visible".hashCode();

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);

    if ((paramaNL instanceof eR))
      this.bZ.a((eR)paramaNL);
  }

  public String getTag()
  {
    return "tableColumn";
  }

  public azz getRendererManager() {
    return this.bZ;
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public String getField() {
    return this.cer;
  }

  public void setField(String paramString) {
    this.cer = paramString;
  }

  public boolean getSortable() {
    return this.hdT;
  }

  public void setSortable(boolean paramBoolean) {
    this.hdT = paramBoolean;
  }

  public int getColumnIndex() {
    return this.hdS;
  }

  public void setColumnIndex(int paramInt) {
    this.hdS = paramInt;
  }

  public String getColumnId() {
    return this.hdR;
  }

  public void setColumnId(String paramString) {
    this.hdR = paramString;
  }

  public int getCellWidth() {
    return this.gPW;
  }

  public void setCellWidth(int paramInt) {
    this.gPW = paramInt;
  }

  public void setVisible(boolean paramBoolean) {
    int i = this.aYZ != paramBoolean ? 1 : 0;
    this.aYZ = paramBoolean;
    if (i != 0)
      this.hdU.a(this, paramBoolean);
  }

  public boolean isVisible() {
    return this.aYZ;
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    bSJ localbSJ = (bSJ)parambdj;
    localbSJ.setName(this.m_name);
    localbSJ.setField(this.cer);
    localbSJ.setSortable(this.hdT);
    localbSJ.setColumnIndex(this.hdS);
    localbSJ.setColumnId(this.hdR);
    localbSJ.setCellWidth(this.gPW);
  }

  public void bc()
  {
    super.bc();

    this.m_name = null;
    this.cer = null;
    this.hdR = null;
  }

  public void aJ()
  {
    super.aJ();

    this.hdS = -1;
    this.gPW = 30;
    this.hdT = true;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cex)
      setName(paramaKN.gL(paramString));
    else if (paramInt == cez)
      setField(paramString);
    else if (paramInt == hdV)
      setSortable(bUD.getBoolean(paramString));
    else if (paramInt == hdW)
      setColumnIndex(bUD.aR(paramString));
    else if (paramInt == hdX)
      setColumnId(paramString);
    else if (paramInt == hdY)
      setCellWidth(bUD.aR(paramString));
    else if (paramInt == gea)
      setVisible(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cex)
      setName((String)paramObject);
    else if (paramInt == cez)
      setField((String)paramObject);
    else if (paramInt == hdV)
      setSortable(bUD.getBoolean(paramObject));
    else if (paramInt == hdW)
      setColumnIndex(bUD.aR(paramObject));
    else if (paramInt == hdX)
      setColumnId((String)paramObject);
    else if (paramInt == gea)
      setVisible(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }

  public void setVisibilityListener(bYf parambYf) {
    this.hdU = parambYf;
  }
}