import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.EnumMap;

public class dGx
{
  private static final dGx lRa = new dGx();

  private final EnumMap lRb = new EnumMap(duv.class);
  private duv gnE;
  private boolean lRc = false;

  public static dGx dhr()
  {
    return lRa;
  }

  public duv dhs()
  {
    return this.gnE;
  }

  public void a(duv paramduv, boolean paramBoolean)
  {
    if (((!this.lRc) || (paramBoolean)) && 
      (this.gnE != paramduv)) {
      Xu localXu = (Xu)this.lRb.get(paramduv);
      if (localXu != null) {
        dht();
        localXu.show();
        this.gnE = paramduv;
      }

    }

    if (paramBoolean)
      this.lRc = true;
  }

  public void unlock()
  {
    this.lRc = false;
    if (this.gnE == duv.lyl) {
      return;
    }
    dht();
    this.gnE = duv.lyl;
    ((Xu)this.lRb.get(this.gnE)).show();
  }

  private void dht() {
    Xu localXu = (Xu)this.lRb.get(this.gnE);
    if (localXu != null)
      localXu.hide();
  }

  public void a(duv paramduv)
  {
    a(paramduv, false);
  }

  public void a(duv paramduv, int paramInt1, int paramInt2, BufferedImage paramBufferedImage) {
    if ((paramduv != null) && (paramBufferedImage != null)) {
      Toolkit localToolkit = Toolkit.getDefaultToolkit();
      Dimension localDimension = localToolkit.getBestCursorSize(paramBufferedImage.getWidth(), paramBufferedImage.getHeight());
      float f1 = localDimension.width / paramBufferedImage.getWidth();
      float f2 = localDimension.height / paramBufferedImage.getHeight();
      paramInt1 = (int)(paramInt1 * f1);
      paramInt2 = (int)(paramInt2 * f2);
      this.lRb.put(paramduv, new auk(localToolkit.createCustomCursor(paramBufferedImage, new Point(paramInt1, paramInt2), null)));
      if (paramduv.equals(duv.lyl))
        a(paramduv);
    }
  }

  public void b(duv paramduv, int paramInt1, int paramInt2, int paramInt3, ArrayList paramArrayList)
  {
    if (paramArrayList == null) {
      return;
    }
    int i = paramArrayList.size();
    if ((paramduv != null) && (i > 0)) {
      if (i == 1) {
        a(paramduv, paramInt1, paramInt2, (BufferedImage)paramArrayList.get(0));
        return;
      }

      Toolkit localToolkit = Toolkit.getDefaultToolkit();
      BufferedImage localBufferedImage = (BufferedImage)paramArrayList.get(0);
      Dimension localDimension = localToolkit.getBestCursorSize(localBufferedImage.getWidth(), localBufferedImage.getHeight());
      float f1 = localDimension.width / localBufferedImage.getWidth();
      float f2 = localDimension.height / localBufferedImage.getHeight();
      paramInt1 = (int)(paramInt1 * f1);
      paramInt2 = (int)(paramInt2 * f2);

      Cursor[] arrayOfCursor = new Cursor[i];
      for (int j = 0; j < i; j++) {
        arrayOfCursor[j] = localToolkit.createCustomCursor((Image)paramArrayList.get(j), new Point(paramInt1, paramInt2), null);
      }

      this.lRb.put(paramduv, new baF(arrayOfCursor, paramInt3));
      if (paramduv.equals(duv.lyl))
        a(paramduv);
    }
  }
}