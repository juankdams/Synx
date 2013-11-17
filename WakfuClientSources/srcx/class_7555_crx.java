public class crx extends bIL
{
  private static final aee iaN = new bOO(new boC());

  protected aee Bq()
  {
    return iaN;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    super.a(paramaVc, paramBoolean);
    cpT();
  }

  private void cpT() {
    if (this.evo == null)
      return;
    if (this.gIX == null)
      return;
    if (!this.gIX.b(eu.azc)) {
      return;
    }
    if ((this.evo.b(eu.azI)) && (this.evo.b(eu.azc))) {
      this.gIX.a(eu.azc).gv(this.evo.e(eu.azI));
      this.gIX.a(eu.azc).gv(this.evo.e(eu.azc));
    }

    if (this.gIX.b(eu.aza)) {
      if (this.evo.b(eu.aza))
        this.gIX.a(eu.aza).gv(this.evo.e(eu.aza));
      if (this.evo.b(eu.aze)) {
        this.gIX.a(eu.aza).gv(this.evo.e(eu.aze));
      }
    }

    if (((bqk)this.eWM).nS() == 11) {
      bfE localbfE = (bfE)this.eWM;
      byte b = localbfE.bsL().bHU();
      bTI localbTI = bTI.dx(b);
      if (this.evo.b(localbTI.bZS()))
        this.gIX.a(eu.azc).gv(this.evo.e(localbTI.bZS()));
    }
  }
}