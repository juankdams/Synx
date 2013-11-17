public class apK
{
  private static final int dvP = 1;
  private static final int dvQ = 2;
  private static final int dvR = 3;
  private static final int dvS = 1;
  private static final int dvT = 1;
  public static final int dvU = 2;
  private int version;
  public int dvV;
  public int dvW;
  private int dvX;
  private int dvY;
  private int dvZ;
  final int[] dwa = new int[2];
  int dwb;
  private int dwc;
  int dwd;
  int dwe;
  int dwf;
  int dwg;
  wm[] dwh = null;
  bdL[] dwi;
  bdL[] dwj;
  bdL[] dwk;
  duz[] dwl = null;

  public void init()
  {
    this.dvW = 0;
  }

  public void clear() {
    this.dwh = null;

    for (int i = 0; i < this.dwc; i++) {
      if ((!bB) && (this.dwi[i].aGs != 0)) throw new AssertionError();
      Vw.aiK(); Vw.O(this.dwi[i].fpV);
    }
    this.dwi = null;

    for (i = 0; i < this.dwe; i++) {
      dqm.a(this.dwj[i]);
    }
    this.dwj = null;

    for (i = 0; i < this.dwf; i++) {
      cKy.a(this.dwk[i]);
    }
    this.dwk = null;

    for (i = 0; i < this.dwg; i++)
    {
      if (this.dwl[i] != null) {
        this.dwl[i].clear();
      }
    }

    this.dwl = null;
  }

  int c(cf paramcf)
  {
    this.version = paramcf.read(32);
    if (this.version != 0) {
      return -1;
    }
    this.dvV = paramcf.read(8);
    this.dvW = paramcf.read(32);

    this.dvX = paramcf.read(32);
    this.dvY = paramcf.read(32);
    this.dvZ = paramcf.read(32);

    this.dwa[0] = (1 << paramcf.read(4));
    this.dwa[1] = (1 << paramcf.read(4));

    if ((this.dvW < 1) || (this.dvV < 1) || (this.dwa[0] < 8) || (this.dwa[1] < this.dwa[0]) || (paramcf.read(1) != 1))
    {
      clear();
      return -1;
    }
    return 0;
  }

  int d(cf paramcf)
  {
    this.dwg = (paramcf.read(8) + 1);

    if ((this.dwl == null) || (this.dwl.length != this.dwg))
      this.dwl = new duz[this.dwg];
    for (int i = 0; i < this.dwg; i++) {
      this.dwl[i] = new duz();
      if (this.dwl[i].a(paramcf) != 0) {
        clear();
        return -1;
      }

    }

    this.dwd = (paramcf.read(6) + 1);
    int j;
    for (i = 0; i < this.dwd; i++) {
      j = paramcf.read(16);
      if ((!bB) && (j != 0)) throw new AssertionError();
      if ((j < 0) || (j >= 1)) {
        clear();
        return -1;
      }

    }

    this.dwe = (paramcf.read(6) + 1);
    if ((this.dwj == null) || (this.dwj.length != this.dwe))
      this.dwj = new bdL[this.dwe];
    Object localObject;
    for (i = 0; i < this.dwe; i++) {
      j = paramcf.read(16);
      if ((j < 0) || (j >= 2)) {
        clear();
        return -1;
      }

      localObject = dqm.lrR[j].b(this, paramcf);
      if (localObject == null) {
        clear();
        return -1;
      }
      this.dwj[i] = new bdL(j, localObject);
    }

    this.dwf = (paramcf.read(6) + 1);
    if ((this.dwk == null) || (this.dwk.length != this.dwf)) {
      this.dwk = new bdL[this.dwf];
    }

    for (i = 0; i < this.dwf; i++) {
      j = paramcf.read(16);
      if ((j < 0) || (j >= 3)) {
        clear();
        return -1;
      }
      localObject = cKy.iJm[j].b(this, paramcf);
      if (localObject == null) {
        clear();
        return -1;
      }

      this.dwk[i] = new bdL(j, localObject);
    }

    this.dwc = (paramcf.read(6) + 1);
    if ((this.dwi == null) || (this.dwi.length != this.dwc)) {
      this.dwi = new bdL[this.dwc];
    }

    for (i = 0; i < this.dwc; i++) {
      j = paramcf.read(16);
      if ((j < 0) || (j >= 1)) {
        clear();
        return -1;
      }
      Vw.aiK(); localObject = Vw.a(this, paramcf);
      if (localObject == null) {
        clear();
        return -1;
      }

      this.dwi[i] = new bdL(j, localObject);
    }

    this.dwb = (paramcf.read(6) + 1);
    if ((this.dwh == null) || (this.dwh.length != this.dwb))
      this.dwh = new wm[this.dwb];
    for (i = 0; i < this.dwb; i++) {
      this.dwh[i] = new wm();
      this.dwh[i].bmc = paramcf.read(1);
      this.dwh[i].bmd = paramcf.read(16);
      this.dwh[i].bme = paramcf.read(16);
      this.dwh[i].bmf = paramcf.read(8);

      if ((this.dwh[i].bmd >= 1) || (this.dwh[i].bme >= 1) || (this.dwh[i].bmf >= this.dwc))
      {
        clear();
        return -1;
      }
    }

    if (paramcf.read(1) != 1) {
      clear();
      return -1;
    }

    return 0;
  }

  public int a(aI paramaI, cAE paramcAE)
  {
    if (paramcAE == null) {
      return -1;
    }

    cf localcf = new cf();
    localcf.a(paramcAE.iqt, paramcAE.iqu, paramcAE.iqv);

    byte[] arrayOfByte = new byte[6];
    int i = localcf.read(8);
    localcf.b(arrayOfByte, 6);
    if ((arrayOfByte[0] != 118) || (arrayOfByte[1] != 111) || (arrayOfByte[2] != 114) || (arrayOfByte[3] != 98) || (arrayOfByte[4] != 105) || (arrayOfByte[5] != 115))
    {
      return -1;
    }
    switch (i) {
    case 1:
      if (paramcAE.iqw == 0)
      {
        return -1;
      }
      if (this.dvW != 0)
      {
        return -1;
      }
      return c(localcf);
    case 3:
      if (this.dvW == 0)
      {
        return -1;
      }
      return paramaI.a(localcf);
    case 5:
      if ((this.dvW == 0) || (!paramaI.bR()))
      {
        return -1;
      }
      return d(localcf);
    case 2:
    case 4:
    }

    return -1;
  }

  public String toString()
  {
    return "version:" + this.version + ", channels:" + this.dvV + ", rate:" + this.dvW + ", bitrate:" + this.dvX + ',' + this.dvY + ',' + this.dvZ;
  }
}