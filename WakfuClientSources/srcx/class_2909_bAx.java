class bAx
  implements buF
{
  bAx(blW paramblW, aAn paramaAn, dCb paramdCb)
  {
  }

  public void a(dCb paramdCb, boolean paramBoolean)
  {
    if (paramBoolean) {
      dOc localdOc = bsP.getInstance().getMouseOver();
      if ((localdOc != null) && (localdOc != bsP.getInstance())) {
        return;
      }
      dle localdle = this.gpJ.axG();
      StringBuilder localStringBuilder = new StringBuilder();
      if (localdle != null) {
        localStringBuilder.append(" [").append(((Su)localdle).getName()).append("] ");
      }
      localStringBuilder.append(bU.fH().b(6, (int)this.gpJ.clt(), new Object[0]));
      cqm localcqm = this.gpJ.atJ();
      dSc localdSc = localcqm.adb();
      if ((localdSc == eu.aAg) || (localdSc == eu.ayM)) {
        localObject = localdSc == eu.aAg ? "hp.var.area" : "hp.var";
        localStringBuilder.append(" (").append(bU.fH().getString((String)localObject, new Object[] { Integer.valueOf(this.gpJ.e(localdSc)) })).append(")");
      }

      Object localObject = new dD(this.gpK, 0);
      ((dD)localObject).c(localStringBuilder.toString(), null);
      cjO.clE().j((cWG)localObject);
    } else {
      daO.cML().a(this.gpK);
    }
  }
}