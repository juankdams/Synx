/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import common.Zen;
/**
 *
 * @author Christophe
 */

public class MasterServer implements Runnable {
	
    private ServerSocket _SS;
    private Thread _t;
    private MasterThread clients[] = new MasterThread[1];

    public MasterServer() {
        try {
            _SS = new ServerSocket(Zen.CONFIG_MASTER_PORT);
            _t = new Thread(this);
            _t.setName("Thread MasterServer");

            _t.setDaemon(true);
            _t.start();
        } catch (IOException e) {
        	Zen.write("IOException: " + e.getMessage());
            Zen.closeServers();
        }
    }

    public void run() {
        while (Zen.isInit) {
            try {
            	if(clients[0] == null){
                	Socket s = _SS.accept();
                	String ip = s.getInetAddress().getHostAddress();
                	if(clients[0] == null && ip.equals(Zen.master_ClientIPToAccept) || Zen.master_ClientIPToAccept.equals("0")){
                        clients[0] = new MasterThread(s);
                        clients[0].send("Client recu !");
                        Zen.write("Master Client recu !");
                       // this._t.interrupt();
                	}else{
                		s.close();
                	}
            	}
            } catch (IOException e) {
            	Zen.write("IOException: " + e.getMessage());
                try {
                	Zen.write("Closing the master socket");
                        if (!_SS.isClosed())
                                _SS.close();
                } catch (IOException e1) {}
            }
        }
    }

    public void createMasterServer() {
            try {
                    _SS.close();
            } catch (IOException e) {}
    }

    public Thread getThread() {
            return _t;
    }
}
