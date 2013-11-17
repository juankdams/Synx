class rH
  implements ddy
{
  rH(dcY paramdcY, aga paramaga)
  {
  }

  public void a(cKq paramcKq, byN parambyN)
  {
    switch (rr.iS[parambyN.ordinal()]) {
    case 1:
      cpa localcpa = this.aZK.getElementMap();
      dOc localdOc = (dOc)localcpa.fi("image");
      if (localdOc != null) {
        localdOc.getAppearance().setModulationColor(bNa.gRx);
      }
      localdOc = (dOc)localcpa.fi("container");
      if (localdOc != null) {
        localdOc.getAppearance().setModulationColor(bNa.gRx);
      }
      localdOc = (dOc)localcpa.fi("text");
      if (localdOc != null) {
        localdOc.getAppearance().setModulationColor(bNa.gRx);
      }
      this.aZK.cleanUp();
      this.aZJ.b(this);
      return;
    }
  }
}