class buf
  implements Runnable
{
  buf(ahm paramahm)
  {
  }

  public void run()
  {
    if (ahm.g(this.gdv) == null) {
      return;
    }
    if (ahm.f(this.gdv) != null) {
      ahm.f(this.gdv).reset();
    }
    ahm.a(this.gdv, ahm.g(this.gdv));
    ahm.b(this.gdv, null);
    this.gdv.asZ();
  }
}