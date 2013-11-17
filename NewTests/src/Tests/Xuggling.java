package Tests;

import com.xuggle.mediatool.IMediaDebugListener;
import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaViewer;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;

public class Xuggling {

	public static void go() {
		// TODO Auto-generated method stub
		IMediaReader reader = ToolFactory.makeReader("loader.swf");
		IMediaWriter writer = ToolFactory.makeWriter("~loader.mov");
		//IMediaViewer viewer = ToolFactory.makeViewer();
		IMediaDebugListener debug = ToolFactory.makeDebugListener();
		
		
		reader.addListener(writer);
		//reader.addListener(viewer);
		reader.addListener(debug);
		
		while(reader.readPacket() == null)
			;
		
	}

}
