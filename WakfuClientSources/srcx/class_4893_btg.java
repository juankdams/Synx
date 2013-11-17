import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.Arrays;
import javax.swing.JComponent;

public final class btg extends dPq
{
  private int gbk = 20;
  private final int[] gbl;
  private final int[] gbm;
  private final int[] gbn;
  private final int[] gbo;
  private final int[] gbp;
  private final int[] gbq;
  private cnU Tw;
  do gbr;
  do gbs;
  private boolean gbt;
  private boolean gbu;
  public static Object gbv = new Object();
  private static final int gbw = 1;
  private static final int gbx = 2;

  public btg(int paramInt1, int paramInt2)
  {
    if (paramInt2 < 1) {
      throw new IllegalArgumentException("wrong columnCount: " + paramInt2);
    }
    if (paramInt1 < 1) {
      throw new IllegalArgumentException("wrong rowCount: " + paramInt1);
    }

    this.gbl = new int[paramInt1];
    for (int i = 0; i < paramInt1; i++) {
      this.gbl[i] = 1;
    }
    this.gbm = new int[paramInt2];
    for (int j = 0; j < paramInt2; j++) {
      this.gbm[j] = 1;
    }

    this.gbp = new int[paramInt2];
    this.gbq = new int[paramInt2];

    this.gbn = new int[paramInt1];
    this.gbo = new int[paramInt1];
  }

  public btg(int paramInt1, int paramInt2, Insets paramInsets, int paramInt3, int paramInt4)
  {
    this(paramInt1, paramInt2);
    setMargin(paramInsets);
    setHGap(paramInt3);
    setVGap(paramInt4);
    this.gbk = 0;
  }

