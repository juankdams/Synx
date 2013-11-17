import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.util.Collections;

class dxW extends adG
{
  dxW(aka paramaka, float paramFloat1, float paramFloat2)
  {
    super(paramFloat1, paramFloat2);
  }

  public void cz(int paramInt) {
    boolean bool = aka.a(this.lEx);

    if (!aka.b(this.lEx).isInitialized()) {
      super.cz(paramInt);
      return;
    }

    this.lEx.djU.removeAllChildren();

    cYm localcYm = aka.b(this.lEx).a(this, bool);

    float f1 = this.bIv / 2.0F + this.lEx.czl.getLeftInset();
    float f2 = this.bIw / 2.0F + this.lEx.czl.getBottomInset();

    a(aka.c(this.lEx), f1, f2, localcYm, false, bool);

    if (this.lEx.dkl) {
      a(aka.d(this.lEx), f1, f2, localcYm, false, bool);
    }

    if (this.lEx.dkm) {
      a(aka.e(this.lEx), f1, f2, localcYm, true, bool);
    }

    if (bool) {
      aka.a(this.lEx, false);
    }

    Collections.sort(this.lEx.djU.aSj(), vl.bjt);

    super.cz(paramInt);
  }

  private void a(aJP paramaJP, float paramFloat1, float paramFloat2, cYm paramcYm, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0; for (int j = paramaJP.size(); i < j; i++) {
      dwn localdwn = paramaJP.mJ(i);
      if (localdwn != null)
      {
        aka.a(this.lEx, this, localdwn, paramaJP.mK(i), paramaJP.mL(i), paramFloat1, paramFloat2, paramcYm, paramBoolean1, paramBoolean2);
      }
    }
  }
}