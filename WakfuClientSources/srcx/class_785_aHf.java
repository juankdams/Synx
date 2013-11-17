public class aHf
{
  public static final aHf eeF = new aHf();
  private final bPu eeG;

  private aHf()
  {
    this.eeG = new bPu();
  }

  public void a(cPc paramcPc) {
    this.eeG.c(paramcPc.Lk(), paramcPc);
  }

  public cPc be(short paramShort) {
    return (cPc)this.eeG.cx(paramShort);
  }

  public bPu aTb() {
    return this.eeG;
  }

  public void clear() {
    this.eeG.s(new cqX());

    this.eeG.clear();
  }

  public String toString()
  {
    return "DungeonLadderManager{m_laddersByInstanceId=" + this.eeG + '}';
  }
}