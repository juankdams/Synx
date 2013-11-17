package com.ankamagames.wakfu.client.chat.console.command;

import CM;
import aEe;
import aeF;
import bU;
import cth;
import dEh;
import dbV;
import dmY;
import dnc;
import java.util.ArrayList;
import java.util.Iterator;

public class ListFriendsCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dEh localdEh = dmY.cUs().cUu();

    if (localdEh != null) {
      String str = bU.fH().getString("chat.friendList");
      str = str + " :\n";
      StringBuilder localStringBuilder = new StringBuilder("");
      for (Object localObject = localdEh.iterator(); ((Iterator)localObject).hasNext(); ) { dbV localdbV = (dbV)((Iterator)localObject).next();
        localStringBuilder.append(" +").append(localdbV.getName()).append(" (");
        if (localdbV.aJl())
          localStringBuilder.append(bU.fH().getString("online"));
        else
          localStringBuilder.append(bU.fH().getString("offline"));
        localStringBuilder.append(")\n");
      }
      str = str + localStringBuilder.toString();
      localObject = new aEe(str);
      ((aEe)localObject).mm(4);
      CM.LV().a((aEe)localObject);
    }
  }

  public boolean X()
  {
    return false;
  }
}