import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Float;
import java.util.ArrayList;

public class dIl extends dRq
  implements vn
{
  public static final String TAG = "tournament";
  private ArrayList hib;
  private ArrayList hqr;
  private ArrayList ca;
  private azz bZ;
  private int hih;
  private int heN;
  private int heM;
  private int hie;
  private int hid;
  private Or cQn;
  private String cn;
  private cpa co;
  private boolean lTj;
  public static final int cQr = "cellSize".hashCode();
  public static final int cs = "content".hashCode();
  public static final int egL = "hgap".hashCode();
  public static final int egM = "vgap".hashCode();

  public dIl()
  {
    this.hqr = new ArrayList();

    this.ca = new ArrayList();
    this.bZ = new azz();

    this.hih = -1;

    this.heN = 5;

    this.heM = 10;

    this.cn = null;
    this.co = null;

    this.lTj = true;
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
    if ((paramaNL instanceof eR))
      this.bZ.a((eR)paramaNL);
  }

  protected void rd()
  {
    super.rd();
  }

  public String getTag()
  {
    return "tournament";
  }

  public void setCellSize(Or paramOr)
  {
    this.cQn = paramOr;
    this.lTj = true;
    setNeedsToPreProcess();
  }

  public Or getCellSize()
  {
    return this.cQn;
  }

  public int getVgap()
  {
    return this.heN;
  }

  public void setVgap(int paramInt)
  {
    this.heN = paramInt;
    this.lTj = true;
    setNeedsToPreProcess();
  }

  public int getHgap()
  {
    return this.heM;
  }

  public void setHgap(int paramInt)
  {
    this.heM = paramInt;
    this.lTj = true;
    setNeedsToPreProcess();
  }

  public void setContentProperty(String paramString, cpa paramcpa)
  {
    this.cn = paramString;
    this.co = paramcpa;
  }

  public void setContent(bZK parambZK)
  {
    int i = 0;

    this.hib = ((ArrayList)parambZK.getItems().clone());
    this.hie = parambZK.getRowCount();
    this.hid = parambZK.getColumnCount();
    this.hqr = (parambZK.ceo() != null ? (ArrayList)parambZK.ceo().clone() : this.hqr);

    i = this.hib.size();

    int j = this.ca.size();
    int k;
    axU localaxU;
    if (j < i) {
      for (k = j; k < i; k++) {
        localaxU = new axU();
        localaxU.aJ();
        localaxU.setNonBlocking(this.meQ);
        localaxU.setRendererManager(this.bZ);

        localaxU.a(CH.bGs, new cEu(this), false);

        localaxU.a(CH.bGt, new cEy(this), false);

        this.ca.add(localaxU);
        a(localaxU);
      }
    } else if (j > i)
    {
      for (k = i; k < j; k++) {
        localaxU = (axU)this.ca.remove(this.ca.size() - 1);
        localaxU.beH();
      }
      if (this.hih >= this.ca.size()) {
        this.hih = -1;
      }
    }

    ba();
  }

  public void ba()
  {
    for (int i = 0; i < this.hib.size(); i++) {
      axU localaxU = (axU)this.ca.get(i);
      Om localOm = (Om)this.hib.get(i);
      localaxU.setContentProperty(this.cn + "#" + i, this.co);
      localaxU.setContent(localOm.getValue());
    }
  }

  public void validate()
  {
    super.validate();

    did();
  }

  private void did()
  {
    ArrayList localArrayList = new ArrayList();

    int i = this.cQn.width + this.heM;
    int j = this.cQn.height + this.heN;

    for (Line2D localLine2D : this.hqr) {
      float f1 = (float)localLine2D.getX1();
      float f2 = (float)localLine2D.getY1();
      float f3 = (float)localLine2D.getX2();
      float f4 = (float)localLine2D.getY2();

      float f5 = i * f1 + this.cQn.width;
      float f6 = i * (f1 + 1.0F) - this.heM / 2;

      float f7 = this.hie - f2 - 1.0F;
      float f8 = j * f7 + this.cQn.height / 2;

      f7 = this.hie - f4 - 1.0F;
      float f9 = j * f7 + this.cQn.height / 2;

      float f10 = i * f3;

      localArrayList.add(new Line2D.Float(f5, f8, f6, f8));
      localArrayList.add(new Line2D.Float(f6, f8, f6, f9));
      localArrayList.add(new Line2D.Float(f6, f9, f10, f9));
    }
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.lTj) {
      cfM();
    }

    this.lTj = false;
    return bool;
  }

  private void die()
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();

    Om localOm = new Om("Arone", 1.0F, 0.0F);
    localArrayList1.add(localOm);
    localOm = new Om("?", 1.0F, 7.0F);
    localArrayList1.add(localOm);
    localOm = new Om("Khalim", 1.0F, 1.0F);
    localArrayList1.add(localOm);
    localArrayList2.add(new Line2D.Float(1.0F, 0.0F, 2.0F, 0.5F));
    localArrayList2.add(new Line2D.Float(1.0F, 1.0F, 2.0F, 0.5F));

    localOm = new Om("Tessaran", 1.0F, 2.0F);
    localArrayList1.add(localOm);
    localOm = new Om("Noreen", 1.0F, 3.0F);
    localArrayList1.add(localOm);
    localArrayList2.add(new Line2D.Float(1.0F, 2.0F, 2.0F, 2.5F));
    localArrayList2.add(new Line2D.Float(1.0F, 3.0F, 2.0F, 2.5F));

    localOm = new Om("Arone", 2.0F, 0.5F);
    localArrayList1.add(localOm);
    localArrayList2.add(new Line2D.Float(2.0F, 0.5F, 3.0F, 1.5F));
    localOm = new Om("Noreen", 2.0F, 2.5F);
    localArrayList1.add(localOm);

    localOm = new Om("Khalim", 0.0F, 4.0F);
    localArrayList1.add(localOm);
    localOm = new Om("Tessaran", 0.0F, 5.0F);
    localArrayList1.add(localOm);

    localOm = new Om("Khalim", 2.0F, 4.5F);
    localArrayList1.add(localOm);
    localOm = new Om("Noreen", 2.0F, 5.5F);
    localArrayList1.add(localOm);

    localOm = new Om("Khalim", 3.0F, 5.0F);
    localArrayList1.add(localOm);
    localOm = new Om("Arone", 3.0F, 1.5F);
    localArrayList1.add(localOm);

    localOm = new Om("?", 4.0F, 3.25F);
    localArrayList1.add(localOm);

    bZK localbZK = new bZK(localArrayList1, localArrayList2, 8, 5);

    setContent(localbZK);
  }

  public void aJ()
  {
    super.aJ();

    ctd localctd = new ctd(this);
    localctd.aJ();
    a(localctd);
  }

  public void bc()
  {
    super.bc();

    this.hib.clear();
    this.hib = null;
    this.ca.clear();
    this.ca = null;
    this.hqr.clear();
    this.hqr = null;

    this.cQn = null;

    this.bZ = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cQr)
      setCellSize(paramaKN.gK(paramString));
    else if (paramInt == egL)
      setHgap(bUD.aR(paramString));
    else if (paramInt == egM)
      setVgap(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cs)
      setContent((bZK)paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}