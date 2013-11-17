import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class de
{
  private JPanel Tb;
  private JTable Tc;
  private JTable Td;

  de()
  {
    gZ();
  }

  public JPanel gY()
  {
    return this.Tb;
  }

  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2) {
    DefaultTableModel localDefaultTableModel = new DefaultTableModel();
    localDefaultTableModel.addColumn("Id");
    localDefaultTableModel.addColumn("Class");
    localDefaultTableModel.addColumn("isAlive");
    localDefaultTableModel.addColumn("emitters");
    localDefaultTableModel.addColumn("pos");
    for (Iterator localIterator = paramArrayList1.iterator(); localIterator.hasNext(); ) { localObject = (ParticleSystem)localIterator.next();
      StringBuffer localStringBuffer = new StringBuffer();
      Emitter[] arrayOfEmitter = ((ParticleSystem)localObject).cji();
      if (arrayOfEmitter != null) {
        int i = arrayOfEmitter.length;
        localStringBuffer.append("cnt=").append(i).append(" {");
        for (int j = 0; j < i; j++) {
          if (j > 0) {
            localStringBuffer.append(",");
          }
          localStringBuffer.append(arrayOfEmitter[j].isAlive());
        }
        localStringBuffer.append("}");
      } else {
        localStringBuffer.append("cnt=0");
      }
      localDefaultTableModel.addRow(new Object[] { Integer.valueOf(((ParticleSystem)localObject).getId()), localObject.getClass().getSimpleName(), Boolean.valueOf(((ParticleSystem)localObject).isAlive()), localStringBuffer, ((ParticleSystem)localObject).getX() + ";" + ((ParticleSystem)localObject).getY() });
    }
    Object localObject;
    this.Tc.setModel(localDefaultTableModel);

    localDefaultTableModel = new DefaultTableModel();
    localDefaultTableModel.addColumn("Id");
    localDefaultTableModel.addColumn("Pos");
    localDefaultTableModel.addColumn("Enabled");
    localDefaultTableModel.addColumn("BaseColor");
    localDefaultTableModel.addColumn("Range");

    for (localIterator = paramArrayList2.iterator(); localIterator.hasNext(); ) { localObject = (bxu)localIterator.next();
      localDefaultTableModel.addRow(new Object[] { Integer.valueOf(((bxu)localObject).getId()), ((bxu)localObject).bDo().getX() + ";" + ((bxu)localObject).bDo().getY(), Boolean.valueOf(((bxu)localObject).isEnabled()), ((bxu)localObject).bER(), Float.valueOf(((bxu)localObject).aBd()) });
    }

    this.Td.setModel(localDefaultTableModel);
  }

  public void b(ArrayList paramArrayList1, ArrayList paramArrayList2) {
    a(paramArrayList1, paramArrayList2);
  }
}