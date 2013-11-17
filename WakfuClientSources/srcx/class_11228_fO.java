import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.alea.graphics.havenWorldMini.DisplayedScreenMultiElement;
import com.ankamagames.wakfu.client.alea.graphics.havenWorldMini.DisplayedScreenMultiElement.ObjectFactory;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class fO
{
  private static final Logger K = Logger.getLogger(fO.class);
  private final aIJ aDa;
  private final int aDb;
  private final int aDc;
  private final ArrayList aDd = new ArrayList();

  public fO(aIJ paramaIJ, int paramInt1, int paramInt2) {
    this.aDa = paramaIJ;
    this.aDb = paramInt1;
    this.aDc = paramInt2;
  }

  public void a(btb parambtb, int paramInt1, int paramInt2, short paramShort) {
    dQx localdQx = this.aDa.KT();
    int i = localdQx.width() / this.aDb;
    int j = localdQx.height() / this.aDc;

    aRa localaRa = aRa.eNR;
    for (int k = 0; k < j; k++)
      for (int m = 0; m < i; m++) {
        DisplayedScreenMultiElement localDisplayedScreenMultiElement = DisplayedScreenMultiElement.bql.b(this.aDa, this.aDb * m + localdQx.hqu, this.aDc * k + localdQx.hqw, this.aDb, this.aDc);

        localDisplayedScreenMultiElement.a(localaRa);
        int n = paramInt1 + m;
        int i1 = paramInt2 + k;

        DisplayedScreenElement localDisplayedScreenElement = parambtb.a(n, i1, cWj.kJi);
        short s = localDisplayedScreenElement == null ? paramShort : localDisplayedScreenElement.bpc().ddH();
        int i2 = localDisplayedScreenElement == null ? 5 : localDisplayedScreenElement.bpc().ddQ();
        localDisplayedScreenMultiElement.a(n, i1, s, i2);
        parambtb.e(localDisplayedScreenMultiElement);
        this.aDd.add(localDisplayedScreenMultiElement);
      }
  }

  public void a(btb parambtb)
  {
    int i = 0; for (int j = this.aDd.size(); i < j; i++) {
      DisplayedScreenMultiElement localDisplayedScreenMultiElement = (DisplayedScreenMultiElement)this.aDd.get(i);
      parambtb.aG(localDisplayedScreenMultiElement);
      localDisplayedScreenMultiElement.axl();
    }
    this.aDd.clear();
  }
}