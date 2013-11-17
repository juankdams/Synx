class dyq
  implements Runnable
{
  dyq(VH paramVH)
  {
  }

  public void run()
  {
    if (this.eOm.isDisposed()) {
      return;
    }

    VH.a(this.eOm, (VH.d(this.eOm) + 1) % VH.e(this.eOm));
    VH.a(this.eOm, 6.283186F / VH.e(this.eOm) * VH.d(this.eOm));

    VH.b(this.eOm, VH.a(this.eOm));
  }
}