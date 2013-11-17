import java.util.ArrayList;

class aYg extends amp
{
  private aYg(alP paramalP)
  {
  }

  public boolean Iv()
  {
    return false;
  }

  public Or getContentMinSize(dRq paramdRq) {
    return new Or(0, 0);
  }

  public Or getContentPreferedSize(dRq paramdRq) {
    return new Or(0, 0);
  }

  public void a(dRq paramdRq)
  {
    if (alP.a(this.dYo)) {
      if (alP.b(this.dYo) != null)
      {
        while (alP.b(this.dYo).length < alP.c(this.dYo).size()) {
          ((czv)alP.c(this.dYo).remove(alP.b(this.dYo).length)).beH();
        }

        if (alP.b(this.dYo).length > alP.c(this.dYo).size())
        {
          czv localczv;
          if (alP.c(this.dYo).size() == 0) {
            localczv = new czv();
            localczv.aJ();
            localczv.setNonBlocking(true);
            localczv.setModulationColor(this.dYo.getModulationColor());
            localczv.a(alP.d(this.dYo).beO());
            a(localczv);
            alP.c(this.dYo).add(localczv);
          }

          while (alP.b(this.dYo).length > alP.c(this.dYo).size()) {
            localczv = (czv)((czv)alP.c(this.dYo).get(0)).beO();
            a(localczv);
            alP.c(this.dYo).add(localczv);
          }

        }

      }

      bnu();
      alP.a(this.dYo, false);
    }
  }

  private void bnu() {
    if ((alP.b(this.dYo) == null) || (alP.b(this.dYo).length == 0) || (alP.c(this.dYo) == null) || (alP.c(this.dYo).size() != alP.b(this.dYo).length))
      return;
    int i;
    czv localczv;
    float f;
    if (alP.e(this.dYo))
      for (i = 0; i < alP.c(this.dYo).size(); i++) {
        localczv = (czv)alP.c(this.dYo).get(i);
        f = alP.b(this.dYo)[i];
        localczv.setPosition(Math.round(this.dYo.getAppearance().getContentWidth() * f), this.dYo.getAppearance().getContentHeight() / 2 - localczv.getHeight() / 2);
      }
    else {
      for (i = 0; i < alP.c(this.dYo).size(); i++) {
        localczv = (czv)alP.c(this.dYo).get(i);
        f = alP.b(this.dYo)[i];
        localczv.setPosition(this.dYo.getAppearance().getContentWidth() / 2 - localczv.getWidth() / 2, Math.round(this.dYo.getAppearance().getContentHeight() * f));
      }
    }
    alP.a(this.dYo, false);
    setNeedsToMiddleProcess();
  }
}