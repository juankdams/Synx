import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import org.apache.log4j.Logger;

public abstract class aTl
  implements cvY
{
  protected static final Logger K = Logger.getLogger(cvY.class);
  private aYr bwL;
  private final EnumSet eQF = EnumSet.noneOf(dLC.class);

  private final cYq eQG = cYq.cLM();
  private asK eQH = asK.dCA;
  protected final cTK eQI;

  protected aTl(cTK paramcTK)
  {
    this.eQI = paramcTK;
  }

  public long biC() {
    return this.eQI.getId();
  }

  public void a(cvY paramcvY) {
    m(paramcvY.UI());
    b(paramcvY.HK());
    g(paramcvY.biI());
    D(paramcvY.biD());
    a(paramcvY.biJ());
  }

  public void m(aYr paramaYr) {
    this.bwL = paramaYr;
  }

  public aYr UI()
  {
    return this.bwL;
  }

  public int bP() {
    return this.bwL.bP();
  }

  public dxL biD() {
    if (this.bwL == aYr.feh)
      return cYq.kLU;
    if (this.eQG != null)
      return this.eQG;
    return cYq.kLU;
  }

  public void D(dxL paramdxL) {
    if (this.bwL == aYr.feh)
      return;
    this.eQG.P(paramdxL);
  }

  public boolean biE() {
    return (this.bwL != aYr.feh) && (this.eQG != null) && (!this.eQG.avJ()) && (this.bwL.aMT().Q(this.eQG));
  }

  public boolean biF()
  {
    return (this.bwL.aMX()) && (!biE());
  }

  public boolean biG()
  {
    return this.bwL.dG(biC());
  }

  public Qy biH()
  {
    return this.bwL.dH(biC());
  }

  public boolean a(dLC paramdLC) {
    return this.eQF.add(paramdLC);
  }

  public boolean b(dLC paramdLC) {
    return this.eQF.remove(paramdLC);
  }

  public boolean c(dLC paramdLC) {
    return this.eQF.contains(paramdLC);
  }

  public EnumSet biI()
  {
    return this.eQF;
  }

  public void g(Collection paramCollection)
  {
    this.eQF.clear();
    this.eQF.addAll(paramCollection);
  }

  public asK biJ() {
    return this.eQH;
  }

  public void a(asK paramasK) {
    this.eQH = paramasK;
  }

  public void reset() {
    c(aYr.feh);
  }

  public void c(aYr paramaYr) {
    m(paramaYr);
    b(null);
    g(Collections.emptySet());
    D(cYq.kLU);
    a(asK.dCA);
  }

  public int dJ(int paramInt) {
    return 0;
  }

  public void dN(int paramInt) {
    throw new UnsupportedOperationException("Impossible de lancer une purgation de peine : à implémenter autre part");
  }

  public void HV() {
    throw new UnsupportedOperationException("Impossible de stopper une purgation de peine : à implémenter autre part");
  }

  public int HM() {
    throw new UnsupportedOperationException("Pas de purgation ici : à implémenter autre part");
  }

  public int HN() {
    throw new UnsupportedOperationException("Pas de purgation ici : à implémenter autre part");
  }

  public int dM(int paramInt) {
    throw new UnsupportedOperationException("Pas de purgation ici : à implémenter autre part");
  }

  public boolean HL() {
    throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : à implémenter autre part");
  }

  public boolean dL(int paramInt) {
    throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : à implémenter autre part");
  }

  public boolean a(aYr paramaYr) {
    throw new UnsupportedOperationException("Impossible d'ajouter une nation aux nations offensées : à implémenter autre part");
  }

  public boolean b(aYr paramaYr) {
    throw new UnsupportedOperationException("Impossible de retirer une nation aux nations offensées : à implémenter autre part");
  }

  public void an(boolean paramBoolean) {
    throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : à implémenter autre part");
  }

  public boolean HW() {
    throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : à implémenter autre part");
  }
}