  public btg(int paramInt1, int paramInt2, Insets paramInsets, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramInt1, paramInt2, paramInsets, paramInt3, paramInt4);
    this.gbt = paramBoolean1;
    this.gbu = paramBoolean2;
  }

  public void addLayoutComponent(Component paramComponent, Object paramObject) {
    JW localJW = (JW)paramObject;
    int i = localJW.getRow();
    int j = localJW.getRowSpan();
    int k = getRowCount();
    if ((i < 0) || (i >= k)) {
      throw new IllegalArgumentException("wrong row: " + i);
    }
    if (i + j - 1 >= k) {
      throw new IllegalArgumentException("wrong row span: " + j + "; row=" + i + " rowCount=" + k);
    }
    int m = localJW.getColumn();
    int n = localJW.getColSpan();
    int i1 = getColumnCount();
    if ((m < 0) || (m >= i1)) {
      throw new IllegalArgumentException("wrong column: " + m);
    }
    if (m + n - 1 >= i1) {
      throw new IllegalArgumentException("wrong col span: " + n + "; column=" + m + " columnCount=" + i1);
    }

    super.addLayoutComponent(paramComponent, paramObject);
  }

  public int getRowCount()
  {
    return this.gbl.length;
  }

  public int getColumnCount()
  {
    return this.gbm.length;
  }

  public int qN(int paramInt)
  {
    return this.gbl[paramInt];
  }

  public void cw(int paramInt1, int paramInt2)
  {
    if (paramInt2 < 1) {
      throw new IllegalArgumentException("wrong stretch: " + paramInt2);
    }
    this.gbl[paramInt1] = paramInt2;
  }

  public int qO(int paramInt)
  {
    return this.gbm[paramInt];
  }

  public void cx(int paramInt1, int paramInt2)
  {
    if (paramInt2 < 1) {
      throw new IllegalArgumentException("wrong stretch: " + paramInt2);
    }
    this.gbm[paramInt1] = paramInt2;
  }

  public Dimension maximumLayoutSize(Container paramContainer) {
    return new Dimension(2147483647, 2147483647);
  }

  public Dimension minimumLayoutSize(Container paramContainer) {
    c(paramContainer);

    do localdo1 = this.gbr;
    do localdo2 = this.gbs;

    Dimension localDimension = a(paramContainer, localdo1, localdo2);

    int[] arrayOfInt1 = a(localdo1);
    if (this.gbt) {
      A(arrayOfInt1);
    }
    localDimension.width += sum(arrayOfInt1);

    int[] arrayOfInt2 = a(localdo2);
    if (this.gbu) {
      A(arrayOfInt2);
    }
    localDimension.height += sum(arrayOfInt2);

    return localDimension;
  }

  private static void A(int[] paramArrayOfInt) {
    int i = paramArrayOfInt[0];
    for (int j = 0; j < paramArrayOfInt.length; j++) {
      k = paramArrayOfInt[j];
      i = Math.max(k, i);
    }

    for (int k = 0; k < paramArrayOfInt.length; k++)
      paramArrayOfInt[k] = i;
  }

  private static int[] a(do paramdo, int paramInt)
  {
    int[] arrayOfInt = new int[paramdo.hl()];

    int i = paramInt / arrayOfInt.length;
    int j = paramInt % arrayOfInt.length;

    for (int k = 0; k < arrayOfInt.length; k++) {
      arrayOfInt[k] = i;
      if (j > 0) {
        arrayOfInt[k] += 1;
        j--;
      }
    }

    return arrayOfInt;
  }

  public Dimension preferredLayoutSize(Container paramContainer) {
    c(paramContainer);

    do localdo1 = this.gbr;
    do localdo2 = this.gbs;

    Dimension localDimension = a(paramContainer, localdo1, localdo2);

    int[] arrayOfInt1 = b(localdo1);
    if (this.gbt) {
      A(arrayOfInt1);
    }
    localDimension.width += sum(arrayOfInt1);

    int[] arrayOfInt2 = b(localdo2);
    if (this.gbu) {
      A(arrayOfInt2);
    }
    localDimension.height += sum(arrayOfInt2);

    return localDimension;
  }

  private static int sum(int[] paramArrayOfInt) {
    int i = 0;
    for (int j = paramArrayOfInt.length - 1; j >= 0; j--) {
      i += paramArrayOfInt[j];
    }
    return i;
  }

  private Dimension a(Container paramContainer, do paramdo1, do paramdo2) {
    Insets localInsets = b(paramContainer);
    return new Dimension(localInsets.left + localInsets.right + a(paramdo1, 0, paramdo1.hl()) + this.mgR.left + this.mgR.right, localInsets.top + localInsets.bottom + a(paramdo2, 0, paramdo2.hl()) + this.mgR.top + this.mgR.bottom);
  }

  private static int a(Container paramContainer)
  {
    while (paramContainer != null) {
      if ((paramContainer instanceof JComponent)) {
        Integer localInteger = (Integer)((JComponent)paramContainer).getClientProperty(gbv);
        if (localInteger != null) {
          return localInteger.intValue();
        }
      }
      paramContainer = paramContainer.getParent();
    }
    return 0;
  }

  private static Insets b(Container paramContainer) {
    Insets localInsets = paramContainer.getInsets();
    int i = a(paramContainer);
    if (i != 0) {
      return new Insets(localInsets.top + i, localInsets.left + i, localInsets.bottom + i, localInsets.right + i);
    }

    return localInsets;
  }

  private static int a(do paramdo, int paramInt1, int paramInt2) {
    int i = 0;
    for (int j = paramInt1 + paramInt2 - 2; 
      j >= paramInt1; 
      j--) {
      if (b(paramdo, j)) {
        i++;
      }
    }
    return i * paramdo.getGap();
  }

  private static boolean b(do paramdo, int paramInt) {
    if ((paramInt < 0) || (paramInt >= paramdo.hl())) {
      throw new IllegalArgumentException("wrong cellIndex: " + paramInt + "; cellCount=" + paramdo.hl());
    }

    int i = 0;
    int j = 0;

    int k = -1;
    for (int m = paramInt + 1; m < paramdo.hl(); m++) {
      if (!c(paramdo, m)) {
        k = m;
        break;
      }
    }

    for (int n = 0; n < paramdo.getComponentCount(); n++) {
      Component localComponent = paramdo.getComponent(n);
      if (!(localComponent instanceof Mw))
      {
        if ((paramdo.i(n, paramInt)) && (do.a(localComponent, paramdo.ae(n)) != null))
        {
          return true;
        }

        if (paramdo.ah(n) == k) {
          j = 1;
        }

        if (paramdo.ah(n) + paramdo.ai(n) - 1 == paramInt) {
          i = 1;
        }
      }
    }
    return (j != 0) && (i != 0);
  }

  private static boolean c(do paramdo, int paramInt) {
    if ((paramInt < 0) || (paramInt >= paramdo.hl())) {
      throw new IllegalArgumentException("wrong cellIndex: " + paramInt + "; cellCount=" + paramdo.hl());
    }
    for (int i = 0; i < paramdo.getComponentCount(); i++) {
      Component localComponent = paramdo.getComponent(i);
      if ((paramdo.ah(i) == paramInt) && (!(localComponent instanceof Mw))) {
        return false;
      }
    }
    return true;
  }

  public void layoutContainer(Container paramContainer) {
    c(paramContainer);

    cnU localcnU = this.Tw;
    do localdo1 = this.gbr;
    do localdo2 = this.gbs;

    Insets localInsets = b(paramContainer);

    int i = a(paramContainer, localInsets);

    Dimension localDimension1 = a(paramContainer, localdo1, localdo2);

    Dimension localDimension2 = paramContainer.getSize();
    localDimension2.width -= localDimension1.width;
    localDimension2.height -= localDimension1.height;

    Dimension localDimension3 = preferredLayoutSize(paramContainer);
    localDimension3.width -= localDimension1.width;
    localDimension3.height -= localDimension1.height;

    Dimension localDimension4 = minimumLayoutSize(paramContainer);
    localDimension4.width -= localDimension1.width;
    localDimension4.height -= localDimension1.height;
    int[] arrayOfInt;
    int k;
    int m;
    if ((i & 0x1) == 0)
    {
      if (this.gbu) {
        arrayOfInt = a(localdo2, Math.max(localDimension2.height, localDimension4.height));
      }
      else if (localDimension2.height < localDimension3.height) {
        arrayOfInt = a(localdo2);
        a(arrayOfInt, 0, localdo2.hl(), localDimension2.height, localdo2, true);
      }
      else {
        arrayOfInt = b(localdo2);
        a(arrayOfInt, 0, localdo2.hl(), localDimension2.height, localdo2, false);
      }

      k = localInsets.top + this.mgR.top;
      for (m = 0; m < arrayOfInt.length; m++) {
        this.gbn[m] = k;
        this.gbo[m] = arrayOfInt[m];
        k += arrayOfInt[m];
        if (b(localdo2, m)) {
          k += localdo2.getGap();
        }
      }
    }

    if ((i & 0x2) == 0)
    {
      if (this.gbt) {
        arrayOfInt = a(localdo1, Math.max(localDimension2.width, localDimension4.width));
      }
      else if (localDimension2.width < localDimension3.width) {
        arrayOfInt = a(localdo1);
        a(arrayOfInt, 0, localdo1.hl(), localDimension2.width, localdo1, true);
      }
      else {
        arrayOfInt = b(localdo1);
        a(arrayOfInt, 0, localdo1.hl(), localDimension2.width, localdo1, false);
      }

      k = localInsets.left + this.mgR.left;
      for (m = 0; m < arrayOfInt.length; m++) {
        this.gbp[m] = k;
        this.gbq[m] = arrayOfInt[m];
        k += arrayOfInt[m];
        if (b(localdo1, m)) {
          k += localdo1.getGap();
        }
      }

    }

    for (int j = 0; j < localcnU.getComponentCount(); j++) {
      JW localJW = localcnU.ae(j);
      Component localComponent = localcnU.getComponent(j);

      int n = localdo1.ah(j);
      int i1 = localdo1.ai(j);
      int i2 = localdo2.ah(j);
      int i3 = localdo2.ai(j);

      int i4 = this.gbp[(n + i1 - 1)] + this.gbq[(n + i1 - 1)] - this.gbp[n];
      int i5 = this.gbn[(i2 + i3 - 1)] + this.gbo[(i2 + i3 - 1)] - this.gbn[i2];

      Dimension localDimension5 = new Dimension(i4, i5);

      if ((localJW.UF() & 0x1) == 0) {
        localDimension5.width = Math.min(localDimension5.width, localdo1.af(j));
      }

      if ((localJW.UF() & 0x2) == 0) {
        localDimension5.height = Math.min(localDimension5.height, localdo2.af(j));
      }

      cHR.a(localComponent, localJW, localDimension5);

      int i6 = 0;
      int i7 = 0;

      if ((localJW.UE() & 0x4) != 0) {
        i6 = i4 - localDimension5.width;
      }
      else if ((localJW.UE() & 0x8) == 0) {
        i6 = (i4 - localDimension5.width) / 2;
      }

      if ((localJW.UE() & 0x2) != 0) {
        i7 = i5 - localDimension5.height;
      }
      else if ((localJW.UE() & 0x1) == 0) {
        i7 = (i5 - localDimension5.height) / 2;
      }

      int i8 = 10 * localJW.getIndent();
      localDimension5.width -= i8;
      i6 += i8;

      localComponent.setBounds(this.gbp[n] + i6, this.gbn[i2] + i7, localDimension5.width, localDimension5.height);
    }
  }

  private int a(Container paramContainer, Insets paramInsets) {
    int i = 0;

    btg localbtg = null;
    JW localJW = null;

    Container localContainer1 = paramContainer.getParent();
    if (localContainer1 != null) {
      if ((localContainer1.getLayout() instanceof btg)) {
        localbtg = (btg)localContainer1.getLayout();
        localJW = localbtg.d(paramContainer);
      }
      else {
        Container localContainer2 = localContainer1.getParent();
        if ((localContainer2 != null) && ((localContainer2.getLayout() instanceof btg))) {
          localbtg = (btg)localContainer2.getLayout();
          localJW = localbtg.d(localContainer1);
        }
      }
    }

    if ((localbtg != null) && (localJW.UG()))
    {
      int j;
      int k;
      if (this.gbl.length == localJW.getRowSpan()) {
        j = localJW.getRow();
        this.gbn[0] = (paramInsets.top + this.mgR.top);
        this.gbo[0] = (localbtg.gbo[j] - this.gbn[0]);
        for (k = 1; k < this.gbl.length; k++) {
          this.gbn[k] = (localbtg.gbn[(k + j)] - localbtg.gbn[j]);
          this.gbo[k] = localbtg.gbo[(k + j)];
        }
        this.gbo[(this.gbl.length - 1)] -= paramInsets.bottom + this.mgR.bottom;
        i |= 1;
      }
      if (this.gbm.length == localJW.getColSpan()) {
        j = localJW.getColumn();
        this.gbp[0] = (paramInsets.left + this.mgR.left);
        this.gbq[0] = (localbtg.gbq[j] - this.gbp[0]);
        for (k = 1; k < this.gbm.length; k++) {
          this.gbp[k] = (localbtg.gbp[(k + j)] - localbtg.gbp[j]);
          this.gbq[k] = localbtg.gbq[(k + j)];
        }
        this.gbq[(this.gbm.length - 1)] -= paramInsets.right + this.mgR.right;
        i |= 2;
      }
    }
    return i;
  }

  public void invalidateLayout(Container paramContainer) {
    this.Tw = null;
    this.gbr = null;
    this.gbs = null;
  }

  void c(Container paramContainer) {
    if (this.Tw == null)
    {
      this.Tw = new cnU(this, a(paramContainer) == 0);
      this.gbr = new cZF(this.Tw, dPq.d(paramContainer));
      this.gbs = new BL(this.Tw, dPq.e(paramContainer));
    }
  }

  public int[] bBv()
  {
    return this.gbp;
  }

  public int[] getWidths()
  {
    return this.gbq;
  }

  public int[] bBw()
  {
    return this.gbn;
  }

  public int[] bBx()
  {
    return this.gbo;
  }

  public int[] ff(boolean paramBoolean) {
    return paramBoolean ? this.gbn : this.gbp;
  }

  public int[] fg(boolean paramBoolean) {
    return paramBoolean ? this.gbo : this.gbq;
  }

  private int[] a(do paramdo) {
    return a(paramdo, true);
  }

  private int[] b(do paramdo) {
    return a(paramdo, false);
  }

  private int[] a(do paramdo, boolean paramBoolean) {
    int[] arrayOfInt = new int[paramdo.hl()];
    for (int i = 0; i < arrayOfInt.length; i++) {
      arrayOfInt[i] = this.gbk;
    }

    for (int j = paramdo.getComponentCount() - 1; j >= 0; j--) {
      if (paramdo.ai(j) == 1)
      {
        int k = paramBoolean ? d(paramdo, j) : Math.max(paramdo.ag(j), paramdo.af(j));
        m = a(paramdo, paramdo.ah(j), paramdo.ai(j));
        k = Math.max(k - m, 0);

        arrayOfInt[paramdo.ah(j)] = Math.max(arrayOfInt[paramdo.ah(j)], k);
      }
    }

    a(paramdo, paramBoolean, arrayOfInt);

    boolean[] arrayOfBoolean1 = new boolean[paramdo.hl()];

    for (int m = paramdo.getComponentCount() - 1; m >= 0; m--) {
      int n = paramBoolean ? d(paramdo, m) : Math.max(paramdo.ag(m), paramdo.af(m));

      int i1 = paramdo.ai(m);
      int i2 = paramdo.ah(m);

      int i3 = a(paramdo, i2, i1);
      n = Math.max(n - i3, 0);

      Arrays.fill(arrayOfBoolean1, false);

      int i4 = 0;
      for (int i5 = 0; i5 < i1; i5++) {
        i4 += arrayOfInt[(i5 + i2)];
        arrayOfBoolean1[(i5 + i2)] = true;
      }

      if (i4 < n)
      {
        boolean[] arrayOfBoolean2 = new boolean[arrayOfBoolean1.length];
        a(paramdo, arrayOfBoolean1, arrayOfBoolean2, false, arrayOfInt);

        a(arrayOfBoolean2, paramdo, n - i4, arrayOfInt);
      }
    }
    return arrayOfInt;
  }

  private static void a(do paramdo, boolean paramBoolean, int[] paramArrayOfInt) {
    for (int i = paramdo.getComponentCount() - 1; i >= 0; i--) {
      Component localComponent = paramdo.getComponent(i);
      JW localJW = paramdo.ae(i);
      if ((localJW.UG()) && ((localComponent instanceof Container))) {
        Container localContainer1 = (Container)localComponent;
        if ((localContainer1.getLayout() instanceof btg)) {
          a(paramdo, paramBoolean, paramArrayOfInt, localContainer1, i);
        }
        else if ((localContainer1.getComponentCount() == 1) && ((localContainer1.getComponent(0) instanceof Container)))
        {
          Container localContainer2 = (Container)localContainer1.getComponent(0);
          if ((localContainer2.getLayout() instanceof btg))
            a(paramdo, paramBoolean, paramArrayOfInt, localContainer2, i);
        }
      }
    }
  }

  private static void a(do paramdo, boolean paramBoolean, int[] paramArrayOfInt, Container paramContainer, int paramInt)
  {
    btg localbtg = (btg)paramContainer.getLayout();
    if (paramdo.ai(paramInt) == paramdo.b(localbtg)) {
      localbtg.c(paramContainer);
      do localdo = (paramdo instanceof cZF) ? localbtg.gbr : localbtg.gbs;

      int[] arrayOfInt = localbtg.a(localdo, paramBoolean);
      int i = paramdo.ah(paramInt);
      for (int j = 0; j < arrayOfInt.length; j++)
        paramArrayOfInt[(i + j)] = Math.max(paramArrayOfInt[(i + j)], arrayOfInt[j]);
    }
  }

  private static int d(do paramdo, int paramInt)
  {
    int i;
    if ((paramdo.ak(paramInt) & 0x1) != 0) {
      i = paramdo.ag(paramInt);
    }
    else
    {
      i = Math.max(paramdo.ag(paramInt), paramdo.af(paramInt));
    }
    return i;
  }

  private void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, do paramdo, boolean paramBoolean)
  {
    int i = paramInt3;

    for (int j = paramInt1; j < paramInt1 + paramInt2; j++) {
      i -= paramArrayOfInt[j];
    }
    if (i <= 0) {
      return;
    }

    boolean[] arrayOfBoolean1 = new boolean[paramdo.hl()];
    for (int k = paramInt1; k < paramInt1 + paramInt2; k++) {
      arrayOfBoolean1[k] = true;
    }

    boolean[] arrayOfBoolean2 = new boolean[paramdo.hl()];
    a(paramdo, arrayOfBoolean1, arrayOfBoolean2, paramBoolean, paramArrayOfInt);

    a(arrayOfBoolean2, paramdo, i, paramArrayOfInt);
  }

  private static void a(boolean[] paramArrayOfBoolean, do paramdo, int paramInt, int[] paramArrayOfInt) {
    int i = 0;
    for (int j = 0; j < paramdo.hl(); j++) {
      if (paramArrayOfBoolean[j] != 0) {
        i += paramdo.aj(j);
      }

    }

    int k = paramInt;
    for (int m = 0; m < paramdo.hl(); m++) {
      if (paramArrayOfBoolean[m] != 0)
      {
        int n = k * paramdo.aj(m) / i;
        paramArrayOfInt[m] += n;

        paramInt -= n;
      }
    }

    if (paramInt != 0) {
      for (k = 0; k < paramdo.hl(); k++) {
        if (paramArrayOfBoolean[k] != 0)
        {
          paramArrayOfInt[k] += 1;
          paramInt--;

          if (paramInt == 0) {
            break;
          }
        }
      }
    }
    if (paramInt != 0)
      throw new IllegalStateException("toDistribute = " + paramInt);
  }

  private void a(do paramdo, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2, boolean paramBoolean, int[] paramArrayOfInt)
  {
    Arrays.fill(paramArrayOfBoolean2, false);

    int i = 0;

    if (paramBoolean)
    {
      int[] arrayOfInt = a(paramdo, false);
      for (k = 0; k < paramArrayOfBoolean1.length; k++) {
        if (paramArrayOfBoolean1[k] != 0)
        {
          if ((!c(paramdo, k)) && (arrayOfInt[k] > paramArrayOfInt[k])) {
            paramArrayOfBoolean2[k] = true;
            i++;
          }
        }
      }
      if (i > 0) {
        return;
      }

    }

    for (int j = 0; j < paramArrayOfBoolean1.length; j++) {
      if (paramArrayOfBoolean1[j] != 0)
      {
        if ((paramdo.al(j) & 0x4) != 0) {
          paramArrayOfBoolean2[j] = true;
          i++;
        }
      }
    }
    if (i > 0) {
      return;
    }

    for (int k = 0; k < paramArrayOfBoolean1.length; k++) {
      if (paramArrayOfBoolean1[k] != 0)
      {
        if ((paramdo.al(k) & 0x2) != 0) {
          paramArrayOfBoolean2[k] = true;
          i++;
        }
      }
    }
    if (i > 0) {
      return;
    }

    for (int m = 0; m < paramArrayOfBoolean1.length; m++) {
      if (paramArrayOfBoolean1[m] != 0)
      {
        if (!c(paramdo, m)) {
          paramArrayOfBoolean2[m] = true;
          i++;
        }
      }
    }
    if (i > 0) {
      return;
    }

    for (int n = 0; n < paramArrayOfBoolean1.length; n++)
      if (paramArrayOfBoolean1[n] != 0)
      {
        paramArrayOfBoolean2[n] = true;
      }
  }

  public boolean bBy() {
    return this.gbt;
  }

  public boolean bBz() {
    return this.gbu;
  }

  public void fh(boolean paramBoolean) {
    this.gbt = paramBoolean;
  }

  public void fi(boolean paramBoolean) {
    this.gbu = paramBoolean;
  }

  public int[] bBA() {
    int[] arrayOfInt = new int[this.gbn.length + 1];
    arrayOfInt[0] = this.gbn[0];
    for (int i = 0; i < this.gbn.length - 1; i++) {
      arrayOfInt[(i + 1)] = ((this.gbn[i] + this.gbo[i] + this.gbn[(i + 1)]) / 2);
    }
    arrayOfInt[this.gbn.length] = (this.gbn[(this.gbn.length - 1)] + this.gbo[(this.gbn.length - 1)]);
    return arrayOfInt;
  }

  public int[] bBB() {
    int[] arrayOfInt = new int[this.gbp.length + 1];
    arrayOfInt[0] = this.gbp[0];
    for (int i = 0; i < this.gbp.length - 1; i++) {
      arrayOfInt[(i + 1)] = ((this.gbp[i] + this.gbq[i] + this.gbp[(i + 1)]) / 2);
    }
    arrayOfInt[this.gbp.length] = (this.gbp[(this.gbp.length - 1)] + this.gbq[(this.gbp.length - 1)]);
    return arrayOfInt;
  }

  public int fj(boolean paramBoolean) {
    return paramBoolean ? getRowCount() : getColumnCount();
  }

  public int e(boolean paramBoolean, int paramInt) {
    do localdo = paramBoolean ? this.gbs : this.gbr;
    if (localdo == null)
    {
      return 0;
    }
    return localdo.al(paramInt);
  }
}