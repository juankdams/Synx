import com.ankamagames.wakfu.client.alea.graphics.havenWorldMini.DisplayedScreenMultiElement;

public class bCa
  implements dGy
{
  public bCa(DisplayedScreenMultiElement paramDisplayedScreenMultiElement, float paramFloat)
  {
  }

  public boolean a(aXL paramaXL)
  {
    p(paramaXL);
    return true;
  }

  private void p(aXL paramaXL) {
    dQx localdQx = paramaXL.bmX();
    int i = bnp.qo(localdQx.hqv);
    if ((i < DisplayedScreenMultiElement.a(this.gwk)) || (i >= DisplayedScreenMultiElement.a(this.gwk) + DisplayedScreenMultiElement.b(this.gwk))) {
      return;
    }
    int j = bnp.qp(localdQx.hqx);
    if ((j < DisplayedScreenMultiElement.c(this.gwk)) || (j >= DisplayedScreenMultiElement.c(this.gwk) + DisplayedScreenMultiElement.d(this.gwk))) {
      return;
    }

    int k = paramaXL.bcY();
    bxF.b(DisplayedScreenMultiElement.e(this.gwk), k, paramaXL.bmV() - DisplayedScreenMultiElement.a(this.gwk) * 9, paramaXL.bmW() - DisplayedScreenMultiElement.c(this.gwk) * 9, this.gwj, DisplayedScreenMultiElement.f(this.gwk).nF(k));
  }
}