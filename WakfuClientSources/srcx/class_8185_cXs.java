import java.util.ArrayList;
import java.util.Arrays;

public class cXs extends amp
{
  public static final String TAG = "tl";
  private int kKB;
  private int kKC;
  private aFG aWn;
  private boolean kKD = true;
  private dOc[][] kKE;
  private int[] kKF;
  private int[] kKG;
  private boolean[] kKH;
  private boolean[] kKI;
  private int kKJ = 0;
  private int kKK = 0;

  private int ia = 0;
  private int ib = 0;

  public static final int kKL = "rows".hashCode();
  public static final int kKM = "columns".hashCode();
  public static final int drs = "align".hashCode();

  public Or getContentPreferedSize(dRq paramdRq)
  {
    h(paramdRq);

    for (int i = 0; i < this.kKC; i++) {
      for (int j = 0; j < this.kKB; j++) {
        dOc localdOc = this.kKE[i][j];
        if ((localdOc != null) && (localdOc.isVisible()))
        {
          Or localOr = localdOc.getPrefSize();
          this.kKF[i] = Math.max(this.kKF[i], localOr.width);
          this.kKG[j] = Math.max(this.kKG[j], localOr.height);

          if (localdOc.isExpandable()) {
            if (this.kKH[i] == 0)
              this.kKJ += 1;
            if (this.kKI[j] == 0) {
              this.kKK += 1;
            }
            this.kKH[i] = true;
            this.kKI[j] = true;
          }
        }
      }
    }
    this.ia = 0;
    this.ib = 0;

    for (i = 0; i < this.kKC; i++) {
      this.ia += this.kKF[i];
    }
    for (i = 0; i < this.kKB; i++) {
      this.ib += this.kKG[i];
    }
    return new Or(this.ia, this.ib);
  }

  public Or getContentMinSize(dRq paramdRq) {
    return getContentPreferedSize(paramdRq);
  }

  public void a(dRq paramdRq) {
    if ((this.kKF == null) || (this.kKG == null))
      return;
    fG[] arrayOffG = new fG[this.kKC * this.kKB];
    int j;
    Object localObject;
    for (int i = 0; i < this.kKC; i++) {
      for (j = 0; j < this.kKB; j++) {
        localObject = this.kKE[i][j];
        if ((localObject != null) && (((dOc)localObject).isVisible()))
        {
          arrayOffG[(i * this.kKB + j)] = new fG((bHe)((dOc)localObject).getLayoutData(), ((dOc)localObject).getPrefSize(), null);
        }
      }
    }
    a(paramdRq, arrayOffG);
    b(paramdRq, arrayOffG);

    for (i = 0; i < this.kKC; i++)
      for (j = 0; j < this.kKB; j++) {
        localObject = arrayOffG[(i * this.kKB + j)];
        if (localObject != null)
        {
          dOc localdOc = this.kKE[i][j];
          localdOc.setPosition(((fG)localObject).hY, ((fG)localObject).hZ);
          localdOc.setSize(((fG)localObject).ia, ((fG)localObject).ib);
        }
      }
  }

  private void a(dRq paramdRq, fG[] paramArrayOffG)
  {
    int i = paramdRq.getAppearance().getContentWidth();

    int j = i - this.ia;
    int k = j / bCO.a(this.kKJ, 1, new int[0]);
    int m = 0;

    int n = 0;
    for (int i1 = 0; i1 < this.kKC; i1++)
    {
      int i2 = this.kKF[i1];
      if (this.kKH[i1] != 0) {
        m++; if (m == this.kKJ) {
          i2 += j;
          j = 0;
        } else {
          i2 += k;
          j -= k;
        }

      }

      for (int i3 = 0; i3 < this.kKB; i3++) {
        fG localfG = paramArrayOffG[(i1 * this.kKB + i3)];
        if (localfG != null)
        {
          aFG localaFG = localfG.aCP.getHorizontalAlign();

          if (localaFG != null) {
            Or localOr = localfG.aCQ;
            localfG.hY = (n + localaFG.ba(localOr.width, i2));
            localfG.ia = localOr.width;
          } else {
            localfG.hY = n;
            localfG.ia = i2;
          }
        }
      }
      n += i2;
    }
  }

