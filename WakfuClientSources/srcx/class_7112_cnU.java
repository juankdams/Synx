import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;

public final class cnU
{
  private final Component[] hVk;
  private final JW[] hVl;
  private final int hVm;
  private final int hVn;
  final Dimension[] hVo;
  final Dimension[] hVp;

  public cnU(btg parambtg, boolean paramBoolean)
  {
    ArrayList localArrayList1 = new ArrayList(parambtg.getComponentCount());
    ArrayList localArrayList2 = new ArrayList(parambtg.getComponentCount());
    for (int i = 0; i < parambtg.getComponentCount(); i++) {
      Component localComponent = parambtg.getComponent(i);
      if ((!paramBoolean) || (localComponent.isVisible())) {
        localArrayList1.add(localComponent);
        JW localJW = parambtg.ae(i);
        localArrayList2.add(localJW);
      }
    }

    this.hVk = ((Component[])localArrayList1.toArray(new Component[localArrayList1.size()]));
    this.hVl = ((JW[])localArrayList2.toArray(new JW[localArrayList2.size()]));

    this.hVp = new Dimension[this.hVk.length];
    this.hVo = new Dimension[this.hVk.length];

    this.hVm = parambtg.getColumnCount();
    this.hVn = parambtg.getRowCount();
  }

  public int getComponentCount() {
    return this.hVk.length;
  }

  public Component getComponent(int paramInt) {
    return this.hVk[paramInt];
  }

  public JW ae(int paramInt) {
    return this.hVl[paramInt];
  }

  public int getColumnCount() {
    return this.hVm;
  }

  public int getRowCount() {
    return this.hVn;
  }
}