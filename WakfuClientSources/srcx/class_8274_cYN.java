class cYN
  implements dkT
{
  cYN(dAy paramdAy, gA paramgA, czW paramczW)
  {
  }

  public void a(int paramInt, String paramString)
  {
    if (paramInt == 8) {
      if (this.bcY.nI()) {
        aCg.aOq().C(this.bcY);
      }

      byv.bFN().bFO().a(this.bcY, this.kML.nP(), this.kML.getSourceUniqueId());
      short s = this.kML.nP() == -1 ? this.bcY.nP() : this.kML.nP();
      dtY.l(this.bcY, s);
      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }
      gA localgA = (gA)dLE.doY().br("itemDetail", "equipmentDialog");
      if ((localgA != null) && (localgA.equals(this.bcY))) {
        dLE.doY().a("itemDetail", null, "equipmentDialog");
        dLE.doY().t("pet", null);
      }
    }
  }
}