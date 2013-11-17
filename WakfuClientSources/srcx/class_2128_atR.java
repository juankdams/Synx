import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class atR
{
  private JPanel Tb;
  private JTree dFG;
  private DefaultMutableTreeNode dFH;

  public atR()
  {
    aFT();
  }

  public void a(RenderTreeStencil paramRenderTreeStencil) {
    this.dFH.removeAllChildren();

    Object localObject = this.dFH;
    RenderTreeStencil localRenderTreeStencil = paramRenderTreeStencil;
    while (localRenderTreeStencil != null) {
      Entity localEntity = localRenderTreeStencil.getEntity();
      ArrayList localArrayList1 = localRenderTreeStencil.bpO();
      ArrayList localArrayList2 = localRenderTreeStencil.bpN();
      ArrayList localArrayList3 = localRenderTreeStencil.bpM();
      String str = localEntity.getClass().getSimpleName();

      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(str).append(" [ ");
      localStringBuffer.append("radius=").append(localEntity.cat);
      localStringBuffer.append(", afterCount=").append(localArrayList1.size());
      localStringBuffer.append(", maskCount=").append(localArrayList2.size());
      localStringBuffer.append(", overCount=").append(localArrayList3.size());
      localStringBuffer.append(" ]");
      DefaultMutableTreeNode localDefaultMutableTreeNode = new DefaultMutableTreeNode(localStringBuffer.toString());
      ((DefaultMutableTreeNode)localObject).add(localDefaultMutableTreeNode);

      localRenderTreeStencil = localRenderTreeStencil.bpK();
      localObject = localDefaultMutableTreeNode;
    }

    a(this.dFG, true);

    this.dFG.repaint();
  }

  private void aFT() {
    this.Tb = new JPanel();
    this.Tb.setLayout(new BorderLayout(0, 0));
    JScrollPane localJScrollPane = new JScrollPane();
    this.Tb.add(localJScrollPane, "Center");
    this.dFH = new DefaultMutableTreeNode("Root");
    this.dFG = new JTree(this.dFH);
    localJScrollPane.setViewportView(this.dFG);
  }

  public void a(JTree paramJTree, boolean paramBoolean) {
    TreeNode localTreeNode = (TreeNode)paramJTree.getModel().getRoot();
    a(paramJTree, new TreePath(localTreeNode), paramBoolean);
  }

  private void a(JTree paramJTree, TreePath paramTreePath, boolean paramBoolean) {
    TreeNode localTreeNode1 = (TreeNode)paramTreePath.getLastPathComponent();
    Enumeration localEnumeration;
    if (localTreeNode1.getChildCount() >= 0) {
      for (localEnumeration = localTreeNode1.children(); localEnumeration.hasMoreElements(); ) {
        TreeNode localTreeNode2 = (TreeNode)localEnumeration.nextElement();
        TreePath localTreePath = paramTreePath.pathByAddingChild(localTreeNode2);
        a(paramJTree, localTreePath, paramBoolean);
      }
    }

    if (paramBoolean)
      paramJTree.expandPath(paramTreePath);
    else
      paramJTree.collapsePath(paramTreePath);
  }

  public JPanel gY()
  {
    return this.Tb;
  }
}