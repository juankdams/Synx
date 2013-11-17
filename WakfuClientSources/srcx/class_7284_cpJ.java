class cpJ
  implements dFU
{
  protected bbN hYW;

  public String toString()
  {
    return "AuthentificationTokenMessageRunner{}";
  }

  protected void a(bbN parambbN) {
    this.hYW = parambbN;
  }

  public boolean a(tg paramtg) {
    String str = paramtg.bI();
    this.hYW.hT(str);
    return false;
  }

  public int vN() {
    return 14001;
  }
}