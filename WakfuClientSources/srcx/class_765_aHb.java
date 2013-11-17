public class aHb
  implements dGy
{
  private int eeA;
  private int eeB;

  public aHb(cKg paramcKg)
  {
    this.eeA = paramcKg.arJ().aDI();
    this.eeB = paramcKg.arJ().aDI();
  }

  public boolean c(cuF paramcuF) {
    this.eeA -= paramcuF.adj().cJv();
    this.eeA += paramcuF.adj().bVy();
    this.eeB += paramcuF.adj().bVy();
    return true;
  }

  public int aSW() {
    return this.eeA;
  }

  public int aSX() {
    return this.eeB;
  }

  public String toString()
  {
    return "WorkerBuildingCount{m_remainingWorker=" + this.eeA + '}';
  }
}