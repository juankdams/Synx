class bVI
  implements Runnable
{
  private int hhN = 0;

  private bVI(dJn paramdJn) {  } 
  public void run() { this.hhN += 1;
    if (dJn.a(this.fih) != null)
      dJn.a(this.fih).setText(dJn.CJ(this.hhN)); }

  public String toString()
  {
    return "DungeonTimer{m_secondsCount=" + this.hhN + '}' + super.toString();
  }
}