import java.util.ArrayList;
import java.util.Iterator;

public class bFT extends cGj
{
  public static final String gBQ = "currentNew";
  public static final String fuW = "list";
  public static final String gBR = "hasPreviousNew";
  public static final String gBS = "hasNextNew";
  public static final String fzv = "videoSoundVolumeValue";
  public static final String[] bF = { "currentNew", "list", "hasPreviousNew", "hasNextNew", "videoSoundVolumeValue" };

  private ArrayList gBT = new ArrayList();
  private ajz gBU;
  private doN fzF = new bso(this);

  private ArrayList gBV = new ArrayList();
  private dRq gBW = null;

  public bFT(aCd paramaCd) {
    for (aGj localaGj : paramaCd.aOo())
      this.gBT.add(new ajz(localaGj, this.gBT.size()));
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("currentNew")) {
      return this.gBU;
    }
    if (paramString.equals("list")) {
      return this.gBT;
    }
    if (paramString.equals("hasPreviousNew")) {
      return Boolean.valueOf(bOc());
    }
    if (paramString.equals("hasNextNew")) {
      return Boolean.valueOf(bOb());
    }
    return null;
  }

  public boolean bOb() {
    return (this.gBT.size() > 1) && (this.gBU != this.gBT.get(this.gBT.size() - 1));
  }

  public boolean bOc() {
    return (this.gBT.size() > 1) && (this.gBU != this.gBT.get(0));
  }

  private void bOd() {
    this.gBU.awo();
    this.gBV.clear();
    if (this.gBW != null) {
      this.gBW.beH();
      this.gBW.beJ();
      this.gBW = null;
    }
    for (Iterator localIterator = this.gBU.awl().iterator(); localIterator.hasNext(); ) { localObject = (bji)localIterator.next();
      ((bHx)localObject).awo();
    }
    Object localObject;
    for (localIterator = this.gBU.awk().iterator(); localIterator.hasNext(); ) { localObject = (cEM)localIterator.next();
      ((bHx)localObject).awo();
    }
  }

  public void e(dRq paramdRq)
  {
    if (this.gBU == null)
      return;
    paramdRq.a(this.gBU.c(paramdRq));
    paramdRq.rV();

    biy localbiy = (biy)paramdRq.getElementMap().fi("bigPLayButton");
    localbiy.setVisible(false);

    for (Iterator localIterator = this.gBU.awl().iterator(); localIterator.hasNext(); ) { localObject = (bji)localIterator.next();
      paramdRq.a(((bHx)localObject).a(paramdRq, this));
      paramdRq.rV();

      dtz localdtz = ((bji)localObject).buM();
      localdtz.a(CH.bGF, this.fzF, false);
      localbiy.setVisible(true);
    }
    Object localObject;
    for (localIterator = this.gBU.awk().iterator(); localIterator.hasNext(); ) { localObject = (cEM)localIterator.next();
      paramdRq.a(((bHx)localObject).a(paramdRq, this));
      paramdRq.rV(); }
  }

  private void gC(long paramLong)
  {
    for (cEM localcEM : this.gBU.awk())
      localcEM.gG(paramLong);
  }

  void a(dQx paramdQx, dRq paramdRq1, dRq paramdRq2)
  {
    if (this.gBW == null) {
      this.gBW = dRq.checkOut();

      localObject = ((cwP)paramdRq2.getLayoutData()).getSize();

      cwP localcwP = new cwP();
      localcwP.aJ();
      localcwP.setSize(new Or((Or)localObject));
      localcwP.setX(0);
      localcwP.setY(0);
      this.gBW.setLayoutData(localcwP);

      this.gBW.setNonBlocking(false);

      bst localbst = new bst(this, (Or)localObject);

      this.gBW.a(CH.bGo, localbst, false);
      this.gBW.a(CH.bGs, localbst, false);
      this.gBW.a(CH.bGt, new bsr(this), false);

      paramdRq2.a(this.gBW);
      paramdRq2.rV();
    }

    paramdRq1.setVisible(false);
    Object localObject = new bXn(paramdQx, paramdRq1);
    this.gBV.add(localObject);
  }

  public void a(ajz paramajz)
  {
    if (this.gBU != null)
      bOd();
    this.gBU = paramajz;
  }

  public ajz bOe() {
    return this.gBU;
  }

  public void clean() {
    bOd();
    dLE.doY().removeProperty("news");
  }

  public ajz bOf() {
    return (ajz)this.gBT.get(0);
  }

  public ajz bOg() {
    int i = this.gBT.indexOf(this.gBU) - 1;
    if (i < 0)
      return null;
    return (ajz)this.gBT.get(i);
  }

  public ajz bOh() {
    int i = this.gBT.indexOf(this.gBU) + 1;
    if (i > this.gBT.size() - 1)
      return null;
    return (ajz)this.gBT.get(i);
  }

  public void bOi() {
    ahZ localahZ = new ahZ(this.gBU);
    localahZ.c(true);
    cjO.clE().j(localahZ);
  }
}