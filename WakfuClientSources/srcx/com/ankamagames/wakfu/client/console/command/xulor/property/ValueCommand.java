package com.ankamagames.wakfu.client.console.command.xulor.property;

import aeF;
import bbo;
import cBQ;
import cDA;
import cth;
import dBv;
import dLE;
import dnc;
import java.util.ArrayList;

public class ValueCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    String str = (String)paramArrayList.get(2);
    StringBuilder localStringBuilder = new StringBuilder(str);
    localStringBuilder.append(" = ");
    bbo localbbo = cBQ.cxL().coO().czu().getProperty(str);
    if (localbbo != null) {
      Object localObject = localbbo.getValue();
      if ((localObject instanceof dBv))
        a((dBv)localObject, localStringBuilder);
      else {
        a(localObject, localStringBuilder);
      }
    }
    paramcth.trace(localStringBuilder.toString());
  }

  public boolean X()
  {
    return false;
  }

  private void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    if ((paramObject instanceof Object[]))
      for (Object localObject : (Object[])paramObject) {
        if ((localObject instanceof dBv))
          a((dBv)localObject, paramStringBuilder);
        else {
          paramStringBuilder.append(localObject);
        }
        paramStringBuilder.append(',').append('\n');
      }
    else
      paramStringBuilder.append(paramObject);
  }

  private void a(dBv paramdBv, StringBuilder paramStringBuilder)
  {
    String[] arrayOfString1 = paramdBv.getFields();
    for (String str : arrayOfString1) {
      paramStringBuilder.append('\n').append(str).append(" = ");
      a(paramdBv.getFieldValue(str), paramStringBuilder);
    }
  }
}