  private void b(dRq paramdRq, fG[] paramArrayOffG) {
    int i = paramdRq.getAppearance().getContentHeight();
    int j = i - this.ib;
    int k = j / bCO.a(this.kKK, 1, new int[0]);
    int m = 0;

    int n = i;

    for (int i1 = 0; i1 < this.kKB; i1++)
    {
      int i2 = this.kKG[i1];
      if (this.kKI[i1] != 0) {
        m++; if (m == this.kKK) {
          i2 += j;
          j = 0;
        } else {
          i2 += k;
          j -= k;
        }
      }

      n -= i2;

      for (int i3 = 0; i3 < this.kKC; i3++) {
        fG localfG = paramArrayOffG[(i3 * this.kKB + i1)];
        if (localfG != null)
        {
          aFG localaFG = localfG.aCP.getVerticalAlign();

          if (localaFG != null) {
            Or localOr = localfG.aCQ;
            localfG.hZ = (n + localaFG.bb(localOr.height, i2));
            localfG.ib = localOr.height;
          } else {
            localfG.hZ = n;
            localfG.ib = i2;
          }
        }
      }
    }
  }

  private void h(dRq paramdRq) {
    if (this.kKD) {
      this.kKE = new dOc[this.kKC][];
      for (int i = 0; i < this.kKC; i++) {
        this.kKE[i] = new dOc[this.kKB];
      }
      this.kKF = new int[this.kKC];
      this.kKG = new int[this.kKB];

      this.kKH = new boolean[this.kKC];
      this.kKI = new boolean[this.kKB];

      this.kKD = false;
    }

    cLh();
    aAB();

    ArrayList localArrayList = paramdRq.getWidgetChildren();
    for (int j = localArrayList.size() - 1; j >= 0; j--) {
      dOc localdOc = (dOc)localArrayList.get(j);
      if ((localdOc.getLayoutData() instanceof bHe))
      {
        bHe localbHe = (bHe)localdOc.getLayoutData();
        if ((localbHe.getRow() < this.kKB) && (localbHe.getColumn() < this.kKC))
        {
          this.kKE[localbHe.getColumn()][localbHe.getRow()] = localdOc;
        }
      }
    }
  }

  private void cLh() { if (this.kKE == null) {
      return;
    }

    for (int i = 0; i < this.kKC; i++)
      for (int j = 0; j < this.kKB; j++)
        this.kKE[i][j] = null; }

  private void aAB()
  {
    if (this.kKF != null)
      Arrays.fill(this.kKF, 0);
    if (this.kKG != null) {
      Arrays.fill(this.kKG, 0);
    }
    if (this.kKH != null)
      Arrays.fill(this.kKH, false);
    if (this.kKI != null) {
      Arrays.fill(this.kKI, false);
    }
    this.kKJ = 0;
    this.kKK = 0;
  }

  public int getRows() {
    return this.kKB;
  }

  public void setRows(int paramInt) {
    this.kKB = paramInt;
    this.kKD = true;
  }

  public int getColumns() {
    return this.kKC;
  }

  public void setColumns(int paramInt) {
    this.kKC = paramInt;
    this.kKD = true;
  }

  public aFG getAlign() {
    return this.aWn;
  }

  public void setAlign(aFG paramaFG) {
    this.aWn = paramaFG;
  }

  public void c(bdj parambdj) {
    super.c(parambdj);

    cXs localcXs = (cXs)parambdj;
    localcXs.setAlign(this.aWn);
    localcXs.setRows(this.kKB);
    localcXs.setColumns(this.kKC);
  }

  public cXs cLi()
  {
    cXs localcXs = new cXs();
    localcXs.aJ();
    c(localcXs);
    return localcXs;
  }

  public void aJ() {
    super.aJ();

    this.kKD = true;
  }

  public void bc() {
    super.bc();

    this.kKE = ((dOc[][])null);
    this.kKF = null;
    this.kKG = null;
    this.kKH = null;
    this.kKI = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == kKL)
      setRows(bUD.aR(paramString));
    else if (paramInt == kKM)
      setColumns(bUD.aR(paramString));
    else if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}