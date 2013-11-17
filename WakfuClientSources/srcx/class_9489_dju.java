import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class dju extends dnp
{
  private static final Logger K = Logger.getLogger(dju.class);
  private String m_name;
  private boolean lgm;
  public static final String bC = "name";
  public static final String ddo = "windowId";
  public static final String dTb = "allFiltersList";
  public static final String lgn = "isDefaultView";
  public static final String lgo = "isPrivateView";
  private coM lgp;
  private boolean lgq;
  private boolean lgr;
  public static final String lgs = "characterName";
  public static final String[] bwd;
  public static final String[] bwe = { "name", "windowId", "allFiltersList", "isPrivateView", "isDefaultView" };

  private bgc lgt = null;

  public dju(int paramInt, String paramString, coM paramcoM, int[] paramArrayOfInt, boolean paramBoolean)
  {
    this(paramInt, paramString, paramcoM, paramArrayOfInt, paramBoolean, false);
  }

  public dju(int paramInt, String paramString, coM paramcoM, int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramInt, paramArrayOfInt);

    this.m_name = paramString;
    this.lgp = paramcoM;
    this.lgm = paramBoolean1;
    this.lgq = paramBoolean2;
    if (paramBoolean2)
      pF(pk(paramString));
  }

  public String[] getFields()
  {
    return bwd;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("name")) {
      return cSo() ? bU.fH().getString(this.m_name) : this.m_name;
    }
    if (paramString.equals("windowId")) {
      return Integer.valueOf(aAx.aMd().d(this));
    }
    if (paramString.equals("allFiltersList")) {
      return cUN();
    }
    if (paramString.equals("isDefaultView")) {
      return Boolean.valueOf(this.lgm);
    }
    if (paramString.equals("isPrivateView")) {
      return Boolean.valueOf(cSr());
    }
    return super.getFieldValue(paramString);
  }

  public boolean l(String paramString)
  {
    if (paramString.equals("name")) {
      return true;
    }
    return super.l(paramString);
  }

  public void a(String paramString, Object paramObject)
  {
    if (paramString.equals("name"))
      setName(paramObject.toString());
    else
      super.a(paramString, paramObject);
  }

  public void b(String paramString, Object paramObject)
  {
    super.b(paramString, paramObject);
    cSm();
  }

  public void c(String paramString, Object paramObject)
  {
    super.c(paramString, paramObject);
    cSm();
  }

  public void cSm()
  {
    int i = aAx.aMd().d(this);
    bpn localbpn = ceb.cgG().uX(i);
    if (localbpn == null) {
      return;
    }
    cpa localcpa = localbpn.getElementMap();
    if (localcpa == null)
      return;
    bbp localbbp = (bbp)localcpa.fi("chatScrollContainer");

    if (this.lgt != null) {
      dka.cSF().j(this.lgt);
      this.lgt.s(localbbp);
    } else {
      this.lgt = new bgc(this, localbbp, null);
    }
    dka.cSF().a(this.lgt, 250L, 1);
  }

  public void cSn() {
    super.cSn();
    cSm();
  }

  private void a(lZ paramlZ, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    if (paramString4 != null) {
      paramlZ.tI();
      paramlZ.am(paramString4);
    }
    if (paramString3 != null) {
      paramlZ.a("[").a(paramString3).a("] ");
    }
    if (paramString2 != null) {
      a(paramlZ, paramString1, paramString2);
    }
    paramlZ.a(bU.fH().getString("colon")).a(paramString5).a("\n");
    if (paramString4 != null)
      paramlZ.tJ();
  }

  public static void a(lZ paramlZ, String paramString1, String paramString2)
  {
    paramlZ.tz().tF();
    paramlZ.ao(paramString1);
    paramlZ.a(paramString2);
    paramlZ.tG().tA();
  }

  protected String j(aEe paramaEe)
  {
    lZ locallZ = new lZ();

    String str1 = paramaEe.getMessage();
    float[] arrayOfFloat = CM.LV().ez(paramaEe.aQj()).ckE();
    String str2 = paramaEe.getColor();

    String str3 = str2 == null ? cii.L(arrayOfFloat) : lZ.aq(str1) ? null : str2;
    if (WakfuClientInstance.awy().awB().a(bmz.fES)) {
      dxL localdxL = paramaEe.aQl();
      int i = localdxL.getHours();
      int j = localdxL.getMinutes();
      int k = localdxL.getSeconds();
      locallZ.tI();
      locallZ.am("808080");
      locallZ.a("[" + (i < 10 ? "0" : "") + i + ":" + (j < 10 ? "0" : "") + j + ":" + (k < 10 ? "0" : "") + k + "] ");
      locallZ.tJ();
    }
    switch (paramaEe.aQj())
    {
    case 4:
      if (paramaEe.getSourceName() != null) {
        locallZ.tz().tF().a(paramaEe.getSourceName()).tG().tA().a(bU.fH().getString("colon"));
      }
      if (str3 != null)
        locallZ.tI().am(str3).a(str1).tJ();
      else {
        locallZ.a(str1);
      }
      locallZ.a("\n");
      break;
    case 5:
      a(locallZ, "characterName_" + paramaEe.aQk(), paramaEe.getSourceName(), bU.fH().getString("chat.pipeName.group"), str3, str1);

      break;
    case 9:
      a(locallZ, "characterName_" + paramaEe.aQk(), paramaEe.getSourceName(), bU.fH().getString("chat.pipeName.team"), str3, str1);

      break;
    case 10:
      a(locallZ, "characterName_" + paramaEe.aQk(), paramaEe.getSourceName(), bU.fH().getString("chat.pipeName.admin"), str3, str1);

      break;
    case 11:
      locallZ.tI();
      locallZ.am(str3);
      locallZ.a("(").a(bU.fH().getString("chat.pipeName.all")).a(") ");
      locallZ.a(str1);
      locallZ.a(">\n");
      locallZ.tJ();
      break;
    case 6:
      a(locallZ, "characterName_" + paramaEe.aQk(), paramaEe.getSourceName(), bU.fH().getString("chat.pipeName.guild"), str3, str1);

      break;
    case 7:
      a(locallZ, "characterName_" + paramaEe.aQk(), paramaEe.getSourceName(), bU.fH().getString("chat.pipeName.trade"), str3, str1);

      break;
    case 8:
      if (paramaEe.getSourceName() != null) {
        a(locallZ, "characterName_" + paramaEe.aQk(), paramaEe.getSourceName(), bU.fH().getString("chat.pipeName.politic"), str3, str1);
      }
      else {
        locallZ.tI().am(str3).a(str1).tJ();
        locallZ.a("\n");
      }
      break;
    case 12:
      a(locallZ, "characterName_" + paramaEe.aQk(), paramaEe.getSourceName(), bU.fH().getString("chat.pipeName.recrute"), str3, str1);

      break;
    case 2:
      if (paramaEe.aQk() != byv.bFN().bFO().getId()) {
        a(locallZ, "characterName_" + paramaEe.aQk(), paramaEe.getSourceName(), null, str3, str1);
      } else {
        locallZ.tI();
        locallZ.am("7ad1d6");
        locallZ.a(bU.fH().getString("chat.to")).a(" ");
        locallZ.tJ();

        a(locallZ, "characterName_" + paramaEe.getSourceName(), paramaEe.getSourceName(), null, "7ad1d6", str1);
      }

      break;
    case 3:
      if (str1 != null) {
        if (str1.length() > 0) {
          if (str3 != null)
            locallZ.tI().am(str3).a(str1).tJ();
          else {
            locallZ.a(str1);
          }
          locallZ.a("\n");
        } else {
          if (str3 != null)
            locallZ.tI().am(str3).a("error").tJ();
          else {
            locallZ.a("error");
          }
          locallZ.a("\n");
        }
      } else {
        if (str3 != null)
          locallZ.tI().am(str3).a("error").tJ();
        else {
          locallZ.a("error");
        }
        locallZ.a("?\n");
      }

      break;
    default:
      a(locallZ, "characterName_" + paramaEe.aQk(), paramaEe.getSourceName(), null, str3, str1);
    }

    return locallZ.tP();
  }

  public void err(String paramString)
  {
    String str = bU.fH().getString("error.chat.malformedCommand");
    aEe localaEe = new aEe(str);
    localaEe.mm(3);
    CM.LV().a(localaEe);
  }

  public void s(String paramString, int paramInt)
  {
  }

  public void c(aEe paramaEe)
  {
    if (!AR(paramaEe.aQj())) {
      return;
    }
    super.c(paramaEe);
    if (!aAx.aMd().lr(paramaEe.aQj()))
      drC.j(this);
  }

  public String getName()
  {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public void ju(boolean paramBoolean) {
    this.lgr = paramBoolean;
  }

  public boolean cSo() {
    return this.lgm;
  }

  public boolean cSp() {
    return this.lgr;
  }

  public void jv(boolean paramBoolean) {
    this.lgm = paramBoolean;
  }

  public void a(coM paramcoM) {
    this.lgp = paramcoM;
  }

  public coM cSq() {
    return this.lgp;
  }

  public cgv a(coM paramcoM, boolean paramBoolean)
  {
    cgv localcgv = super.a(paramcoM, paramBoolean);
    if (localcgv == null) {
      return null;
    }
    if (paramcoM == this.lgp) {
      paramBoolean = false;
    }
    this.lgp = paramcoM;

    if (localcgv.ciz().getInternalName().startsWith("subPipe"))
      pF(pk(getName()));
    else {
      pF(paramcoM.anI());
    }
    if (!paramBoolean) {
      return localcgv;
    }
    dLE.doY().a(this, new String[] { "currentChannel" });
    try {
      arV.save();
    } catch (Exception localException) {
      K.error("Erreur à la sauvegarde du chat");

      K.error("Exception", localException);
    }
    return localcgv;
  }

  public static String pk(String paramString) {
    return abi.cPt.anI().concat(" \"" + paramString + "\"");
  }

  public boolean cSr()
  {
    return this.lgq;
  }

  public String toString()
  {
    return "ChatView{m_name='" + this.m_name + '\'' + ", viewId=" + cUQ();
  }

  public void cSs()
  {
    dLE.doY().a(cUP(), cgv.bF);
  }

  public void clean() {
    if (this.lgt != null) {
      dka.cSF().j(this.lgt);
      this.lgt = null;
    }
  }

  static
  {
    bwd = new String[bwe.length + dnp.bF.length];
    System.arraycopy(bwe, 0, bwd, 0, bwe.length);
    System.arraycopy(dnp.bF, 0, bwd, bwe.length, dnp.bF.length);
  }
}