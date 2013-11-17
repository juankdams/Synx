import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class bMF
{
  protected static final Logger K = Logger.getLogger(dJA.class);

  private static bMF gQE = new bMF();

  private final aoL gQF = new aoL();

  private final aoL gQG = new aoL();

  private final aoL gQH = new aoL();

  private final aoL gQI = new aoL();

  private final aoL gQJ = new aoL();

  private final aoL gQK = new aoL();

  private final aoL gQL = new aoL();

  private final aoL gQM = new aoL();

  private final aoL gQN = new aoL();

  private final aoL gQO = new aoL();

  private final aoL gQP = new aoL();

  private final aoL gQQ = new aoL();

  private final aoL gQR = new aoL();

  private final aoL gQS = new aoL();

  private final aoL gQT = new aoL();

  private final aoL gQU = new aoL();

  private final aoL gQV = new aoL();

  private final aoL gQW = new aoL();

  public static bMF bUo()
  {
    return gQE;
  }

  public void e(aAn paramaAn) {
    if ((paramaAn instanceof bbx))
      a((bbx)paramaAn);
    else if ((paramaAn instanceof bmS))
      a((bmS)paramaAn);
    else if ((paramaAn instanceof aho))
      a((aho)paramaAn);
    else if ((paramaAn instanceof fk))
      a((fk)paramaAn);
    else if ((paramaAn instanceof hq))
      a((hq)paramaAn);
    else if ((paramaAn instanceof bQv))
      a((bQv)paramaAn);
    else if ((paramaAn instanceof aYV))
      b((aYV)paramaAn);
    else if ((paramaAn instanceof cTE))
      a((cTE)paramaAn);
    else if ((paramaAn instanceof awr))
      k((awr)paramaAn);
    else if ((paramaAn instanceof adW))
      a((adW)paramaAn);
    else if ((paramaAn instanceof wN))
      a((wN)paramaAn);
    else if ((paramaAn instanceof chy))
      a((chy)paramaAn);
    else if ((paramaAn instanceof cdr))
      a((cdr)paramaAn);
    else if ((paramaAn instanceof cDo))
      a((cDo)paramaAn);
    else if ((paramaAn instanceof cDg))
      a((cDg)paramaAn);
    else if ((paramaAn instanceof dha))
      a((dha)paramaAn);
    else if ((paramaAn instanceof dyV))
      a((dyV)paramaAn);
    else if ((paramaAn instanceof abj))
      a((abj)paramaAn);
    else
      K.error("Type de zone d'effet inconnue du manager " + paramaAn.getClass().getSimpleName());
  }

  private void a(cDo paramcDo) {
    this.gQW.put(paramcDo.clt(), paramcDo);
    this.gQS.put(paramcDo.clt(), paramcDo);
  }

  private void a(cDg paramcDg) {
    this.gQW.put(paramcDg.clt(), paramcDg);
    this.gQT.put(paramcDg.clt(), paramcDg);
  }

  private void a(dyV paramdyV) {
    this.gQW.put(paramdyV.clt(), paramdyV);
    this.gQU.put(paramdyV.clt(), paramdyV);
  }

  private void a(abj paramabj) {
    this.gQW.put(paramabj.clt(), paramabj);
    this.gQV.put(paramabj.clt(), paramabj);
  }

  private void a(cdr paramcdr) {
    this.gQW.put(paramcdr.clt(), paramcdr);
    this.gQR.put(paramcdr.clt(), paramcdr);
  }

  private void a(chy paramchy) {
    this.gQW.put(paramchy.clt(), paramchy);
    this.gQQ.put(paramchy.clt(), paramchy);
  }

  private void a(wN paramwN) {
    this.gQP.put(paramwN.clt(), paramwN);
    this.gQW.put(paramwN.clt(), paramwN);
  }

  private void a(adW paramadW) {
    this.gQW.put(paramadW.clt(), paramadW);
  }

  private void k(awr paramawr) {
    this.gQN.put(paramawr.clt(), paramawr);
    this.gQW.put(paramawr.clt(), paramawr);
  }

  private void a(dha paramdha) {
    this.gQO.put(paramdha.clt(), paramdha);
    this.gQW.put(paramdha.clt(), paramdha);
  }

  private void a(cTE paramcTE) {
    this.gQM.put(paramcTE.clt(), paramcTE);
    this.gQW.put(paramcTE.clt(), paramcTE);
  }

  private void a(bbx parambbx) {
    this.gQF.put(parambbx.clt(), parambbx);
    this.gQW.put(parambbx.clt(), parambbx);
  }

  public bbx ff(long paramLong) {
    return (bbx)this.gQF.get(paramLong);
  }

  private void a(bmS parambmS) {
    this.gQL.put(parambmS.clt(), parambmS);
    this.gQW.put(parambmS.clt(), parambmS);
  }

  public bmS fh(long paramLong) {
    return (bmS)this.gQL.get(paramLong);
  }

  private void a(aho paramaho) {
    this.gQG.put(paramaho.clt(), paramaho);
    this.gQW.put(paramaho.clt(), paramaho);
  }

  public aho fi(long paramLong) {
    return (aho)this.gQG.get(paramLong);
  }

  private void a(fk paramfk) {
    this.gQK.put(paramfk.clt(), paramfk);
    this.gQW.put(paramfk.clt(), paramfk);
  }

  public fk fj(long paramLong) {
    return (fk)this.gQK.get(paramLong);
  }

  private void b(aYV paramaYV) {
    this.gQH.put(paramaYV.clt(), paramaYV);
    this.gQW.put(paramaYV.clt(), paramaYV);
  }

  public aYV fk(long paramLong) {
    return (aYV)this.gQH.get(paramLong);
  }

  public aYV bUp() {
    return (aYV)this.gQH.get(this.gQH.aBb()[bCO.sf(this.gQH.size())]);
  }

  private void a(hq paramhq) {
    this.gQI.put(paramhq.clt(), paramhq);

    this.gQW.put(paramhq.clt(), paramhq);
  }

  public hq fl(long paramLong) {
    return (hq)this.gQI.get(paramLong);
  }

  public Iterator bUq() {
    return new dAI(this.gQI);
  }

  private void a(bQv parambQv) {
    this.gQJ.put(parambQv.clt(), parambQv);

    this.gQW.put(parambQv.clt(), parambQv);
  }

  public bQv fm(long paramLong) {
    return (bQv)this.gQJ.get(paramLong);
  }

  public cTE fn(long paramLong) {
    return (cTE)this.gQM.get(paramLong);
  }

  public aAn fo(long paramLong) {
    return (aAn)this.gQW.get(paramLong);
  }

  public awr fp(long paramLong) {
    return (awr)this.gQN.get(paramLong);
  }

  public List bUr() {
    chy[] arrayOfchy = new chy[this.gQQ.size()];
    this.gQQ.d(arrayOfchy);
    return Arrays.asList(arrayOfchy);
  }

  public static void a(bMF parambMF) {
    gQE = parambMF;
  }
}