public class dgV extends buS
{
  public dgV(int paramInt)
  {
    super(paramInt);
  }

  protected void yB() {
    byz localbyz = byv.bFN().bFO();
    byte b = (byte)(int)((aOw)re(0)).b(localbyz, null, null, localbyz.ayL());

    El localEl = El.Q(b);
    if (dDE.dft().VN().Q(localEl.tw())) {
      return;
    }
    hx.aGS.b(localEl);
  }

  public boolean j(Su paramSu) {
    return true;
  }

  public boolean k(Su paramSu) {
    long l = ((aOw)re(0)).b(paramSu, null, null, paramSu.ayL());
    El localEl = El.Q((byte)(int)l);
    if (dDE.dft().VN().Q(localEl.tw())) {
      return false;
    }
    if (!bjY.ais()) {
      iS(bU.fH().getString("krosmoz.gameBoard.systemRequirementsNotMet"));
      return false;
    }
    return true;
  }
}