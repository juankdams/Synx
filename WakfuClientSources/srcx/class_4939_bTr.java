class bTr
  implements aLb
{
  bTr(dqB paramdqB)
  {
  }

  public void ut()
  {
    dLE.doY().a(this.heQ, new String[] { "name" });
  }

  public void uu() {
    dLE.doY().a(this.heQ, new String[] { "blazon" });
  }

  public void uv() {
    dLE.doY().a(this.heQ, new String[] { "guildDescription" });
  }

  public void uw() {
    this.heQ.cXI();
    dLE.doY().a(this.heQ, new String[] { "guildMessage" });
  }

  public void r(short paramShort) {
    bZQ();
    aOq.euI.H(new bPG(this));

    dLE.doY().a(this.heQ, new String[] { "canLevelUp", "nextLevelCost", "nextLevelDuration", "guildLevelText" });
  }

  public void bL(int paramInt)
  {
    dLE.doY().a(this.heQ, new String[] { "currentGuildPoints" });
  }

  public void bM(int paramInt) {
    dLE.doY().a(this.heQ, new String[] { "totalGuildPoints" });
  }

  public void a(aUJ paramaUJ) {
    this.heQ.kh(true);
  }

  public void b(aUJ paramaUJ) {
    this.heQ.kh(true);
  }

  public void a(aCl paramaCl) {
    String str1 = null;
    String str2 = null;
    if (paramaCl.getId() == byv.bFN().bFO().getId()) {
      str1 = "notification.guildJoinTitle";
      str2 = bU.fH().getString("notification.guildJoinText");
    } else {
      str1 = "notification.guildRecrueTitle";
      str2 = bU.fH().getString("notification.guildRecrueText", new Object[] { paramaCl.getName() });
    }

    String str3 = bU.fH().getString(str1);
    String str4 = cda.createLink(str2, ana.dqj);
    az localaz = new az(str3, str4, ana.dqj);
    cjO.clE().j(localaz);
    this.heQ.ki(true);
  }

  public void b(aCl paramaCl) {
    if (paramaCl.getId() != byv.bFN().bFO().getId()) {
      String str1 = null;
      String str2 = null;
      str1 = "notification.guildQuitTitle";
      str2 = bU.fH().getString("notification.guildQuitText", new Object[] { paramaCl.getName() });

      String str3 = bU.fH().getString(str1);
      String str4 = cda.createLink(str2, ana.dqj);
      az localaz = new az(str3, str4, ana.dqj);
      cjO.clE().j(localaz);
    }
    this.heQ.ki(true);
  }

  public void b(bqd parambqd) {
    i(parambqd);
    dqB.a(this.heQ, parambqd);
  }

  public void a(bqd parambqd) {
    i(parambqd);
    j(parambqd);
  }

  public void c(aUJ paramaUJ) {
    this.heQ.kh(true);
  }

  public void c(aCl paramaCl) {
    dqB.a(this.heQ, paramaCl);
  }

  public void c(bqd parambqd) {
    i(parambqd);
    dqB.a(this.heQ, parambqd);

    dax localdax = dax.zx(parambqd.ajL());
    if (clr.a(localdax)) {
      return;
    }

    String str1 = "notification.guildBonusActivatedTitle";
    String str2 = bU.fH().b(138, parambqd.ajL(), new Object[0]);
    String str3 = bU.fH().getString("notification.guildBonusActivatedText", new Object[] { str2 });

    String str4 = bU.fH().getString("notification.guildBonusActivatedTitle");
    String str5 = cda.createLink(str3, ana.dqj);
    az localaz = new az(str4, str5, ana.dqj);
    cjO.clE().j(localaz);

    String str6 = bU.fH().getString("guild.chatBonusActivated", new Object[] { str2 });
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), str6);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public void bN(int paramInt) {
    dLE.doY().a(this.heQ, new String[] { "currentWeekGuildPoints" });
  }

  public void bO(int paramInt) {
    dLE.doY().a(this.heQ, new String[] { "currentWeekGuildPoints" });
  }

  private void i(bqd parambqd) {
    dvQ localdvQ = aOq.euI.nn(parambqd.ajL());
    localdvQ.dbi();
    dLE.doY().a(this.heQ, new String[] { "canLevelUp", "availableBonuses", "loadingBonuses", "permanentBonuses", "temporaryBonuses", "simultaneousBonusesText" });
  }

  private void j(bqd parambqd)
  {
    cig localcig = qY.aYI.cw(parambqd.ajL());
    if (!crP.e(localcig)) {
      return;
    }

    dvQ localdvQ = aOq.euI.nn(parambqd.ajL());
    localdvQ.byC();

    b(localcig);
  }

  private void b(cig paramcig) {
    String str1 = "notification.guildBonusEndTitle";
    String str2 = bU.fH().b(138, paramcig.getId(), new Object[0]);
    String str3 = bU.fH().getString("notification.guildBonusEndText", new Object[] { str2 });

    String str4 = bU.fH().getString("notification.guildBonusEndTitle");
    String str5 = cda.createLink(str3, ana.dqj);
    az localaz = new az(str4, str5, ana.dqj);
    cjO.clE().j(localaz);

    String str6 = bU.fH().getString("guild.chatBonusEnd", new Object[] { str2 });
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), str6);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  private void bZQ() {
    dLE.doY().a(this.heQ, new String[] { "level", "nextLevel", "nextLevelCost", "canLevelUp" });

    String str1 = "notification.guildLevelTitle";
    String str2 = bU.fH().getString("notification.guildLevelText", new Object[] { Short.valueOf(this.heQ.cXM()) });

    String str3 = bU.fH().getString("notification.guildLevelTitle");
    String str4 = cda.createLink(str2, ana.dqj);
    az localaz = new az(str3, str4, ana.dqj);
    cjO.clE().j(localaz);

    String str5 = bU.fH().getString("guild.chatLevelGain", new Object[] { Short.valueOf(this.heQ.cXM()) });
    aEe localaEe = new aEe(bU.fH().getString("chat.pipeName.guild"), str5);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }
}