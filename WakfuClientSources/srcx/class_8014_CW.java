class CW
  implements Runnable
{
  CW(dKp paramdKp)
  {
  }

  public void run()
  {
    aga localaga = bAO.a(this.bHl.lXZ, false);
    if (localaga == null) {
      return;
    }
    localaga.a(new bNw(this, localaga));
  }
}