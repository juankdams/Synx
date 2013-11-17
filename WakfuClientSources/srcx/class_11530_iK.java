import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class iK
  implements dBv, Comparable
{
  public static final String aGo = "title";
  public static final String RI = "description";
  public static final String aIE = "type";
  public static final String aIF = "types";
  public static final String aIG = "selectedType";
  public static final String aIH = "iconUrl";
  public static final String aII = "typeDescription";
  public static final String aIJ = "areParticipantsLimited";
  public static final String aIK = "maxParticipants";
  public static final String aIL = "numParticipants";
  public static final String aIM = "numParticipantsDesc";
  public static final String aIN = "maxRegistrations";
  public static final String aIO = "numRegistrations";
  public static final String aIP = "numRegistrationsDesc";
  public static final String aIQ = "startDateDesc";
  public static final String aIR = "endDateDesc";
  public static final String aIS = "isRegistered";
  public static final String aIT = "registeredList";
  public static final String aIU = "isValidated";
  public static final String aIV = "validatedList";
  public static final String aIW = "canEditParticipantsLimit";
  private vL aIX;
  private vL aIY;
  private boolean aIZ = false;
  private boolean aJa = false;
  private boolean aJb = false;
  private boolean aJc = false;
  private Ha aJd;

  public int a(iK paramiK)
  {
    if (this.aIX != null) {
      return this.aIX.EQ().U(paramiK.aIX.EQ());
    }

    return 0;
  }

  public void c(int paramInt1, int paramInt2, int paramInt3) {
    this.aIX = new vL();

    byz localbyz = byv.bFN().bFO();
    if (localbyz != null) {
      this.aIX.aI(localbyz.getId());
    }

    this.aIX.ag(true);
    this.aIX.setType((byte)1);
    this.aIX.n((byte)0);

    this.aJd = Ha.W((byte)1);

    this.aIX.l((byte)-1);

    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    localGregorianCalendar.setTime(new Date());
    localGregorianCalendar.add(10, 1);
    int i = localGregorianCalendar.get(9) == 0 ? 0 : 12;
    cYq localcYq = new cYq(0, 0, localGregorianCalendar.get(10) + i, paramInt1, paramInt2, paramInt3);

    this.aIX.e(localcYq);
    localGregorianCalendar.add(10, 1);
    i = localGregorianCalendar.get(9) == 0 ? 0 : 12;
    localcYq = new cYq(0, 0, localGregorianCalendar.get(10) + i, paramInt1, paramInt2, paramInt3);

    this.aIX.f(localcYq);

    this.aJa = false;
    this.aIZ = false;
    this.aJb = false;
    this.aJc = false;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    cYq localcYq1 = this.aIX.EP();
    long l1 = localcYq1.rP();

    cYq localcYq2 = this.aIX.ER();
    long l2 = localcYq2.rP();

    int i = (int)((float)(l2 - l1) / 1000.0F);

    localcYq1.set(0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    localcYq2.set(i, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);

    dLE.doY().a(this, new String[] { "startDateDesc", "endDateDesc" });
  }

  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    cYq localcYq = this.aIX.ER();
    localcYq.set(0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);

    dLE.doY().a(this, new String[] { "endDateDesc" });
  }

  public void x(boolean paramBoolean) {
    int i = this.aIX.EU();

    if (((paramBoolean) && (i >= 1)) || ((!paramBoolean) && (i < 1)))
    {
      return;
    }

    if (paramBoolean) {
      this.aIX.l((byte)2);
      this.aIX.m((byte)2);
    } else {
      this.aIX.l((byte)-1);
      this.aIX.m((byte)-1);
    }

    dLE.doY().a(this, new String[] { "areParticipantsLimited", "maxParticipants", "maxRegistrations" });
  }

  public boolean qy()
  {
    return this.aIX.EU() != -1;
  }

  public void l(byte paramByte) {
    if ((paramByte < 1) || (paramByte > 20)) {
      return;
    }

    this.aIX.l(paramByte);
    dLE.doY().a(this, new String[] { "maxParticipants" });
  }

  public void m(byte paramByte) {
    if ((paramByte < 1) || (paramByte > 20)) {
      return;
    }

    this.aIX.m(paramByte);
    dLE.doY().a(this, new String[] { "maxRegistrations" });
  }

  public void setType(byte paramByte) {
    if (this.aIX.getType() == paramByte) {
      return;
    }
    this.aIX.setType(paramByte);
    this.aJd = Ha.W(paramByte);

    switch (paramByte) {
    case 3:
      x(false);
      break;
    case 2:
      x(true);
      break;
    case 4:
      x(false);
    }

    dLE.doY().a(this, new String[] { "type", "typeDescription", "iconUrl", "selectedType", "canEditParticipantsLimit" });
  }

  public void n(byte paramByte)
  {
    if (this.aIX.ET() == paramByte) {
      return;
    }
    this.aIX.n(paramByte);

    dLE.doY().a(this, new String[] { "iconUrl", "selectedType" });
  }

  public void setTitle(String paramString)
  {
    String str = this.aIX.getTitle();
    if ((str == paramString) || ((str != null) && (str.equals(paramString))) || ((paramString != null) && (paramString.equals(str))))
    {
      return;
    }

    this.aIX.setTitle(paramString);
    dLE.doY().a(this, new String[] { "title" });
  }

  public void setDescription(String paramString) {
    String str = this.aIX.getDescription();
    if ((str == paramString) || ((str != null) && (str.equals(paramString))) || ((paramString != null) && (paramString.equals(str))))
    {
      return;
    }

    this.aIX.aP(paramString);
    dLE.doY().a(this, new String[] { "description" });
  }

  public void a(vL paramvL) {
    this.aIX = paramvL;
    this.aJd = Ha.W(this.aIX.getType());
  }

  public void b(vL paramvL)
  {
    this.aIY = paramvL;
    this.aIX = new vL();
    this.aIX.c(this.aIY);

    this.aJd = Ha.W(this.aIX.getType());

    this.aJa = false;
    this.aIZ = false;
    this.aJb = false;
    this.aJc = false;
  }

  public boolean qz() {
    if (this.aIY != null) {
      return !this.aIY.getTitle().equals(this.aIX.getTitle());
    }

    return false;
  }

  public boolean qA() {
    if (this.aIY != null) {
      return !this.aIY.getDescription().equals(this.aIX.getDescription());
    }

    return false;
  }

  public boolean qB() {
    if (this.aIY != null) {
      return this.aIY.EQ().U(this.aIX.EQ()) != 0;
    }

    return false;
  }

  public boolean qC() {
    if (this.aIY != null) {
      return this.aIY.ES().U(this.aIX.ES()) != 0;
    }

    return false;
  }

  public boolean qD() {
    if (this.aIY != null) {
      return this.aIY.EU() != this.aIX.EU();
    }

    return false;
  }

  public boolean qE() {
    if (this.aIY != null) {
      return this.aIY.EV() != this.aIX.EV();
    }

    return false;
  }

  public void qF() {
    if (this.aIY == null) {
      return;
    }

    aoL localaoL1 = this.aIX.EX();
    localaoL1.clear();
    aoL localaoL2 = this.aIY.EX();
    if (localaoL2.size() > 0) {
      cHu localcHu = localaoL2.aBa();
      while (localcHu.hasNext()) {
        localcHu.fl();
        localaoL1.put(localcHu.bic(), localcHu.value());
      }
    }

    dLE.doY().a(this, new String[] { "isRegistered", "registeredList", "numRegistrationsDesc", "numRegistrations" });
  }

  public void qG()
  {
    if (this.aIY == null) {
      return;
    }

    aoL localaoL1 = this.aIX.EW();
    localaoL1.clear();
    aoL localaoL2 = this.aIY.EW();
    if (localaoL2.size() > 0) {
      cHu localcHu = localaoL2.aBa();
      while (localcHu.hasNext()) {
        localcHu.fl();
        localaoL1.put(localcHu.bic(), localcHu.value());
      }
    }

    dLE.doY().a(this, new String[] { "isValidated", "validatedList", "numParticipants", "numParticipantsDesc" });
  }

  public void qH()
  {
    if (this.aIY == null) {
      return;
    }

    long l = byv.bFN().bFO().getId();
    if (this.aIX.EX().containsKey(l)) {
      this.aIY.aK(l);
      qF();
    } else if (this.aIX.EW().containsKey(l)) {
      this.aIY.aJ(l);
      qG();
    }
  }

  public vL qI() {
    return this.aIX;
  }

  public vL qJ() {
    return this.aIY;
  }

  public void qK()
  {
    Object localObject;
    if (qz()) {
      this.aIY.setTitle(this.aIX.getTitle());
      localObject = new bWJ();
      ((bWJ)localObject).setTitle(this.aIY.getTitle());
      ((bWJ)localObject).bA(this.aIY.EN());
      byv.bFN().aJK().d((cWG)localObject);
    }

    if (qA()) {
      this.aIY.aP(this.aIX.getDescription());
      localObject = new Gq();
      ((Gq)localObject).aP(this.aIY.getDescription());
      ((Gq)localObject).bA(this.aIY.EN());
      byv.bFN().aJK().d((cWG)localObject);
    }

    if (qD()) {
      this.aIY.l(this.aIX.EU());
      localObject = new dGb();
      ((dGb)localObject).bA(this.aIY.EN());
      ((dGb)localObject).fJ(this.aIY.EU());
      ((dGb)localObject).setType((byte)2);
      byv.bFN().aJK().d((cWG)localObject);
    }

    if (qE()) {
      this.aIY.m(this.aIX.EV());
      localObject = new dGb();
      ((dGb)localObject).bA(this.aIY.EN());
      ((dGb)localObject).fJ(this.aIY.EV());
      ((dGb)localObject).setType((byte)1);
      byv.bFN().aJK().d((cWG)localObject);
    }

    if (qB()) {
      aca.aoj().a(this.aIY.EN(), this.aIX.EQ());
      localObject = new afT();
      ((afT)localObject).h(this.aIY.EQ());
      ((afT)localObject).bA(this.aIY.EN());
      byv.bFN().aJK().d((cWG)localObject);
    }

    if (qC()) {
      this.aIY.f(this.aIX.ES());
      localObject = new dll();
      ((dll)localObject).h(this.aIY.ES());
      ((dll)localObject).bA(this.aIY.EN());
      byv.bFN().aJK().d((cWG)localObject);
    }
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("title"))
      return abd.d(this.aIX);
    if (paramString.equals("description"))
      return abd.e(this.aIX);
    if (paramString.equals("areParticipantsLimited"))
      return Boolean.valueOf(qy());
    if (paramString.equals("maxParticipants"))
      return Byte.valueOf(this.aIX.EU());
    if (paramString.equals("maxRegistrations"))
      return Byte.valueOf(this.aIX.EV());
    if (paramString.equals("numParticipants"))
      return Integer.valueOf(this.aIX.EW().size());
    if (paramString.equals("numRegistrations"))
      return Integer.valueOf(this.aIX.EX().size());
    Object localObject;
    int i;
    if (paramString.equals("numParticipantsDesc")) {
      localObject = new StringBuilder().append(this.aIX.EW().size());
      i = this.aIX.EU();
      if (i >= 0) {
        ((StringBuilder)localObject).append("/").append(i);
      }
      return ((StringBuilder)localObject).toString();
    }if (paramString.equals("numRegistrationsDesc")) {
      localObject = new StringBuilder().append(this.aIX.EX().size());
      i = this.aIX.EV();
      if (i >= 0) {
        ((StringBuilder)localObject).append("/").append(i);
      }
      return ((StringBuilder)localObject).toString();
    }if (paramString.equals("startDateDesc")) {
      localObject = this.aIX.EQ();
      if ((localObject == null) || (((dxL)localObject).avJ())) {
        return null;
      }
      return ((dxL)localObject).cLV();
    }if (paramString.equals("endDateDesc")) {
      localObject = this.aIX.ES();
      if ((localObject == null) || (((dxL)localObject).avJ())) {
        return null;
      }
      return ((dxL)localObject).cLV();
    }if (paramString.equals("type"))
      return Byte.valueOf(this.aIX.getType());
    if (paramString.equals("iconUrl"))
      return ay.bd().b(this.aIX.getType());
    if (paramString.equals("typeDescription"))
      return bU.fH().getString("calendar.event.type." + this.aIX.getType());
    if (paramString.equals("selectedType"))
      return this.aJd;
    if (paramString.equals("types"))
      return Ha.QK();
    if (paramString.equals("isRegistered"))
      return Boolean.valueOf(this.aIX.EX().N(byv.bFN().bFO().getId()));
    if (paramString.equals("isValidated"))
      return Boolean.valueOf(this.aIX.EW().N(byv.bFN().bFO().getId()));
    if (paramString.equals("registeredList"))
      return b(this.aIX.EX());
    if (paramString.equals("validatedList"))
      return b(this.aIX.EW());
    if (paramString.equals("canEditParticipantsLimit")) {
      return Boolean.valueOf((this.aIX.sN() == byv.bFN().bFO().aex()) || ((this.aIX.getType() == 3) && (bBc.b(byv.bFN().bFQ().bOR(), bBc.gti))));
    }

    return null;
  }

  private ArrayList b(aoL paramaoL) {
    ArrayList localArrayList = new ArrayList(paramaoL.size());
    cHu localcHu = paramaoL.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      localArrayList.add(new bUN(localcHu.bic(), (String)localcHu.value()));
    }
    return localArrayList;
  }

  public String[] getFields() {
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }
}