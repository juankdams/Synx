import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ckV extends bbM
  implements cfI
{
  private static final Logger K = Logger.getLogger(ckV.class);

  public ckV(gA paramgA)
  {
    this.flr = paramgA;
    this.aFh = paramgA.nJ();
    this.aFh.c(this);
    bqk();
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("smallIconUrl"))
      return ((gA)this.flr).getFieldValue("iconUrl");
    if (paramString.equals("breedName"))
      return ((gA)this.flr).getFieldValue("name");
    if (paramString.equals("bonusDescription")) {
      int i = (!this.aFh.cJs()) && (this.aFh.aGa() > 0) ? 1 : 0;
      ArrayList localArrayList = new ArrayList();
      Object localObject = ((gA)this.flr).getFieldValue("effectAndCaracteristic");
      if (localObject == null) {
        return localArrayList;
      }
      for (String str : (ArrayList)localObject) {
        lZ locallZ = new lZ();
        if (i == 0) {
          locallZ.tI();
          locallZ.am(bNa.gRE.bUV());
        }
        locallZ.a(str);
        if (i == 0) {
          locallZ.tJ();
        }
        localArrayList.add(locallZ.tP());
      }
      return localArrayList;
    }
    return super.getFieldValue(paramString);
  }

  public boolean bhR()
  {
    gA localgA = (gA)byv.bFN().bFO().ayJ().dB((short)azO.dRT.hV);
    return (localgA != null) && (localgA.oj() == ((gA)this.flr).oj());
  }

  public void eu(String paramString)
  {
    dLE.doY().a(this, new String[] { "name" });
  }

  public void ih(int paramInt) {
    dSe localdSe = this.aFh.cJh().Az(paramInt);
    if (localdSe == null) {
      return;
    }
    this.flq.a(localdSe);
    dLE.doY().a(this, new String[] { "animatedElement", "color" });
  }

  public void ii(int paramInt) {
    bBn localbBn = Hh.QM().dh(paramInt);
    if (localbBn == null)
      this.flq.bIR();
    else {
      this.flq.rT(localbBn.oc());
    }
    this.flq.asZ();
    dLE.doY().a(this, new String[] { "petAnimationEquipment", "equipment" });
  }

  public void ij(int paramInt) {
    dLE.doY().a(this, new String[] { "hp", "hpDescription" });
  }

  public void ik(int paramInt) {
    dLE.doY().a(this, new String[] { "levelTextShort", "xpValue", "xpText", "bonusDescription" });
  }

  public void o(dxL paramdxL) {
    dLE.doY().a(this, new String[] { "lastMealDateText", "dietDescription" });
  }

  public void p(dxL paramdxL) {
    if (this.aFh.aGa() == 0) {
      return;
    }
    this.flq.eq("AnimEmote-Effrayee");
    this.flq.asZ();
  }

  public void q(dxL paramdxL) {
    dLE.doY().a(this, new String[] { "isActive" });
    dLE.doY().a(this.flr, new String[] { "backgroundStyle" });
  }

  public void il(int paramInt)
  {
  }

  public void aT(byte paramByte)
  {
    dLE.doY().a(this, new String[] { "fightLimitText" });
  }

  public void n(dxL paramdxL)
  {
  }

  public gA cmF() {
    return (gA)this.flr;
  }

  public String getName()
  {
    String str = this.aFh.getName();
    return (str == null) || (str.length() == 0) ? ((gA)this.flr).getName() : str;
  }

  public void clean() {
    this.aFh.d(this);
  }

  public void VF() {
    dLE.doY().a(this, bF);
  }

  public bAF cmG() {
    return this.flq;
  }

  public long bhS()
  {
    return ((gA)this.flr).oj();
  }

  public int getId()
  {
    return ((gA)this.flr).ok();
  }
}