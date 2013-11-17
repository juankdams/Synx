import org.apache.log4j.Logger;

public class dSG
  implements cvW
{
  private static final Logger K = Logger.getLogger(dSG.class);

  public static final dSG moI = new dSG();
  private bnm N;
  private boolean moJ = true;
  private iK moK;
  private long moL = -1L;

  public static dSG dsZ()
  {
    return moI;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject3;
    Object localObject2;
    switch (paramcWG.getId())
    {
    case 19200:
      localObject1 = (dOc)cBQ.cxL().a("eventsCalendarCreateDialog", VV.dJ("eventsCalendarCreateDialog"), 256L, (short)10000);

      this.moK = new iK();
      this.moK.c(dpQ.cXg().GK(), dpQ.cXg().GL() + 1, dpQ.cXg().GM());

      dLE.doY().t("calendar.event.editable", this.moK);

      aWc.blo().blC();
      return false;
    case 19202:
      localObject1 = (bzu)paramcWG;
      if (((bzu)localObject1).getBooleanValue()) {
        ww localww = (ww)paramcWG;
        this.moK.setTitle(localww.getTitle());
        this.moK.setDescription(localww.getDescription());
        if (this.moK.qy()) {
          this.moK.l(localww.EU());
          this.moK.m(localww.EV());
        }
        localObject3 = new aos();
        byz localbyz = byv.bFN().bFO();
        vL localvL = this.moK.qI();
        ((aos)localObject3).a(localvL);
        localvL.a(localbyz.getId(), localbyz.getName());
        aca.aoj().f(localvL);
        byv.bFN().aJK().d((cWG)localObject3);
        dpQ.cXg().cXj();
      }
      cBQ.cxL().mW("eventsCalendarCreateDialog");
      this.moK = null;
      return false;
    case 19201:
      localObject1 = (dEp)paramcWG;

      if (((dEp)localObject1).dgb() == null) {
        return false;
      }

      this.moK = new iK();
      this.moK.b(((dEp)localObject1).dgb().qI());

      cBQ.cxL().a("eventsCalendarEditDialog", VV.dJ("eventsCalendarEditDialog"), 256L, (short)10000);

      aWc.blo().blC();

      dLE.doY().t("calendar.event.editable", this.moK);
      boolean bool = (this.moK.qI().sN() == byv.bFN().bFO().getId()) || ((this.moK.qI().getType() == 3) && (bBc.b(byv.bFN().bFQ().bOR(), bBc.gti)));

      dLE.doY().t("calendar.event.editable.isOwner", Boolean.valueOf(bool));

      return false;
    case 19203:
      localObject1 = (bzu)paramcWG;
      if (((bzu)localObject1).getBooleanValue()) {
        localObject2 = (ww)paramcWG;
        this.moK.setTitle(((ww)localObject2).getTitle());
        this.moK.setDescription(((ww)localObject2).getDescription());
        if (this.moK.qy()) {
          this.moK.l(((ww)localObject2).EU());
          this.moK.m(((ww)localObject2).EV());
        }

        this.moK.qK();
        dpQ.cXg().cXj();
      }
      cBQ.cxL().mW("eventsCalendarEditDialog");
      this.moK = null;
      return false;
    case 19205:
      if (cBQ.cxL().mZ("calendarDialog")) {
        cBQ.cxL().mW("calendarDialog");
      } else {
        localObject1 = (bzu)paramcWG;
        this.moJ = ((bzu)localObject1).getBooleanValue();

        localObject2 = new xJ();

        if (this.moJ)
          localObject3 = this.moK.qI().EQ();
        else {
          localObject3 = this.moK.qI().ES();
        }

        ((xJ)localObject2).h((dxL)localObject3);

        dLE.doY().t("calendar.editable", localObject2);

        cBQ.cxL().a("calendarDialog", VV.dJ("calendarDialog"), 256L, (short)10000);

        aWc.blo().blC();
      }
      return false;
    case 19204:
      localObject1 = (bzu)paramcWG;

      if (this.moJ) {
        this.moK.a((int)((bzu)localObject1).ai(), (int)((bzu)localObject1).ah(), ((bzu)localObject1).af(), ((bzu)localObject1).ag(), ((bzu)localObject1).getIntValue());
      }
      else {
        this.moK.b((int)((bzu)localObject1).ai(), (int)((bzu)localObject1).ah(), ((bzu)localObject1).af(), ((bzu)localObject1).ag(), ((bzu)localObject1).getIntValue());
      }

      cBQ.cxL().mW("calendarDialog");
      return false;
    case 19206:
      localObject1 = new cyP();
      ((cyP)localObject1).dN(this.moK.qI().EN());
      byv.bFN().aJK().d((cWG)localObject1);

      return false;
    case 19207:
      localObject1 = new aBH();
      ((aBH)localObject1).dN(this.moK.qI().EN());
      byv.bFN().aJK().d((cWG)localObject1);

      this.moK.qH();
      return false;
    case 19208:
      cBQ.cxL().mW("eventsCalendarEditDialog");

      aca.aoj().i(this.moK.qJ());
      dpQ.cXg().cXj();

      localObject1 = new cUS();
      ((cUS)localObject1).bA(this.moK.qI().EN());
      byv.bFN().aJK().d((cWG)localObject1);

      this.moK = null;
      return false;
    case 19209:
      localObject1 = (bzu)paramcWG;
      localObject2 = new bpS();
      ((bpS)localObject2).g(((bzu)localObject1).ah());
      ((bpS)localObject2).bA(this.moK.qI().EN());
      byv.bFN().aJK().d((cWG)localObject2);
      return false;
    case 19210:
      localObject1 = (bzu)paramcWG;
      localObject2 = new csg();
      ((csg)localObject2).g(((bzu)localObject1).ah());
      ((csg)localObject2).bA(this.moK.qI().EN());
      byv.bFN().aJK().d((cWG)localObject2);
      return false;
    case 19211:
      localObject1 = this.moK.qI().EW().aBa();
      while (((cHu)localObject1).hasNext()) {
        ((cHu)localObject1).fl();
        if (!((String)((cHu)localObject1).value()).equals(byv.bFN().bFO().getName())) {
          localObject2 = new djK();
          ((djK)localObject2).a(go.aEq);
          ((djK)localObject2).setName((String)((cHu)localObject1).value());
          cjO.clE().j((cWG)localObject2);
        }
      }
      return false;
    case 19212:
      localObject1 = (bzu)paramcWG;
      localObject2 = new bsw();
      ((bsw)localObject2).bA(this.moK.qI().EN());
      ((bsw)localObject2).iO(((bzu)localObject1).getStringValue());
      byv.bFN().aJK().d((cWG)localObject2);
      return false;
    }

    return true;
  }

  public void dta() {
    if (this.moK != null)
      this.moK.qF();
  }

  public void dtb() {
    if (this.moK != null)
      this.moK.qG();
  }

  public void reset() {
    this.moL = -1L;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean);
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("eventsCalendarDialog");

      cBQ.cxL().mN("wakfu.eventsCalendar");

      dLE.doY().removeProperty("eventsCalendar");

      aWc.blo().blD();
    }
  }
}