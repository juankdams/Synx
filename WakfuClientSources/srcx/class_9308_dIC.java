import java.util.ArrayList;

public enum dIC
{
  private final ArrayList cVf = new ArrayList();
  private final byte lTP;
  private cnm lTQ;

  private dIC(int arg3)
  {
    int j;
    this.lTP = bCO.gn(j);
  }

  static void init()
  {
    dIC localdIC = lTy;
  }

  private void b(dBY paramdBY) {
    this.cVf.add(paramdBY);
    paramdBY.a(this);
  }

  public int dir() {
    if (this.cVf.isEmpty()) {
      return -1;
    }

    return ((dBY)this.cVf.get(0)).aw;
  }

  public cnm dis() {
    return this.lTQ;
  }

  public byte dit() {
    return this.lTP;
  }

  public boolean ab(dGy paramdGy) {
    int i = 0; for (int j = this.cVf.size(); i < j; i++) {
      if (!paramdGy.d(this.cVf.get(i))) {
        return false;
      }
    }

    return true;
  }

  public ArrayList cBM() {
    return this.cVf;
  }

  public dBY fL(byte paramByte) {
    if ((paramByte < 0) || (paramByte >= this.cVf.size())) {
      return null;
    }

    return (dBY)this.cVf.get(paramByte);
  }

  static
  {
    lTy.b(dBY.lJF);
    lTz.b(dBY.lJG);
    lTA.b(dBY.lJH);
    lTB.b(dBY.lJI);

    lTC.b(dBY.lJJ);
    lTC.b(dBY.lJK);
    lTC.b(dBY.lJL);
    lTD.b(dBY.lJM);
    lTD.b(dBY.lJN);
    lTD.b(dBY.lJO);
    lTE.b(dBY.lJP);
    lTE.b(dBY.lJQ);
    lTE.b(dBY.lJR);
    lTF.b(dBY.lJS);
    lTF.b(dBY.lJT);
    lTF.b(dBY.lJU);
    lTG.b(dBY.lJV);
    lTG.b(dBY.lJW);
    lTG.b(dBY.lJX);
    lTH.b(dBY.lJY);
    lTH.b(dBY.lJZ);
    lTH.b(dBY.lKa);
    lTI.b(dBY.lKb);
    lTI.b(dBY.lKc);
    lTI.b(dBY.lKd);
    lTJ.b(dBY.lKe);
    lTJ.b(dBY.lKf);
    lTJ.b(dBY.lKg);

    lTK.b(dBY.lKh);
    lTK.b(dBY.lKi);
    lTL.b(dBY.lKj);
    lTL.b(dBY.lKk);
    lTM.b(dBY.lKl);
    lTM.b(dBY.lKm);
    lTN.b(dBY.lKn);
    lTN.b(dBY.lKo);

    lTO.b(dBY.lKp);

    lTy.lTQ = cnm.hTp;
    lTz.lTQ = cnm.hTq;
    lTA.lTQ = cnm.hTr;
    lTB.lTQ = cnm.hTs;
    lTC.lTQ = cnm.hTt;
    lTD.lTQ = cnm.hTu;
    lTE.lTQ = cnm.hTv;
    lTF.lTQ = cnm.hTw;
    lTG.lTQ = cnm.hTx;
    lTH.lTQ = cnm.hTy;
    lTI.lTQ = cnm.hTz;
    lTJ.lTQ = cnm.hTA;
    lTK.lTQ = cnm.hTB;
    lTL.lTQ = cnm.hTC;
    lTM.lTQ = cnm.hTD;
    lTN.lTQ = cnm.hTE;
    lTO.lTQ = cnm.hTF;
  }
}