package MemoryMapping;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;

import Misc.Tests.Perfs;

public class MemoryBuffersManager {
	
	// STATIC VARS ------------------------------------------------------------------------------------------------
	private static long fileTotalSize = Integer.MAX_VALUE;
	public static MemoryBuffersManager MBM = null;
	
	// OBJECT VARS -------------------------------------------------------------------------------------------------
	private MappedByteBuffer mapout = null;
	//      -   SERIALIZING ---
	private ByteArrayOutputStream streamout = null;
	private ObjectOutputStream oos = null;
	
	
	// STATIC METHODS -----------------------------------------------------------------------------------------------
	
	public static MemoryBuffersManager createNew(){
		return new MemoryBuffersManager();
	}
	
	public static void main(String[] args) throws Exception{
		MBM = new MemoryBuffersManager().init();
		MBM.doTest();
	}
	
	
	
	// OBJECT METHODS ---------------------------------------------------------------------------------------------
	
	public MemoryBuffersManager init() throws Exception{
		streamout = new ByteArrayOutputStream();
		oos = new ObjectOutputStream(streamout);
		
		RandomAccessFile memoryMappedFile = new RandomAccessFile("largeFile.txt","rw");
		mapout = memoryMappedFile.getChannel().map(MapMode.READ_WRITE, 0, 100000000);
		return this;
	}
	
	
	public void doTest() throws IOException, ClassNotFoundException{
		HashMap<Integer, Perfs> mmap = new HashMap<Integer, Perfs>();
		for(int i = 0; i < 1; i++){
			mmap.put(i, new Perfs());
		}
		
		Perfs p = new Perfs();
		byte[] ori = serialize(mmap);
		byte[] neww = new byte[ori.length];
		//out.put((byte) 'A');
		mapout.put(ori);
		//out.put((byte) 'A');
		int start = 0;
		int end = 0;
		for(int i = 0; i < ori.length; i++){
			neww[i] = mapout.get(i);
		}
		Object result = deserialize(neww);
		//w("result is Perfs-"+(result instanceof Perfs));
		//((Perfs)result).stopTiming("Gotten resulted Perfs !");
		w("result is Perfs-"+(result instanceof HashMap));
		((HashMap<Integer, Perfs>)result).get(mmap.size()-1).stopTiming("Gotten resulted Perfs !");
		w("mmap size ="+((HashMap<Integer, Perfs>)result).size());
		/*
		 *result is Perfs-true
		  Temps d'exécution de Gotten resulted Perfs !: 321ms
		  mmap size =10000
		  Temps d'exécution de Done reading file!: 322ms

		 */
		/*
		 * result is Perfs-true
			Temps d'exécution de Gotten resulted Perfs !: 529ms
			mmap size =100000
			Temps d'exécution de Done reading file!: 529ms

		 */
		/*result is Perfs-true
			Temps d'exécution de Gotten resulted Perfs !: 3156ms
			mmap size =1000000   //Donc meme si size = 10*l'ancienne size, ca prend juste 5-6 fois plus de temps à faire a lieu de 10* !:O
			Temps d'exécution de Done reading file!: 3156ms
		 * 
		 */

		
		/*
		//for(int i = 0; i < fileTotalSize; i++){
		//	out.put((byte) 'A');
		//}
		p.stopTiming("Done writing to file!");
		p.restartTiming();
		
		for(int i = 0; i < fileTotalSize; i++){
			char a = (char) out.get(i);
			//w("Read char="+a+".");
			//if(i % 100000 == 0){//takes exactly 6ms, 1ms per 10 byte.    f(x) = 6*0,10*x = temps. x=nbBytes.
			//	p.stopTiming("i % 100000");
			//}
		}*/
		
		p.stopTiming("Done reading file!");//lit 2GO en 3 secondes.
		
	}
	
	
	
	
	public byte[] serialize(Object obj) throws IOException {
	    oos.writeObject(obj);
	    return streamout.toByteArray();
	}
	public Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
		ByteArrayInputStream in = new ByteArrayInputStream(data);
		ObjectInputStream is = new ObjectInputStream(in);
	    return is.readObject();
	}
	
	
	private static void w(String s){
		System.out.println(s);
	}
	
}
