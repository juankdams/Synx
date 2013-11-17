import org.apache.log4j.Logger;

public class aFf extends bLe
{
  public aFf(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void kN()
  {
    Su localSu = dX(bwv());
    if (localSu == null) {
      K.error("Début de tour demandé pour un fighter inexistant ??");
      return;
    }
    Object localObject;
    if (!localSu.c(cfY.hCh)) {
      localObject = localSu.aeL();
      ((cew)localObject).dJ(localSu.Fx());
    }

    if (Ij()) {
      localObject = (arl)mD();
      if (!((arl)localObject).aJ(localSu)) {
        K.error("impossible de débuter le tour du fighter " + localSu.getId());
        ((arl)localObject).aDA();
      }
    }

    bIR.bQl().aC(localSu);
    if (byv.bFN().bFO() == localSu)
      bOU.gUc.b(new wX());
  }

  protected void kO()
  {
  }
}