class dda
  implements Runnable
{
  private final cuB kWm;
  private final bAF cUI;

  dda(cuB paramcuB, bAF parambAF)
  {
    this.kWm = paramcuB;
    this.cUI = parambAF;
  }

  public void run() {
    this.cUI.a(this.kWm, false);
  }

  public String toString()
  {
    return "PetPathRunnable{m_petPath=" + this.kWm + '}';
  }
}