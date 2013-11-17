import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dQq
  implements dBv
{
  protected static final Logger K = Logger.getLogger(dQq.class);
  public static final String mkz = "speakerIconUrl";
  public static final String mkA = "speakerName";
  public static final String mkB = "currentText";
  public static final String mkC = "currentChoices";
  public static final String[] bF = { "speakerIconUrl", "speakerName", "currentText", "currentChoices" };
  private cdf mkD;
  private final ctr mkE;
  private final long aHS;
  private final long mkF;
  private ArrayList mkG;
  private String[] mkH;
  private static final int mkI = 250;
  public static final int mkJ = -2;
  public static final int mkK = -1;
  private int mkL = 0;
  private boolean mkM = false;

  public dQq(cdf paramcdf, ctr paramctr, long paramLong) {
    this.mkE = paramctr;
    this.aHS = paramLong;
    if (paramctr == ctr.idl)
      this.mkF = CA.Lv().bj(paramLong).uO();
    else {
      this.mkF = this.aHS;
    }
    b(paramcdf);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("speakerIconUrl"))
      return ay.bd().n(drn());
    if (paramString.equals("speakerName"))
    {
      Object localObject;
      switch (aXJ.fdk[this.mkE.ordinal()]) {
      case 1:
        localObject = CA.Lv().bj(this.aHS);
        return localObject == null ? null : ((Su)localObject).getName();
      case 2:
        localObject = (ayn)cSE.kEZ.xz((int)this.aHS);
        return localObject == null ? null : ((ayn)localObject).getName();
      case 3:
        return null;
      }
    } else {
      if (paramString.equals("currentText"))
        return this.mkH[this.mkL] + (drr() ? "" : " [...]");
      if (paramString.equals("currentChoices"))
        return dro();
    }
    return null;
  }

  public String drn() {
    return this.mkE.hJ(this.mkF);
  }

  private void b(uz paramuz, String paramString) {
    if (paramuz != null)
      dLE.doY().a(this, new String[] { "speakerIconUrl" });
    else
      K.warn(paramString);
  }

  private ArrayList dro()
  {
    if (this.mkG != null)
      return this.mkG;
    this.mkG = new ArrayList();

    if (!drr()) {
      this.mkG.add(new bVz(-2, aMh.erd));
      this.mkM = true;
      return this.mkG;
    }

    if (this.mkD.cgc() == 0) {
      this.mkM = true;
      this.mkG.add(new bVz(-1, aMh.erd));
      return this.mkG;
    }
    this.mkM = false;
    for (Iterator localIterator = this.mkD.cgd(); localIterator.hasNext(); ) {
      cwR localcwR = (cwR)localIterator.next();
      if (localcwR.a(byv.bFN().bFO(), drp())) {
        this.mkG.add(new bVz(localcwR.getId(), aMh.bR(localcwR.xH())));
      }
    }
    return this.mkG;
  }

  private cRg drp() {
    switch (aXJ.fdk[this.mkE.ordinal()]) {
    case 1:
      return (byo)CA.Lv().bj(this.aHS);
    case 2:
      return cSE.kEZ.xz((int)this.aHS);
    case 3:
    }
    return null;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString)
  {
    return false;
  }

  public void b(cdf paramcdf) {
    this.mkD = paramcdf;
    this.mkG = null;
    this.mkL = 0;
    String str1 = bU.fH().b(75, this.mkD.getId(), new Object[0]);
    ArrayList localArrayList = new ArrayList();
    while (str1.length() > 250) {
      String str2 = str1.substring(0, 250);
      int j = str2.lastIndexOf(" ");
      localArrayList.add(str1.substring(0, j));
      str1 = str1.substring(j + 1);
    }
    localArrayList.add(str1);
    this.mkH = new String[localArrayList.size()];
    for (int i = 0; i < this.mkH.length; i++) {
      this.mkH[i] = ((String)localArrayList.get(i));
    }
    dLE.doY().a(this, new String[] { "currentText", "currentChoices" });
  }

  public int bel() {
    return this.mkD.getId();
  }

  public ArrayList drq() {
    return this.mkG;
  }

  public boolean drr() {
    return this.mkL == this.mkH.length - 1;
  }

  public void drs() {
    this.mkL += 1;
    if (drr())
      this.mkG = null;
    dLE.doY().a(this, new String[] { "currentText", "currentChoices" });
  }

  public boolean drt() {
    return this.mkM;
  }

  public void reset() {
    this.mkH = null;
    dLE.doY().a(this, new String[] { "currentText" });
  }
}