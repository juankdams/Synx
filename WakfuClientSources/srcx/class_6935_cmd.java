class cmd
  implements MB
{
  cmd(bWx parambWx)
  {
  }

  public dOc a(ddu paramddu)
  {
    if (paramddu == null)
      return null;
    if ((paramddu.getText() == null) || (paramddu.fJ() == null))
      return null;
    return bWx.a(this.hRa, paramddu.fJ(), paramddu.getText());
  }

  public void f(dOc paramdOc) {
    paramdOc.beH();
  }
}