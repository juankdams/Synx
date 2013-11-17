import com.ankamagames.wakfu.client.WakfuClientInstance;

public class um
{
  private static final bNa bhT = new bNa(0.8F, 0.4F, 0.5F, 0.8F);

  public static final um bhU = new um();
  private final cSi bhV = new cSi();

  public void clear()
  {
    int i = 0; for (int j = this.bhV.size(); i < j; i++) {
      bFq.sB(this.bhV.wm(i));
    }
    this.bhV.clear();
  }

  public void cX(int paramInt)
  {
    clear();
  }

  public void reset() {
    clear();
  }

  public void cY(int paramInt) {
    switch (paramInt) {
    case 48:
      Da();
      return;
    case 49:
      CZ();
      return;
    case 50:
      c(dAf.lGN);
      return;
    case 54:
      bFq.bMZ();
      return;
    case 55:
      a(new coZ(1.0F));
      return;
    case 56:
      dxL localdxL = aat.cOE.VN();
      a(new asD(25, localdxL.rP()));
      return;
    case 51:
    case 52:
    case 53: } int i = bOh.D();
    switch (i) {
    case 98:
    case 99:
    case 101:
    case 115:
    case 141:
      Db();
      return;
    case 278:
    case 282:
    case 283:
    case 284:
      Dc();
      return;
    case 237:
    case 240:
    case 243:
    case 247:
    case 248:
    case 249:
    case 250:
    case 251:
    case 252:
    case 253:
    case 254:
    case 255:
    case 256:
    case 257:
    case 258:
    case 259:
    case 301:
    case 302:
      Dd();
      return;
    case 210:
    case 213:
    case 214:
    case 215:
    case 216:
    case 217:
      De();
      return;
    case 323:
      CZ();
      return;
    case 327:
      CZ();
      c(bhT);
      return;
    case 336:
    case 339:
      c(bhT);
      return;
    case 370:
    case 371:
      Df();
      return;
    case 524:
      CZ();
      return;
    }
  }

  private void CZ()
  {
    this.bhV.add(bFq.bNh());
  }

  private void Da() {
    this.bhV.add(bFq.bNf());
  }

  private void Db() {
    this.bhV.add(bFq.bNb());
  }

  private void Dc() {
    bFq.bNd();
  }

  private void Dd() {
    bFq.bNe();
  }

  private void De() {
    this.bhV.add(bFq.bNg());
    cZv localcZv = new cZv();
    localcZv.a(Dg().cKV());
    localcZv.a(new czT(-18.0F, 18.0F, -18.0F, 18.0F, -18.0F, 18.0F));
    localcZv.initialize(1000);
    localcZv.a(1.0F, 1.0F, 0.0F, 1.0F, 0.1F);
    localcZv.b(10.0F, 500.0F, 5000.0F, 0.4F, 2.0F, 0.02F);
    localcZv.cc(100);
    Pb.aaU().a(localcZv);
    this.bhV.add(localcZv.getId());
  }

  private void c(bNa parambNa) {
    dAf localdAf = new dAf();
    localdAf.setColor(parambNa);
    localdAf.L(true);
    localdAf.a(Dg().cKV());
    Pb.aaU().a(localdAf);

    this.bhV.add(localdAf.getId());
  }

  private void a(coZ paramcoZ) {
    Sa localSa = new Sa();
    localSa.L(true);
    localSa.e(paramcoZ);
    localSa.a(Dg().cKV());
    Pb.aaU().a(localSa);
    this.bhV.add(bFq.c(paramcoZ));
  }

  private void Df() {
    anK.drx.d(Pr.chJ);
    anK.drx.az(0.9F);
  }

  private dSz Dg() {
    return WakfuClientInstance.awy().Dg();
  }

  private void b(coZ paramcoZ) {
    dRD localdRD = new dRD();
    localdRD.L(true);
    localdRD.e(paramcoZ);
    localdRD.a(Dg().cKV());
    Pb.aaU().a(localdRD);
    this.bhV.add(bFq.d(paramcoZ));
  }
}